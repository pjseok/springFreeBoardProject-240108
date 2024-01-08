package com.pjseok.board.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pjseok.board.dao.FreeBoardDao;

@Controller
public class FBoardController {
   
	//DataSource dataSource;
   
   @RequestMapping(value = "/write_form")
   public String write_form() {
      return "write_form";
   }
   
   @RequestMapping(value = "/write")
   public String write(HttpServletRequest request) {
      
      String fbtitle = request.getParameter("fbtitle");
      String fbname = request.getParameter("fbname");
      String fbcontent = request.getParameter("fbcontent");
      
      FreeBoardDao freeBoardDao = new FreeBoardDao();
      
      freeBoardDao.write(fbtitle, fbname, fbcontent);
      
      return "write_form";
   }
   
}