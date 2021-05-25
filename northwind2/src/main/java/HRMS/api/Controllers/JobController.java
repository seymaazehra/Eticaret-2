package HRMS.api.Controllers;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMS.business.abstracts.JobService;
import HRMS.entities.concretes.Job;

@RestController
@RequestMapping("/api/Job")
public class JobController {
private JobService jobService;
	
	
	@Autowired
	public JobController(JobService jobService) {
		super();
		this.jobService = jobService;
	}


	@GetMapping("/getall")
	public List<Job> getAll() {
		return this.jobService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Job job) {
		return;
	}
	
	
}
