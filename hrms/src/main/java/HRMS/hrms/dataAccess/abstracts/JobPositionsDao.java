package HRMS.hrms.dataAccess.abstracts;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMS.hrms.entities.concretes.JobPositions;

public interface JobPositionsDao extends JpaRepository<JobPositions, Integer>{

	//List<JobPositions> getAll(String jobPositions);
	
	JobPositions findByPositionNameEquals(String positionName);
	
}
