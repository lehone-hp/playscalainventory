package controllers

import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}

class AdminController @Inject()(cc: ControllerComponents) extends AbstractController(cc){

  def index = Action { implicit request =>

    Ok(views.html.admin.index());
  }

  def customers = Action { implicit request =>
    Ok(views.html.admin.customers.index());
  }

  def users = Action { implicit  request =>
    Ok(views.html.admin.users.index())
  }
}
