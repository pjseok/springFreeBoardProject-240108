package com.pjseok.board.command;


import com.pjseok.board.dao.FreeBoardDao;
import com.pjseok.board.dto.FboardDto;

public class FbContentCommand {
	
	public FboardDto execute(String fbnum) {
		
		FreeBoardDao freeBoardDao = new FreeBoardDao();
		FboardDto fboardDto = freeBoardDao.content_view(fbnum);
		
		return fboardDto;
	} 

}