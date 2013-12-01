package controllers;

import java.io.File;

import play.Play;
import play.mvc.*;
import play.mvc.Http.MultipartFormData;
import play.mvc.Http.MultipartFormData.FilePart;
import views.html.*;

public class MainController extends Controller 
{
	public static String uploadPath = "c:\\test\\temp\\";
	
    public static Result index() {
        return ok(views.html.index.render("Hello from Java"));
    }
    public static Result test() 
    {
        return ok(views.html.test.render());
    }
    
    public static Result uploadFile()
    {
      MultipartFormData body = request().body().asMultipartFormData();
      FilePart picture = body.getFile("picture");
      if (picture != null) 
      {
    	String fileName = picture.getFilename();
        String contentType = picture.getContentType(); 
        File file = picture.getFile();
        
        //String myUploadPath = Play.application().configuration().getString("uploadPath");
        file.renameTo(new File(uploadPath, fileName));

        
        
        return ok("file saved as " + uploadPath + fileName);
        
        //return ok("File uploaded" + file.getName());
      } 
      else 
      {
        flash("error", "Missing file");
        return redirect("http://test.com");
        
      }
    }
}
