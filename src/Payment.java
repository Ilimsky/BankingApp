import java.text.DateFormatSymbols;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

class Payment {
    void payment(int sum, int period, double percent, int yearOfIssue, int monthOfIssue, int dayOfIssue){

        DecimalFormat df = new DecimalFormat("#.##");
        Calendar calendar = new GregorianCalendar(yearOfIssue, monthOfIssue-1, dayOfIssue);
        DateFormatSymbols symbols = new DateFormatSymbols();


        double payment = (((percent / 1200 * (Math.pow((1 + percent / 1200), period))) //Формула аннуитета
                / (Math.pow((1 + percent / 1200), period) - 1)) * sum);
        double residue = (sum-(payment - (sum*percent/1200)));
        double procenty = (sum*percent/1200);
        double capital = payment - procenty;

        for (int i = 1; i<period; i++) {

            calendar.add(Calendar.MONTH, 1);
            if (calendar.get(Calendar.MONTH) == 0 && calendar.get(Calendar.DATE) == 1) {
                calendar.add(Calendar.DATE, 1);
            }if (calendar.get(Calendar.MONTH) == 0 && calendar.get(Calendar.DATE) == 2){
                calendar.add(Calendar.DATE, 1);
            }if (calendar.get(Calendar.MONTH) == 0 && calendar.get(Calendar.DATE) == 7) {
                calendar.add(Calendar.DATE, 1);
            }if (calendar.get(Calendar.MONTH) == 1 && calendar.get(Calendar.DATE) == 23) {
                calendar.add(Calendar.DATE, 1);
            }if (calendar.get(Calendar.MONTH) == 2 && calendar.get(Calendar.DATE) == 8) {
                calendar.add(Calendar.DATE, 1);
            }if (calendar.get(Calendar.MONTH) == 2 && calendar.get(Calendar.DATE) == 21) {
                calendar.add(Calendar.DATE, 1);
            }if (calendar.get(Calendar.MONTH) == 3 && calendar.get(Calendar.DATE) == 7) {
                calendar.add(Calendar.DATE, 1);
            }if (calendar.get(Calendar.MONTH) == 4 && calendar.get(Calendar.DATE) == 1) {
                calendar.add(Calendar.DATE, 1);
            }if (calendar.get(Calendar.MONTH) == 4 && calendar.get(Calendar.DATE) == 5) {
                calendar.add(Calendar.DATE, 1);
            }if (calendar.get(Calendar.MONTH) == 4 && calendar.get(Calendar.DATE) == 9) {
                calendar.add(Calendar.DATE, 1);
            }if (calendar.get(Calendar.MONTH) == 7 && calendar.get(Calendar.DATE)==31) {
                calendar.add(Calendar.DATE, 1);
            }if (calendar.get(Calendar.MONTH) == 10 && calendar.get(Calendar.DATE)==7){
                calendar.add(Calendar.DATE, 1);
            }if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                calendar.add(Calendar.DAY_OF_WEEK, -1);
            }if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                calendar.add(Calendar.DAY_OF_WEEK, 1);
            }

            String dateInSchedule = (calendar.get(Calendar.DATE) + " "
                    + symbols.getMonths()[calendar.get(Calendar.MONTH)] + " "
                    + calendar.get(Calendar.YEAR) + ", " + symbols.getWeekdays()[calendar.get(Calendar.DAY_OF_WEEK)]);

            System.out.printf("%-5s %-30s %-15s %-15s%-15s %-15s%n",i, dateInSchedule,df.format(payment),df.format(procenty),df.format(capital),df.format(residue));
            procenty = (residue * (percent/1200));
            capital = payment - procenty;
            residue = residue - capital;
        }
        calendar.set(yearOfIssue, monthOfIssue-1, dayOfIssue);
        calendar.add(Calendar.MONTH, period); // Добавить последний месяц графика погашения

        if (calendar.get(Calendar.MONTH) == 0 && calendar.get(Calendar.DATE) == 1) {
            calendar.add(Calendar.DATE, 1);
        }if (calendar.get(Calendar.MONTH) == 0 && calendar.get(Calendar.DATE) == 2){
            calendar.add(Calendar.DATE, 1);
        }if (calendar.get(Calendar.MONTH) == 0 && calendar.get(Calendar.DATE) == 7) {
            calendar.add(Calendar.DATE, 1);
        }if (calendar.get(Calendar.MONTH) == 1 && calendar.get(Calendar.DATE) == 23) {
            calendar.add(Calendar.DATE, 1);
        }if (calendar.get(Calendar.MONTH) == 2 && calendar.get(Calendar.DATE) == 8) {
            calendar.add(Calendar.DATE, 1);
        }if (calendar.get(Calendar.MONTH) == 2 && calendar.get(Calendar.DATE) == 21) {
            calendar.add(Calendar.DATE, 1);
        }if (calendar.get(Calendar.MONTH) == 3 && calendar.get(Calendar.DATE) == 7) {
            calendar.add(Calendar.DATE, 1);
        }if (calendar.get(Calendar.MONTH) == 4 && calendar.get(Calendar.DATE) == 1) {
            calendar.add(Calendar.DATE, 1);
        }if (calendar.get(Calendar.MONTH) == 4 && calendar.get(Calendar.DATE) == 5) {
            calendar.add(Calendar.DATE, 1);
        }if (calendar.get(Calendar.MONTH) == 4 && calendar.get(Calendar.DATE) == 9) {
            calendar.add(Calendar.DATE, 1);
        }if (calendar.get(Calendar.MONTH) == 7 && calendar.get(Calendar.DATE)==31) {
            calendar.add(Calendar.DATE, 1);
        }if (calendar.get(Calendar.MONTH) == 10 && calendar.get(Calendar.DATE)==7){
            calendar.add(Calendar.DATE, 1);
        }if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            calendar.add(Calendar.DAY_OF_WEEK, 1);
        }if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            calendar.add(Calendar.DAY_OF_WEEK, 1);
        }

        String dateOverSchedule = (calendar.get(Calendar.DATE) + " " + symbols.getMonths()[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.YEAR) + ", " + symbols.getWeekdays()[calendar.get(Calendar.DAY_OF_WEEK)]);
        System.out.printf("%-5s %-30s %-15s %-15s%-15s %-15s%n", period, dateOverSchedule, df.format(procenty + capital + residue), df.format(procenty), df.format(capital+residue), "0");
        System.out.printf("%-5s %-30s %-15s %-15s%-15s ", " ", " ", df.format(payment*period), df.format(payment*period-sum), sum);
    }
}




