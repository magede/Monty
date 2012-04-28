package controllers

import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import play.api.libs.json.Json._

import anorm._

import views._
import models._

object Games extends Controller {
  
  val myForm = Form(
    	"playerName" -> text
   )
  
 // def newGame = ((views.html.index(myForm)))
 
  
}