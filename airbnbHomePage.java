import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class airbnbHomePage {

    WebDriver driver;

    // ===== HEADER =====
    By lnkLogo           = By.xpath("//a[@aria-label='Airbnb homepage']");
    By btnBecomeAHost    = By.xpath("//a[normalize-space()='Airbnb your home']");
    By btnLanguage       = By.xpath("//button[@aria-label='Choose a language and currency']");
    By btnLogin          = By.xpath("//button[normalize-space()='Log in']");
    By btnSignUp         = By.xpath("//a[normalize-space()='Sign up']");
    By btnMenu           = By.xpath("//button[@aria-label='Main navigation menu']");

    // ===== SEARCH BAR =====
    By txtWhere          = By.xpath("//input[@placeholder='Search destinations']");
    By txtCheckIn        = By.xpath("//div[@data-testid='structured-search-input-field-split-dates-0']");
    By txtCheckOut       = By.xpath("//div[@data-testid='structured-search-input-field-split-dates-1']");
    By txtGuests         = By.xpath("//div[@data-testid='structured-search-input-field-guests-button']");
    By btnSearchSubmit   = By.xpath("//button[@data-testid='structured-search-input-search-button']");

    // ===== GUESTS DROPDOWN =====
    By btnAdultsPlus     = By.xpath("//button[@aria-label='increase value of Adults']");
    By btnAdultsMinus    = By.xpath("//button[@aria-label='decrease value of Adults']");
    By btnChildrenPlus   = By.xpath("//button[@aria-label='increase value of Children']");
    By btnChildrenMinus  = By.xpath("//button[@aria-label='decrease value of Children']");
    By btnInfantsPlus    = By.xpath("//button[@aria-label='increase value of Infants']");
    By btnInfantsMinus   = By.xpath("//button[@aria-label='decrease value of Infants']");
    By btnPetsPlus       = By.xpath("//button[@aria-label='increase value of Pets']");
    By btnPetsMinus      = By.xpath("//button[@aria-label='decrease value of Pets']");

    // ===== CATEGORY TABS =====
    By tabIcons          = By.xpath("//div[@data-testid='category-bar']//button");
    By tabBeachfront     = By.xpath("//div[text()='Beachfront']");
    By tabCabins         = By.xpath("//div[text()='Cabins']");
    By tabTinyHomes      = By.xpath("//div[text()='Tiny homes']");
    By tabLakefront      = By.xpath("//div[text()='Lakefront']");

    // ===== LISTING CARDS =====
    By listingCards      = By.xpath("//div[@data-testid='card-container']");
    By listingTitle      = By.xpath("//div[@data-testid='listing-card-title']");
    By listingPrice      = By.xpath("//span[@data-testid='price-availability-row']");
    By listingRating     = By.xpath("//span[@aria-label='Rating']");

    // ===== FOOTER =====
    By lnkPrivacy        = By.xpath("//a[normalize-space()='Privacy']");
    By lnkTerms          = By.xpath("//a[normalize-space()='Terms']");
    By lnkSitemap        = By.xpath("//a[normalize-space()='Sitemap']");

    public airbnbHomePage(WebDriver driver) {
        this.driver = driver;
    }
}
