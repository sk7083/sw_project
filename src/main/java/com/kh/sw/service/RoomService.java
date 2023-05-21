package com.kh.sw.service;

import java.util.List;

import com.kh.sw.vo.RoomVO;


public interface RoomService {
	//방 등록
	public int roomInsert(RoomVO room);
	
	//상품의 방 리스트
	public List<RoomVO> roomList(String pr_pid);
}
