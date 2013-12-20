function saveUser(action)
{

var username=document.getElementById("userId").value;
var firstname=document.getElementById("firstname").value;
var lastname=document.getElementById("lastname").value;
var email=document.getElementById("email").value;
var password=document.getElementById("password").value;
var confirm_password=document.getElementById("confirm_password").value;
var secretquestion=document.getElementById("secretquestion").value;
var secretanswer=document.getElementById("secretanswer").value;

    var form;


var user_id=document.getElementById("userId").value;




    if(action=='Edit')
    {
     form=document.getElementById("form_edit_user_profile");
    }
    if(action=='Add')
    {
    form=document.getElementById("form_add_user");
    }


if(!emptyFields(form))
{

    var full_path = 'newuser?userid='+user_id+'&action='+action+'&lastname='+lastname+'&firstname='+firstname+'&username='+username+'&secretquestion='+secretquestion+'&secretanswer='+secretanswer+'&password='+password+'&email='+email+'&confirm_password='+confirm_password+'&';
    //div1.innerHTML="";

    var myRequest=new ajaxObject(full_path);
    myRequest.callback=function(responseText)
    {
        JSPOPUP_createModalPopUp("admin/alert_box.jsp",{response: responseText});

        loadUserAccounts();

        if(action=='Add'|| action=='Edit')
        {
            //$("#closepopup").click();
            JSPOPUP_closePopUp();
        }
    }
    myRequest.update();

}
}





function SaveSelectedRoles()
{
    var userId=document.getElementById("userId").value;
    var selectedRolesSize=document.getElementById("sel2").length;
    var selectedRole=document.getElementById("sel2");
    var selectedRoles;


    for ( var i=0;i <  selectedRolesSize;i++)
    {
      if(selectedRole.options[i].value !=null)
       {
           if(i==0)
           {
          selectedRoles=selectedRole.options[i].value;
           }
           else
           {
          selectedRoles=  selectedRoles+"$"+selectedRole.options[i].value;
           }
       }


    }

    var full_path = 'newuserrole?user_id='+userId+'&userrole='+selectedRoles+'&';
    alert(full_path);

   var myRequest=new ajaxObject(full_path);
    myRequest.callback=function(responseText)
    {
        JSPOPUP_createModalPopUp("admin/alert_box.jsp",{response: responseText});
        loadUserRoles();

       $("#closepopup").click();

    }
    myRequest.update();



}



function populateTextArea(rolename,checkboxid)
{


  if(document.getElementById(checkboxid).checked)
  {
      $("textarea#selectedRoles").append(rolename+"\n") ;
  }
    else
  {
      $("textarea#selectedRoles").remove(rolename) ;

  }




}
function editRole (roleId)
{

   JSPOPUP_createModalPopUp("admin/edit_role.jsp",{roleId: roleId});

 }

function editUser (userId)
{

    JSPOPUP_createModalPopUp("admin/edit_user.jsp",{userId: userId});


}
function editUserRoles(userId)
{
   // $("#editUserRoles").submit();
    JSPOPUP_createModalPopUp("admin/edit_user_role.jsp",{userId: userId});


}

function editUserProfile()
{
    $("#form_user_profile :input").attr("disabled", false);
    document.getElementById("editUser").style.visibility="hidden";
    document.getElementById("saveEditUser").style.visibility="visible"

}
function removeRole (roleId)
{

  //  JSPOPUP_createModalPopUp("admin/edit_role.jsp?roleId='"+roleId+"'&");
     var action="Remove";
     var full_path = 'newrole?roleId='+roleId+'&action='+action+'&';
     //div1.innerHTML="";

     var myRequest=new ajaxObject(full_path);
     myRequest.callback=function(responseText)
     {
     alert(responseText);
     loadAllRoles();

     }
     myRequest.update();

}

