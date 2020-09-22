public class EmployeeWageComputation
{
        static final int IS_FULL_TIME=1,IS_PART_TIME=2,WAGE_PER_HR=20,WORKING_DAYS=20;
        static final int MAX_WORKING_HRS=100;
        public static void main(String[] args)
        {
		System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION");
                int workingHrs=0,salary,totalSalary=0,totalWorkingHrs=0,totalWorkingDays=0;
                while (totalWorkingDays < WORKING_DAYS && totalWorkingHrs <= MAX_WORKING_HRS)
                {
                        totalWorkingDays++;
                        int random=(int)Math.floor(Math.random()*10)%3;

                        switch(random)
                        {
                                case IS_PART_TIME:
                                                                workingHrs=4;
                                                                break;
                                case IS_FULL_TIME:
                                                                workingHrs=8;
                                                                break;
                                default:
                                                                workingHrs=0;
                        }
                        totalWorkingHrs +=workingHrs;
                        System.out.println("Emp totalWorkingHrs:" +totalWorkingHrs + "Emp totalWorkingDays:" +totalWorkingDays);
                }
                totalSalary=totalWorkingHrs*WAGE_PER_HR;

                System.out.println("Employee Earns "+totalSalary+" This Month");

        }
}
