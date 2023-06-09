package com.kh.sw.Controller;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.kh.sw.service.BoardService;
import com.kh.sw.service.MemberService;
import com.kh.sw.vo.BoardVO;
import com.kh.sw.vo.MemberVO;





@Controller
public class BoardController {
	BoardService boardService;
	MemberService memberService;
	
	//寃뚯떆�뙋 議고쉶 (怨듭��궗�빆)
	@RequestMapping(value = "/boardList1", method = RequestMethod.GET)
	public ModelAndView boardList1(ModelAndView mv, BoardVO board, HttpServletRequest request, MemberVO member) throws Exception{
		//寃뚯떆�뙋 移댄뀒怨좊━ 遺덈윭�삤湲�
		List<BoardVO> boCate = boardService.boardCategoryList(board);
		//寃뚯떆�뙋 �쟾泥� 遺덈윭�삤湲�
		List<BoardVO> list = boardService.boardLoad(board);
		for(BoardVO bor : list) {
		}
		MemberVO user = (MemberVO)request.getSession().getAttribute("user");
		
		mv.addObject("boCate", boCate);
		mv.addObject("user", user);
		mv.addObject("list", list);
		mv.setViewName("board/boardList1");
		return mv;
	}
	
	//寃뚯떆�뙋 議고쉶 (臾몄쓽�궗�빆)
	@RequestMapping(value = "/boardList2", method = RequestMethod.GET)
	public ModelAndView boardList2(ModelAndView mv, BoardVO board, HttpServletRequest request, MemberVO member) throws Exception{
		//寃뚯떆�뙋 移댄뀒怨좊━ 遺덈윭�삤湲�
		List<BoardVO> boCate = boardService.boardCategoryList(board);
		//寃뚯떆�뙋 �쟾泥� 遺덈윭�삤湲�
		List<BoardVO> list = boardService.boardLoad(board);
		for(BoardVO bor : list) {
		}
		MemberVO user = (MemberVO)request.getSession().getAttribute("user");
		
		mv.addObject("boCate", boCate);
		mv.addObject("user", user);
		mv.addObject("list", list);
		mv.setViewName("board/boardList2");
		return mv;
	}
	
	//寃뚯떆�뙋 議고쉶 (�씠踰ㅽ듃)
	@RequestMapping(value = "/boardList3", method = RequestMethod.GET)
	public ModelAndView boardList3(ModelAndView mv, BoardVO board, HttpServletRequest request, MemberVO member) throws Exception{
		//寃뚯떆�뙋 移댄뀒怨좊━ 遺덈윭�삤湲�
		List<BoardVO> boCate = boardService.boardCategoryList(board);
		//寃뚯떆�뙋 �쟾泥� 遺덈윭�삤湲�
		List<BoardVO> list = boardService.boardLoad(board);
		for(BoardVO bor : list) {
		}
		MemberVO user = (MemberVO)request.getSession().getAttribute("user");
		
		mv.addObject("boCate", boCate);
		mv.addObject("user", user);
		mv.addObject("list", list);
		mv.setViewName("board/boardList3");
		return mv;
	}
	
	//寃뚯떆�뙋 湲��벐湲�(GET)
	@RequestMapping(value = "/boardInsert", method = RequestMethod.GET)
	public ModelAndView boardInsert(ModelAndView mv, HttpServletRequest request, MemberVO member, BoardVO board) throws Exception{
		//寃뚯떆�뙋 移댄뀒怨좊━ 遺덈윭�삤湲�
		List<BoardVO> boCate = boardService.boardCategoryList(board);
		MemberVO user = (MemberVO)request.getSession().getAttribute("user");
			
			System.out.println("�꽆寃⑥� boCate媛� �솗�씤 : "+boCate);
			mv.addObject("boCate", boCate);
			mv.addObject("user", user);
			mv.setViewName("board/boardInsert");
			return mv;
	}
	
