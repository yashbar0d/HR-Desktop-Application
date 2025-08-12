import com.thinking.machines.hr.dl.exceptions.*;
import com.thinking.machines.hr.dl.interfaces.dto.*;
import com.thinking.machines.hr.dl.interfaces.dao.*;
import com.thinking.machines.hr.dl.dto.*;
import com.thinking.machines.hr.dl.dao.*;
import java.util.*;
import java.text.*;
public class EmployeeGetByAadharCardNumberTestCase
{
public static void main(String gg[])
{
String aadharCardNumber=gg[0];
try
{
EmployeeDAOInterface employeeDAO;
employeeDAO=new EmployeeDAO();
EmployeeDTOInterface employeeDTO;
employeeDTO=employeeDAO.getByAadharCardNumber(aadharCardNumber);
SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/mm/yyyy");
System.out.println("Employee Id: "+employeeDTO.getEmployeeId());
System.out.println("Name: "+employeeDTO.getName());
System.out.println("Designation code: "+employeeDTO.getDesignationCode());
System.out.println("Date of Birth: "+simpleDateFormat.format(employeeDTO.getDateOfBirth()));
System.out.println("Gender: "+employeeDTO.getGender());
System.out.println("Is Indian: "+employeeDTO.getIsIndian());
System.out.println("Basic Salary: "+employeeDTO.getBasicSalary().toPlainString());
System.out.println("PAN Number: "+employeeDTO.getPANNumber());
System.out.println("Aadhar Card Number: "+employeeDTO.getAadharCardNumber());
}catch(DAOException daoe)
{
System.out.println(daoe.getMessage());
}
}
}