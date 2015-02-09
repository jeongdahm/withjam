package withjam.control.json;

import java.io.File;
import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import withjam.domain.Band;
import withjam.domain.Member;
import withjam.service.BandService;


@Controller("json.bandControl") 
@RequestMapping("/json/band") 
public class BandControll {
	
	@Autowired
	BandService bandService;
	
	@Autowired ServletContext servletContext;
	
	
	@RequestMapping("/myBandList")
	  public Object myBandList(int uid) throws Exception{
	    
		System.out.println(uid);
	    
	    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
	    
	    resultMap.put("myBand", 
	    		bandService.myBandList(uid));
	    
	    return resultMap;
	  }
	
//	myBandListDetail
	
	
	@RequestMapping("/myBandListDetail")
	  public Object myBandListDetail(int uid , String bandName) throws Exception{
	    
//		System.out.println(band);
	    
		//System.out.println(uid);
		System.out.println(bandName);
		
		HashMap<String,Object> pram = new HashMap<>();
		pram.put("uid", uid);
		pram.put("bandName", bandName);

		
		
	    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
	    
	    resultMap.put("myBandListDetail", 
	    		bandService.myBandListDetail(pram));
	    
	    resultMap.put("myBandMember", 
	    		bandService.myBandMember(bandName));
	    
	    return resultMap;
	  }
	
//	BandListAdd	
	
	@RequestMapping("/BandListAdd")
	  public Object BandListAdd(Band band) throws Exception{
	    
		System.out.println(band);
	    
	    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
	    
	     
	   bandService.BandListAdd(band);
	    
	    return resultMap;
	  }
	
//	BandListDelete
	
	@RequestMapping("/BandListDelete")
	  public Object BandListDelete(Band band) throws Exception{
	    
		System.out.println(band);
	    
	    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
	    
	     
	   bandService.BandListDelete(band);
	    
	    return resultMap;
	  }
	
//	makeBand
	
	
	@RequestMapping("/makeBand")
	  public Object makeBand(MultipartFile photoFile,String bandName,String comment,HttpSession session) throws Exception{
	    
		String filename = System.currentTimeMillis() + "_"; 
		File file = new File("C:/workspace/withjam15/src/main/webapp/fileupload/" + filename);
		photoFile.transferTo(file);	
		
		String bPhoto = filename;
		
		System.out.println(photoFile);
		System.out.println(bandName);
		System.out.println(comment);
		
		Band band = new Band();
		Member member = new Member();
		
		member = (Member) session.getAttribute("loginUser");
		
		band.setUid(member.getUid());
		band.setBandName(bandName);
		band.setBandComment(comment);
		band.setbPhoto(bPhoto);
	    
	    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
//	    
//	     
	   bandService.makeBand(band);
	   
	   Band band2 = bandService.LastBandNo();
	   
	   band.setBandNo(band2.getBandNo());
	   
	   System.out.println(band2.getBandNo());
	   
	   bandService.makeBand2(band);
	    
	    return resultMap;
	  }

}
