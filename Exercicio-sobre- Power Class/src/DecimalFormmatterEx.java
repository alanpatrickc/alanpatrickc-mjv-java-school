import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class DecimalFormmatterEx {
public static void main(String [] args){

String padrao = "###,###.##";
DecimalFormat df = new DecimalFormat(padrao);
System.out.println(df.format(1234567890.123));


 String padrao2 = "###,###,###.##";
 df = new DecimalFormat(padrao2);
 df.setGroupingSize(4);
 System.out.println(df.format(1234567890.123));


 String padrao3 = "###,###,###.00";
 df = new DecimalFormat(padrao3);
 df.setGroupingSize(4);
 System.out.println(df.format(1234567890.1));


 String padrao4 = "###,###,###.00";
 df = new DecimalFormat(padrao4);
 df.setGroupingSize(4);
 System.out.println(df.format(0.1));

  }
}