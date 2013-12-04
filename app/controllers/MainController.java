package controllers;

import java.io.File;
import java.io.IOException;
import java.util.List;

import play.Play;
import play.mvc.*;
import play.mvc.Http.MultipartFormData;
import play.mvc.Http.MultipartFormData.FilePart;
import views.html.*;

public class MainController extends Controller 
{
	//public static String uploadPath = "c:\\test\\temp\\";
	public static String uploadPath ="/tmp/jesseract/";
	
	
    public static Result index() 
    {
        return ok(views.html.index.render());
    }
    public static Result mainPage()
    {
    	return ok(views.html.mainPage.render());
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
    		List<String> result = null;
    		String fileName = picture.getFilename();
    		if(fileName.contains(" "))
    		{
    			fileName.replaceAll("\\s", "");
    		}
    		String contentType = picture.getContentType(); 
        
    		if (contentType.contains("image"))
    		{
    			File file = picture.getFile();
	        
    			file.renameTo(new File(uploadPath, fileName));
	        
    			String sourceFilename = uploadPath+fileName;
    			String destinationFilename = uploadPath+"result";
	        
    			Jesseract jess = new Jesseract();
	        
    			try 
    			{
    				result = jess.convertSingleDocumentAndRead(sourceFilename, destinationFilename);
    			} 
    			catch (TesseractException | IOException e) 
    			{
    				return internalServerError(e.toString());
    			}
    			
    			return ok(result.toString() + "\n" + contentType);
    		}
    		else
    		{
    			return badRequest("that's not an image file...");
    		}
    	} 
    	else 
    	{
    		flash("error", "Missing file");
    		return badRequest("Missing file");
    	}
    }
}
