package exercise.services;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @author Carsten
 * Time: 11.22
 * Date: 08/02/2021
 */
public class DayOfTheWeek {

    public String dayOfTheWeekWithAdditionalText() {

        DayOfWeek dayOfWeek = getDayOfTheWeek();
        String str = "<h1>Is it Friday?</h1><br>";

        switch (dayOfWeek) {
            case WEDNESDAY:
                return str + wednesday();
            case FRIDAY:
                return str + friday();
            default:
                return str + "<h1>No, it is " + dayOfWeek + "</h1>";
        }

    }

    private DayOfWeek getDayOfTheWeek() {
        LocalDate localDate = LocalDate.now();
        return DayOfWeek.from(localDate);
    }

    private String wednesday() {
        String str = "<img alt=\"Wednesday, my dudes\" src=\"https://i.kym-cdn.com/photos/images/newsfeed/001/091/264/665.jpg\">";
        return str;
    }

    private String friday() {
        return "<h1 style=\"background-color:LightGray; color:Tomato;\"> It's Friday, Friday <br> Gotta get down on Friday</h1> " +
                "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/kfVsfOSbJY0\" " +
                "frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>";
    }
}
