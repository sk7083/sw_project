package com.kh.sw.Controller;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kh.sw.service.ProductService;
import com.kh.sw.service.RoomService;
import com.kh.sw.vo.MemberVO;
import com.kh.sw.vo.ProductVO;
import com.kh.sw.vo.RoomVO;
import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;


@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	RoomService roomService;

	//================================================================================================

	
//	//硫붿씤 �솕硫�
//	@RequestMapping(value = "/pro", method = RequestMethod.GET)
//	public ModelAndView home(ModelAndView mv) throws Exception{
////		List <MemberVO> list = memberService.memberLoad();
////		for(int i = 0; i<list.size(); i++) {
////			System.out.println(list.get(i) + "");
////		}
//		mv.setViewName("main/pro");
//		
//		return mv;
//	}	

	//�긽�뭹 �깮�꽦(異붽�) (GET)
	@RequestMapping(value = "/productInsert", method = RequestMethod.GET)
	public ModelAndView ProductInsert(ModelAndView mv, HttpServletRequest request, MemberVO member, ProductVO product) throws Exception{
		//���옣�맂 移댄뀒怨좊━ 蹂댁뿬二쇨린 �쐞�븿
		List<ProductVO> list = productService.CategoryList(product);
		MemberVO user = (MemberVO)request.getSession().getAttribute("user");
		mv.addObject("list",list);
		mv.addObject("user", user);
		System.out.println("蹂대궦 user �젙蹂� : " + user);
		mv.setViewName("product/productInsert");
		return mv;
	}
	
	//�긽�뭹 �깮�꽦(異붽�) (POST)
	@RequestMapping(value = "/productInsert", method = RequestMethod.POST)
	public ModelAndView ProductInsertPost(ModelAndView mv, ProductVO product, RoomVO room) throws Exception{
		int pns = productService.productAdd(product);
		int ros = roomService.RoomInsert(room);
		
		if(pns != 0 && ros != 0) {
			System.out.println("�긽�뭹 �벑濡� �셿猷�");
			System.out.println("�벑濡앸맂 �긽�뭹 : "+ product);
			System.out.println("�벑濡앸맂 諛� : "+room);
			mv.setViewName("redirect:/");
		} else {
			System.out.println("�긽�뭹 �벑濡� �떎�뙣");
			mv.setViewName("redirect:/");
		}
		return mv;
	}
	
	
	//�긽�뭹 �쁽�솴
	@RequestMapping(value = "/productList", method = RequestMethod.GET)
	public ModelAndView prductList(ModelAndView mv, ProductVO product, HttpServletRequest request, MemberVO member) throws Exception{
		List<ProductVO> list = productService.productList(product);
		MemberVO user = (MemberVO)request.getSession().getAttribute("user");
		mv.addObject("user", user);
		mv.addObject("list", list);
		mv.setViewName("product/productList");
		return mv;
	}
	
	
		
	//�긽�뭹 �긽�꽭 �럹�씠吏�
	@RequestMapping(value = "/productDetail", method = RequestMethod.GET)
	public ModelAndView productDetail(ModelAndView mv, HttpSession session, ProductVO product, @RequestParam("pr_pid") int pr_pid, @RequestParam("ro_pid") int ro_pid) throws Exception{
		ProductVO Detail = productService.productDetail(pr_pid);
		RoomVO RDetail = roomService.RoomDetail(ro_pid);
		mv.addObject("Detail", Detail);
		mv.addObject("RDetail",RDetail);
		System.out.println("boardDetail 媛� : "+Detail);
		mv.setViewName("product/productDetail");
		return mv;
	}
	
	//�긽�뭹 �닔�젙 (GET)
	@RequestMapping(value = "/productUpdate", method = RequestMethod.GET)
	public ModelAndView productUpdate(ModelAndView mv, HttpSession session, ProductVO product,
			@RequestParam("pr_pid") int pr_pid) throws Exception{
		ProductVO Detail = productService.productDetail(pr_pid);

		mv.addObject("Detail", Detail);
		session.setAttribute("Detail", Detail);
		mv.setViewName("product/productUpdate");
		return mv;
	}

	//�긽�뭹 �닔�젙 (POST)
	@RequestMapping(value = "/productUpdate", method = RequestMethod.POST)
	public ModelAndView productUpdatePost(ModelAndView mv, ProductVO product) throws Exception{
		
		int res = productService.productUpdate(product);
		System.out.println("res媛� �솗�씤 �긽�뭹 : "+res);
		if(res != 0) {
			System.out.println("�긽�뭹 �닔�젙 �셿猷�");
			mv.setViewName("redirect:/");
		} else {
			System.out.println("�긽�뭹 �닔�젙 �떎�뙣");
			mv.setViewName("redirect:/productUpdate");
		}
		return mv;
	}
	
	//�긽�뭹 �궘�젣
	@RequestMapping(value = "/productDelete/{pr_pid}", method = RequestMethod.GET)
	public ModelAndView productDelete(ModelAndView mv, @PathVariable("pr_pid")int pr_pid) throws Exception{
		
		int res = productService.productDelete(pr_pid);
		if(res != 0) {
			System.out.println("�긽�뭹 �궘�젣 �셿猷�");
			mv.setViewName("redirect:/");
		} else {
			System.out.println("�긽�뭹 �궘�젣 �떎�뙣");
			mv.setViewName("redirect:/productList");
		}
		return mv;
	}
	// ==================================== [�긽�뭹 �럹�씠吏�] ====================================
	//�긽�뭹 �쁽�솴 [紐⑦뀛]
	@RequestMapping(value = "/motel", method = RequestMethod.GET)
	public ModelAndView prductListMotel(ModelAndView mv, ProductVO product, HttpServletRequest request, MemberVO member) throws Exception{
		List<ProductVO> proList = productService.productList(product);
		MemberVO user = (MemberVO)request.getSession().getAttribute("user");
		mv.addObject("user", user);
		mv.addObject("proList", proList);
		mv.setViewName("product/motel");
		return mv;
	}
	
	
	//�긽�뭹 �쁽�솴 [紐⑦뀛]
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ModelAndView prducel(ModelAndView mv, RoomVO room) throws Exception{

		mv.setViewName("member/test");
		return mv;
	}
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public ModelAndView prducelasd(ModelAndView mv, RoomVO room) throws Exception{
		int ros = roomService.RoomInsert(room);
		System.out.println("ros �솗�씤 : "+ros);
	    if(ros != 0) {
	    	System.out.println("�꽦怨�!");
	    }

		mv.setViewName("member/test");
		return mv;
	}
}
