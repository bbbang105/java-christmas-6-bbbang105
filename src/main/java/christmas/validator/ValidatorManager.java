package christmas.validator;

import java.util.Map;

public class ValidatorManager {
    private StringValidator stringValidator = new StringValidator();
    private NumberValidator numberValidator = new NumberValidator();
    private SplitValidator splitValidator = new SplitValidator();
    private MenuValidator menuValidator = new MenuValidator();

    public void validateInputUserDate(String userDate) {
        stringValidator.validateNotNull(userDate);
        stringValidator.validateNotContainBlank(userDate);
        numberValidator.validateDigit(userDate);
        numberValidator.validateRightNumberRange(userDate);
    }

    public void validateInputUserMenu(String userMenu) {
        stringValidator.validateNotNull(userMenu);
        splitValidator.validateSplitByComma(userMenu);
        splitValidator.validateSplitByDash(userMenu);
        menuValidator.validateExistMenu(userMenu);
    }

    public void validateUserMenuDetails(Map<String, Integer> menus) {
        menuValidator.validateOrderMenuExceptBevarage(menus);
        menuValidator.validateMenuNumbers(menus);
    }
}
