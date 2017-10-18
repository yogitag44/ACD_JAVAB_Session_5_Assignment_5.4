public class StackTest {
	
	  public static void main(String args[ ])
      {
              FixedStack fs=new FixedStack(3);    //Fixed stack  constructor of class FixedStack
              
              DynStack ds=new DynStack(5);     //Dynamic stack constructor of class DynStack
              
              Stack mystk;    //calling interface
              for(int i=0;i<3;i++)    //checking for fixed stack value and loop will continue till value is equal to 3
                      
            	  fs.push(i);    //will accept integer one by one and printing its value
              
              System.out.println("======Fixed length Stack defined as 3 and Contents are:======");
              for(int i=0;i<3;i++)
                      System.out.println(fs.pop());   //printing result stored in pop method
              
              for(int i=0;i<7;i++)    //starting dynamic loop
                      ds.push(i);   //pushed values from loop from i=0 till less than 7
              
              System.out.println("\n======Dynamic length Stack Contents are:======");
              for(int i=0;i<7;i++)
                      System.out.println(ds.pop());   //printing all the dynamic elements on by one.
              mystk=fs;
              
              
              for(int i=0;i<3;i++)
                      mystk.push(i);
              
              System.out.println("\n=======Fixed length Stack Contents using interface reference=======");
              for(int i=0;i<3;i++)
                      System.out.println(mystk.pop());   //printing all the values of fixed length using interface reference
              mystk=ds;
              for(int i=0;i<7;i++)
                      mystk.push(i);
              System.out.println("\n=======Dynamic length Stack Contents using interface reference=======");
              for(int i=0;i<7;i++)
                      System.out.println(mystk.pop());   //printing all the values of dynamic length using interface reference
      }
}

class FixedStack implements Stack     //created fixed stack which implements interface Stack
{
      private int stk[ ];
      private int tos;
      FixedStack(int size)    //passing value into method defined in interface Stack
      {
              stk=new int[size];   //storing value in array
              tos=-1;				//initialized top of the stack as -1
      }
      public void push(int item)    //created push method which takes input and calculate if value is greater than the defined stack
      {
              if(tos==stk.length-1)   //comparing values of top of stack
              {
                      System.out.println("******Stack Overflows******");
                      int t[ ]=new int[stk.length * 2];
                      for(int i=0;i<stk.length;i++)
                              t[i]=stk[i];
                      stk=t;
                      stk[++tos]=item;
              }
              else
                      stk[++tos]=item;
      }
      public int pop()
      {
              if(tos<0)
              {
                      System.out.println("Stack Underflows");
                      return 0;
              }
              else
                      return stk[tos--];
      }
}
class DynStack implements Stack
{
      private int stk[ ];
      private int tos;
      DynStack(int size)
      {
              stk=new int[size];
              tos=-1;
      }
      public void push(int item)
      {
              if(tos==stk.length-1)
              {
                      System.out.println("*****Stack Overflows.*****");
                      int t[ ]=new int[stk.length * 2];
                      for(int i=0;i<stk.length;i++)
                              t[i]=stk[i];
                      stk=t;
                      stk[++tos]=item;
              }
              else
                      stk[++tos]=item;
      }
      public int pop()
      {
              if(tos<0)
              {
                      System.out.println("Stack Underflows.");
                      return 0;
              }
              else
                      return stk[tos--];
      }
}


