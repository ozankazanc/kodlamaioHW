package kodlamaioHW;

public class Homework {
	
	public Homework()
	{
		
	}
	public Homework(int id, String homeworkCaption, HomeworkDetail [] homeworkDetail)
	{
		this.id=id;
		this.homeworkCaption = homeworkCaption;
		this.howeworkDetail=homeworkDetail;
	}
	
	int id;
	String homeworkCaption;
	HomeworkDetail [] howeworkDetail;
}
