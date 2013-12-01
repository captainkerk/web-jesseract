
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>
<html>
<head>
    <title>"""),_display_(Seq[Any](/*6.13*/title)),format.raw/*6.18*/("""</title>
    <link rel='shortcut icon' type='image/png' href='"""),_display_(Seq[Any](/*7.55*/routes/*7.61*/.Assets.at("images/favicon.png"))),format.raw/*7.93*/("""'>
    <link rel='stylesheet' href='"""),_display_(Seq[Any](/*8.35*/routes/*8.41*/.WebJarAssets.at(WebJarAssets.locate("bootstrap.min.css")))),format.raw/*8.99*/("""'>
    <link rel='stylesheet' href='"""),_display_(Seq[Any](/*9.35*/routes/*9.41*/.Assets.at("stylesheets/index.css"))),format.raw/*9.76*/("""'>
    <script type='text/javascript' src='"""),_display_(Seq[Any](/*10.42*/routes/*10.48*/.WebJarAssets.at(WebJarAssets.locate("jquery.min.js")))),format.raw/*10.102*/("""'></script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*11.42*/routes/*11.48*/.MessageController.javascriptRoutes)),format.raw/*11.83*/(""""></script>
</head>
<body>
    <div class="navbar navbar-fixed-top">
        <div class="navbar-inner">
            <div class="container-fluid">
                <a id="titleLink" class="brand" href="/">"""),_display_(Seq[Any](/*17.59*/title)),format.raw/*17.64*/("""</a>
            </div>
        </div>
    </div>
    <div class="container">
        """),_display_(Seq[Any](/*22.10*/content)),format.raw/*22.17*/("""
    </div>
</body>
</html>"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Nov 29 16:21:39 CST 2013
                    SOURCE: C:/Users/JFK/Desktop/hello-play/app/views/main.scala.html
                    HASH: 661eede5b50748a9149881a6b2b6f1f69cdec237
                    MATRIX: 560->1|684->31|763->75|789->80|887->143|901->149|954->181|1026->218|1040->224|1119->282|1191->319|1205->325|1261->360|1341->404|1356->410|1433->464|1522->517|1537->523|1594->558|1834->762|1861->767|1984->854|2013->861
                    LINES: 19->1|22->1|27->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|38->17|38->17|43->22|43->22
                    -- GENERATED --
                */
            