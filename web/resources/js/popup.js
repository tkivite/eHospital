/**
 * JSPopUp v1.0  author: Oky Firmansyah
 * http://www.okyfirmansyah.net
 * You can freely use and distribute this code
 * Please don't remove nor modify this comments :)
 */


var JSPOPUP_topZOrder = 1000;
var JSPOPUP_lock = 0;
var JSPOPUP_dragXOffset=0;
var JSPOPUP_dragYOffset=0;
var JSPOPUP_dragObject;
var JSPOPUP_clickedZIndex;


function JSPOPUP_showPopUp_(response,status,xhr)
{
    $(".JSPOPUP_main#JSPS"+JSPOPUP_topZOrder).css("z-index",JSPOPUP_topZOrder+1);
    $(".JSPOPUP_main#JSPS"+JSPOPUP_topZOrder).css("top",$(document).scrollTop()+($(window).height()-$(".JSPOPUP_main#JSPS"+JSPOPUP_topZOrder).height())/2);
    $(".JSPOPUP_main#JSPS"+JSPOPUP_topZOrder).css("left",$(document).scrollLeft()+($(window).width()-$(".JSPOPUP_main#JSPS"+JSPOPUP_topZOrder).width())/2);
    $(".JSPOPUP_main#JSPS"+JSPOPUP_topZOrder).css("display","block");

    $(".JSPOPUP_titleBar").css("cursor","move");

    $(".JSPOPUP_close").unbind("click",JSPOPUP_closePopUp);
    $(".JSPOPUP_titleBar").unbind("mousedown",JSPOPUP_mouseDown_);
    $(".JSPOPUP_main").unbind("mousedown",JSPOPUP_bringFront_);

    $(".JSPOPUP_close").click(JSPOPUP_closePopUp);
    $(".JSPOPUP_titleBar").mousedown(JSPOPUP_mouseDown_);
    $(".JSPOPUP_main").mousedown(JSPOPUP_bringFront_);

    JSPOPUP_topZOrder=JSPOPUP_topZOrder+100;
    JSPOPUP_lock=0;
}

// function to create non-modal PopUp, input is target link that
// generate Pop Up content, this function will pass PopUp ID as HTML GET addition
// to that link. This PopUp ID will be then used by PopUp to destroy themself using destroyPopUp function
function JSPOPUP_createPopUp(targetLink, data)
{
    while(JSPOPUP_lock==1);
    JSPOPUP_lock=1;
    // add main <div> section
    $("body").append("<div class='JSPOPUP_main' id='JSPS"+JSPOPUP_topZOrder+"'></div>");
    $(".JSPOPUP_main#JSPS"+JSPOPUP_topZOrder).load(targetLink, data, JSPOPUP_showPopUp_);
}


// function to create modal PopUp, input is target link that
// generate Pop Up content, this function will pass PopUp ID as HTML GET addition
// to that link. This PopUp ID will be then used by PopUp to destroy themself using destroyPopUp function
function JSPOPUP_createModalPopUp(targetLink, data)
{
    var topZOrder_save=JSPOPUP_topZOrder;
    if(JSPOPUP_lock==1) return;
    JSPOPUP_lock=1;
    // add main <div> section
    $("body").append("<div class='JSPOPUP_main' id='JSPS"+JSPOPUP_topZOrder+"'></div>");

    // add new <div> for popup background
    $("body").append("<div class='JSPOPUP_background' id='JSPB"+JSPOPUP_topZOrder+"'></div>");

    $(".JSPOPUP_main#JSPS"+JSPOPUP_topZOrder).load(targetLink, data, JSPOPUP_showPopUp_);

    // fade-in animate that <div>
    $(".JSPOPUP_background#JSPB"+topZOrder_save).css("z-index",topZOrder_save);
    $(".JSPOPUP_background#JSPB"+topZOrder_save).css("display","block");
    $(".JSPOPUP_background#JSPB"+topZOrder_save).css("height",$(document).height());
    $(".JSPOPUP_background#JSPB"+topZOrder_save).css("width",$(document).width());
    $(".JSPOPUP_background#JSPB"+topZOrder_save).fadeTo("fast",0.8);
}

// destroy already created popup(modal or no modal). this function is intended to be used in popup content link
function JSPOPUP_destroyPopUp_()
{
    $(this).remove();
}



function JSPOPUP_closePopUp()
{
    $(this).unbind();
    while(JSPOPUP_lock==1);
    JSPOPUP_lock=1;
    JSPOPUP_topZOrder=JSPOPUP_topZOrder-100;
    JSPOPUP_lock=0;
    var p=$(this).parents(".JSPOPUP_main");

    if(p.next().hasClass("JSPOPUP_background"))
    {
        p.next().fadeTo("fast",0, JSPOPUP_destroyPopUp_);
        p.fadeTo("slow",0, JSPOPUP_destroyPopUp_);
    }else
        p.fadeTo("fast",0, JSPOPUP_destroyPopUp_);
}

function JSPOPUP_mouseDown_(e)
{
    JSPOPUP_dragObject=$(this).parents(".JSPOPUP_main");
    var pos=JSPOPUP_dragObject.position();
    JSPOPUP_dragXOffset=e.pageX-pos.left;
    JSPOPUP_dragYOffset=e.pageY-pos.top;

    $("body").mousemove(JSPOPUP_mouseMove_);
    $("body").mouseup(JSPOPUP_mouseUp_);
}

function JSPOPUP_mouseUp_(e)
{
    $("body").unbind("mousemove",JSPOPUP_mouseMove_);
    $("body").unbind("mouseup",JSPOPUP_mouseUp_);
}

function JSPOPUP_mouseMove_(e)
{
    JSPOPUP_dragObject.css("top", (e.pageY-JSPOPUP_dragYOffset));
    JSPOPUP_dragObject.css("left", (e.pageX-JSPOPUP_dragXOffset));
}

function JSPOPUP_bringFront_()
{
    while(JSPOPUP_lock==1);
    JSPOPUP_lock=1;
    var popupObject;
    if(!$(this).hasClass("JSPOPUP_main"))
        popupObject=$(this).parents(".JSPOPUP_main");
    else
        popupObject=$(this);

    JSPOPUP_clickedZIndex=popupObject.css("z-index");

    $(".JSPOPUP_main").each(function()
        {
            if($(this).css("z-index")>JSPOPUP_clickedZIndex)
            {
                $(this).css("z-index", $(this).css("z-index")-100);
            }
        }
    );
    popupObject.css("z-index",JSPOPUP_topZOrder-100+1)
    JSPOPUP_lock=0;
}