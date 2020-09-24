import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

class Company
{

        public final String company;
        public final int wagePerHr;
        public final int numbOfWorkingDays;
        public final int numbWorkingHrs;

        public Company(String company,int wagePerHr,int numbOfWorkingDays,int numbWorkingHrs)
        {
                this.company=company;
                this.wagePerHr=wagePerHr;
                this.numbOfWorkingDays=numbOfWorkingDays;
                this.numbWorkingHrs=numbWorkingHrs;
        }

}

interface EmployeeWageComp{
        public abstract Map<String,Integer> calculateEmpWage(Company company);
        public abstract ArrayList readInputsFromUser();

}

public class EmployeeWageComputation implements EmployeeWageComp
{

        public static final int FULL_TIME=1;
        public static final int PART_TIME=2;

        @Override
        public Map<String,Integer> calculateEmpWage(Company company)
        {
        int currentWorkingHour=0;
        int currentWorkingday=0;
        int salary,workingHr=0;
        int totalSalary=0;

        Map<String,Integer> cmpGag =  new HashMap<String,Integer>();

        while( company.numbOfWorkingDays>=currentWorkingday && company.numbWorkingHrs>=currentWorkingHour )
        {
                int random=(int)Math.floor(Math.random()*10)%3;

               switch(random)
                {
                        case FULL_TIME:
                        workingHr=8;
                        break;

                        case PART_TIME:
                        workingHr=4;
                        break;

                       default:
                       workingHr=0;
                 }
                        currentWorkingday++;
                        salary=workingHr*company.wagePerHr;
//                       System.out.println("Daily salary for "+company.company+" "+salary);

                        totalSalary+=salary;
                        wageOnDailyBasis(currentWorkingday, workingHr, totalSalary);


        }
                System.out.println("Total computed salary for "+company.company+" "+totalSalary);
                cmpGag.put(company.company,totalSalary);

                return cmpGag;

}
        @Override
        public ArrayList readInputsFromUser()
        {
                ArrayList<Company> companyDetails = new ArrayList<Company>();
                System.out.println("please enter number of companies");
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();

                for(int i=0;i<n;i++)
                {
                        String company="";
                        int workPerHr=0;
                        int numbOfWorkingDays=0;
                        int numbWorkingHrs=0;

                        Scanner sc1=new Scanner(System.in);
                        System.out.println("please enter company name:");
                        company=sc1.nextLine();

                        System.out.println("please enter workPerHr:");
                        workPerHr=sc1.nextInt();

                        System.out.println("please enter numberofworkingdays:");
                        numbOfWorkingDays=sc1.nextInt();

                        System.out.println("please enter numberofworkingHrs:");
                        numbWorkingHrs=sc1.nextInt();

                        Company com=new Company(company,workPerHr,numbOfWorkingDays,numbWorkingHrs);
                        companyDetails.add(com);

                }
                return companyDetails;
        }

        public static void main(String[] args)
        {

                EmployeeWageComp empComp = new EmployeeWageComputation();

                ArrayList<Company> array=empComp.readInputsFromUser();
                Company c=null;
                 Map<String,Integer> cmpMaps =  new HashMap<String,Integer>();

                for(Company c2:array)
                {
                        String company="";
                        int wagePerHr=0;
                        int workingDays=0;
                        int workingHrs=0;

                        company=c2.company.toString();
                        System.out.println("company "+company);

                        wagePerHr=(int)c2.wagePerHr;
                        System.out.println("wageperhr "+wagePerHr);

                        workingDays=(int)c2.numbOfWorkingDays;
                        System.out.println("workingDays "+workingDays);

                        workingHrs=(int)c2.numbWorkingHrs;
                        System.out.println("workingHrs "+workingHrs);

                        c=new Company(company,wagePerHr,workingDays,workingHrs);
//                      TestEmp object=new TestEmp();
                        cmpMaps = empComp.calculateEmpWage(c);

                }
                System.out.println("Enter company name to get total wage");

                Scanner sc = new Scanner(System.in);
                String comName = sc.nextLine();

                Integer totalG = cmpMaps.get(comName);
                System.out.println("Total Gague fot "+comName +" is "+totalG);

         }



        public void wageOnDailyBasis( int currentWorkingday, int workingHr, int totalSalary) {
                System.out.println(workingHr + " Hrs worked on Day " + currentWorkingday + ", wage of employee is " + totalSalary);
        }


}
