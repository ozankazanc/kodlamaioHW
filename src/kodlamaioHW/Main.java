package kodlamaioHW;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		CampDay campDay1 = new CampDay(3, 3, LocalDate.of(2021, 04, 28));
		CampDay campDay3 = new CampDay();
		campDay3.id = 1;
		campDay3.day = 1;
		campDay3.date = LocalDate.of(2021, 04, 21);
		
		//FOR CAMPDAY2---------------------------------------------------------------------------------------------------------------------------
		//---------------------------------------------------------------------------------------------------------------------------------------
		HomeworkDetail homework1Detail1 = new HomeworkDetail(1,"Özellik nesnesi olarak tanýmladýðýmýzý düþündüðünüz iki örnek veriniz.");
		HomeworkDetail homework1Detail2 = new HomeworkDetail(2,"Bunlara ait class, contructor yapýlarýný oluþturup diziye ekleyip listeleyiniz.");
		HomeworkDetail homework1Detail3 = new HomeworkDetail(3,"Özellik nesnesi olarak tanýmladýðýmýzý düþündüðünüz iki örnek veriniz.");
		HomeworkDetail [] homework1Details = { homework1Detail1, homework1Detail2, homework1Detail3 };
		
		HomeworkDetail homework2Detail1 = new HomeworkDetail(4, "Bu oynatma listesini 24-35 aralýðýnda izleyiniz. (24-35 dahil)");
		HomeworkDetail homework2Detail2 = new HomeworkDetail(5, "Bu dersler sizi sonraki derse hazýr getirecek.");
		HomeworkDetail [] homework2Details = { homework2Detail1, homework2Detail2 };
		
		Homework [] homeworks = {new Homework(1,"Ödev 1",homework1Details), new Homework(2,"Ödev 2",homework2Details)};
		//---------------------------------------------------------------------------------------------------------------------------------------
		//---------------------------------------------------------------------------------------------------------------------------------------
			
		CampDay campDay2 = new CampDay(2, 2, LocalDate.of(2021, 04, 24), homeworks);
		CampDay [] campDays = {campDay1,campDay2,campDay3};
		
		CampManager campManager = new CampManager();
		
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		for (CampDay campDay : campDays) {
			System.out.println(campDay.day + ". Gün - " + campDay.date.toString());
			
			if(campManager.isDayContainHomework(campDay)==true)
			{
				for (Homework homework : campDay.homework) {
					campManager.writeHomeworkCaption(homework);
					
					for (HomeworkDetail homeworkDetail : homework.howeworkDetail) {
						 System.out.println(homeworkDetail.Detail);
					}
				}
			}else
			{
				System.out.println("Bu Kamp gününde ödev bulunmamaktadýr.");
			}
			System.out.println("----------------------------------------------------");
			System.out.println("----------------------------------------------------");
		}
	}
}
