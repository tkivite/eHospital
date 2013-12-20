<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256" %>

<% String msg=  request.getParameter("msg");   %>

?><table width="500" border="0">
<tr>
    <td width="470" class="alertsBox"  onMouseDown="javascript:getReadyToMove('alert_div', event);" onMouseUp="javascript:dropLoadedObject(event)" onClick="javascript:dropLoadedObject(event);">eHospital </td>
    <td width="20" class="alertsBox"><img src="../Main/Layout/images/close.png" width="20" height="20" onclick="close_alert_div()"></td>
</tr>
<tr>
    <td colspan="2" class="alertsText"><div id="show_msg" style="width:100%; height:auto;"><?php echo $msg; ?></div></td>
</tr>
<tr>
    <td colspan="2" align="center"><input type="button" name="Button" value="OK" id="OK_Button" onclick="close_alert_div()" />
    </td>
</tr>
</table>