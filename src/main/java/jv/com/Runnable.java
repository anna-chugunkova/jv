package jv.com;

/**
 * Created by chugunkova_a on 04/02/2017.
 */
public class Runnable {
    public void choirs(){
        System.out.println("Hey Hey");
        System.out.println("I'm down");
    }
    public Runnable(){
        choirs();
    }
    public static void main(String[] args) {

        /* Assume you have access to an integer variable called dayOfTheWeek and a boolean variable
        called holiday, which is true when it is a holiday and false on normal days. Write Java
        code that prints “Wake up at 7:00” on weekdays that are not holidays, and prints “Sleep
        in!” on weekends and holidays. For the variable dayOfTheWeek, use this key:
        1 = Monday
        2 = Tuesday
        3 = Wednesday
        4 = Thursday
        5 = Friday
        6 = Saturday
        7 = Sunday*/
        int dayOfTheWeek = 6;
        boolean holiday = true;
        if (dayOfTheWeek>1&&dayOfTheWeek<=5||!holiday){
            System.out.println("Wake up at 7:00");
        }else if (dayOfTheWeek==6 || dayOfTheWeek==7 ||holiday){
            System.out.println("Sleep in!");
        }

        System.out.println("--------------");
        /*Assume the int variable dayOfWeek has some value, and that it follows this rule:
            1 = Monday
            2 = Tuesday
            3 = Wednesday
            4 = Thursday
            5 = Friday
            6 = Saturday
            7 = Sunday
            Declare a String variable called schedule and write a switch statement that gives schedule
            a different value based on the day of the week. For Monday, give it the value “Gym in the
            morning.” For Tuesday give it the value “Class after work.” For Wednesday, give it the value
            “Meetings all day.” For Thursday give it the value “Work from home.” For Friday, give it
            the value “Game night after work.” For Saturday and Sunday, give it the value “Free!” This
            should also be the default value.
            OR (optional): decide what to assign schedule for each day based on your own weekly
            schedule!
            Starting code:
            //Assume this can have any value from 1 to 7:
            int dayOfWeek = 1;
            //TODO: declare a String variable called schedule.
            //TODO: write a switch statement that give schedule a different
            //value for each day of the week based on the dayOfWeek variable.
            //Don’t forget to "break" after each case, and don’t forget to
            //provide a default case!*/

        int week=11;
        String schedule;
        switch (week){
            case 1: schedule="Monday: Gym in the morning.";
                break;
            case 2: schedule="Tuesday: Class after work.";
                break;
            case 3: schedule="Wednesday: Meetings all day.";
                break;
            case 4: schedule="Thursday: Work from home.";
                break;
            case 5: schedule="Friday: Game night after work.";
                break;
            case 6: schedule="Saturday: Free!";
                break;
            case 7: schedule="Sunday: Free!";
                break;
            default: schedule="Such week day doesn't exist!";
                break;
        }
        System.out.println(schedule);
    }
}

