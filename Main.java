import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(changeData(data));
    }

    public static String changeData(OffsetDateTime data) {
        if(data==null){
            return null;
        }
        data=data.plusYears(1).minusMonths(1).plusDays(7);
        return data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.ITALY));
    }
}
