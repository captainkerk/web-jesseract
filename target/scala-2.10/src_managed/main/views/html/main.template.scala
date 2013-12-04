
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Jesseract -- image to text conversion.</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Le styles -->
    <link rel='stylesheet' href='"""),_display_(Seq[Any](/*11.35*/routes/*11.41*/.Assets.at("css/bootstrap.css"))),format.raw/*11.72*/("""'>
    <link rel='stylesheet' href='"""),_display_(Seq[Any](/*12.35*/routes/*12.41*/.Assets.at("css/bootstrap-responsive.css"))),format.raw/*12.83*/("""'>

    
    <style type="text/css">
      body """),format.raw/*16.12*/("""{"""),format.raw/*16.13*/("""
        padding-top: 60px;
        padding-bottom: 40px;
      """),format.raw/*19.7*/("""}"""),format.raw/*19.8*/("""
    </style>
    <link href="css/bootstrap-responsive.css" rel="stylesheet">

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="../assets/js/html5shiv.js"></script>
    <![endif]-->

    <!-- Fav and touch icons -->
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="../assets/ico/apple-touch-icon-114-precomposed.png">
      <link rel="apple-touch-icon-precomposed" sizes="72x72" href="../assets/ico/apple-touch-icon-72-precomposed.png">
                    <link rel="apple-touch-icon-precomposed" href="../assets/ico/apple-touch-icon-57-precomposed.png">
                                   <link rel="shortcut icon" href="../assets/ico/favicon.png">
    
  </head>

  <body>

    <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <!-- <a class="brand" href="#">Project name</a> -->
          <div class="nav-collapse collapse">
            <ul class="nav">
              <li class="active"><a href="#">Home</a></li>
              <li><a href="#about">About</a></li>
    		<li><a href="#contact">Get Started!</a></li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Sign In!<b class="caret"></b></a>
                <ul class="dropdown-menu">

					<form class="navbar-form">
					<div class="centeredForm">
						&nbsp &nbsp <input class="span2" type="text" placeholder="Email"> &nbsp
						<br>
						&nbsp &nbsp <input class="span2" type="password" placeholder="Password">
						<br>
						&nbsp &nbsp <button type="submit" class="btn">Sign in</button>
						
					</div>	
					</form>
					<li>
					<li><a href="/forgotPassword.html">Forgot Password?</a></li>
                </ul>
              </li>
			  
			  <li>
            </ul>

          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>

    <div class="container">

      <!-- Main hero unit for a primary marketing message or call to action -->
      <div class="hero-unit">
	  <div class = "centeredForm">
	  <h2>jesseract: an image to text converter</h2>
	  
	 
	<div class="main-form">
      """),_display_(Seq[Any](/*89.8*/helper/*89.14*/.form(action = routes.MainController.uploadFile, 'enctype -> "multipart/form-data")/*89.97*/ {_display_(Seq[Any](format.raw/*89.99*/("""
    
    <input type="file" name="picture" id="imgInp">
    
    <p>
        <input type="submit">
    </p>
    
        """)))})),format.raw/*97.10*/("""
      </div>
        
      <div class="upload-image-preview">
	  <img id="uploaded-image" src="#" alt="" />
	  
	
	  
	  </div>
	  
	  </div>
	     
	  
      </div>
	  

      <hr>

      <footer>
        <p>&copy; Company 2013</p>
      </footer>

    </div> <!-- /container -->

    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    
<script type='text/javascript' src='"""),_display_(Seq[Any](/*125.38*/routes/*125.44*/.Assets.at("javascripts/jquery-1.9.1.js"))),format.raw/*125.85*/("""'></script>
<script type='text/javascript' src='"""),_display_(Seq[Any](/*126.38*/routes/*126.44*/.Assets.at("javascripts/bootstrap.js"))),format.raw/*126.82*/("""'></script>
	<script>							   
	function readURL(input) """),format.raw/*128.26*/("""{"""),format.raw/*128.27*/("""

    if (input.files && input.files[0]) """),format.raw/*130.40*/("""{"""),format.raw/*130.41*/("""
			var reader = new FileReader();

			reader.onload = function (e) """),format.raw/*133.33*/("""{"""),format.raw/*133.34*/("""
				$('#uploaded-image').attr('src', e.target.result);
			"""),format.raw/*135.4*/("""}"""),format.raw/*135.5*/("""

			reader.readAsDataURL(input.files[0]);
		"""),format.raw/*138.3*/("""}"""),format.raw/*138.4*/("""
	"""),format.raw/*139.2*/("""}"""),format.raw/*139.3*/("""

		$("#imgInp").change(function()"""),format.raw/*141.33*/("""{"""),format.raw/*141.34*/("""
		readURL(this);
	"""),format.raw/*143.2*/("""}"""),format.raw/*143.3*/(""");
	</script>
	<script>
		function formSubmit()
		"""),format.raw/*147.3*/("""{"""),format.raw/*147.4*/("""
		document.getElementById("pictureForm").submit();
		alert("thanks");
		"""),format.raw/*150.3*/("""}"""),format.raw/*150.4*/("""
	</script>
	
  </body>
</html>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Dec 02 15:33:23 CST 2013
                    SOURCE: C:/Users/JFK/Desktop/hello-play/app/views/main.scala.html
                    HASH: 9aab1db4cb4a1b9fdc60a93860e4a5816224a7d5
                    MATRIX: 636->0|1009->337|1024->343|1077->374|1150->411|1165->417|1229->459|1305->507|1334->508|1425->572|1453->573|4057->3142|4072->3148|4164->3231|4204->3233|4359->3356|4876->3836|4892->3842|4956->3883|5042->3932|5058->3938|5119->3976|5205->4033|5235->4034|5305->4075|5335->4076|5432->4144|5462->4145|5549->4204|5578->4205|5651->4250|5680->4251|5710->4253|5739->4254|5802->4288|5832->4289|5879->4308|5908->4309|5986->4359|6015->4360|6116->4433|6145->4434
                    LINES: 22->1|32->11|32->11|32->11|33->12|33->12|33->12|37->16|37->16|40->19|40->19|110->89|110->89|110->89|110->89|118->97|146->125|146->125|146->125|147->126|147->126|147->126|149->128|149->128|151->130|151->130|154->133|154->133|156->135|156->135|159->138|159->138|160->139|160->139|162->141|162->141|164->143|164->143|168->147|168->147|171->150|171->150
                    -- GENERATED --
                */
            