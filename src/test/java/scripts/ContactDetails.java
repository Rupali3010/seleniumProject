package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomPages.ContactUspage;
import pomPages.SkillraryLoginPage;

public class ContactDetails extends BaseClass {

	@Test
	public void contatctus() throws FileNotFoundException, IOException, InterruptedException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
	    Point loc = s.getContactus().getLocation();
		double x = loc.getX();
		double y = loc.getY();
		utilies.scollBar(driver, x, y);
		//Thread.sleep(5000);
		s.cotatctusbtn();
		
		ContactUspage c=new ContactUspage(driver);
		c.nameTxtbox(p.getData("name"));
		c.emailAddress(p.getData("email"));
	    c.subjectTxtbox(p.getData("subject"));
	    c.messgaetb(p.getData("message"));
	    c.sendusemail();
		
	}
}
