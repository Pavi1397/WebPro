package springmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;



import org.springframework.web.bind.annotation.PostMapping;

import springmvc.model.Product;



@Controller





public class ShowController {

	@PostMapping("/show")

	public String show(Model m,HttpServletRequest req) {


		int ProductId=Integer.parseInt(req.getParameter("pid"));

		String ProductName=req.getParameter("pname");

		int ProductPrice=Integer.parseInt(req.getParameter("price"));

		m.addAttribute("ProductId",ProductId);

		m.addAttribute("ProductName",ProductName);

		m.addAttribute("ProductPrice",ProductPrice);

		return "show";

	}

}