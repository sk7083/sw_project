package com.kh.sw.dao;

import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.kh.sw.vo.BoardVO;


public interface BoardDAO {
	
	//寃뚯떆�뙋 �쟾泥� 由ъ뒪�듃
	public List<BoardVO> BoardList();
	
	//寃뚯떆�뙋 湲��벐湲�
	public int BoardInsert(BoardVO board);
	
	//寃뚯떆�뙋 �닔�젙
	public int BoardUpdate(BoardVO board);
	
	//寃뚯떆�뙋 �긽�꽭 �럹�씠吏�
	public BoardVO BoardSelect(int bo_pid);

	//寃뚯떆�뙋 �궘�젣
	public int BoardDelete(int bo_pid);
	
	//�뙆�씪 �뾽濡쒕뱶(異붽�)
	public void insertFile(MultipartFile[] file);
	
	//寃뚯떆�뙋 移댄뀒怨좊━ �쟾泥� 由ъ뒪�듃
	public List<BoardVO> BoCateList();

}
