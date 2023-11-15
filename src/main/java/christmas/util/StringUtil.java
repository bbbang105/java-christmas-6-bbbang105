package christmas.util;

import christmas.constant.Menu;
import christmas.constant.Sign;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUtil {
    public String RemoveBlankInString(String input) {
        return input.replace("\\s+","");
    }

    public String[] ConvertStringToArray(String input) {
        return input.split("\\s*,\\s*");
    }

    public String[] SplitByComma(String input) {
        return input.split(Sign.COMMA.getSign());
    }

    public String[] SplitByDash(String input) {
        return input.split(Sign.DASH_OR_MINUS.getSign());
    }

    public String formatAmountInThousandWon(String amount) {
        double number = Double.parseDouble(amount);

        DecimalFormat formatter = new DecimalFormat("#,###");
        return formatter.format(number);
    }

    public List<String> getDesertMenuNames() {
        return Arrays.stream(Menu.values())
                .filter(menu -> menu.getCategory() == Menu.Category.디저트)
                .map(Menu::getName)
                .collect(Collectors.toList());
    }

    public List<String> getMainMenuNames() {
        return Arrays.stream(Menu.values())
                .filter(menu -> menu.getCategory() == Menu.Category.메인)
                .map(Menu::getName)
                .collect(Collectors.toList());
    }
}
