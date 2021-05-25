package HRMS.dataAccess.abstracts;

import java.util.List; 

import HRMS.entities.concretes.Job;



public interface JobDao {
	void add(Job job);
    void update(Job job);
    void delete(Job job);
    
    //Product [] getAll();//
    List<Job> getAll();//ürünleri listeler
	
}
