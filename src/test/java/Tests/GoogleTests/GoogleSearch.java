package Tests.GoogleTests;

import Components.GoogleComponents.SearchGoogleComponents;
import Tests.BaseTC;
import org.testng.annotations.Test;

public class GoogleSearch extends BaseTC {


    @Test
    public void validateSearchFunctionality(){
        //driver. get ("https://www.browserstack.com");
        SearchGoogleComponents searchGoogleComponents = new SearchGoogleComponents(driver);
        searchGoogleComponents.navigateToGoogleHome();
        searchGoogleComponents.searchOnGoogle();

    }



}
