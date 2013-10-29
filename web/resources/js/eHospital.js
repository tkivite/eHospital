

function loadUserProfile1(action)
{
	
	//var div1 = document.getElementById('mainContent');
	var div = document.getElementById('apps_div');
	var full_path = 'user_profile.jsp'; 
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
function loadTriage()
{
	//$( "#mainContent" ).load( "home1.jsp" );
	$( "#mainContent" ).load("http://localhost:8069/?db=test#page=0&limit=80&view_type=list&model=res.partner&menu_id=306&action=320");
}
function loadRegistration()
{
	//var myurl="http://localhost:8069/?db=test#page=0&limit=80&view_type=list&model=res.partner&menu_id=306&action=320";
	//$( "#mainContent" ).load( "http://localhost:8069/?db=test#page=0&limit=80&view_type=list&model=res.partner&menu_id=306&action=320" );
	//$.getJSON( myurl + '&callback=?', function(data) {
		  // do my stuff
	//	});
	//$( "#mainContent" ).load( "http://localhost:8080/openmrs/index.htm" );
	var url= "http://localhost:8080/openmrs/index.htm";
	$( "#mainContent" ).load( url );
	//$('#mainContent').html('<iframe id="myframe" src="'+ url+'" scrolling="no" style="position:inherit; border: 0px none; height: 100%; margin-top: -50px; width: 100%; z-index:-500">');
	//var content='<iframe height="auto" scrolling="auto" id="main_window"  name="main_window" src="http://localhost:8069/?db=test#page=0&limit=80&view_type=list&model=res.partner&action=320" style="visibility:hidden; width:100%" ></iframe>';
	//document.getElementById('mainContent').innerHTML=content;
	//document.getElementById('main_window').style.visibility='visible';
	/*var div = document.getElementById('mainContent');
	var uname="admin";
	var pw="Admin123";
	//var full_path='http://209.10.74.136:8080/openmrs/kenyaemr/registration/registrationHome.page';
	//var full_path = 'http://localhost:8080/openmrs/index.htm?uname='+uname+'&pw='+pw+'&'; 
	var full_path='http://localhost:8080/openmrs/index.htm';
	div.innerHTML="";
	var myRequest=new ajaxObject(full_path);
	myRequest.callback=function(responseText)
		{
		 alert(responseText);
		 alert(full_path);
		 div.innerHTML= responseText;
		 }
	
	 myRequest.update();		*/
}

function loadUserProfile(action)
{
	alert("here");
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
