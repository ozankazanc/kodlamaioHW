package kodlamaioHW;

import java.time.LocalDate;

public class CampDay {

	public CampDay() {
		// this.date = LocalDate.now();
	}

	public CampDay(int id, int day, LocalDate date) {
		this.id = id;
		this.day = day;
		this.date = date;
	}

	public CampDay(int id, int day, LocalDate date, Homework[] homework) {
		this.id = id;
		this.day = day;
		this.date = date;
		this.homework = homework;
	}

	int id;
	int day;
	LocalDate date;
	Homework[] homework;
}
