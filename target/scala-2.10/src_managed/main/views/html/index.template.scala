
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main("Welcome to Play Framework")/*3.35*/ {_display_(Seq[Any](format.raw/*3.37*/("""

    <script type='text/javascript' src='"""),_display_(Seq[Any](/*5.42*/routes/*5.48*/.Assets.at("javascripts/index.min.js"))),format.raw/*5.86*/("""'></script>
    
    <div class="well">
        <h1>"""),_display_(Seq[Any](/*8.14*/message)),format.raw/*8.21*/("""</h1>
    </div>

    <button id="getMessageButton">Get JSON Message</button>

""")))})),format.raw/*13.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Nov 29 16:21:39 CST 2013
                    SOURCE: C:/Users/JFK/Desktop/hello-play/app/views/index.scala.html
                    HASH: c32007ea5e39a3bb485a26547cdff63219a9ca72
                    MATRIX: 556->1|667->18|704->21|745->54|784->56|862->99|876->105|935->143|1023->196|1051->203|1162->283
                    LINES: 19->1|22->1|24->3|24->3|24->3|26->5|26->5|26->5|29->8|29->8|34->13
                    -- GENERATED --
                */
            