import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Calendar {
    String[] messages;
    private String Exception;

    public Calendar() {
        messages = new String[MonthOfYear.values().length];
    }

    public void addMessage(MonthOfYear month, String message) {
        switch (month) {
            case January -> messages[0] = message;
            case February -> messages[1] = message;
            case March -> messages[2] = message;
            case April -> messages[3] = message;
            case May -> messages[4] = message;
            case June -> messages[5] = message;
            case July -> messages[6] = message;
            case August -> messages[7] = message;
            case September -> messages[8] = message;
            case October -> messages[9] = message;
            case November -> messages[10] = message;
            case December -> messages[11] = message;
        }
    }

    public String getMessage(MonthOfYear month) {
        String message = switch (month) {
            case January -> messages[0];
            case February -> messages[1];
            case March -> messages[2];
            case April -> messages[3];
            case May -> messages[4];
            case June -> messages[5];
            case July -> messages[6];
            case August -> messages[7];
            case September -> messages[8];
            case October -> messages[9];
            case November -> messages[10];
            case December -> messages[11];
        };
        return message;
    }

    public void printAllMessages() {
        int i = 0;
        for (MonthOfYear Month : MonthOfYear.values()) {
            if (messages[i] != null)
                System.out.println(Month + ": " + messages[i]);
            else System.out.println(Month + ": ");
            i++;
        }
    }

    public void printAllMessagesByMonth(MonthOfYear CurrentMonth) {
        int i = 0;
        System.out.println(">>> Отпраздновали <<<");
        for (MonthOfYear Month : MonthOfYear.values()) {
            if (Month.equals(CurrentMonth))
                System.out.println(">>> Еще будем Праздновать <<<");
            if (messages[i] != null)
                System.out.println(Month + ": " + messages[i]);
            else System.out.println(Month + ": ");
            i++;
        }
    }

    public void save() {
        try {
            FileWriter writer = new FileWriter("calendar.txt", false);
            int i = 0;
            for (MonthOfYear Month : MonthOfYear.values()) {
                if (messages[i] != null)
                    writer.write(messages[i] + "\n");
                else writer.write("\n");
                i++;
                writer.flush();
//              writer.close();
            }
        } catch (Exception e) {
            System.out.println(Exception);
        }
    }

    public void restore() {
        try {
            FileReader reader;
            reader = new FileReader("calendar.txt");
            Scanner input = new Scanner(reader);
            messages[0] = input.nextLine();
            messages[1] = input.nextLine();
            messages[2] = input.nextLine();
            messages[3] = input.nextLine();
            messages[4] = input.nextLine();
            messages[5] = input.nextLine();
            messages[6] = input.nextLine();
            messages[7] = input.nextLine();
            messages[8] = input.nextLine();
            messages[9] = input.nextLine();
            messages[10] = input.nextLine();
            messages[11] = input.nextLine();
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}