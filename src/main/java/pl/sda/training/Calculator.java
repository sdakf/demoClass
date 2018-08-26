package pl.sda.training;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class Calculator {

    @GetMapping(value = "/calc")
    public String calculate(@RequestParam(required = false) String input, Map<String, Object> model) {
        if (input != null) {
            String[] strings = input.split(" ");
            int result = 0;
            if (strings[1].equals("+")) {
                result = adding(Integer.parseInt(strings[0]), Integer.parseInt(strings[2]));
            } else if (strings[1].equals("-")) {
                result = subtracting(Integer.parseInt(strings[0]), Integer.parseInt(strings[2]));
            } else if (strings[1].equals("*")) {
                result = multiplying(Integer.parseInt(strings[0]), Integer.parseInt(strings[2]));
            } else if (strings[1].equals("/")) {
                result = dividing(Integer.parseInt(strings[0]), Integer.parseInt(strings[2]));
            }

            model.put("result", result);
        }
        return "calcPage";
    }

    public static int adding(int x, int y) {
        int result = x + y;
        return result;
    }

    public static int subtracting(int x, int y) {
        int result = x - y;
        return result;
    }

    public static int multiplying(int x, int y) {
        int result = x * y;
        return result;
    }

    public static int dividing(int x, int y) {
        int result = x / y;
        return result;
    }
}
