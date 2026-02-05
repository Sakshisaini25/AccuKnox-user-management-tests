package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class AdminPage {
    private Page page;

    public AdminPage(Page page) {
        this.page = page;
    }

    public void goToAdminModule() {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Admin")).click();
    }

    public void addUser(String username) {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add")).click();
    }
}
