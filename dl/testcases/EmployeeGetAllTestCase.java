import com.thinking.machines.hr.dl.exceptions.*;
import com.thinking.machines.hr.dl.interfaces.dto.*;
import com.thinking.machines.hr.dl.interfaces.dao.*;
import com.thinking.machines.hr.dl.dto.*;
import com.thinking.machines.hr.dl.dao.*;
import java.util.*;
import java.text.*;
public class EmployeeGetAllTestCase
{
public static void main(String gg[])
{
try
{
EmployeeDAOInterface employeeDAO;
employeeDAO=new EmployeeDAO();
Set<EmployeeDTOInterface> employees;
employees=employeeDAO.getAll();
SimpleDateFormat simpleDateFormat;
simpleDateFormat=new SimpleDateFormat("dd/mm/yyyy");
for(EmployeeDTOInterface employeeDTO: employees)
{
System.out.println("EmployeeId: "+employeeDTO.getEmployeeId());
System.out.println("Name: "+employeeDTO.getName());
System.out.println("Designation code: "+employeeDTO.getDesignationCode());
System.out.println("Date of Birth: "+simpleDateFormat.format(employeeDTO.getDateOfBirth()));
System.out.println("Gender: "+employeeDTO.getGender());
System.out.println("Is indian: "+employeeDTO.getIsIndian());
System.out.println("Basic Salary: "+employeeDTO.getBasicSalary().toPlainString());
System.out.println("PAN Number: "+employeeDTO.getPANNumber());
System.out.println("AadharCard Number: "+employeeDTO.getAadharCardNumber());
System.out.println("**********************************************************************");
}
}catch(DAOException daoe)
{
System.out.println(daoe.getMessage());
}
}
}