package member_project.com.topia.web;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import member_project.com.topia.service.MemberService;

@Controller
public class MemberController {

	/** MemberService **/
	@Resource(name = "memberService")
	private MemberService memberService;
	
	private static final Logger log = LoggerFactory.getLogger(MemberController.class);
	
	
	@RequestMapping(value = "/memberList.do")
	public String memberList() {
		log.info("@@@@@ Controller memberList Start...@@@@@");
		
		return "memberList";
		
	}
}
