package com.kh.sw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.sw.dao.RoomDAO;
import com.kh.sw.vo.RoomVO;


@Service
public class RoomServiceImp implements RoomService{
	@Autowired
	RoomDAO roomDao;
	

	//�긽�뭹 �깮�꽦(異붽�)
	@Override
	public int roomInsert(RoomVO room){
		return roomDao.roomInsert(room);
	}

	@Override
	public List<RoomVO> roomList(String pr_pid) {
		// TODO Auto-generated method stub
		return roomDao.roomList(pr_pid);
	}
	
}
