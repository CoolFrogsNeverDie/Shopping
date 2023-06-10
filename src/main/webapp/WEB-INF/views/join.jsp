<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=utf-8" %>
<!doctype html>
<html lang="ko">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Hello, world!</title>
<link
href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
rel="stylesheet"
/>
<!-- Google Fonts -->
<link
href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
rel="stylesheet"
/>
<!-- MDB -->
<link
href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.2.0/mdb.min.css"
rel="stylesheet" />
<!-- MDB -->
<script
  type="text/javascript"
  src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.2.0/mdb.min.js"
></script>
  </head>
  <body>
<form action ="join.do" method ="POST">

        <!-- Email input -->
        <div class="form-outline mb-4">
          <input type="text" id="customerID" name = "customerID" class="form-control" />
          <label class="form-label" for="customerID">User ID</label>
        </div>
  
        <!-- Password input -->
        <div class="form-outline mb-4">
          <input type="password" id="customerPassword" name = "customerPassword" class="form-control" />
          <label class="form-label" for="customerPassword">Password</label>
        </div>

        <div class="form-outline mb-4">
          <input type="text" id="customerName" name = "customerName" class="form-control" />
          <label class="form-label" for="customerName">User Name</label>
        </div>
		
        <div class="form-outline mb-4">
          <input type="text" id="customerNumber" name = "customerNumber" class="form-control" />
          <label class="form-label" for="customerNumber">User Number</label>
        </div>
  
        <div>
        <input type ="radio" name ="codeType" value="1" checked>개인
        <input type ="radio" name ="codeType" value="2">기업
        </div>
        
       
        <!-- Submit button -->
        <button type="submit" class="btn btn-primary btn-block mb-4">Sign in</button>
  
        <!-- Register buttons -->
        <div class="text-center">
          <p>Not a member? <a href="#!">Register</a></p>
        </div>
      </form>
    </div>
    <div class="tab-pane fade" id="pills-register" role="tabpanel" aria-labelledby="tab-register">
      <form>
        <div class="text-center mb-3">
          <p>Sign up with:</p>
          <button type="button" class="btn btn-secondary btn-floating mx-1">
            <i class="fab fa-facebook-f"></i>
          </button>
  
          <button type="button" class="btn btn-secondary btn-floating mx-1">
            <i class="fab fa-google"></i>
          </button>
  
          <button type="button" class="btn btn-secondary btn-floating mx-1">
            <i class="fab fa-twitter"></i>
          </button>
  
          <button type="button" class="btn btn-secondary btn-floating mx-1">
            <i class="fab fa-github"></i>
          </button>
        </div>
  
        <p class="text-center">or:</p>
  
        <!-- Name input -->
        <div class="form-outline mb-4">
          <input type="text" id="registerName" class="form-control" />
          <label class="form-label" for="registerName">Name</label>
        </div>
  
        <!-- Username input -->
        <div class="form-outline mb-4">
          <input type="text" id="registerUsername" class="form-control" />
          <label class="form-label" for="registerUsername">Username</label>
        </div>
  
        <!-- Email input -->
        <div class="form-outline mb-4">
          <input type="email" id="registerEmail" class="form-control" />
          <label class="form-label" for="registerEmail">Email</label>
        </div>
  
        <!-- Password input -->
        <div class="form-outline mb-4">
          <input type="password" id="registerPassword" class="form-control" />
          <label class="form-label" for="registerPassword">Password</label>
        </div>
  
        <!-- Repeat Password input -->
        <div class="form-outline mb-4">
          <input type="password" id="registerRepeatPassword" class="form-control" />
          <label class="form-label" for="registerRepeatPassword">Repeat password</label>
        </div>
  
        <!-- Checkbox -->
        <div class="form-check d-flex justify-content-center mb-4">
          <input
            class="form-check-input me-2"
            type="checkbox"
            value=""
            id="registerCheck"
            checked
            aria-describedby="registerCheckHelpText"
          />
          <label class="form-check-label" for="registerCheck">
            I have read and agree to the terms
          </label>
        </div>
  
        <!-- Submit button -->
        <button type="submit" class="btn btn-primary btn-block mb-3">Sign in</button>

</form>

      </form>
    </div>
  </div>

</body>
</html>