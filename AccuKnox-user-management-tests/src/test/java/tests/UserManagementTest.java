package tests;

import com.microsoft.playwright.*;
import org.testng.annotations.*;
import pages.LoginPage;
import pages.AdminPage;

public class UserManagementTest {
    Playwright playwright;
    Browser browser;
    Page page;

    @BeforeClass
    public void setup() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch();
        page = browser.newPage();
        page.navigate("https://opensource-demo.orangehrmlive.com/");
    }

    @Test
    public void testFlow() {
        LoginPage login = new LoginPage(page);
        AdminPage admin = new AdminPage(page);
        login.login("Admin", "admin123");
        admin.goToAdminModule();
    }

    @AfterClass
    public void teardown() {
        browser.close();
        playwright.close();
    }
}
