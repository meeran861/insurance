package in.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import in.utilityclass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass {
		
	BaseClass base = new BaseClass();

		@Before
		
		public void browserFunctionalities(Scenario scenario) {
			base.launch();
			TakesScreenshot ts = (TakesScreenshot)base.driver;
			final byte[] image = ts.getScreenshotAs(OutputType.BYTES);
			scenario.embed(image,"image/png");
		}

		@After
		public void tearDown(Scenario scenario) {
			TakesScreenshot ts = (TakesScreenshot)base.driver;
			final byte[] image = ts.getScreenshotAs(OutputType.BYTES);
			scenario.embed(image,"image/png");
			base.setImplicitWait();
			base.browserClose();
		}
	}

