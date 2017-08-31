<%--
  Created by IntelliJ IDEA.
  User: administrator
  Date: 2017/8/31 0031
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>玩玩</title>
  <script language="JavaScript" src="../../js/jquery-3.2.1.min.js"></script>
  <script language="JavaScript">
    function add(){

      go($.("#add").val(),"POST");
    }
    function del(){
      go($.("#delete").val(),"DELETE");
    }
    function put(){
      go($.("#put").val(),"PUT");
    }
    function gett(){
      go($.("#get").val(),"GET");
    }
    function go(val,meh){
      $.ajax({
        url:"item",
        data:val,

        success:function(data){

        },
        dataType:JSON
      });
    }


  </script>
</head>
<body>

<div align="center">
  <h1><input type="text" id="add"><input type="button" onclick="add();" value="添加"></h1>
  <h1><input type="text" id="delete"><input type="button" onclick="del();" value="添加"></h1>
  <h1><input type="text" id="put"><input type="button" onclick="put();" value="添加"></h1>
  <h1><input type="text" id="get"><input type="button" onclick="gett();" value="添加"></h1>


</div>




</body>
</html>
