// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/bingerso/GitHub-Projects/csc750-project3/bingers-project3/conf/routes
// @DATE:Sat Oct 27 15:27:25 EDT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
