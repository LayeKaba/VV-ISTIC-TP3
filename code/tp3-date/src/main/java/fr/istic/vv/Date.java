package fr.istic.vv;

public class Date implements Comparable<Date> {

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	@Override
	public int compareTo(Date other) {
		// TODO Auto-generated method stub
		if (other == null)
		{
			 throw new NullPointerException("Date nulle retournee!!!");
		}
		if (this.year >other.year)
		{
			return 1;
		}
		else if (this.year< other.year)
		{
			return -1;
		}
		
		else
		{
			if (this.month >other.month)
			{
				return 1;
			}
			else if (this.month< other.month)
			{
				return -1;
			}
			else {
				if (this.day >other.day)
				{
					return 1;
				}
				else if (this.day< other.day)
				{
					return -1;
				}
				else {
					return 0;
				}
			}
		}
	}


	public static boolean isValidDate(int day, int month, int year) {
		if (year >= 1) {
			if (month >=1 && month <= 12)
			{
				if (day>= 1 && day <=31)
				{
					switch (month )
					{
					//Pour les mois à 31 jours
					case 1  : 
					case 3  : 
					case 5  : 
					case 7  : 
					case 8  : 
					case 10  : 
					case 12  : 
						return ( day <=31);
						
					//Pour fevrier
					case 2:
						if (isLeapYear(year)  && day <=29 ) {
							return true;
						}
						else if ( day <= 28)
						{
							return true;
						}
						else
						{
							return false;
						}
						
					//Pour les mois à 30 jours
					case 4  :
					case 6  :
					case 9  :
					case 11  :
						return ( day <=30);
					default:

					}
				}
				else {
					return false;
				}
			}
		}
		return false;  
		}

	public static boolean isLeapYear(int year) {
			if (year % 4 != 0) {
				return false;
			} else if (year % 400 == 0) {
				return true;
			} else if (year % 100 == 0) {
				return false;
			} else {
				return true;
			}  
		}
		
	boolean is31days(int month){
		    switch(month){
		        case 1:
		        case 3:
		        case 5:
		        case 7:
		        case 8:
		        case 10:
		        case 12:
		            return true;
		        default :
		            return false;
		    }
		}
		
	public Date nextDate() {
			//fevrier
			if (this.month ==2 )
			{
				if (isLeapYear(this.year))
				{
					if (this.day<29)
					{
						this.day=this.day+1;
					}
					else
					{
						this.day=1;
						this.month++;
					}
				}
				else
				{
					if (this.day<28)
					{
						this.day=this.day+1;
					}
					else
					{
						this.day=1;
						this.month++;
					}
				}
				
			}
			
			//Pour les mois de 31 jours
			if (is31days(this.month))
			{
				if (this.day>=31)
				{
					this.day= 1;
					this.month= this.month+1;
					
					//Cas du mois de decembre
					if (this.month>12)
					{
						this.month=1;
						this.year++;
					}
				}
				else
				{
					this.day++;
				}
			}
			//Pour les mois de 30 jours
			else if (this.month!=2){
				if (this.day>=30)
				{
					this.day= 1;
					this.month= this.month+1;
				}
				else
				{
					this.day++;
				}
			}
			
			return this;
		}

	public Date previousDate() {

			//mars
			if (this.month ==3 )
			{
				if (isLeapYear(this.year))
				{
					if (this.day==1)
					{
						this.day=29;
						this.month--;
					}
					else
					{
						this.day--;
					}
				}
				else
				{
					if (this.day==1)
					{
						this.day=28;
						this.month--;
					}
					else
					{
						this.day--;
					}
				}
				
			}
			
			//Pour les mois de 31 jours
			if (is31days(this.month))
			{
				if (this.month== 8  )//Aout
				{
					if (day == 1)
					{
						this.day= 31;
						this.month--;
					}
					else {
						this.day--;
					}
				}
				//Les mois à 31 qui ne sont pas Aout et  mars
				else if ( this.month != 3){
					if (this.day==1)
					{
						this.day= 30;
						this.month--;
						
						//Cas du mois de janvier
						if (this.month == 1)
						{
							this.day= 31;
							this.month=12;
							this.year--;
						}
					}
					else
					{
						this.day--;
					}
				}
				
				
			}
			//Pour les mois de 30 jours
			else {
				if (this.day == 1)
				{
					this.day= 31;
					this.month--;
				}
				else
				{
					this.day--;
				}
			}
			
			return this;
		}
	}
