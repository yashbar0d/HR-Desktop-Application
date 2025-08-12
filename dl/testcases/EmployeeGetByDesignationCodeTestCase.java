import com.thinking.machines.hr.dl.exceptions.*;
import com.thinking.machines.hr.dl.interfaces.dto.*;
import com.thinking.machines.hr.dl.interfaces.dao.*;
import com.thinking.machines.hr.dl.dto.*;
import com.thinking.machines.hr.dl.dao.*;
import java.util.*;
import java.text.*;
public class EmployeeGetByDesignationCodeTestCase
{
public static void main(String gg[])
{
int designationCode=Integer.parseInt(gg[0]);
try
{
EmployeeDAOInterface employeeDAO;
employeeDAO=new EmployeeDAO();
Set<EmployeeDTOInterface> employees;
employees=employeeDAO.getByDesignationCode(designationCode);
SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/mm/yyyy");
for(EmployeeDTOInterface employeeDTO: employees)
{
System.out.println("EmployeeId: "+employeeDTO.getEmployeeId());
System.out.println("Name: "+employeeDTO.getName());
System.out.println("Designation Code: "+employeeDTO.getDesignationCode());
System.out.println("Date of Birth: "+simpleDateFormat.format(employeeDTO.getDateOfBirth()));
System.out.println("Gender: "+employeeDTO.getGender());
System.out.println("EmployeeId: "+employeeDTO.getIsIndian());
System.out.println("EmployeeId: "+employeeDTO.getBasicSalary());
System.out.println("EmployeeId: "+employeeDTO.getPANNumber());
System.out.println("EmployeeId: "+employeeDTO.getAadharCardNumber());
System.out.println("******************************************************************");
}
}catch(DAOException daoe)
{
System.out.println(daoe.getMessage());
}
}
}