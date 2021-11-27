//Разработать класс календарь с месяцами. Месяцы реализовать в виде класса enum.
//Календарь должен иметь возможность сохранять строку-сообщение на каждый месяц.
//Добавить возможность вывода строки-сообщения по месяцу.
//Добавить возможность вывода списка выполненных задач к определенному месяцу.

//добавить возможность сохранять значения в файле и восстанавливать из файла при запуске

public class Main {
    public static void main(String[] args) {
    Calendar calendar = new Calendar();

    calendar.addMessage(MonthOfYear.January, "Рождество");
    calendar.addMessage(MonthOfYear.February, "День влюбленных");
    calendar.addMessage(MonthOfYear.March, "8 марта");
    calendar.addMessage(MonthOfYear.April, "У сестры день рожденье");
    calendar.addMessage(MonthOfYear.May, "У жены день рожденье");
    calendar.addMessage(MonthOfYear.June, "У папы день рожденье");
    calendar.addMessage(MonthOfYear.August, "У сына день рожденье");
    calendar.addMessage(MonthOfYear.October, "У дочки день рожденье");
    calendar.addMessage(MonthOfYear.December, "У мамы день рожденье");

//        System.out.println(calendar.getMessage(MonthOfYear.April));
//        System.out.println(calendar.getMessage(MonthOfYear.May));
//        System.out.println(calendar.getMessage(MonthOfYear.June));
//        System.out.println(calendar.getMessage(MonthOfYear.August));
//        System.out.println(calendar.getMessage(MonthOfYear.December));

        calendar.restore();
        calendar.printAllMessagesByMonth(MonthOfYear.November);
        calendar.save();
    }
}
