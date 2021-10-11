// Print the following pattern for the given number of rows.
// Pattern for N = 4
// 4444444
// 4333334
// 4322234
// 4321234
// 4322234
// 4333334
// 4444444

public class solution {

	public static void print(int n) {
	//Write your code here
        
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print(n - Math.min(i,j) + 1);                
            }
            for(int j = n-1; j>=1; j--){
                System.out.print(n - Math.min(i,j) + 1);                
            }
            System.out.println();
        }
        
        for(int i = n-1; i>=1; i--){
            for(int j = 1; j<=n; j++){
                System.out.print(n - Math.min(i,j) + 1);                
            }
            for(int j = n-1; j>=1; j--){
                System.out.print(n - Math.min(i,j) + 1);                
            }
            System.out.println();
        }        
	}

}
