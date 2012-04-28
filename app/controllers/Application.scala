package controllers

import play.api._
import play.api.mvc._
import play.api.data.Forms._
import play.api.data._
import play.api.libs.json.Json._

import anorm._

import views._
import models._


object Application extends Controller {
  
    val myForm = Form(
    	"playerName" -> text
   )
  
  def newGame = Action {
      implicit request => myForm.bindFromRequest()
      
      NotFound
      //Ok(views.html.game("Mupp"));
  }
  
  def index = Action {
    Ok(views.html.index(myForm))
  }
  
}