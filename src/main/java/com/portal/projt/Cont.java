package com.portal.projt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Cont {
	
	@RequestMapping(value = "/st_grade")
	public ModelAndView st_grade(ModelAndView mv) {
		
		mv.setViewName("student/st_grade");
		return mv;  
	}//
	
	
	@RequestMapping(value = "/st_classList")
	public ModelAndView st_classList(ModelAndView mv) {
		
		mv.setViewName("student/st_classList");
		return mv;  
	}//
	
	@RequestMapping(value = "/st_infoMain")
	public ModelAndView st_infoMain(ModelAndView mv) {
		
		mv.setViewName("student/st_infoMain"); 
		return mv;  
	}
	
	@RequestMapping(value = "/st_update")
	public ModelAndView st_update(ModelAndView mv) {
		
		mv.setViewName("student/st_update");
		return mv; 
	}
	
	@RequestMapping(value = "/layout")
	public ModelAndView layout(ModelAndView mv) {
		
		mv.setViewName("layout/layout");
		return mv; 
	}

	@RequestMapping(value = "/joinf")
	public ModelAndView joinf(ModelAndView mv) {
		mv.setViewName("join/joinForm");
		return mv;
	}

	@RequestMapping(value = "/qbinsert")
	public ModelAndView qbinsertf(ModelAndView mv) {
		mv.setViewName("board/qnaBoardInsert");
		return mv;
	}

	@RequestMapping(value = "/qblist")
	public ModelAndView qbinsert(ModelAndView mv) {
		mv.setViewName("board/qnaBoardList");
		return mv;
	}

	@RequestMapping(value = "/qbdetail")
	public ModelAndView qbdetail(ModelAndView mv) {
		mv.setViewName("board/qnaBoardDetail");
		return mv;
	}

	@RequestMapping(value = "/nbinsert")
	public ModelAndView nbinsertf(ModelAndView mv) {
		mv.setViewName("board/noticeBoardInsert");
		return mv;
	}

	@RequestMapping(value = "/nblist")
	public ModelAndView nbinsert(ModelAndView mv) {
		mv.setViewName("board/noticeBoardList");
		return mv;
	}

	@RequestMapping(value = "/nbdetail")
	public ModelAndView nbdetail(ModelAndView mv) {
		mv.setViewName("board/noticeBoardDetail");
		return mv;
	}

}
