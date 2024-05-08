import org.example.*;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest{//extends class to call method open and close browser

    //create obj to call Homepage class's methods
    HomePage homePage = new HomePage();

    //create obj to call RegisterPage class's methods
    RegisterPage registerPage = new RegisterPage();

    //create obj to call RegisterResultPage class's methods
    RegisterResultPage registerResultPage = new RegisterResultPage();

    //create obj to call LoginPage class's methods
    LoginPage loginPage = new LoginPage();

    //create obj to call ElectronicsPage class's methods
    ElectronicsPage electronicsPage = new ElectronicsPage();

    //create obj to call CameraAndPhotoPage class's methods
    CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();

    //create obj to call LeicaT_MirrorlessDigital_CameraPage class's methods
    LeicaT_MirrorlessDigital_CameraPage leicaTMirrorlessDigitalCameraPage = new LeicaT_MirrorlessDigital_CameraPage();

    //create obj to call ProductEmailAFriendPage class's methods
    ProductEmailAFriendPage productEmailAFriendPage = new ProductEmailAFriendPage();

    //create obj to  call buildYourOwnComputerPage class's methods
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();

    //create obj to call ShoppingCartPage class's methods
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    // create obj to call computerPage class's methods
    ComputerPage computerPage = new ComputerPage();

    //create obj to call desktopsPage class's methods
    DesktopsPage desktopsPage = new DesktopsPage();

    //create obj to call facebookPage class's methods
    FacebookPage facebookPage = new FacebookPage();

    //create obj to call NopcommerceNewRelease  class's methods
    NopcommerceNewRelease nopcommerceNewRelease = new NopcommerceNewRelease();
    //
    NikePage nikePage = new NikePage();




    @Test
    public void verifyUserShouldBeAbleToRegisterSuccessfully(){

        //click on register button from header bar
        homePage.clickOnRegisterButton();
        //enter registration details
        registerPage.enterRegistrationDetails();
        //verify user registered Successfully
        registerResultPage.userShouldBeAbleTOGetRegisterMsg();


    }

    @Test
    public void verifyUserShouldBeAbleToLogIn(){

        //click on login from header bar
        homePage.clickOnLoginButton();
        //enter login detail and submit Login button
        loginPage.loginDetails();

    }

    @Test
    public void verifyUserShouldBeAbleReferAProductToFriendByEmail(){

        //click on electronics button
        homePage.clickOnElectronicsButton();
        //click on Camera & photo
        electronicsPage.clickOnCameraAndPhoto();
        //click on Leica T Mirrorless Digital Camera
        cameraAndPhotoPage.clickOnT_MirrorDigitalCamera();
        //click on Email a friend
        leicaTMirrorlessDigitalCameraPage.emailAFriend();
        //refer a product to friend
        productEmailAFriendPage.toReferAFriend();

    }

    @Test

    public void userShouldBeAbleToConformCorrectProductAddedInACart(){

        //Select a FeatureProduct
        homePage.featuredProducts();
        //build your own computer
        buildYourOwnComputerPage.selectYourProductOptions();
        //verify correct product added
        shoppingCartPage.conformAddedProduct();
    }

    @Test
    public void verifyUserShouldAbleToSeeEachProductsShouldHaveATitle() {
        //click on computer
        homePage.clickOnComputer();
        //click on desktops
        computerPage.clickOnDesktops();
        //conform that each product have a title
        desktopsPage.eachProductsShouldHaveATitle();
    }

    @Test
    public void verifyUserShouldAbleToSeeEachProductsShouldHaveAAddToCartButton() {
        //click On Electronics Button
        homePage.clickOnElectronicsButton();
        //to click on Camera And Photo
        electronicsPage.clickOnCameraAndPhoto();
        //conform that each product should have a add to cart button
        cameraAndPhotoPage.eachProductShouldHaveAAddToCartButton();
    }

    @Test
    public void verifyThatOnHomepageWhenUserClickOnVoteWithoutClickingOnAnyAnswerPopupAlert_CaptureText_AcceptTheAlert() {
        // click on vote button without clicking on any answer
        homePage.clickOnVote();
        //capture the text and accept the alert
        homePage.handleAlertMsg();
    }

    @Test
    public void verifyUserShouldAbleToCompereTextAndAcceptAlertOnHomepageWhenClickOnSearchButtonWithoutTypingAnything() {
        //click on search button without typing anything
        homePage.clickSearchButton();
        //capture the text and accept the alert
        homePage.getAlertMsg();
    }

    @Test
    public void userShouldBeAbleTOVisitFaceBookPageWhenClickOnFLogoOnHomePageAndComeBackToHomePage(){
        //click on f logo under follow us
        homePage.clickOnFaceBook();
        //to enter on facebook page, verify url, click NopCommerce title to verify on facebook page, click on nopCommerce demo store to come back
        facebookPage.enterOnFaceBookPage();
        //click Welcome to our store
        homePage.verifyWelcomeMsg();
    }

    @Test
    public void whenUserClickOnDETAILSUndernopCommercenewrelease_verifyUserAbleTCommentSuccessfullyAndSeeTheCommentAddedInListAtLast(){
        //click on DETAILS under nopCommerce new release!
        homePage.clickOnDetailButton();
        //type title and comment and verify text, new comment successfully added
        //verify that your comment has been added in the list at last
        nopcommerceNewRelease.enterYourTitleAndComment();

    }

    @Test
    public void eachProductsShouldContainSpecificWordInTitle(){
        //type product name
        homePage.typeProductName();
        //to click on Search button
        homePage.clickSearchButton();
        //each product contain same brand name
        nikePage.ProductsContainSpecificWordInTitle();

    }

    @Test
    public void allProductShouldShowCorrectCurrencyWhenUserChangeCurrency(){
        //to check each product show Euro correct currency
        homePage.clickOnEuroCurrency();
        //to check each product show US Dollar correct currency
        homePage.clickOnUSDollarCurrency();

    }
}


