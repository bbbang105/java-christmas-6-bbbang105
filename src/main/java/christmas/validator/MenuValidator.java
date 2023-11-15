package christmas.validator;

import christmas.constant.Menu;
import christmas.constant.message.ErrorMessage;
import christmas.util.StringUtil;

import java.util.List;
import java.util.Map;

public class MenuValidator {
    private final StringUtil stringUtil = new StringUtil();

    public void validateExistMenu(String userMenu) {
        for (Menu menu : Menu.values()) {
            if (menu.getName().equalsIgnoreCase(userMenu)) {
                return;
            }
        }
        throw new IllegalArgumentException(ErrorMessage.IS_NOT_IN_MENU_LIST_MESSAGE.getErrorMessage());
    }

    public void validateOrderMenuExceptBevarage(Map<String, Integer> menus) {
        List<String> appetizerMenuNames = stringUtil.getAppetizerMenuNames();
        List<String> mainMenuNames = stringUtil.getMainMenuNames();
        List<String> desertMenuNames = stringUtil.getDesertMenuNames();

        for (String menu : menus.keySet()) {
            if (appetizerMenuNames.contains(menu)
                || mainMenuNames.contains(menu)
                || desertMenuNames.contains(menu)) {
                return;
            }
        }
        throw new IllegalArgumentException(ErrorMessage.IS_ONLY_DRINK_MESSAGE.getErrorMessage());
    }

    public void validateMenuNumbers(Map<String, Integer> menus) {
        if (menus.values().stream().mapToInt(Integer::intValue).sum() > 20) {
            throw new IllegalArgumentException(ErrorMessage.IS_NOT_UNDER_TWENTY_MENUS_MESSAGE.getErrorMessage());
        }
    }
}
