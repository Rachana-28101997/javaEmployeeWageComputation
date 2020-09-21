public class EmployeeWageComputation
{
        static final int PRESENT=1;
        public static void main(String[] args)
        {
		System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION")

                int random=(int)Math.floor(Math.random()*10)%2;

                if(PRESENT==random)
                        System.out.println("Employee Is Present ");
                else
                        System.out.println("Employee Is Absent ");

        }
}
