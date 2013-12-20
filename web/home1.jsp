
<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256" %>

<%@ include file="header.jsp" %>




<div id="loading_div" style="width:400px; display:none; position:absolute; top:300px; left:400px;">
  <div align="center">
    <table width="100%" border="0" align="center" cellpadding="3" cellspacing="1" style="border:dotted 1px #5D5D5D;">
      <tr><td>&nbsp;</td></tr><tr><td align="center"><img src="resources/img/loading.gif" width="50" height="50"></td></tr><tr><td align="center" class="small">Loading .... please wait.</td></tr><tr><td>&nbsp;</td></tr>
    </table>
  </div>
</div>



<div id="mainContent"   >
<%@ include file="home.jsp" %>

<div id="popup_div" onMouseMove="javascript:checkLoadedObjects(event);" onMouseUp="javascript:dropLoadedObject(event)"> </div>
    <%--</div>
    <div id="QuitWindowDiv" onDblClick="javascript:getReadyToMove('QuitWindowDiv', event);" onMouseUp="javascript:dropLoadedObject(event)" onClick="javascript:dropLoadedObject(event);"></div>
    <div id="alert_div" onMouseMove="javascript:checkLoadedObjects(event);" onMouseUp="javascript:dropLoadedObject(event)" ></div>--%>
<%--<div id="light" class="white_content"> <a href = "javascript:void(0)" onclick = "document.getElementById('light').style.display='none';document.getElementById('fade').style.display='none'">Close</a></div>
<div id="fade" class="black_overlay"></div>--%>
<%--<iframe id="contentframe"  width="100%"  src="https://localhost:9443/kenyaemr/kenyaemr/intake/intakeHome.page"  scrolling="no" style="visibility: visible; position: absolute; height:100%"  ></iframe>--%>


</div>

<%@ include file="footer.jsp" %>
</body>



    <%--  <!--
<%@ include file="home.jsp" %> -->
--%>