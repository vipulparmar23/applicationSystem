package com.candidate.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.candidate.classes.Candidate;
import com.candidate.dao.CandidateDAO;

@Controller
@RequestMapping("/applications")
public class CandidateController {

	// need to inject candidateDAO
	@Autowired
	private CandidateDAO candidateDOA;
	
	@RequestMapping("/candidateForm")
	public String candidateForm(Model theModel) {

		Candidate can = new Candidate();
		theModel.addAttribute("candidate", can);
		return "candidate-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@RequestParam(name = "firstName") String fName,
			@RequestParam(name = "lastName") String lName, Model theModel) {

		theModel.addAttribute("fName", fName);
		theModel.addAttribute("lName", lName);

		return "confirmation-page";
	}

	@RequestMapping("/processFormTWO")
	public String processForm(@Valid @ModelAttribute("candidate") Candidate can, BindingResult theBindings) {

		// System.out.println("Can" +can.getFirstName()+" "+can.getLastName());

		if (theBindings.hasErrors()) {
			return "candidate-form";
		} else {
			return "confirmation-page";
		}
	}
	
	@RequestMapping("/list")
	public String listCandidates(Model theModel) {
		
		// get candidate from dao
		List<Candidate> theCandidates = candidateDOA.getCandidates();
		// add the candidate to the model
		theModel.addAttribute("candidates", theCandidates);
		
		
		return "list-candidates";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, editor);
	}
}
