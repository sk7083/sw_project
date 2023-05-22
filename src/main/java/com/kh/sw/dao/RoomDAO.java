package com.kh.sw.dao;

import java.util.List;

import com.kh.sw.vo.RoomVO;



public interface RoomDAO {

	//�긽�뭹 �깮�꽦(異붽�)
	public int roomInsert(RoomVO room);
	
	public List<RoomVO>roomList(String pr_pid);
	
	//룸 전체 리스트
	public List<RoomVO> roomALlList(RoomVO room);
}
