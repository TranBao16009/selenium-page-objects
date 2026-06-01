import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class amazonSearchResultPage {

    WebDriver driver;

    // ===== HEADER =====
    By lnkLogo           = By.id("nav-logo-sprites");
    By txtSearchBox      = By.id("twotabsearchtextbox");
    By btnSearchSubmit   = By.id("nav-search-submit-button");
    By ddlSearchCategory = By.id("searchDropdownBox");

    // ===== TOP NAVIGATION =====
    By lnkReturnsOrders  = By.id("nav-orders");
    By lnkCart           = By.id("nav-cart");
    By lnkAccount        = By.id("nav-link-accountList");
    By lblCartCount      = By.id("nav-cart-count");

    // ===== LANGUAGE SELECTOR =====
    By btnLanguage       = By.id("icp-nav-flyout");
    By ddlLanguage       = By.xpath("//span[@class='icp-nav-flag-text']");
    By lstLanguageOptions = By.xpath("//div[@id='nav-flyout-icp']//a");

    // ===== FILTER / SORT =====
    By ddlSortBy         = By.id("s-result-sort-select");
    By lblResultCount    = By.xpath("//div[contains(@class,'s-breadcrumb')]//span[@class='a-size-base a-color-base']");
    By filterBrands      = By.xpath("//span[text()='Brand']//ancestor::div[contains(@class,'a-section')]");
    By filterPriceRange  = By.xpath("//span[text()='Price']//ancestor::div[contains(@class,'a-section')]");
    By filterRating      = By.xpath("//span[text()='Avg. Customer Review']//ancestor::div[contains(@class,'a-section')]");

    // ===== SEARCH RESULT ITEMS =====
    By lstProducts           = By.xpath("//div[@data-component-type='s-search-result']");
    By productTitle          = By.xpath(".//h2/a/span");
    By productPrice          = By.xpath(".//span[@class='a-price-whole']");
    By productRating         = By.xpath(".//span[@class='a-icon-alt']");
    By productRatingCount     = By.xpath(".//span[@class='a-size-base s-underline-text']");
    By productImage          = By.xpath(".//img[@class='s-image']");
    By productPrimeBadge     = By.xpath(".//i[@aria-label='Amazon Prime']");
    By btnAddToCart          = By.xpath(".//button[normalize-space()='Add to cart']");

    // ===== PAGINATION =====
    By btnPreviousPage   = By.xpath("//a[contains(@class,'s-pagination-previous')]");
    By btnNextPage       = By.xpath("//a[contains(@class,'s-pagination-next')]");
    By lstPageNumbers    = By.xpath("//span[contains(@class,'s-pagination-item')]");

    // ===== SPONSORED / ADS =====
    By sponsoredProducts = By.xpath("//div[@data-component-type='sp-sponsored-result']");

    public amazonSearchResultPage(WebDriver driver) {
        this.driver = driver;
    }
}
