package kodlamaioHW;

public class CampManager {
	
	public boolean isDayContainHomework(CampDay camp)
	{
		if(camp.homework==null)
		{
			return false;
		}
		return true;
	}
	public void writeHomeworkCaption(Homework homework)
	{
		System.out.println(homework.homeworkCaption);
	}
}
