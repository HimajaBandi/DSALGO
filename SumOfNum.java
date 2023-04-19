//count the sum of a number using recursion

class SumOfNum {
    public static void main(String[] args) {
        getCount(2341);
    }
    public static int getCount(int n){
        //base condition 
        if(n==0){
            return 0;
        }
        int modNum=n%10;
        getCount= modNum+getCount(n/10);
    }
}

