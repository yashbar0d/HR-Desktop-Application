import com.thinking.machines.hr.dl.exceptions.*;
import com.thinking.machines.hr.dl.interfaces.dto.*;
import com.thinking.machines.hr.dl.interfaces.dao.*;
import com.thinking.machines.hr.dl.dto.*;
import com.thinking.machines.hr.dl.dao.*;
import java.util.*;
import java.text.*;
public class EmployeeAadharCardNumberExistsTestCase
{
public static void main(String gg[])
{
String aadharCardNumber=gg[0];
try
{
System.out.println("Aadhar Card Number: "+aadharCardNumber+" exists: "+new EmployeeDAO().aadharCardNumberExists(aadharCardNumber));
}catch(DAOException daoe)
{
System.out.println(daoe.getMessage());
}
}
}
