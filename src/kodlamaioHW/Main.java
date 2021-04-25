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
		HomeworkDetail homework1Detail1 = new HomeworkDetail(1,"�zellik nesnesi olarak tan�mlad���m�z� d���nd���n�z iki �rnek veriniz.");
		HomeworkDetail homework1Detail2 = new HomeworkDetail(2,"Bunlara ait class, contructor yap�lar�n� olu�turup diziye ekleyip listeleyiniz.");
		HomeworkDetail homework1Detail3 = new HomeworkDetail(3,"�zellik nesnesi olarak tan�mlad���m�z� d���nd���n�z iki �rnek veriniz.");
		HomeworkDetail [] homework1Details = { homework1Detail1, homework1Detail2, homework1Detail3 };
		
		HomeworkDetail homework2Detail1 = new HomeworkDetail(4, "Bu oynatma listesini 24-35 aral���nda izleyiniz. (24-35 dahil)");
		HomeworkDetail homework2Detail2 = new HomeworkDetail(5, "Bu dersler sizi sonraki derse haz�r getirecek.");
		HomeworkDetail [] homework2Details = { homework2Detail1, homework2Detail2 };
		
		Homework [] homeworks = {new Homework(1,"�dev 1",homework1Details), new Homework(2,"�dev 2",homework2Details)};
		//---------------------------------------------------------------------------------------------------------------------------------------
		//---------------------------------------------------------------------------------------------------------------------------------------
			
		CampDay campDay2 = new CampDay(2, 2, LocalDate.of(2021, 04, 24), homeworks);
		CampDay [] campDays = {campDay1,campDay2,campDay3};
		
		CampManager campManager = new CampManager();
		
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		for (CampDay campDay : campDays) {
			System.out.println(campDay.day + ". G�n - " + campDay.date.toString());
			
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
				System.out.println("Bu Kamp g�n�nde �dev bulunmamaktad�r.");
			}
			System.out.println("----------------------------------------------------");
			System.out.println("----------------------------------------------------");
		}
	}
}
