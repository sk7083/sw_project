package com.kh.sw.Controller;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kh.sw.service.ProductService;
import com.kh.sw.service.RoomService;
import com.kh.sw.vo.CategoryVO;
import com.kh.sw.vo.MemberVO;
import com.kh.sw.vo.ProductVO;
import com.kh.sw.vo.RoomVO;
import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;


@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	@Autowired
	RoomService roomService;

	//================================================================================================

	//상품 관리 페이지
	@RequestMapping(value = "/productManagerInfoList", method = RequestMethod.GET)
	public ModelAndView productManagerInfoList(ModelAndView mv, HttpServletRequest request, MemberVO member, ProductVO product) throws Exception{
		List<ProductVO> list = productService.productInfoList();
		MemberVO user = (MemberVO)request.getSession().getAttribute("user");
		mv.addObject("list",list);
		mv.addObject("user", user);
		mv.setViewName("product/proudctManagerList");
		return mv;
	}
	
	//상품 등록 페이지
	@RequestMapping(value = "/productInsert", method = RequestMethod.GET)
	public ModelAndView productInsert(ModelAndView mv, HttpServletRequest request, CategoryVO category) {
		//23-05-22 수정
		List<CategoryVO> categoryList = productService.CategoryList2(category);
		
		MemberVO user = (MemberVO)request.getSession().getAttribute("user");
		List<CategoryVO> lsCategory = productService.CategoryList();
		List<CategoryVO> getCategory = new ArrayList<CategoryVO>();
		for(int i=0; i<lsCategory.size(); i++) {
			CategoryVO categoryVO = lsCategory.get(i);
			String sPid = categoryVO.getCa_pid();
			if(sPid.contains("CA")) {
				getCategory.add(categoryVO);
			}
		}
		
		mv.addObject("user", user);
		mv.addObject("category",getCategory);
		mv.addObject("categoryList", categoryList);
		mv.setViewName("product/productInsert");
		return mv;
	}
	
	//상품 등록 Process
	@RequestMapping(value = "/productInsertProcess", method = RequestMethod.POST)
	public String productInsertProcess(ModelAndView mv,HttpServletRequest request) {
		ProductVO product = new ProductVO();
		product.setPr_ca_pid(request.getParameter("pr_ca_pid"));
		product.setPr_name(request.getParameter("pr_name"));
		product.setPr_content(request.getParameter("pr_content"));
		product.setPr_address1(request.getParameter("pr_address1"));
		product.setPr_address2(request.getParameter("pr_address2"));
		product.setPr_address3(request.getParameter("pr_address3"));
		
		int result = productService.productAdd(product);
		
		return "redirect:/productManagerInfoList";
	}
	
	//상품 정보 페이지
	@RequestMapping(value = "/productInfo", method = RequestMethod.GET)
	public ModelAndView productInfo(ModelAndView mv,HttpServletRequest request) {
		String pid = request.getParameter("pid");
		ProductVO product = productService.productDetail(Integer.parseInt(pid));
		List<RoomVO> roomList = roomService.roomList(pid);
		mv.addObject("product",product);
		mv.addObject("roomList",roomList);
		mv.setViewName("product/productInfo");
		return mv;
	}
	
	
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
	public ModelAndView productDetail(ModelAndView mv, HttpSession session,HttpServletRequest request) throws Exception{
		int pr_pid = Integer.parseInt(request.getParameter("pr_pid"));
		ProductVO Detail = productService.productDetail(pr_pid);
		mv.addObject("Detail", Detail);
		System.out.println("boardDetail 媛� : "+Detail);
		mv.setViewName("product/productDetail");
		return mv;
	}
	
	//상품 정보 수정.
	@RequestMapping(value = "/productUpdate", method = RequestMethod.POST)
	public String productUpdate(ModelAndView mv, HttpSession session,HttpServletRequest request) throws Exception{
		int pid = Integer.parseInt(request.getParameter("pr_pid"));
		ProductVO product = new ProductVO();
		product.setPr_pid(pid);
		product.setPr_name(request.getParameter("pr_name"));
		product.setPr_content(request.getParameter("pr_content"));
		product.setPr_address1(request.getParameter("pr_address1"));
		product.setPr_address2(request.getParameter("pr_address2"));
		product.setPr_address3(request.getParameter("pr_address3"));
		
		int result = productService.productUpdate(product);
		
		return "redirect:/productInfo?pid="+pid+"#tel123";
	}

	//방 등록 페이지
	@RequestMapping(value = "/roomInsert", method = RequestMethod.GET)
	public ModelAndView roomInsert(ModelAndView mv, HttpServletRequest request) throws Exception{
		int pid = Integer.parseInt(request.getParameter("pid"));
		mv.addObject("pr_pid",pid);
		mv.setViewName("product/roomInsert");
		return mv;
	}
	
	//방 등록 Process.
	@RequestMapping(value = "/roomInsertProcess", method = RequestMethod.POST)
	public String roomInsertProcess(ModelAndView mv, HttpServletRequest request) throws Exception{
		int pr_pid = Integer.parseInt(request.getParameter("pr_pid"));
		String ro_name = request.getParameter("ro_name");
		int ro_count = Integer.parseInt(request.getParameter("ro_num"));
		int ro_min_people = Integer.parseInt(request.getParameter("ro_min_people"));
		int ro_max_people = Integer.parseInt(request.getParameter("ro_max_people"));
		String select = request.getParameter("ro_select_s_or_t");
		
		RoomVO room = new RoomVO();
		room.setPr_pid(pr_pid);
		room.setRo_name(ro_name);
		room.setRo_count(ro_count);
		room.setRo_description("설명");
		room.setRo_min_people(ro_min_people);
		room.setRo_max_people(ro_max_people);
		room.setRo_select(select);
		
		if(select.equals("S")) {
			room.setRo_s_price(request.getParameter("ro_s_price"));
			room.setRo_s_in_time(request.getParameter("ro_s_in_time"));
			room.setRo_s_out_time(request.getParameter("ro_s_in_time"));
			
		}else if(select.equals("T")) {
			room.setRo_t_price(request.getParameter("ro_t_price"));
			room.setRo_t_in_time(request.getParameter("ro_t_in_time"));
			room.setRo_t_out_time(request.getParameter("ro_t_out_time"));
		}else {
			room.setRo_s_price(request.getParameter("ro_s_price"));
			room.setRo_s_in_time(request.getParameter("ro_s_in_time"));
			room.setRo_s_out_time(request.getParameter("ro_s_in_time"));
			
			room.setRo_t_price(request.getParameter("ro_t_price"));
			room.setRo_t_in_time(request.getParameter("ro_t_in_time"));
			room.setRo_t_out_time(request.getParameter("ro_t_out_time"));
		}
		
		
		roomService.roomInsert(room);
		return "redirect:/productInfo?pid="+pr_pid+"#tel123";
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
	
	//상품 motel
	@RequestMapping(value = "/motel", method = RequestMethod.GET)
	public ModelAndView motel(ModelAndView mv, ProductVO product, RoomVO room) throws Exception{
		//상품 전체 리스트
		List<ProductVO> productList = productService.ProductAllList(product);
		//방 전체 리스트
		List<RoomVO> roomList = roomService.roomALlList(room);
		
		mv.addObject("productList", productList);
		mv.addObject("roomList", roomList);
		mv.setViewName("product/motel");
		return mv;
	}
}
