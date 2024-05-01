import org.example.*;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest{//extends class to call method open and close browser

    //create obj to call Homepage method
    HomePage homePage = new HomePage();

    //create obj to call RegisterPage method
    RegisterPage registerPage = new RegisterPage();

    //create obj to call RegisterResultPage method
    RegisterResultPage registerResultPage = new RegisterResultPage();

    //create obj for to call LoginPage
    LoginPage loginPage = new LoginPage();

    //create obj to call ElectronicsPage
    ElectronicsPage electronicsPage = new ElectronicsPage();

    //create obj to call CameraAndPhoto
    CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();

    //create obj to call LeicaT_MirrorlessDigital_CameraPage
    LeicaT_MirrorlessDigital_CameraPage leicaTMirrorlessDigitalCameraPage = new LeicaT_MirrorlessDigital_CameraPage();

    //create obj to call ProductEmailAFriendPage
    ProductEmailAFriendPage productEmailAFriendPage = new ProductEmailAFriendPage();

    //create obj for call buildYourOwnComputer
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();

    //create obj for call checkShoppingCart
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();



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
    public void verifyRegisteredUserShouldBeAbleToLogIn(){

        //click on register button
       // homePage.clickOnRegisterButton();
        //enter registration details
        //registerPage.enterRegistrationDetails();
        //verify user registered Successfully
       // registerResultPage.userShouldBeAbleTOGetRegisterMsg();
        //click on login from header bar
       // homePage.clickOnLoginButton();
        //enter login detail and submit Login button
        //loginPage.loginDetails();

    }

    @Test
    public void verifyRegisteredUserShouldBeAbleReferAProductToFriendByEmail(){

//        //click on register button
//        homePage.clickOnRegisterButton();
//        //enter registration details
//        registerPage.enterRegistrationDetails();
//        //verify user registered Successfully
//        registerResultPage.userShouldBeAbleTOGetRegisterMsg();
//        //click on login from header bar
//        homePage.clickOnLoginButton();
//        //enter login detail and submit Login button
          // loginPage.loginDetails();
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

        //homePage.clickOnLoginButton();
        //Enter login Details
       // loginPage.loginDetails();
        //Select a FeatureProduct
        homePage.featuredProducts();
        //build your own computer
        buildYourOwnComputerPage.selectYourProductOptions();
        //verify correct product added
        shoppingCartPage.conformAddedProduct();
    }
}


