<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

      <!-- Top Nav Bar  include∑Œ ª¨ øπ¡§¿”-->
      <div name = "top bar">
      <nav class="navbar navbar-expand-lg bg-dark-subtle">
        <div class="container-fluid">
          <a class="navbar-brand" href="#"><b>Manager Page</b></a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarText">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}/product/productView">Product</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/customer/customerView">Customer</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/sales/salesView">Sales</a>
              </li>
            </ul>
            <span class="navbar-text">
              æ»≥Á«œººø‰! 000¥‘  <a class="btn btn-secondary disabled" role="button" aria-disabled="true" href="${pageContext.request.contextPath}/logout">Logout</a>
            </span>
          </div>
        </div>
    </nav>
</div>
    <!--Top Nav Bar End-->