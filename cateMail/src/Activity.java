
public class Activity
{
	private static int nr;
	
	private String name;
	
	private String startDate;
	private String endDate;
	
	private String actualState;

	public Activity()
	{
		name = "Dummy Activity Name" + nr;
		nr++;
		startDate = nr + ".12.2010";
		endDate = "24.12.2010";
		actualState = "20%";
	}

	public String getName()
	{
		return name;
	}

	public String getStartDate()
	{
		return startDate;
	}

	public String getEndDate()
	{
		return endDate;
	}

	public String getActualState()
	{
		return actualState;
	}
	
	

}
