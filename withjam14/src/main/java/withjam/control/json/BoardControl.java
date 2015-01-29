package withjam.control.json;

import java.io.File;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import withjam.domain.Board;
import withjam.domain.Member;
import withjam.service.BoardService;

@Controller("json.boardControl")
@RequestMapping("/json/board")
public class BoardControl {

	// ../json/board/uploadBoard.do

	@Autowired
	BoardService boardService;

	

	@RequestMapping(value = "/insertBoard", method = RequestMethod.POST)
	public Object insertBoard(MultipartFile musicFile, String title, String content,
			HttpSession session) throws Exception {

		Member member = new Member();
		Board  board  = new Board();

		System.out.println(musicFile);
		System.out.println(title);
		System.out.println(content);

		String filename = System.currentTimeMillis() + "_.mp3";
		File file = new
		File("/Users/iyongho/Documents/workspace/withjam14/src/main/webapp/fileupload-music/"
		+ filename);
		musicFile.transferTo(file);
		
		
		String bfName = filename;
		
		member = (Member) session.getAttribute("loginUser");
		
		board.setBfName(bfName);
		board.setTitle(title);
		board.setContent(content);
		board.setUid(member.getUid());

		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("status", "success");

		boardService.insertBoard(board);

		return resultMap;

	}
	
//	BoardList
	
	
	
	@RequestMapping("/BoardList")
	public Object BoardList(HttpSession session) throws Exception {

		Member member = new Member();
		Board  board  = new Board();
		
//		member = (Member) session.getAttribute("loginUser");
//
//		board.setUid(member.getUid());
		
		board = boardService.BoardPlayList(board);
		
        String FileUrl = "../../fileupload-music/" + board.getBfName();
		
		board.setBfName(FileUrl);

		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("status", "success");

		resultMap.put("playList", board);

		return resultMap;

	}
	
//	insertReply
	
	
	@RequestMapping(value = "/insertReply", method = RequestMethod.POST)
	public Object insertReply(MultipartFile musicFile, String content,
			HttpSession session) throws Exception {

		Member member = new Member();
		Board  board  = new Board();

		System.out.println(musicFile);
		System.out.println(content);

		String filename = System.currentTimeMillis() + "_.mp3";
		File file = new
		File("/Users/iyongho/Documents/workspace/withjam14/src/main/webapp/fileupload-music/"
		+ filename);
		musicFile.transferTo(file);
		
		String rfName = filename;
		
		System.out.println(rfName + "=>rfName");
		
		member = (Member) session.getAttribute("loginUser");
		
		board.setRfName(rfName);
		board.setContent(content);
		board.setUid(member.getUid());
		
		System.out.println(board.getRfName() + "=>rfName2");

		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("status", "success");

		boardService.insertReply(board);

		return resultMap;

	}

}
