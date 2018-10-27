// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/bingerso/GitHub-Projects/csc750-project3/bingers-project3/conf/routes
// @DATE:Sat Oct 27 15:27:25 EDT 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:13
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def addMerchant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addMerchant",
      """
        function(uniqueID0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addmerchant/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("uniqueID", uniqueID0))})
        }
      """
    )
  
    // @LINE:22
    def isCommercial: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.isCommercial",
      """
        function(transactionID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "iscommercial/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("transactionID", transactionID0))})
        }
      """
    )
  
    // @LINE:25
    def isPersonal: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.isPersonal",
      """
        function(transactionID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ispersonal/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("transactionID", transactionID0))})
        }
      """
    )
  
    // @LINE:31
    def isRefund: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.isRefund",
      """
        function(transactionID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "isrefund/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("transactionID", transactionID0))})
        }
      """
    )
  
    // @LINE:19
    def addTransaction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addTransaction",
      """
        function(senderID0,receiverID1,transactionID2) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addtransaction/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("senderID", senderID0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("receiverID", receiverID1)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("transactionID", transactionID2))})
        }
      """
    )
  
    // @LINE:28
    def isPurchase: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.isPurchase",
      """
        function(transactionID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ispurchase/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("transactionID", transactionID0))})
        }
      """
    )
  
    // @LINE:16
    def addConsumer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addConsumer",
      """
        function(uniqueID0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addconsumer/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("uniqueID", uniqueID0))})
        }
      """
    )
  
    // @LINE:34
    def isTrusted: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.isTrusted",
      """
        function(merchantID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "istrusted/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("merchantID", merchantID0))})
        }
      """
    )
  
    // @LINE:37
    def reset: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.reset",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reset"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
