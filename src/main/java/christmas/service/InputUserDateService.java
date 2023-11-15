package christmas.service;

import christmas.constant.message.ErrorMessage;
import christmas.validator.ValidatorManager;
import christmas.view.InputView;

public class InputUserDateService {
    private final InputView inputView = new InputView();
    private final ValidatorManager validatorManager = new ValidatorManager();

    public String getUserDate() {
        inputView.printWelcomeComment();
        while (true) {
            try {
                String userDate = inputView.inputUserDate();
                validatorManager.validateInputUserDate(userDate);
                return userDate;
            } catch (IllegalArgumentException e) {
                System.out.println(ErrorMessage.IS_NOT_VALIDATE_DATE_MESSAGE.getErrorMessage());
            }
        }
    }


}
