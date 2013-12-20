
<%

    session.invalidate();
    out.println("<script>parent.location.href='https://localhost:9443/cas/logout?url=https://localhost:8443/eHospital/'</script>");
    //https://auth.ucr.edu/cas/logout?service=http://casdemo.ucr.edu/
%>