	//寃뚯떆�뙋 湲��벐湲�(POST)
	@RequestMapping(value = "/boardInsert", method = RequestMethod.POST)
	public ModelAndView boardInsertPost(ModelAndView mv, BoardVO board, MultipartFile[] file) throws Exception{
		
		int bes = boardService.boardInsert(board);
		
//	 String filePath  = "D:\\upload\\";	
//	 int bo_pid = board.getBo_pid();
//	 String fi_crea_id = board.getBo_writer();
//	 
//	 for(int i=0; i<file.length; i++) {		 
//		 String fi_ori_name = file[i].getOriginalFilename();
//		 long fi_size = file[i].getSize();
//		 System.out.println("fi_ori_name 媛� : " + fi_ori_name);
//		 System.out.println("fi_size 媛� : " + fi_size);
//	 }
//	 
//	 
//	 System.out.println("filePath 媛� : " + filePath);
//	 System.out.println("bo_pid 媛� : " + bo_pid);
//	 System.out.println("fi_crea_id 媛� : " + fi_crea_id);
//	 System.out.println("理쒖쥌 board 媛� : "+board);
//	 System.out.println("理쒖쥌 file 媛� : "+file);
	

	 System.out.println("board媛� 泥댄겕 : [boardController] : " + board);
	 System.out.println("file媛� 泥댄겕 : [boardController] : " + file);

		if(bes != 0) {
			System.out.println("寃뚯떆湲� �벑濡� �셿猷�");
			System.out.println("�벑濡앸맂 寃뚯떆湲� : "+ board);
			mv.setViewName("redirect:/");
		} else {
			System.out.println("寃뚯떆湲� �벑濡� �떎�뙣");
			mv.setViewName("redirect:/boardInsert");
		}
		return mv;
	}
	

	
	//寃뚯떆�뙋 �긽�꽭 �럹�씠吏�
	@RequestMapping(value = "/boardDetail", method = RequestMethod.GET)
	public ModelAndView boardDetail(ModelAndView mv, HttpSession session, BoardVO board, @RequestParam("bo_pid") int bo_pid) throws Exception{
		//寃뚯떆�뙋 移댄뀒怨좊━ 遺덈윭�삤湲�
		List<BoardVO> boCate = boardService.boardCategoryList(board);
		BoardVO Detail = boardService.boardDetail(bo_pid);
		mv.addObject("Detail", Detail);
		mv.addObject("boCate", boCate);
		System.out.println("boCate 媛� �븣�젮以� : "+boCate);
		System.out.println("boardDetail 媛� : "+Detail);
		mv.setViewName("board/boardDetail");
		return mv;
	}
	
	//寃뚯떆�뙋 �닔�젙
	@RequestMapping(value = "/boardUpdate", method = RequestMethod.GET)
	public ModelAndView boardUpdate(ModelAndView mv, HttpSession session, BoardVO board,
			@RequestParam("bo_pid") int bo_pid) throws Exception{
		BoardVO Detail = boardService.boardDetail(bo_pid);

		mv.addObject("Detail", Detail);
		session.setAttribute("Detail", Detail);
		mv.setViewName("board/boardUpdate");
		return mv;
	}

	//寃뚯떆�뙋 �닔�젙
	@RequestMapping(value = "/boardUpdate", method = RequestMethod.POST)
	public ModelAndView boardUpdatePost(ModelAndView mv, BoardVO board, @RequestParam("bo_pid") int bo_pid) throws Exception{
		boardService.boardDetail(bo_pid);
		int res = boardService.boardUpdate(board);
		System.out.println("res媛� �솗�씤 蹂대뱶 : "+res);
		if(res != 0) {
			System.out.println("寃뚯떆�뙋 �닔�젙 �셿猷�");
			mv.setViewName("redirect:/boardDetail?bo_pid="+bo_pid+"#tel123");
		} else {
			System.out.println("寃뚯떆�뙋 �닔�젙 �떎�뙣");
			mv.setViewName("redirect:/boardUpdate");
		}
		return mv;
	}
	
	//寃뚯떆�뙋 �궘�젣
	@RequestMapping(value = "/boardDelete/{bo_pid}", method = RequestMethod.GET)
	public ModelAndView boardDelete(ModelAndView mv, @PathVariable("bo_pid")int bo_pid) throws Exception{
		
		int res = boardService.boardDelete(bo_pid);
		if(res != 0) {
			System.out.println("寃뚯떆�뙋 �궘�젣 �셿猷�");
			mv.setViewName("redirect:/");
		} else {
			System.out.println("寃뚯떆�뙋 �궘�젣 �떎�뙣");
			mv.setViewName("redirect:/boardList");
		}
		return mv;
	}
}