function removeUser(userId)
{
    alert(roleId);
    //  JSPOPUP_createModalPopUp("admin/edit_role.jsp?roleId='"+roleId+"'&");
    var action="Remove";
    var full_path = 'newuser?userid='+userId+'&action='+action+'&';
    //div1.innerHTML="";

    var myRequest=new ajaxObject(full_path);
    myRequest.callback=function(responseText)
    {
        alert(responseText);
        loadUserAccounts();

    }
    myRequest.update();

}


function saveRole(action)
{
        var rolename=document.getElementById("rolename").value;
        var role_description=document.getElementById("role_description").value;
        var appname=document.getElementById("roleapp").value;
        var appurl= encodeURIComponent(document.getElementById("app_url").value);




        var iconname=document.getElementById("icon_name").value;


        var role_id=document.getElementById("roleId").value;
        var form=document.getElementById("addroleform");


    if(!emptyFields(form))
     {

       var full_path = 'newrole?roleId='+role_id+'&action='+action+'&rolename='+rolename+'&app_name='+appname+'&app_url='+appurl+'&icon_name='+iconname+'&role_description='+role_description+'&';
        //div1.innerHTML="";
         alert(full_path);
        var myRequest=new ajaxObject(full_path);
        myRequest.callback=function(responseText)
        {
            alert(responseText);
            loadAllRoles();
            if(action=='Save'|| action=='Edit')
            {
            $("#closepopup").click();
             }
        }
        myRequest.update();

      }

}


function emptyFields(form)
{

    var empty = 0;
    $('input[type=text]').each(function(){
        if (this.value == "") {
            empty++;
           // $(form).show('slow');
        }
    })
    if(empty>=1)
    {
        alert("you have empty fields! fill all fields to save");
        return true;


    }
    else
    {
        return false;
    }

}
function loadUserRoles()
{

    document.getElementById('settingsdiv').innerHTML="";
    document.getElementById('loading_div').style.display='block';
    document.getElementById('loading_div').style.zIndex  = 1000;

    $( "#settingsdiv" ).load( "admin/user_roles.jsp" );
    document.getElementById('loading_div').style.display='none';


}

function loadAllRoles()
{

    document.getElementById('settingsdiv').innerHTML="";
    document.getElementById('loading_div').style.display='block';
    document.getElementById('loading_div').style.zIndex  = 1000;

    $( "#settingsdiv" ).load( "admin/view_roles.jsp" );
    document.getElementById('loading_div').style.display='none';


}
function loadUserAccounts()
{

    document.getElementById('settingsdiv').innerHTML="";
    document.getElementById('loading_div').style.display='block';
    document.getElementById('loading_div').style.zIndex  = 1000;

    $( "#settingsdiv" ).load( "admin/user_accounts.jsp" );
    document.getElementById('loading_div').style.display='none';


}
function loadSettings()
{
    document.getElementById('mainContent').innerHTML="";
    document.getElementById('loading_div').style.display='block';
    document.getElementById('loading_div').style.zIndex  = 1000;

    $( "#mainContent" ).load( "admin/ehospital_settings.jsp" );
    document.getElementById('loading_div').style.display='none';

}
function loadUserProfile1()
{

    JSPOPUP_createModalPopUp("user_profile.jsp");
	//var div1 = document.getElementById('mainContent');
	/*var div = document.getElementById('apps_div');
	var full_path = 'user_profile.jsp'; 
	//div1.innerHTML="";
	div.innerHTML="";
	var myRequest=new ajaxObject(full_path);
	myRequest.callback=function(responseText)
		{
		 div.innerHTML= responseText;
		 }
	 myRequest.update();*/
}

