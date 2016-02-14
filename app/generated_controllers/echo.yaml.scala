
import play.api.mvc.{Action, Controller}

import play.api.data.validation.Constraint

import de.zalando.play.controllers._

import PlayBodyParsing._

import PlayValidations._

import scala.util._



import scala.util.Success



package echo.yaml {

    class EchoYaml extends EchoYamlBase {
        val get = getAction { _ =>
                        
                      Success(200, "")

            

        } //////// EOF ////////  getAction
        val post = postAction { input: (PostName, PostName) =>
            val (name, year) = input
            
                      Success(200, PostResponses200(name, year))

            

        } //////// EOF ////////  postAction
        val gettest_pathById = gettest_pathByIdAction { (id: String) =>
                        
                      Success(200, id)

            

        } //////// EOF ////////  gettest_pathByIdAction
    }
}
