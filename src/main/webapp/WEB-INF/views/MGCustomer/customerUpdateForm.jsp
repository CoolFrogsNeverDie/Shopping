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
      

	<c:import url="/WEB-INF/views/include/headerNav.jsp"/>
	
	
    <div class="p-3 mb-2 bg-body text-body">    <!--배경색 start-->
        <br>

        
        <div align ="center" style ="margin: 5%;">
            <h1 class="display-6"><b>Customer Update Page</b></h1><br><hr><br>

            <!--키워드 검색 폼-->
            <form action="${pageContext.request.contextPath}/customer/search">
            <table>
                <tr>
                    <td> 
                        <select name="searchOption" class="form-select" >
                            <option>선택</option>
                            <option value="CustomerName">고객명</option>
                            <option value="CustomerId">고객아이디</option>
                        </select>
                    </td>
                    <td>
                        : <input type="text" name="keyword" /> <button type="submit" class="btn btn-secondary">Search</button>
                    </td>
                </tr>

            </table>
        </form><!-- 검색어 마지막-->
    <br>
       

    <!--수정 고객 정보 나열-->

            <bR>
                <div>
                <table  class="table table-striped" >
                    <tr >
                        <td style="width: 30%; text-align: center;" >고객 아이디</td>
                        <td style="width: 10%; text-align: center;">이름</td>
                        <td style="width: 30%; text-align: center;">고객 번호</td>
                        <td style="width: 10%; text-align: center;">코드타입</td>
                        <td style="width: 20%; text-align: center;"></td>
                    </tr>
                <form action = "${pageContext.request.contextPath}/customer/update">
                  <tr>
                    <td style="width: 30%; text-align: center;"><input type = "text" style ="width:95%;   border: none; " name = "customerId" value = "${updateCustomer.customerId}" readonly/></td>
                    <td style="width: 10%; text-align: center;"><input type = "text" style ="width:95%" name = "name" value = "${updateCustomer.name}" /></td>
                    <td style="width: 30%; text-align: center;"><input type = "text" style ="width:95%" name = "customerNumbers" value = "${updateCustomer.customerNumbers}" /></td>
                    <td style="width: 8%; text-align: center;"><input type = "number" style ="width:95%" name = "codeType" value = "${updateCustomer.codeType}" /></td>
                    <td style="width: 20%; text-align: center;" colspan="2">
                        <button type ="submit" id = "update" class="btn btn-secondary">수정</button>
                        <a href ="${pageContext.request.contextPath}/customer/delete/${updateCustomer.customerId}" id = "remove"  class="btn btn-primary">삭제</a>
                    </td>
                  </tr>
                  </form>
                </table>
                <br><br>
                <a href ="${pageContext.request.contextPath}/customer/customerView">고객 조회 페이지로 돌아가기</a>
              </div>
            </div>


    <!--수정 고객 정보 나열 end-->








    </div><!--배경색 end-->






    <script>
        function updateMinRange(value) {
          document.getElementById("minRangeInput").value = value;
        }
        function updateMaxRange(value) {
          document.getElementById("maxRangeInput").value = value;
        }

        </script>
  </body>
</html>