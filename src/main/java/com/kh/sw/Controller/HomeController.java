package com.kh.sw.Controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.kh.sw.service.MemberService;
import com.kh.sw.vo.MemberVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	MemberService memberService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(ModelAndView mv) throws Exception{
//		List <MemberVO> list = memberService.memberLoad();
//		for(int i = 0; i<list.size(); i++) {
//			System.out.println(list.get(i) + "");
//		}
		mv.setViewName("mainPage/index");
		
		return mv;
	}	

//	//ȸ�� ���� ��ü �ҷ�����
	@RequestMapping(value = "/information", method = RequestMethod.GET)
	public ModelAndView information(ModelAndView mv, MemberVO member, HttpServletRequest request) throws Exception{
		List<MemberVO> list = memberService.memberLoad(member);
		MemberVO user = (MemberVO)request.getSession().getAttribute("user");

		mv.addObject("user", user);
		mv.addObject("list", list);
		mv.setViewName("member/information");
		return mv;
	}
	
	//ȸ�� �� ������
	@RequestMapping(value = "/Detail", method = RequestMethod.GET)
	public ModelAndView boardDetail(ModelAndView mv, HttpSession session, MemberVO member, @RequestParam("me_id") String me_id) throws Exception{
		MemberVO Detail = memberService.memberDetail(me_id);
		mv.addObject("Detail", Detail);
		System.out.println("memberDetail �� : "+Detail);
		mv.setViewName("member/Detail");
		return mv;
	}

	//ȸ������ (GET)
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView registerMember(ModelAndView mv) throws Exception{
		mv.setViewName("member/register");
		return mv;
	}
	
	//ȸ������ (POST)
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView registerMemberPost(ModelAndView mv, MemberVO member) throws Exception{
		boolean memberSignup = memberService.registerMember(member);
		if(memberSignup) {
			mv.setViewName("redirect:/");
		} else {
			mv.setViewName("redirect:/register");
		}
		return mv;
	}
	
	//�α��� (POST)
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView memberLoginPost(ModelAndView mv, HttpSession session, MemberVO member) throws Exception{
		MemberVO user = memberService.memberLogin(member);
		if(user != null && user.getMe_pw().equals(member.getMe_pw())) {
			//�α����� ��� ������ 1�� ���� => ������ 1 �̻��� ��� ȸ�� ���� �б� ���� ����
			//�α׾ƿ��� ��� ���� 0���� ���� ��
			
			//�α����� �ȵ� ������ ������ 0������ �α����� ��� 1�� ��½�Ŵ.
			//�������� ��� �׽� 2 ����
			if(user.getMe_auth() == 0) {
				user.setMe_auth(1);
			} else if(user.getMe_auth() == 2) {
				user.setMe_auth(2);
			}
			
			mv.addObject("user", user);
			System.out.println("����");
			System.out.println("user�� : "+user);
			//���ǿ� �� ����
			session.setAttribute("user", user);
			mv.setViewName("redirect:/");
		} else {
			System.out.println("����");

			mv.setViewName("redirect:/");
		}

		return mv;
	}
	
	//����������
	@RequestMapping(value = "/myPage", method = RequestMethod.GET)
	public ModelAndView myPage(ModelAndView mv, MemberVO member, HttpSession session) throws Exception{
		List<MemberVO> list = memberService.memberLoad(member);
		MemberVO user = memberService.memberLogin(member);

		mv.addObject("user", user);
		mv.addObject("list", list);
		mv.setViewName("member/myPage");
		return mv;
	}
	
	//�α׾ƿ� ���
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public ModelAndView logout(ModelAndView mv, HttpSession session) throws Exception{
		//���� ������ ��ü�� ������.
		session.invalidate();
		mv.setViewName("redirect:/");
		return mv;
	}
	
	//ȸ������ ���� (GET)
	@RequestMapping(value = "/Update", method = RequestMethod.GET)
	public ModelAndView memberUpdate(ModelAndView mv, HttpSession session, MemberVO member, 
			@RequestParam("me_id") String me_id) throws Exception{
		MemberVO Detail = memberService.memberDetail(me_id);
		System.out.println("update������ detail �� : "+Detail);
		System.out.println("me_id�� ��� : "+me_id);
		mv.addObject("Detail", Detail);
		session.setAttribute("Detail", Detail);
		mv.setViewName("member/Update");
		return mv;
	}
	
	//ȸ������ ���� (POST)
	@RequestMapping(value = "/Update", method = RequestMethod.POST)
	public ModelAndView memberUpdatePOST(ModelAndView mv, MemberVO member, 
			@RequestParam("me_id") String me_id) throws Exception{		
		MemberVO detail = memberService.memberDetail(me_id);
		System.out.println("=======================================");
		int res = memberService.memberUpdate(member);
		System.out.println("res�� Ȯ�� : "+res);
		if(res != 0) {
			System.out.println("ȸ������ ���� �Ϸ�");
			mv.setViewName("redirect:/Detail?me_id="+me_id);
		} else {
			System.out.println("ȸ������ ���� ����");
			mv.setViewName("redirect:/");
		}
		return mv;
	}
	
	//ȸ�� ����
	@RequestMapping(value = "/Delete/{me_id}", method = RequestMethod.GET)
	public ModelAndView boardDelete(ModelAndView mv, @PathVariable("me_id")String me_id, MemberVO member) throws Exception{
		MemberVO user = memberService.memberLogin(member);
		int res = memberService.memberDelete(me_id);
		if(res != 0) {
			System.out.println("ȸ�� ���� �Ϸ�");
			mv.addObject("user", user);
			mv.setViewName("redirect:/logout");
		} else {
			System.out.println("ȸ�� ���� ����");
			mv.setViewName("redirect:/");
		}
		return mv;
	}
	
