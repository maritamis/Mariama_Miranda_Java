/**
 * Mariama Miranda
 *  6/12/2023
 *  First Challenge
 */

import com.company.AccountRecord;
import com.company.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
    Customer customerT;
    Customer customerY;
    Customer customerB;

    @BeforeEach
    public void setUp() {
        customerT = new Customer();
        customerT.setId(100);
        customerT.setName("Tinola Hardware");
        AccountRecord customerRecord = new AccountRecord();
        customerRecord.setCharge(1000);
        customerT.getCharges().add(customerRecord);

        customerY = new Customer();
        customerY.setId(101);
        customerY.setName("Yakap Parlor");
        AccountRecord customerRecordY = new AccountRecord();
        customerRecordY.setCharge(1748);
        customerY.getCharges().add(customerRecordY);

        customerB = new Customer();
        customerB.setId(102);
        customerB.setName("Baliktad Clothes");
        AccountRecord customerRecordB = new AccountRecord();
        customerRecordB.setCharge(-200000);
        customerB.getCharges().add(customerRecordB);

    }
    @Test
    public void shouldOutputTotalBalance() {
        assertEquals(1000, customerT.getBalance());
        assertEquals(1748, customerY.getBalance());
        assertEquals(-200000, customerB.getBalance());
    }
    @Test
    public void shouldPrintToString(){
        assertEquals("Customer ID: " + customerT.getId() + "\nCustomer Name: " +
                customerT.getName() + "\nCustomer Balance: " + customerT.getBalance() + "\n\n", customerT.toString());
        assertEquals("Customer ID: " + customerY.getId() + "\nCustomer Name: " +
                customerY.getName() + "\nCustomer Balance: " + customerY.getBalance() + "\n\n", customerY.toString());
        assertEquals("Customer ID: " + customerB.getId() + "\nCustomer Name: " +
                customerB.getName() + "\nCustomer Balance: " + customerB.getBalance() + "\n\n", customerB.toString());
    }
}
