package com.kh.sw.service; 
 
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.kh.sw.dao.BoardDAO;
import com.kh.sw.vo.BoardVO;

 
@Service 
public class BoardServiceImp implements BoardService{ 
	BoardDAO boardDao; 
	//FileUtils fileUtils;
 
	//寃뚯떆�뙋 �쟾泥� 由ъ뒪�듃 
	@Override 
	public List<BoardVO> boardLoad(BoardVO board){ 
		return boardDao.BoardList(); 
	} 
	 
	//寃뚯떆�뙋 湲��벐湲� 
	@Override
	public int boardInsert(BoardVO board){
	    
		if(board == null) {
			return 0;
		}
		boardDao.BoardInsert(board);
			return 1;
	}
	 
	//寃뚯떆�뙋 �닔�젙 
	@Override 
	public int boardUpdate(BoardVO board){ 
		if(board == null || boardDao.BoardList().size() == 0) { 
			return 0; 
		} 
		return boardDao.BoardUpdate(board); 
	} 
	 
	//寃뚯떆�뙋 �긽�꽭 �럹�씠吏� 
	@Override 
	public BoardVO boardDetail(int bo_pid){ 
		if(bo_pid == 0) { 
			return null; 
		} 
		return boardDao.BoardSelect(bo_pid); 
	} 
	 
	//寃뚯떆�뙋 �궘�젣 
	@Override 
	public int boardDelete(int bo_pid){ 
		if(bo_pid == 0) { 
			return 0; 
		} 
	 
		return boardDao.BoardDelete(bo_pid); 
	} 
	 
	//�뙆�씪 �뾽濡쒕뱶(異붽�) 
	@Override 
	public int fileInsert(MultipartFile[] file){ 
		if(file == null) { 
			return 0; 
		}
		boardDao.insertFile(file);
		return 1;
	} 
	
	//寃뚯떆�뙋 �쟾泥� 由ъ뒪�듃 
	@Override 
	public List<BoardVO> boardCategoryList(BoardVO board){ 
		return boardDao.BoCateList(); 
	} 
 
} 
