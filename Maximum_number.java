// We are given a 4 digit number using digits 1 to 9. What is the maximum 3 digit number that we can make by removing one digit from the given integer.

int var = 0;
    int max = 0;
    int i = 1;
    
    while(n/i>0){
        int temp = (n / (i * 10))*i +(n%i);
        //System.out.println(temp);
        if(temp>max){
            max = temp;
        }
        i*=10;
    }
    return max;
