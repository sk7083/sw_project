package com.kh.sw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.sw.dao.RoomDAO;
import com.kh.sw.vo.RoomVO;


@Service
public class RoomServiceImp implements RoomService{
	RoomDAO roomDao;
	
	//�긽�뭹 �쟾泥� 由ъ뒪�듃
	@Override
	public List<RoomVO> RoomList(RoomVO room){
		return roomDao.RoomList();
	}
	
	//�긽�뭹 �깮�꽦(異붽�)
	@Override
	public int RoomInsert(RoomVO room){
		if(room == null) {
			System.out.println("Room null 諛쒖깮");
			return 0;
		}
		return roomDao.RoomInsert(room);
	}
	
	//�긽�뭹 �닔�젙
	@Override
	public int RoomUpdate(RoomVO room){
		if(room == null || roomDao.RoomList().size() == 0) {
			return 0;
		}
		return roomDao.RoomUpdate(room);
	}
	
	//�긽�뭹 �긽�꽭 �럹�씠吏�
	@Override
	public RoomVO RoomDetail(int ro_pid){
		if(ro_pid == 0) {
			return null;
		}
		return roomDao.RoomSelect(ro_pid);
	}
	
	//�긽�뭹 �궘�젣
	@Override
	public int RoomDelete(int ro_pid){
		if(ro_pid == 0) {
			return 0;
		}
	
		return roomDao.RoomDelete(ro_pid);
	}
	
}
