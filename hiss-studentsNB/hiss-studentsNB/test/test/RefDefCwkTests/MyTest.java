/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package test.RefDefCwkTests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import refdefcwk.Manager;
import refdefcwk.HISS;

/**
 *
 * @author Ja22aaj
 */
public class MyTest {

    HISS pr;

    public MyTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        // Assuming Manager constructor is Manager(String name, int budget)
        pr = new Manager("Olenka", 1000);
    }

    @After
    public void tearDown() {
    }

    // *** My Tests ***
    // The following tests are custom tests added by Ja22aaj.
    // Each test is documented for clarity.

    /**
     * Test hiring the same staff member twice does not deduct budget twice.
     */
    @Test
    public void cannotHireSameStaffTwice() {
        pr.hireStaff("Amir");
        double afterFirstHire = pr.getAccount();
        pr.hireStaff("Amir");
        double afterSecondHire = pr.getAccount();
        assertEquals("Hiring same staff should not deduct funds twice.", afterFirstHire, afterSecondHire, 0.01);
    }

    /**
     * Test that hiring a staff not in the available list does not change the budget.
     */
    @Test
    public void hiringNonexistentStaffNoBudgetChange() {
        double before = pr.getAccount();
        pr.hireStaff("NonExistentPerson");
        double after = pr.getAccount();
        assertEquals("Hiring non-existent staff changes budget!", before, after, 0.01);
    }

    /**
     * Test that after hiring all staff, available staff list is empty or contains expected message.
     */
    @Test
    public void hiredStaffIsNotInAvailableList() {
    pr.hireStaff("Amir");
    String available = pr.getAllAvailableStaff();
    assertFalse("Hired staff should not appear in available staff list.", available.contains("Amir"));
}
    /**
     * Test that account cannot go negative even if attempting to hire with insufficient funds.
     */
    @Test
    public void accountNeverNegative() {
        // Hire until budget is exhausted
        pr.hireStaff("Amir"); // -300
        pr.hireStaff("Dana"); // -300
        pr.hireStaff("Hui");  // -300 (should now be 100)
        pr.hireStaff("Firat");// -300 (should fail, not enough money)
        assertTrue("Account should not be negative.", pr.getAccount() >= 0);
    }
}