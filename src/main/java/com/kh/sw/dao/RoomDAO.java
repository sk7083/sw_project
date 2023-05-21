package com.kh.sw.dao;

import java.util.List;

import com.kh.sw.vo.RoomVO;



public interface RoomDAO {

	//�긽�뭹 �깮�꽦(異붽�)
	public int roomInsert(RoomVO room);
	
	public List<RoomVO>roomList(String pr_pid);
}
