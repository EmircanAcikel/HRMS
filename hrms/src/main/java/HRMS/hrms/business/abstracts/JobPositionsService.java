package HRMS.hrms.business.abstracts;

import java.util.List;

import HRMS.hrms.entities.concretes.JobPositions;

public interface JobPositionsService {
	
	List<JobPositions> getAll();
	
}
