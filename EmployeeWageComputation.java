public class EmployeeWageComputation
{
        static final int IS_FULL_TIME=1,IS_PART_TIME=2;

        public static void computeEmpWage(String company, int wagePerHr, int numOfWorkingDays, int maxHoursPerMonth)
        {
                 int workingHrs=0,salary,totalSalary=0,totalWorkingHrs=0,totalWorkingDays=0;
                while (totalWorkingDays < numOfWorkingDays && totalWorkingHrs <= maxHoursPerMonth)
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
                totalSalary=totalWorkingHrs*wagePerHr;

                System.out.println("Employee Wage For Company: " +company+" is: "+totalSalary);
        }

        public static void main(String[] args)
        {

                computeEmpWage("HP",20,20,50);
                computeEmpWage("BridgeLabs",30,20,50);

        }
}
