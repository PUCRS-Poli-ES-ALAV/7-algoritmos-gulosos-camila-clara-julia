import java.util.ArrayList;
  
class Exercicio1
{
    static int centavos[] = {1, 5, 10, 25, 100};
    static int n = centavos.length;
  
    static void findMin(int V)
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
  
        for (int i = n - 1; i >= 0; i--)
        {
            while (V >= centavos[i]) 
            {
                V -= centavos[i];
                
                ans.add(centavos[i]);
            }
        }
  
        for (int i = 0; i < ans.size(); i++)
        {
            System.out.print(" " + ans.get(i));
        }
    }
   
    public static void main(String[] args) 
    {
        int n = 93;
        System.out.print(
            "Following is minimal number "
            +"of change for " + n + ": ");
        findMin(n);
    }
}