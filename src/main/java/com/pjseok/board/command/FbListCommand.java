package com.pjseok.board.command;

import java.util.ArrayList;

import com.pjseok.board.dao.FreeBoardDao;
import com.pjseok.board.dto.FboardDto;

public class FbListCommand {
	
	public ArrayList<FboardDto> execute() {
		FreeBoardDao freeBoardDao = new FreeBoardDao();
		ArrayList<FboardDto> dtos = freeBoardDao.list();
		
		return dtos;
		
	}

	
}
