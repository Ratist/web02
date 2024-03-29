package sems.controls;

import java.io.File;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.commons.fileupload.FileItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/file/upload")
public class FileUploadControl {
	
	static long fileCount;
	
	@Autowired 
	ServletContext servletContext;

	public String execute(
			String name,
			int age,
			@RequestParam("file1")MultipartFile file1,
			Model model) {
   try{
			String fullPath = servletContext.getRealPath("/upload");
			if(!file1.isEmpty()){
				
				String filename = System.currentTimeMillis() + "_" + ++fileCount;
				File savedFile = new File(fullPath + "/" + filename);
       file1.transferTo(savedFile);
       
       model.addAttribute("name",name);
       model.addAttribute("age", age);
       model.addAttribute("file1name", file1.getName());
			}	
		   return "file/uploadResult";
		
	}catch(Throwable ex){
		throw new Error(ex);
	}
	}
}
