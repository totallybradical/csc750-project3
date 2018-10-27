// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/bingerso/GitHub-Projects/csc750-project3/bingers-project3/conf/routes
// @DATE:Sat Oct 27 15:27:25 EDT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:13
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def addMerchant(uniqueID:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addmerchant/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("uniqueID", uniqueID)))
    }
  
    // @LINE:22
    def isCommercial(transactionID:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "iscommercial/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("transactionID", transactionID)))
    }
  
    // @LINE:25
    def isPersonal(transactionID:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "ispersonal/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("transactionID", transactionID)))
    }
  
    // @LINE:31
    def isRefund(transactionID:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "isrefund/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("transactionID", transactionID)))
    }
  
    // @LINE:19
    def addTransaction(senderID:String, receiverID:String, transactionID:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addtransaction/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("senderID", senderID)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("receiverID", receiverID)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("transactionID", transactionID)))
    }
  
    // @LINE:28
    def isPurchase(transactionID:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "ispurchase/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("transactionID", transactionID)))
    }
  
    // @LINE:16
    def addConsumer(uniqueID:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addconsumer/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("uniqueID", uniqueID)))
    }
  
    // @LINE:34
    def isTrusted(merchantID:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "istrusted/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("merchantID", merchantID)))
    }
  
    // @LINE:37
    def reset(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "reset")
    }
  
  }

  // @LINE:6
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
