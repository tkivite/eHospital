//Script author:Kirathe Dickson
//This script will be involved in the movement of divs on the system display

//Store double clicked objects for movement on a array
var pickedUp = new Array("", false);

function getReadyToMove(element, evt) {
//This function is to alert the browser to get ready to move objects
pickedUp[0] = element;
pickedUp[1] = true;
}

function checkLoadedObjects(evt) {
	//This function actually moves the selected objects
  if (pickedUp[1] == true) {
	//If there were selected objects to move,store them on a variable called currentSelectiuon
  var currentSelection = document.getElementById(pickedUp[0]);

  currentSelection.style.position = "absolute";
  //Set the new position of the selected object with the coordinates of the mouse 
  currentSelection.style.top = (evt.clientY + 1-40) + "px";
  currentSelection.style.left = (evt.clientX + 1-100) + "px";
  }
}

function dropLoadedObject(evt) {
	//To stop moving the objects,invoke this function
  if (pickedUp[1] == true) {
//If there were selected objects to move,store them on a variable called currentSelectiuon

  var currentSelection = document.getElementById(pickedUp[0]);
  //Set the new position of the selected object with the coordinates of the mouse 
  currentSelection.style.position = "absolute";
  currentSelection.style.top = (evt.clientY +1-40) + "px";
  currentSelection.style.left = (evt.clientX +1-100) + "px";
  //The array that had stored the objects will now be wiped out to stop moving the objects
  pickedUp = new Array("", false);
  }
}



function beginDrag(elementToDrag, event){
	var deltaX = event.clientX - parseInt(elementToDrag.style.left);
	var deltaY = event.clientY - parseInt(elementToDrag.style.top);
	if (document.addEventListener){
		document.addEventListener("mousemove", moveHandler, true);
		document.addEventListener("mouseup", upHandler, true);
	}
	else if (document.attachEvent){
		document.attachEvent("onmousemove", moveHandler);
		document.attachEvent("onmouseup", upHandler);
	}
	else {
		var oldmovehandler = document.onmousemove;
		var olduphandler = document.onmouseup;
		document.onmousemove = moveHandler;
		document.onmouseup = upHandler;
	}
	if (event.stopPropagation) event.stopPropagation();
	else event.cancelBubble = true;
	if (event.preventDefault) event.preventDefault();
	else event.returnValue = false;
	function moveHandler(e){
		if (!e) e = window.event;
		elementToDrag.style.left = (e.clientX - deltaX) + "px";
		elementToDrag.style.top = (e.clientY - deltaY) + "px";
		if (e.stopPropagation) e.stopPropagation();
		else e.cancelBubble = true;
	}
	function upHandler(e){
		if (!e) e = window.event;
		if (document.removeEventListener){
			document.removeEventListener("mouseup", upHandler, true);
			document.removeEventListener("mousemove", moveHandler, true);
		}
		else if (document.detachEvent){
			document.detachEvent("onmouseup", upHandler);
			document.detachEvent("onmousemove", moveHandler);
		}
		else {
			document.onmouseup = olduphandler;
			document.onmousemove = oldmovehandler;
		}
		if (e.stopPropagation) e.stopPropagation();
		else e.cancelBubble = true;
	}
}
