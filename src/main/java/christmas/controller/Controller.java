package christmas.controller;

import christmas.domain.UserDate;
import christmas.service.InputUserDateService;

public class Controller {
    InputUserDateService inputUserDateService = new InputUserDateService();
    public void run() {
        assignUserDate();
    }

    private void assignUserDate() {
        UserDate userDate = new UserDate(inputUserDateService.getUserDate());
    }
}
