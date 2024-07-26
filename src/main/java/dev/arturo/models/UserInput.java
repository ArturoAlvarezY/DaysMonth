package dev.arturo.models;

public class UserInput extends Months {

    public UserInput(String monthName, Integer days) {
        super(monthName, days);

    }

    @Override
    public void obtainMonth(int monthNumber) {
        switch (monthNumber) {
            case 1:
            setMonthName("January");
            setDays(31);               
                break;
            
            case 2:
             setMonthName("February");
            setDays(28);
                break;

            case 3:
            setMonthName("March");
            setDays(31);
                break;

            case 4:
            setMonthName("April");
            setDays(30);
              break;

            case 5:
            setMonthName("May");
            setDays(31);
              break;


              case 6:
              setMonthName("June");
              setDays(30);
                break;

              case 7:
              setMonthName("July");
              setDays(31);
                break;

              case 8:
              setMonthName("August");
              setDays(31);
                break;

              case 9:
              setMonthName("September");
              setDays(30);
                break;

              case 10:
              setMonthName("October");
              setDays(31);
                break;

              case 11:
              setMonthName("November");
              setDays(30);
                break;

              case 12:
              setMonthName("December");
              setDays(31);
                break;

            default:
                break;
        }
    }


  
    
}
