package withjam.control.json;

import java.util.HashMap;

import javax.servlet.ServletContext;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import withjam.domain.Member;
import withjam.service.MemberService;

@Controller("json.memberControl")
@RequestMapping("/json/member")
public class MemberControl {
  static Logger log = Logger.getLogger(MemberControl.class);
  static final int PAGE_DEFAULT_SIZE = 5;
  
  @Autowired MemberService     memberService;
  @Autowired ServletContext    servletContext;
 
  @RequestMapping(value="/add", method=RequestMethod.POST)
  public Object add(Member member) throws Exception {  
    
    memberService.add(member);
    
    HashMap<String,Object> resultMap = new HashMap<>();
    resultMap.put("status", "success");
    
    return resultMap;
  }
}












