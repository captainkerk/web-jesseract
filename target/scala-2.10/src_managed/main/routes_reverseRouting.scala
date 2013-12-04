// @SOURCE:C:/Users/JFK/Desktop/hello-play/conf/routes
// @HASH:12205b800734fbeb56bf0548952cbd418651fe38
// @DATE:Mon Dec 02 15:33:21 CST 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers {

// @LINE:9
// @LINE:8
class ReverseMessageController {
    

// @LINE:8
def getMessage(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "message")
}
                                                

// @LINE:9
def javascriptRoutes(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/javascripts/routes")
}
                                                
    
}
                          

// @LINE:13
class ReverseWebJarAssets {
    

// @LINE:13
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "webjars/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:7
// @LINE:6
// @LINE:5
class ReverseMainController {
    

// @LINE:5
def mainPage(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:6
def test(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "test")
}
                                                

// @LINE:7
def uploadFile(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "upload")
}
                                                
    
}
                          

// @LINE:12
class ReverseAssets {
    

// @LINE:12
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          
}
                  


// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers.javascript {

// @LINE:9
// @LINE:8
class ReverseMessageController {
    

// @LINE:8
def getMessage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MessageController.getMessage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
      }
   """
)
                        

// @LINE:9
def javascriptRoutes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MessageController.javascriptRoutes",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/javascripts/routes"})
      }
   """
)
                        
    
}
              

// @LINE:13
class ReverseWebJarAssets {
    

// @LINE:13
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebJarAssets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:7
// @LINE:6
// @LINE:5
class ReverseMainController {
    

// @LINE:5
def mainPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MainController.mainPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:6
def test : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MainController.test",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test"})
      }
   """
)
                        

// @LINE:7
def uploadFile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MainController.uploadFile",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "upload"})
      }
   """
)
                        
    
}
              

// @LINE:12
class ReverseAssets {
    

// @LINE:12
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              
}
        


// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers.ref {


// @LINE:9
// @LINE:8
class ReverseMessageController {
    

// @LINE:8
def getMessage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MessageController.getMessage(), HandlerDef(this, "controllers.MessageController", "getMessage", Seq(), "GET", """""", _prefix + """message""")
)
                      

// @LINE:9
def javascriptRoutes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MessageController.javascriptRoutes(), HandlerDef(this, "controllers.MessageController", "javascriptRoutes", Seq(), "GET", """""", _prefix + """assets/javascripts/routes""")
)
                      
    
}
                          

// @LINE:13
class ReverseWebJarAssets {
    

// @LINE:13
def at(file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebJarAssets.at(file), HandlerDef(this, "controllers.WebJarAssets", "at", Seq(classOf[String]), "GET", """""", _prefix + """webjars/$file<.+>""")
)
                      
    
}
                          

// @LINE:7
// @LINE:6
// @LINE:5
class ReverseMainController {
    

// @LINE:5
def mainPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MainController.mainPage(), HandlerDef(this, "controllers.MainController", "mainPage", Seq(), "GET", """""", _prefix + """""")
)
                      

// @LINE:6
def test(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MainController.test(), HandlerDef(this, "controllers.MainController", "test", Seq(), "GET", """""", _prefix + """test""")
)
                      

// @LINE:7
def uploadFile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MainController.uploadFile(), HandlerDef(this, "controllers.MainController", "uploadFile", Seq(), "POST", """""", _prefix + """upload""")
)
                      
    
}
                          

// @LINE:12
class ReverseAssets {
    

// @LINE:12
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          
}
        
    