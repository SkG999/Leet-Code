package main;
public class Prob326 {
        public boolean isPowerOfThree(int n) {
            if(n<1){
                return false;
            }
            else{
                while(n%3==0){
                    n=n/3;
                }
                if(n==1){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
    }

