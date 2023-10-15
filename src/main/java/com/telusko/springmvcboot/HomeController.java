package com.telusko.springmvcboot;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.telusko.springmvcboot.model.Alien;

import java.util.Arrays;
import java.util.List;


@Controller
public class HomeController
{
	@ModelAttribute
	public void modelData(Model m)
	{
	m.addAttribute("name","Aliens");     // this method is use for name="aid" and name="aname" in index.jsp
	}

	@RequestMapping("/")
	public String home()
	{
		return "index";
	}

	@RequestMapping("add")
	public String add(@RequestParam("num1")int i ,@RequestParam("num2") int j, Model m)
	{
		int num3 = i + j;                    // this is a simple which adds two number ,  write simple html that takes two numbers

		m.addAttribute("num3",num3);     // model stores data

		return  "result";                  // model return data to the view  ,  pass the num3 in result variable in html , like  ${num3} in result.jsp

	}

	@RequestMapping("addAlien")   // getter and setter are used here for getting and setting the values with Alien object a
	public String addAlien(@ModelAttribute("a1") Alien a)    //in  @modelAttribute  a1 , put the a1 in the result in result.jsp ,
	{														// it doesn't matter what is the value of Alien a object, a,b,ca .... whatever
		return "result";
	}


//	@GetMapping("getAliens")                      just add method ="post" in form in html
//	public String getAliens(Model m)
//	{
//		List<Alien> aliens= Arrays.asList(new Alien(101,"Cristiano"), new Alien(102,"Rose"));
//		m.addAttribute("result",aliens);
//		return "showAliens";
//	}


// attention here please use this method when using a post request , given down below , just add method ="post" in form in html


//	@PostMapping(value="addAlien")
//	public String addAlien(@ModelAttribute("a1") Alien a)
//	{
//		return "result";
//
//	}
}



// ***  writing the index.jsp explanation here   ****

//  right at the moment when the user enter the data and clicks on the summit button it calls action="addAlien">
//  before calling the @RequestMapping("addAlien") it calls the @ModelAttribute public void modelData(Model m) method
//  because the model controller is where the data is stored , the server return it through @RequestMapping("addAlien") public String addAlien(@ModelAttribute Alien a)
//



