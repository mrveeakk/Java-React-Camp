package kodlomaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlomaio.hrms.business.abstracts.JobPositionService;
import kodlomaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlomaio.hrms.entities.concretes.JobPosition;

public class JobPositionManager implements JobPositionService{
	private JobPositionDao jobPosition;

	@Autowired
	public JobPositionManager(JobPositionDao jobPosition) {
		super();
		this.jobPosition = jobPosition;
	}

	@Override
	public List<JobPosition> getAll() {

		return this.jobPosition.findAll();
	}

}
