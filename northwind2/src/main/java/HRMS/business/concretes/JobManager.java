package HRMS.business.concretes;

import java.util.List;    

import HRMS.business.abstracts.JobService;
import HRMS.core.LoggerService;
import HRMS.dataAccess.abstracts.JobDao;
import HRMS.entities.concretes.Job;

public class JobManager implements JobService {
	private JobDao jobDao;
	private LoggerService loggerService;
	
	
	public JobManager(JobDao jobDao, LoggerService loggerService) {//hibernate e baðýmlý deðiliz productdao referansýný tutuyor
		super();
		this.jobDao=jobDao;
		this.loggerService=loggerService;
	}


	@Override
	public void add(Job job) {
				
	
	
	this.jobDao.add(job);
	this.loggerService.logToSystem(job.getAd()+" "+job.getSoyad()+" "+job.getYas()+" "+ " kiþi iþe alýndý.");
	}


	@Override
	public List<Job> getAll() {
		
		return null;
	}


	@Override
	public void update(Job job) {
		this.loggerService.logToSystem(job.getAd()+" "+job.getSoyad()+" "+job.getYas()+" "+" kiþi güncellendi.");
		
	}


	@Override
	public void delete(Job job) {
		this.loggerService.logToSystem(job.getAd()+" "+job.getSoyad()+" "+job.getYas()+" "+" kiþi silindi.");
		
	}

	
	
	
	
}
