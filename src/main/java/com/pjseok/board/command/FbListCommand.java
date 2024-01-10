package com.pjseok.board.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.pjseok.board.dao.FreeBoardDao;
import com.pjseok.board.dto.FboardDto;

public class FbListCommand implements fbCommand {
	
	public void execute(Model model) {
		
		FreeBoardDao freeBoardDao = new FreeBoardDao();
		ArrayList<FboardDto> dtos = freeBoardDao.list();
		
		model.addAttribute("fboardDtos", dtos);
		
	}
	
}
