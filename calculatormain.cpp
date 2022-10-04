#include <Stdio.h>
int main ()
{
int op,done=0;
float num1,num2,ans;	
	printf ("CALCULATOR\n");
	do 
	{
	printf ("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
	printf ("\n\nEnter the corresponding number:");
	scanf  ("%d",&op);
	switch (op)
	{
	
		case (1):
			printf ("enter 1st number:");
			scanf  ("%f",&num1);
			printf ("enter 2nd number:");
			scanf  ("%f",&num2);
			ans = num1 + num2 ;
			printf ("%f + %f is: %f",num1,num2,ans);
			break;
		case (2):
			printf ("enter 1st number:");
			scanf  ("%f",&num1);
			printf ("enter 2nd number:");
			scanf  ("%f",&num2);
			ans = num1 - num2 ;
			printf ("%f - %f is: %f",num1,num2,ans);
			break;
		case (3):
			printf ("enter 1st number:");
			scanf  ("%f",&num1);
			printf ("enter 2nd number:");
			scanf  ("%f",&num2);
			ans = num1 * num2 ;
			printf ("%f * %f is: %f",num1,num2,ans);
			break;
		case (4):
			printf ("enter 1st number:");
			scanf  ("%f",&num1);
			printf ("enter 2nd number:");
			scanf  ("%f",&num2);
			ans = num1 / num2 ;
			printf ("%f / %f is: %f",num1,num2,ans);
			break;
	}
	printf ("\n-------------------------\n");
	printf ("\n1.Yes\n2.No\nARE YOU DONE?:");
	scanf ("%d",&done);
	if (done==2)
	{
		printf ("\n--------------------\n");
	}
	op = 1;
	}
	while (done != 1);

}