//	================================[ȭ�� ����]================================
	
	//����ȭ�� (about)
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public ModelAndView aboutMain(ModelAndView mv) throws Exception{
		
		mv.setViewName("mainPage/about");
		return mv;
	}
	
	//����ȭ�� (blog)
	@RequestMapping(value = "/blog", method = RequestMethod.GET)
	public ModelAndView blogMain(ModelAndView mv) throws Exception{
		
		mv.setViewName("mainPage/blog");
		return mv;
	}
	
	//����ȭ�� (blog-single)
	@RequestMapping(value = "/blogSingle", method = RequestMethod.GET)
	public ModelAndView blogSingleMain(ModelAndView mv) throws Exception{
		
		mv.setViewName("mainPage/blogSingle");
		return mv;
	}
	
	//����ȭ�� (contact)
	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public ModelAndView contactMain(ModelAndView mv) throws Exception{
		
		mv.setViewName("mainPage/contact");
		return mv;
	}
	
	//����ȭ�� (gallery)
	@RequestMapping(value = "/gallery", method = RequestMethod.GET)
	public ModelAndView galleryMain(ModelAndView mv) throws Exception{
		
		mv.setViewName("mainPage/gallery");
		return mv;
	}
	
//	========================================================================================
	
	//ID �ߺ�üũ
	@RequestMapping(value = "/idCheck", method = RequestMethod.GET)
	@ResponseBody
	public String idCheck(@RequestParam("meId") String me_id) {
		int result = memberService.idCheck(me_id);
		return String.valueOf(result);
	}
	
	//����ȭ�� (properties)
	@RequestMapping(value = "/properties", method = RequestMethod.GET)
	public ModelAndView propertiesMain(ModelAndView mv) throws Exception{
		
		mv.setViewName("mainPage/properties");
		return mv;
	}
	
	
	//ȸ������ [������ ����]
	@RequestMapping(value = "/memberManager", method = RequestMethod.GET)
	public ModelAndView memberManager(ModelAndView mv, MemberVO member, HttpServletRequest request) throws Exception{
		List<MemberVO> list = memberService.memberLoad(member);
		MemberVO user = (MemberVO)request.getSession().getAttribute("user");

		mv.addObject("user", user);
		mv.addObject("list", list);
		mv.setViewName("member/memberManager");
		return mv;
	}
}
