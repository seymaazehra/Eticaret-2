package HRMS.business.abstracts;

import java.util.List;

import HRMS.entities.concretes.Job;

public interface JobService {
	void add(Job job);//neyi servis etmek istiyorsak onun oprasyonu yaz�l�r
	List<Job> getAll();
	void update(Job job);//neyi servis etmek istiyorsak onun oprasyonu yaz�l�r
	//List<Job> getAll1();
	void delete(Job job);//neyi servis etmek istiyorsak onun oprasyonu yaz�l�r
	//List<Job> getAll2();
}
