package com.example.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.accessingdatamysql.MoneyCourse.WEB_OUTPUT;

@RestController
public class BlogController {

	@Autowired
	private CompanyRepository companyRepository;
	@Autowired
	private GameTypeRepository gameTypeRepository;

	@GetMapping("/blog")
	public String blogMain(Model model) {
		Iterable<Company> companies = companyRepository.findAll();
		model.addAttribute("companies", companies);

		Iterable<GameType> gameType = gameTypeRepository.findAll();
		model.addAttribute("gameType", gameType);

		return companies.toString();
	}

}
