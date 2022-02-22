
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateTimeFormatterEx {
    public static void main(String[] args) throws Exception {

 // formatação de datas com a nova API       
        
LocalDateTime localDateTime = LocalDateTime.now();
System.out.println(localDateTime);

DateTimeFormatter dateTimne = DateTimeFormatter.ofPattern("MMM dd, YYYY");
System.out.println(dateTimne.format(localDateTime));

LocalDate now = LocalDate.now();
LocalTime hoje = LocalTime.now();


DateTimeFormatter dateTimne1 = DateTimeFormatter.ofPattern("MM - dd - YY");
System.out.println("Data com -: " + dateTimne1.format(localDateTime));

DateTimeFormatter dateTimne2 = DateTimeFormatter.ofPattern("MM/dd/YYYY");
System.out.println("Data com /: " +  dateTimne2.format(localDateTime));

DateTimeFormatter dateTimne3 = DateTimeFormatter.ofPattern("MMM/dd/YY");
System.out.println("Data com / mes abreviado: " + dateTimne3.format(localDateTime));

DateTimeFormatter dateTime4 = DateTimeFormatter.ofPattern("dd/MMMM/yy", Locale.ENGLISH);
System.out.println("Padrão Americano" + dateTime4.format(now));

DateTimeFormatter dateTime5 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
System.out.println(dateTime5.format(now));

DateTimeFormatter dateTime6 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
System.out.println(dateTime6.format(now));

DateTimeFormatter dateTime7 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
System.out.println(dateTime7.format(now));

		//localTime
DateTimeFormatter dateTime10 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		System.out.println(dateTime10.format(hoje));

DateTimeFormatter dateTime11 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
System.out.println(dateTime11.format(hoje));




    }
}
