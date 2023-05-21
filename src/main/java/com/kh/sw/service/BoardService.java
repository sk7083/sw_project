package com.kh.sw.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.kh.sw.vo.BoardVO;
import com.kh.sw.vo.CategoryVO;


public interface BoardService {

	
	public List<BoardVO> AllList(BoardVO board);
	
	//寃뚯떆�뙋 �쟾泥� 由ъ뒪�듃
	public List<BoardVO> boardLoad(String ca_pid);

	//寃뚯떆�뙋 湲��벐湲�
	public int boardInsert(BoardVO board);
	
	//寃뚯떆�뙋 �닔�젙
	public int boardUpdate(BoardVO board);
	
	//寃뚯떆�뙋 �긽�꽭 �럹�씠吏�
	public BoardVO boardDetail(int bo_pid);
	
	//寃뚯떆�뙋 �궘�젣
	public int boardDelete(int bo_pid);

	//�뙆�씪 �뾽濡쒕뱶(異붽�)
	public int fileInsert(MultipartFile[] file) throws Exception;
	
	//寃뚯떆�뙋 移댄뀒怨좊━ �쟾泥� 由ъ뒪�듃
	public List<BoardVO> boardCategoryList(String ca_pid);
	
	public List<CategoryVO> CategoryList();
}
