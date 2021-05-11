package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.corcretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer> {

}
