package HRMS;



import HRMS.business.abstracts.JobService;
import HRMS.business.concretes.JobManager;
import HRMS.core.jLoggerManagerAdapter;
import HRMS.dataAccess.concretes.HibernateJobDao;
import HRMS.entities.concretes.Job;




public class Main {
	public static void main(String[] args) {
		
		
		JobService jobService=new JobManager(new HibernateJobDao(), new jLoggerManagerAdapter());
        
		
		Job job=new Job("engin","demirog",20);
		jobService.add(job);
		jobService.delete(job);
		jobService.update(job);
		
		
		
		
		
		
		
	}
}
