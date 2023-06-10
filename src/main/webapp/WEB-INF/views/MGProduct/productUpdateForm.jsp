<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>제품 수정 페이지?</title>
    <!--부트 스트랩 코드-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
  </head>
  <body>
    <!--부트 스트랩 코드-->
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
      

      <!-- Top Nav Bar  include로 뺄 예정임-->
  
	<c:import url="/WEB-INF/views/include/headerNav.jsp"/>
	
    <!--Top Nav Bar End-->

    <div class="p-3 mb-2 bg-body text-body">    <!--배경색 start-->
        <br>

        
        <div align ="center" style ="margin: 5%;">
            <h1 class="display-6"><b>Product Update</b></h1><br><hr><br>
            <form action = "${pageContext.request.contextPath}/product/update" >
            <table  class="table table-striped" style="width:80%">
                <tr >
                  <td style="width: 15%; text-align: center;" >제품코드</td>
                  <td style="width: 25%; text-align: center;">제품명</td>
                  <td style="width: 10%; text-align: center;">개수</td>
                  <td style="width: 20%; text-align: center;">가격</td>
                  <td style="width: 10%; text-align: center;"></td>
                  <td style="width: 10%; text-align: center;"></td>
                </tr>
                <tr>
                    
                  <td style="width: 15%; text-align: center;"><input type = "text" class="form-control"  name = "productId" id = "productId" value = "${updateProduct.productId}" readonly/></td>
                  <td style="width: 25%; text-align: center;"><input type = "text" class="form-control" name = "productName" value = "${updateProduct.productName}" required/></td>
                  <td style="width: 10%; text-align: center;"><input type = "number" class="form-control"  min = "0" name = "productEA" value = "${updateProduct.productEA}" required /></td>
                  <td style="width: 20%; text-align: center;"><input type = "number" class="form-control" min = "0" name = "price" value = "${updateProduct.price}" required/></td>
                  <td style="width: 10%; text-align: center;"><button type ="submit" class="btn btn-success" >등록</button></td>
                  <td style="width: 10%; text-align: center;"><a class="btn btn-secondary" role="button" aria-disabled="true" href="${pageContext.request.contextPath}/product/delete/${updateProduct.productId}" >삭제</a></td>
                </tr>
              </table>
                </form>
            </div>

        </div>




    </div><!--배경색 end-->






    
  </body>
</html>