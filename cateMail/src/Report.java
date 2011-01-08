import java.util.Calendar;


public class Report
{
	private String reportDate;
	private String projectName;
	private String projectLeader;
	private String projectLeaderMailAddress;
	
	
	Activity[] activities;
	
	public Report()
	{
		Calendar cal = Calendar.getInstance();
		reportDate = cal.get(Calendar.DAY_OF_MONTH) + "." + cal.get(Calendar.MONTH + 1) + "." + cal.get(Calendar.YEAR);
		
		projectName = "Dummy Project";
		projectLeader = "Richard";
		projectLeaderMailAddress = "r.henck@fhtw-berlin.de";
		
		activities = new Activity[3];
		for (int i=0;i<3;i++)
		{
			activities[i] = new Activity();
		}
		
	}
	
	public String getProjectName()
	{
		return projectName;
	}
	
	public String getProjectLeaderName()
	{
		return projectLeader;
	}


	public String getRecipient()
	{
		return projectLeaderMailAddress;
	}


	public String getSubject()
	{
		return "Report for Project" + projectName + " - " + reportDate;
	}
	
	public String getReportDate()
	{
		return reportDate;
	}

	public Activity[] getActivities()
	{
		return activities;
	}

}
