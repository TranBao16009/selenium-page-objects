import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class hrmAdminPage {

    WebDriver driver;

    // ===== TOP BAR =====
    By txtSearch         = By.xpath("//input[@placeholder='Search']");
    By btnAdd            = By.xpath("//button[normalize-space()='Add']");
    By btnDelete         = By.xpath("//button[normalize-space()='Delete Selected']");

    // ===== FILTER / SEARCH FORM =====
    By ddlUserRole       = By.xpath("//label[text()='User Role']/following-sibling::div//div[@class='oxd-select-text-input']");
    By ddlStatus         = By.xpath("//label[text()='Status']/following-sibling::div//div[@class='oxd-select-text-input']");
    By txtUsername       = By.xpath("//label[text()='Username']/following-sibling::div//input");
    By txtEmployeeName   = By.xpath("//label[text()='Employee Name']/following-sibling::div//input");
    By btnSearch         = By.xpath("//button[@type='submit']");
    By btnReset          = By.xpath("//button[normalize-space()='Reset']");

    // ===== TABLE =====
    By tblUserList       = By.xpath("//div[@class='oxd-table']");
    By tblHeader         = By.xpath("//div[@class='oxd-table-header']");
    By tblRows           = By.xpath("//div[@class='oxd-table-body']//div[@class='oxd-table-row oxd-table-row--with-border']");
    By chkSelectAll      = By.xpath("//label[@class='oxd-checkbox-wrapper']//input[@type='checkbox']");

    // ===== PAGINATION =====
    By lblRecordCount    = By.xpath("//span[contains(@class,'oxd-text') and contains(text(),'Records')]");
    By btnPreviousPage   = By.xpath("//button[@class='oxd-icon-button oxd-pagination-previous']");
    By btnNextPage       = By.xpath("//button[@class='oxd-icon-button oxd-pagination-next']");

    // ===== SIDEBAR =====
    By menuAdmin         = By.xpath("//span[text()='Admin']");
    By menuPIM           = By.xpath("//span[text()='PIM']");
    By menuLeave         = By.xpath("//span[text()='Leave']");
    By menuTime          = By.xpath("//span[text()='Time']");
    By menuRecruitment   = By.xpath("//span[text()='Recruitment']");
    By menuMyInfo        = By.xpath("//span[text()='My Info']");

    // ===== TOP NAVIGATION =====
    By imgAvatar         = By.xpath("//img[@class='oxd-userdropdown-img']");
    By btnLogout         = By.xpath("//a[normalize-space()='Logout']");
    By lblUsername       = By.xpath("//p[@class='oxd-userdropdown-name']");

    public hrmAdminPage(WebDriver driver) {
        this.driver = driver;
    }
}