function addnewuser()
{

    //var div1 = document.getElementById('mainContent');
    var div = document.getElementById('settingsdiv');
    var full_path = 'admin/new_user.jsp';
    //div1.innerHTML="";
    div.innerHTML="";
    var myRequest=new ajaxObject(full_path);
    myRequest.callback=function(responseText)
    {
        div.innerHTML= responseText;
    }
    myRequest.update();
}
function loadHome()
{
	document.getElementById('mainContent').innerHTML=""; 
	document.getElementById('loading_div').style.display='block';
	document.getElementById('loading_div').style.zIndex  = 1000;
		   
	$( "#mainContent" ).load( "home.jsp" );
	document.getElementById('loading_div').style.display='none';
		
}
function loadHr()
{
    document.getElementById('mainContent').innerHTML="";
    document.getElementById('loading_div').style.display='block';
    document.getElementById('loading_div').style.zIndex  = 1000;

    $( "#mainContent" ).load( "Hr.jsp" );
    document.getElementById('loading_div').style.display='none';

}

function loadapp(url)
{
    document.getElementById('mainContent').innerHTML="";
    document.getElementById('loading_div').style.display='block';
    document.getElementById('loading_div').style.zIndex  = 1000;

    document.getElementById('mainContent').innerHTML= '<iframe src='+url+' style="position:relative;' +
        'left:0px; bottom:0px; right:0px; width:100%; height:100%;'+
        'border:none; margin:0; padding:0;" scrolling="no"> </iframe>';
    //$( "#mainContent" ).load( "https://localhost:9443/kenyaemr/" );

    document.getElementById('loading_div').style.display='none';


}



function loadUserProfile(action)
{

	var div = document.getElementById('mainContent');
	var full_path = "user_profile.jsp"; 
	div.innerHTML="";
	var myRequest=new ajaxObject(full_path);
		myRequest.callback=function(responseText)
			{
			
			 div.innerHTML=responseText;
			 
			 if(action=="view")
	           {   
				var f = document.forms['form_user_profile'];
				for(var i=0,fLen=f.length;i<fLen;i++)
					{
					  if( f.elements[i].is('input:text') ) 
					   {
                        f.elements[i].readOnly = false;
                       }	
					}
					 
					 document.getElementById("save").style.visibility="hidden";
					 document.getElementById("edit").style.visibility="visible";
				  	
				   
				}
			 else if(action=="edit")
	           {   
				var f = document.forms['form_user_profile'];
				for(var i=0,fLen=f.length;i<fLen;i++)
					{
					  if( f.elements[i].is('input:text') ) 
					   {
                        f.elements[i].readOnly = false;
                       }	
					 }	
					 document.getElementById("save").style.visibility="visible";
					 document.getElementById("edit").style.visibility="hidden";
					 
				   
			   }
			  else if(action=="add")
	           {   
				var f = document.forms['form_user_profile'];
				for(var i=0,fLen=f.length;i<fLen;i++)
					{
						  if( f.elements[i].is('input:text') ) 
						   {
	                        f.elements[i].readOnly = false;
	                       }	
					}
					 document.getElementById("save").style.visibility="visible";
					 document.getElementById("edit").style.visibility="hidden";
				    	
				   
			  }	
			  else
			  {
			  }
			}
		myRequest.update();	
			
      	  
}
function loadUserProfile(action)
{
	
	var div = document.getElementById('mainContent');
	var full_path = "user_profile.jsp"; 

	var myRequest=new ajaxObject(full_path);
		myRequest.callback=function(responseText)
			{
			div.innerHTML=responseText;
			 if(action=="view")
		        {   
					var f = document.forms['form_user_profile'];
					for(var i=0,fLen=f.length;i<fLen;i++)
						{
						 f.elements[i].readOnly = true;
						}
				 }
		myRequest.update();	
			}
      	  
}
function cancel(form)
{
	var f = document.forms[form];
		for(var i=0,fLen=f.length;i<fLen;i++)
		 {
		 if( f.elements[i].is('input:text') ) 
					   {
                        f.elements[i].value = "";
                       }
		 }
}

