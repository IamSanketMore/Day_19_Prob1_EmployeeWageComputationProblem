public class EmpWageComputation
{

        public static final int Full_Time=1;
        public static final int Part_Time=2;

	public static void main(String args [])
	{
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		System.out.println("--------------------------------------------------------------------");

                int Emp_Hrs=0;
                int Emp_Rate_Per_Hrs=20;
                int Per_Day_Salary=0;
                int Num_Of_Working_Days=20;
                int Per_Month_Salary=0;
                int Month_Hrs=0;

                int Result=(int)Math.floor(Math.random()*10)%3;
                System.out.println("Result is :-"+Result);

                for( int day=1; day<=Num_Of_Working_Days && Month_Hrs < 100; day++ )
                {
                        switch ((int)Result)
                        {
                               case Full_Time :
                                       //System.out.println("Employee is Presnt and Its Full Time Employee");
                                        Emp_Hrs=8;
                                break;

                                case Part_Time :
                                        //System.out.println("Employee is Presnt and Its Part Time Employee");
                                        Emp_Hrs=4;
                                break;

                                default :
                                        //System.out.println("Employee is Absent");
                                        Emp_Hrs=0;
                                        Per_Day_Salary=0;
                        }
                        Month_Hrs=(Month_Hrs+Emp_Hrs);
                        System.out.println("Working Days :-"+day);
                        System.out.println("Monthly Hourse Wisev:-"+Month_Hrs);
                        Per_Month_Salary=( Per_Month_Salary+Per_Day_Salary);
                        Per_Day_Salary = (Emp_Hrs*Emp_Rate_Per_Hrs);
                        System.out.println("Per Day Salary is :-"+Per_Day_Salary);


                }
                        //System.out.println("Per Day Salary is :-"+Per_Day_Salary);
                        System.out.println("Per Month Salary is :-"+Per_Month_Salary);

        }

}
