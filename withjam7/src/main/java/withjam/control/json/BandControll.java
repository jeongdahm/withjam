package withjam.control.json;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import withjam.domain.Band;
import withjam.service.BandService;


@Controller("json.bandControl") 
@RequestMapping("/json/band") 
public class BandControll {
	
	@Autowired
	BandService bandService;
	
	
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
	  public Object makeBand(Band band) throws Exception{
	    
		System.out.println(band.getGenreNo());
		
	    
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
