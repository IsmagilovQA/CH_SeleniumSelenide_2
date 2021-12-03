package loans.positive;

import base.BaseTest;
import org.junit.jupiter.api.Test;

import static constants.Constant.Urls.CAR_LOANS_URL;

public class CarLoansTest extends BaseTest {

    @Test
    public void selectAgreementsTabInPublicSession() {
        basePage.goToUrl(CAR_LOANS_URL);
        carLoansPage.selectAgreementTab();
        basePage.isAuthWidgetPresent();
    }
}