function check_email_address($email) 
{ // First, we check that there's one @ symbol, and that the lengths are right 
	if (!ereg("^[^@]{1,64}@[^@]{1,255}$", $email)) 
	 { // Email invalid because wrong number of characters in one section, or wrong number of @ symbols. 
		return false; 
	 } // Split it into sections to make life easier 
	$email_array = explode("@", $email);
	$local_array = explode(".", $email_array[0]);
	for ($i = 0; $i < sizeof($local_array); $i++) 
	 { 
		if (!ereg("^(([A-Za-z0-9!#$%&'*+/=?^_`{|}~-][A-Za-z0-9!#$%&'*+/=?^_`{|}~\.-]{0,63})|(\"[^(\\|\")]{0,62}\"))$", $local_array[$i])) 
		{
			return false; 
		} 
	 } 
	if (!ereg("^\[?[0-9\.]+\]?$", $email_array[1])) 
		{ // Check if domain is IP. If not, it should be valid domain name 
			$domain_array = explode(".", $email_array[1]); 
			if (sizeof($domain_array) < 2) 
			{ 
				return false; // Not enough parts to domain 
			} 
			for ($i = 0; $i < sizeof($domain_array); $i++) 
			{ 
				if (!ereg("^(([A-Za-z0-9][A-Za-z0-9-]{0,61}[A-Za-z0-9])|([A-Za-z0-9]+))$", $domain_array[$i])) 
				{ 
					return false; 
				} 
			} 
		} 
	   return true; 
			
         
}






function alert_box(msg,action_var)
{
    //This function will be used to display a customised alert box.This defaul alert box on most browsers is not only irritating but also very monotonous,so we decided to come up with ours
    //alert(action_var);
    for(var i=0;i<=20;i++)
    {

        var pname='admin/alert.jsp?msg='+msg+'&';

        var div=document.getElementById('alert_div');
        var myRequest=new ajaxObject(pname);
        myRequest.callback=function(responseText)
        {

            div.innerHTML=responseText;
            div.style.display='block';
            div.style.position='absolute';
            div.style.left='25%';
            div.style.top='30%';
            div.style.height='auto';
            div.style.width='auto';
            div.style.zIndex = 10000000;
            //after  displaying the alert box,block all other window components by displaying some  overlat on them
            //Put the focus on the OK button on the alert box to give the user a chance of using the Enter  key on their keyboards to exit the alert

            document.getElementById('OK_Button').focus();
        }
        myRequest.update();
        return false;
    }

}














    var NS4 = (navigator.appName == "Netscape" && parseInt(navigator.appVersion) < 5);

    function addOption(theSel,theText, theValue)
{
    var newOpt = new Option(theText, theValue);
    var selLength = theSel.length;
    theSel.options[selLength] = newOpt;






}

    function deleteOption(theSel, theIndex)
{
    var selLength = theSel.length;

    theSel.options[theIndex] = null;

    }

    function moveOptions(theSelFrom, theSelTo)
{

    var selLength = theSelFrom.length;
    var selectedText = new Array();
    var selectedValues = new Array();
    var selectedCount = 0;

    var i;

    // Find the selected Options in reverse order
    // and delete them from the 'from' Select.
    for(i=selLength-1; i>=0; i--)
    {


        if(theSelFrom.options[i].selected)
        {
        selectedText[selectedCount] = theSelFrom.options[i].text;
        selectedValues[selectedCount] = theSelFrom.options[i].value;
            if(theSelFrom.name=="sel2")
            {
        deleteOption(theSelFrom, i);
            }
        selectedCount++;
        }

    }

    // Add the selected text/values in reverse order.
    // This will add the Options to the 'to' Select
    // in the same order as they were in the 'from' Select.
    for(i=selectedCount-1; i>=0; i--)
  {
      if(theSelTo.name=="sel2" && !checkifroleexists(selectedValues[i]))
      {

      addOption(theSelTo, selectedText[i], selectedValues[i]);
      }
   }

    if(NS4) history.go(0);
    }


function checkifroleexists(value)
{   var exists=false;
    for(var i = 0, opts = document.getElementById("sel2").options; i < opts.length; ++i)
        if( opts[i].value == value )
        {

            exists=true;
           return exists;
        }
}