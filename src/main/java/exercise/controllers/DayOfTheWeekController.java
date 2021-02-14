package exercise.controllers;

import exercise.services.DayOfTheWeek;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author Carsten
 * Time: 10.58
 * Date: 08/02/2021
 */
@Controller
public class DayOfTheWeekController {

    @ResponseBody
    @GetMapping("day")
    public String dayOfTheWeek(){

        DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();

        return dayOfTheWeek.dayOfTheWeekWithAdditionalText();
    }



}
