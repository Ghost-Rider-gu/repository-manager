package repositoryManager.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;
import repositoryManager.model.RepositoryModel;
import repositoryManager.model.RepositorySource;

@Slf4j
@Controller
@RequestMapping(value = "/repository")
public class RepositoryController {
	@GetMapping
	public String repositoryForm(Model model) {
		List<RepositoryModel> listOfRepository = Arrays.asList(
				new RepositoryModel(1L, "GameSolution", RepositorySource.BITBUCKET),
				new RepositoryModel(2L, "SimpleRepository", RepositorySource.BITBUCKET),
				new RepositoryModel(3L, "AnotherExample", RepositorySource.GITLAB),
				new RepositoryModel(4L, "TestRepository", RepositorySource.BITBUCKET),
				new RepositoryModel(5L, "MyProjectRepository", RepositorySource.GITLAB)
				);
		RepositorySource[] repositorySources = RepositorySource.values();
		for (RepositorySource source: repositorySources) {
			model.addAttribute(source.toString().toUpperCase(), "");
		}
		model.addAttribute("repository", RepositorySource.BITBUCKET);
		return "repository";
	}	
}
