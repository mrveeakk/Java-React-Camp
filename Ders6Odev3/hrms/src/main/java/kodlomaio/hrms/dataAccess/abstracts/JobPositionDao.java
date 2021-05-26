package kodlomaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlomaio.hrms.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition,Integer>{

}
