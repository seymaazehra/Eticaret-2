package HRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMS.entities.concretes.Job;




public interface JobDao extends JpaRepository<Job,Integer>{
	void add(Job job);
    void update(Job job);
    void delete(Job job);
    
    //Product [] getAll();//
    List<Job> getAll();//�r�nleri listeler
	
}
