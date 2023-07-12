class Solution {
    public boolean lemonadeChange(int[] bills) {
        int cash = 0;
        int[] arr = {0,0,0};
        for(int i = 0; i<bills.length;i++){
            if(bills[i]==5){
                arr[0] += 1;
                cash +=5;
            } else if(bills[i]==10){
                arr[1] += 1;
                cash += 5;
                    if(arr[0] != 0) {
                        arr[0] -= 1;
                        cash -= 5;
                    } else return false;
            } else if(bills[i]==20){
                arr[2] += 20;
                cash += 20;
                if(arr[1] != 0) {
                        arr[1] -= 1;
                        cash -= 10;
                            if(arr[0] != 0) {
                                arr[0] -= 1;
                                cash -= 5;
                            } else return false;
                } else if(arr[0] >= 3){
                    cash -= 15;
                    arr[0] -= 3;

                } else return false;

            }
        }
        return true;
     }
}