<%-- 
    Document   : Formular
    Created on : Mar 15, 2019, 4:20:18 PM
    Author     : Miruna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- PAGE settings -->
  <link rel="icon" href="https://templates.pingendo.com/assets/Pingendo_favicon.ico">
  <title>Checkout</title>
  <meta name="description" content="Wireframe design of a checkout form by Pingendo">
  <meta name="keywords" content="Pingendo bootstrap example template wireframe checkout form">
  <meta name="author" content="Pingendo">
  <!-- CSS dependencies -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
  <link rel="stylesheet" href="wireframe.css">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body class="bg-light" >
        <div class="py-5">
    <div class="container">
      <div class="row">
        <div class="text-center col-md-7 mx-auto"> <i class="fa d-block fa-bullseye fa-5x mb-4 text-info"></i>
          <h2>Interpreteaza-ti analizele !</h2>
          <p class="lead">[.......]</p>
        </div>
      </div>
    </div>
  </div>
  <div class="">
    <div class="container">
      <div class="row">
        <div class="col-md-12 order-md-1">
          <h4 class="mb-3"><b>Formular analize</b></h4>
          <form class="needs-validation" novalidate="">
            <div class="mb-3">
              <div class="input-group">
                <div class="invalid-feedback" style="width: 100%;"> Your username is required. </div>
              </div>
            </div>
            <div class="mb-3">
              <div class="invalid-feedback"> Please enter a valid email address for shipping updates. </div>
            </div>
               <div class="form-group row"><label class="col-2">ID:&nbsp;&nbsp;</label>
              <div class="col-10"><input type="text" class="form-control"  name="id" id="address2"></div>
            </div>
            <div class="form-group row"><label class="col-2">Glucoza&nbsp;&nbsp; [mg/dL]</label>
              <div class="col-10"><input type="text" class="form-control"  name="glucoza" id="address2"></div>
            </div>
            <div class="form-group row"><label class="col-2">Colosterol&nbsp;&nbsp; [mg/dL]</label>
              <div class="col-10"><input type="text" class="form-control"  name="colesterol" id="address2"></div>
            </div>
            <div class="form-group row"><label class="col-2">LDL&nbsp; [mg/dL]</label>
              <div class="col-10"><input type="text" class="form-control"  name="ldl" id="address2"></div>
            </div>
            <div class="form-group row"><label class="col-2">HDL&nbsp;&nbsp; [mg/dL]</label>
              <div class="col-10"><input type="text" class="form-control"  name="hdl" id="address2"></div>
            </div>
            <div class="form-group row"><label class="col-2">Trigliceride&nbsp;&nbsp; [mg/dL]</label>
              <div class="col-10"><input type="text" class="form-control"  name="trigliceride" id="address2"></div>
            </div>
            <div class="form-group row"><label class="col-2">Fibrogen&nbsp;&nbsp; [mg/dL]</label>
              <div class="col-10"><input type="text" class="form-control"  name="fibrogen" id="address2"></div>
            </div>
            <div class="form-group row"><label class="col-2">Hemoglobina A1C [%]&nbsp;</label>
              <div class="col-10"><input type="text" class="form-control"  name="hemoglobina" id="address2"></div>
            </div>
            <div class="form-group row"><label class="col-2">TSH&nbsp; [mU/L]</label>
              <div class="col-10"><input type="text" class="form-control"  name="tsh" id="address2"></div>
            </div>
            <div class="form-group row"><label class="col-2">DHEA&nbsp; [µg/dL]</label>
              <div class="col-10"><input type="text" class="form-control"  name="dhea" id="address2"></div>
            </div>
            <div class="form-group row"><label class="col-2">PSA&nbsp;</label>
              <div class="col-10"><input type="text" class="form-control"  name="psa" id="address2" placeholder="Men ONLY"></div>
            </div>
            <div class="form-group row"><label class="col-2">Homocisteina&nbsp; [µmol/L]</label>
              <div class="col-10"><input type="text" class="form-control"  name="homocisteina" id="address2"></div>
            </div>
            <div class="form-group row"><label class="col-2">Proteina C-Reactiva[mg/L]<br><br></label>
              <div class="col-10"><input type="text" class="form-control"  name="proteina" id="address2"></div>
            </div>
            <div class="form-group row"><label class="col-2">Testosteron&nbsp; [pg/mL]</label>
              <div class="col-10"><input type="text" class="form-control"  name="testosteron" id="address2"></div>
            </div>
            <div class="form-group row"><label class="col-2">Estradiol&nbsp; [ pg/mL]</label>
              <div class="col-10"><input type="text" class="form-control"  name="estradiol" id="address2"></div>
            </div>
            <hr class="mb-4">
            <hr class="mb-4">
            <div class="form-group row">
              <div class="col-10 col-md-6"></div>
              <div class="col-md-6"><a class="btn btn-secondary" href="RezultateAnalize.jsp">VERIFICA ACUM!&nbsp;</a></div>
            </div>
          </form>
        </div>
      </div>
    </div>
  </div>
  <div class="py-5 text-muted text-center">
    <div class="container">
      <div class="row">
        <div class="col-md-12 my-4">
          <p class="mb-1" contenteditable="true">© 2018-2019 Clinica Online dezvoltata de Verdes &amp; Dutu<br></p>
        </div>
      </div>
    </div>
  </div>
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
  <script src="assets/js/validation.js" style=""></script>
  <pingendo onclick="window.open('https://pingendo.com/', '_blank')" style="cursor:pointer;position: fixed;bottom: 20px;right:20px;padding:4px;background-color: #00b0eb;border-radius: 8px; width:220px;display:flex;flex-direction:row;align-items:center;justify-content:center;font-size:14px;color:white">Made with Pingendo Free&nbsp;&nbsp;<img src="https://pingendo.com/site-assets/Pingendo_logo_big.png" class="d-block" alt="Pingendo logo" height="16"></pingendo>

    </body>
</html>
