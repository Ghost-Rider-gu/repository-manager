package repositoryManager.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RepositoryModel {
	private Long id;
	private String repositoryName;
	private RepositorySource repositorySource;
}
