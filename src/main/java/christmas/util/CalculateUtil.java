package christmas.util;

import christmas.constant.Date;
import christmas.constant.Menu;
import christmas.constant.Rule;

import java.util.Map;

public class CalculateUtil {
    private StringUtil stringUtil = new StringUtil();

    public boolean isWeekEND(int userInputDay) {
        return Date.WEEKEND_DATES.contains(userInputDay);
    }

    public boolean isSpecialDay(int userInputDay) {
        return Date.SPECIAL_DISCOUNT_DATES.contains(userInputDay);
    }

    public int CalculateDdayDiscountAmount(int userInputDay) {
        return (Rule.D_DAY_EVENT_START_AMOUNT.getRule() + ((userInputDay - Rule.EVENT_START_DAY.getRule()) * 100));
    }

    public int CalculateWeekEventDiscountAmount(int count) {
        return (Rule.WEEK_DISCOUNT_AMOUNT.getRule() * count);
    }

    public int CountDesertMenuNumber(Map<String, Integer> userMenu) {
        int count = 0;
        for (String menu : userMenu.keySet()) {
            if (stringUtil.getDesertMenuNames().contains(menu)) {
                count++;
            }
        }

        return count;
    }

    public int CountMainMenuNumber(Map<String, Integer> userMenu) {
        int count = 0;
        for (String menu : userMenu.keySet()) {
            if (stringUtil.getMainMenuNames().contains(menu)) {
                count++;
            }
        }

        return count;
    }

}
