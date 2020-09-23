public class EmployeeWageComputation
{
        static final int IS_FULL_TIME=1,IS_PART_TIME=2;

        private final String company;
        private final int wagePerHr;
        private final int numOfWorkingDays;
        private final int maxHoursPerMonth;
        private int totalSalary;

        public EmployeeWageComputation(String company, int wagePerHr, int numOfworkingDays, int maxHoursPerMonth)
        {
                this.company=company;
                this.wagePerHr=wagePerHr;
                this.numOfWorkingDays=numOfworkingDays;
                this.maxHoursPerMonth=maxHoursPerMonth;
        }




        public void computeEmpWage()
        {
                 int workingHrs=0,salary,totalWorkingHrs=0,totalWorkingDays=0;
                	while (totalWorkingDays < numOfWorkingDays && totalWorkingHrs <= maxHoursPerMonth)
                	{
                        	totalWorkingDays++;
                        	int random=(int)Math.floor(Math.random()*10)%3;
				System.out.println(random);
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

        }

        public String toString()
        {
                return "Total Emp Wage For Company: " +company+ " is: " +totalSalary;
        }

        public static void main(String[] args)
        {
                EmployeeWageComputation object=new EmployeeWageComputation("unisis", 20, 2, 10);
                EmployeeWageComputation object1=new EmployeeWageComputation("microsoft", 20, 2, 10);
                object.computeEmpWage();
                System.out.println(object);
                object1.computeEmpWage();
                System.out.println(object1);
        }
}
