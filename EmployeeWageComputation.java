public class EmployeeWageComputation
{
        static final int IS_FULL_TIME=1,IS_PART_TIME=2,WAGE_PER_HR=20,WORKING_DAYS=20;
        public static void main(String[] args)
        {

                int workingHrs=0,salary,totalSalary=0;
                for(int day=1;day<=WORKING_DAYS;day++)
                {
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

                        salary=WAGE_PER_HR*workingHrs;
                        totalSalary+=salary;
                }


                System.out.println("Employee Earns "+totalSalary+" This Month");

        }
}
