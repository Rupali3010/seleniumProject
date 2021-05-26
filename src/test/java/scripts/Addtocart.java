package scripts;

import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomPages.AddtoCartPage;
import pomPages.DemoSkillraryLoginPage;
import pomPages.SkillraryLoginPage;

public class Addtocart extends BaseClass {
	
	@Test
	public void addproduct() {
		SkillraryLoginPage s =new  SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillraryDemoapp();
		
		utilies.switchTab(driver);

		DemoSkillraryLoginPage d = new DemoSkillraryLoginPage(driver);
		utilies.mouseHover(driver, d.getCoursebtn());
		d.seleniumTrainingBtn();
		
		AddtoCartPage a=new AddtoCartPage(driver);
		utilies.doubleClick(driver,a.getAddbtn());
		a.addtocartButton();
		utilies.alertPopup(driver);
		
		

	}
}
