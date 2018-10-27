// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/bingerso/GitHub-Projects/csc750-project3/bingers-project3/conf/routes
// @DATE:Sat Oct 27 15:27:25 EDT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Assets_1: controllers.Assets,
  // @LINE:13
  HomeController_0: controllers.HomeController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Assets_1: controllers.Assets,
    // @LINE:13
    HomeController_0: controllers.HomeController
  ) = this(errorHandler, Assets_1, HomeController_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_1, HomeController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addmerchant/""" + "$" + """uniqueID<[^/]+>""", """controllers.HomeController.addMerchant(uniqueID:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addconsumer/""" + "$" + """uniqueID<[^/]+>""", """controllers.HomeController.addConsumer(uniqueID:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addtransaction/""" + "$" + """senderID<[^/]+>/""" + "$" + """receiverID<[^/]+>/""" + "$" + """transactionID<[^/]+>""", """controllers.HomeController.addTransaction(senderID:String, receiverID:String, transactionID:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """iscommercial/""" + "$" + """transactionID<[^/]+>""", """controllers.HomeController.isCommercial(transactionID:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ispersonal/""" + "$" + """transactionID<[^/]+>""", """controllers.HomeController.isPersonal(transactionID:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ispurchase/""" + "$" + """transactionID<[^/]+>""", """controllers.HomeController.isPurchase(transactionID:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """isrefund/""" + "$" + """transactionID<[^/]+>""", """controllers.HomeController.isRefund(transactionID:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """istrusted/""" + "$" + """merchantID<[^/]+>""", """controllers.HomeController.isTrusted(merchantID:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset""", """controllers.HomeController.reset"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Assets_versioned0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned0_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_addMerchant1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addmerchant/"), DynamicPart("uniqueID", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_addMerchant1_invoker = createInvoker(
    HomeController_0.addMerchant(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addMerchant",
      Seq(classOf[String]),
      "POST",
      this.prefix + """addmerchant/""" + "$" + """uniqueID<[^/]+>""",
      """ Add an individual to Merchant class""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_addConsumer2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addconsumer/"), DynamicPart("uniqueID", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_addConsumer2_invoker = createInvoker(
    HomeController_0.addConsumer(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addConsumer",
      Seq(classOf[String]),
      "POST",
      this.prefix + """addconsumer/""" + "$" + """uniqueID<[^/]+>""",
      """ Add an individual to Consumer class""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_addTransaction3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addtransaction/"), DynamicPart("senderID", """[^/]+""",true), StaticPart("/"), DynamicPart("receiverID", """[^/]+""",true), StaticPart("/"), DynamicPart("transactionID", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_addTransaction3_invoker = createInvoker(
    HomeController_0.addTransaction(fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addTransaction",
      Seq(classOf[String], classOf[String], classOf[String]),
      "POST",
      this.prefix + """addtransaction/""" + "$" + """senderID<[^/]+>/""" + "$" + """receiverID<[^/]+>/""" + "$" + """transactionID<[^/]+>""",
      """ Add an individual to Transaction class""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_isCommercial4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("iscommercial/"), DynamicPart("transactionID", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_isCommercial4_invoker = createInvoker(
    HomeController_0.isCommercial(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "isCommercial",
      Seq(classOf[String]),
      "GET",
      this.prefix + """iscommercial/""" + "$" + """transactionID<[^/]+>""",
      """ Return whether a transaction is commercial""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_HomeController_isPersonal5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ispersonal/"), DynamicPart("transactionID", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_isPersonal5_invoker = createInvoker(
    HomeController_0.isPersonal(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "isPersonal",
      Seq(classOf[String]),
      "GET",
      this.prefix + """ispersonal/""" + "$" + """transactionID<[^/]+>""",
      """ Return whether a transaction is personal""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_HomeController_isPurchase6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ispurchase/"), DynamicPart("transactionID", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_isPurchase6_invoker = createInvoker(
    HomeController_0.isPurchase(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "isPurchase",
      Seq(classOf[String]),
      "GET",
      this.prefix + """ispurchase/""" + "$" + """transactionID<[^/]+>""",
      """ Return whether a transaction is a purchase transaction""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_HomeController_isRefund7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("isrefund/"), DynamicPart("transactionID", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_isRefund7_invoker = createInvoker(
    HomeController_0.isRefund(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "isRefund",
      Seq(classOf[String]),
      "GET",
      this.prefix + """isrefund/""" + "$" + """transactionID<[^/]+>""",
      """ Return whether a transaction is a refund transaction""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_HomeController_isTrusted8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("istrusted/"), DynamicPart("merchantID", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_isTrusted8_invoker = createInvoker(
    HomeController_0.isTrusted(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "isTrusted",
      Seq(classOf[String]),
      "GET",
      this.prefix + """istrusted/""" + "$" + """merchantID<[^/]+>""",
      """ Return whether a merchant is trusted (return an error if the ID is not a merchant)""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_HomeController_reset9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset")))
  )
  private[this] lazy val controllers_HomeController_reset9_invoker = createInvoker(
    HomeController_0.reset,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "reset",
      Nil,
      "POST",
      this.prefix + """reset""",
      """ This should reload the ontology (or delete all added individuals), so that I can start the testing afresh""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Assets_versioned0_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned0_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:13
    case controllers_HomeController_addMerchant1_route(params@_) =>
      call(params.fromPath[String]("uniqueID", None)) { (uniqueID) =>
        controllers_HomeController_addMerchant1_invoker.call(HomeController_0.addMerchant(uniqueID))
      }
  
    // @LINE:16
    case controllers_HomeController_addConsumer2_route(params@_) =>
      call(params.fromPath[String]("uniqueID", None)) { (uniqueID) =>
        controllers_HomeController_addConsumer2_invoker.call(HomeController_0.addConsumer(uniqueID))
      }
  
    // @LINE:19
    case controllers_HomeController_addTransaction3_route(params@_) =>
      call(params.fromPath[String]("senderID", None), params.fromPath[String]("receiverID", None), params.fromPath[String]("transactionID", None)) { (senderID, receiverID, transactionID) =>
        controllers_HomeController_addTransaction3_invoker.call(HomeController_0.addTransaction(senderID, receiverID, transactionID))
      }
  
    // @LINE:22
    case controllers_HomeController_isCommercial4_route(params@_) =>
      call(params.fromPath[String]("transactionID", None)) { (transactionID) =>
        controllers_HomeController_isCommercial4_invoker.call(HomeController_0.isCommercial(transactionID))
      }
  
    // @LINE:25
    case controllers_HomeController_isPersonal5_route(params@_) =>
      call(params.fromPath[String]("transactionID", None)) { (transactionID) =>
        controllers_HomeController_isPersonal5_invoker.call(HomeController_0.isPersonal(transactionID))
      }
  
    // @LINE:28
    case controllers_HomeController_isPurchase6_route(params@_) =>
      call(params.fromPath[String]("transactionID", None)) { (transactionID) =>
        controllers_HomeController_isPurchase6_invoker.call(HomeController_0.isPurchase(transactionID))
      }
  
    // @LINE:31
    case controllers_HomeController_isRefund7_route(params@_) =>
      call(params.fromPath[String]("transactionID", None)) { (transactionID) =>
        controllers_HomeController_isRefund7_invoker.call(HomeController_0.isRefund(transactionID))
      }
  
    // @LINE:34
    case controllers_HomeController_isTrusted8_route(params@_) =>
      call(params.fromPath[String]("merchantID", None)) { (merchantID) =>
        controllers_HomeController_isTrusted8_invoker.call(HomeController_0.isTrusted(merchantID))
      }
  
    // @LINE:37
    case controllers_HomeController_reset9_route(params@_) =>
      call { 
        controllers_HomeController_reset9_invoker.call(HomeController_0.reset)
      }
  }
}
