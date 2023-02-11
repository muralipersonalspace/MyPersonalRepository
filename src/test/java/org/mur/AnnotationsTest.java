package org.mur;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsTest {
  @Test(priority = -20)
  private void Login() {
	  }
  @Test(priority = -10)
private void SearchHotel() {
	  }
  @Test(enabled = false)
  private void SelectHotel() {
  }
  @Test(priority =10)
  private void BookHotel() {
	  }
  @Test(priority=20)
  private void BookingConfirmation() {
	  }
}