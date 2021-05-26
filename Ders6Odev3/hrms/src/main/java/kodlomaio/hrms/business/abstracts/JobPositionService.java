package kodlomaio.hrms.business.abstracts;

import java.util.List;

import kodlomaio.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
		List<JobPosition> getAll();
}
