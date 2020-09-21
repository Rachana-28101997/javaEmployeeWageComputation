public class EmployeeWageComputation
{
        static final int IS_FULL_TIME=1,IS_PART_TIME=2,WAGE_PER_HR=20;
        public static void main(String[] args)
        {
                int random=(int)Math.floor(Math.random()*10)%3;
                int workingHrs=0,salary;

                if(random==IS_FULL_TIME)
                {
                        System.out.println("Employee Is a full time employee");
                        workingHrs=8;
                }
                else if(random==IS_PART_TIME)
                {
                        System.out.println("Employee Is a part time employee");
                        workingHrs=4;
                }
                else
                        System.out.println("Employee Is Absent ");
                salary=WAGE_PER_HR*workingHrs;

                System.out.println("Employee Earns "+salary);

        }
}
