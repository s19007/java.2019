import  java.util.*;

class Ex6{

    public int [] ex6_1(){

        int [] ret = new int[5];
        for (int i = 5; i > 0; i--) {
            ret[5-i] = i;
        }
        return ret;
    }

    public double [] ex6_2(){

        double [] ret ={1.1, 2.2, 3.3, 4.4, 5.5};
        return ret;
    }

    public int [] ex6_3(int a, int b){

        int [] ret = new int[a];
        for (int i = 0; i < a; i++){
            ret[i]  = b;
        }

        return ret;
    }

    public int [] ex6_4(int [] a){

        int sum = 0;
        int max = a[0];
        int min = a[1];

        for(int i = 0; i < a.length; i++){
            sum += a[i];
            int v = a[i];
            if (v > max) {
                max = v;
            }
            if (v < min) {
                min = v;
            }
        }
        float SumFloat = sum;
        float ave = Math.round(SumFloat / a.length);

        int [] ret = {sum, (int)ave, max, min};
        return ret;
    }

    public int ex6_5(int [] a, int key){


        for (int i = 0; i < a.length; i++){
            if (key == a[i]){
                return i;
            }
        }
        return -1;

    }

    public int ex6_6(int [] a, int key){

        for (int i = a.length -1; i > 0; i--){
            if (a[i] == key){
                return i;
            }
        }
        return -1;

    }
    public int [] ex6_7(int [] a, int idx){

        int size = a.length;

        if (idx >= 0 && idx < a.length){
            size--;
        }

        int [] ret = new int[size];

        for (int src = 0, dst = 0; src < a.length; src++){
            if (src == idx){
                continue;
            }
            ret[dst++] = a[src];
        }
        return ret;

    }

    public int [] ex6_8(int [] a, int idx, int n){

        int size = a.length;
        int sum = idx + n;

        if (a.length > sum){
            size = size - n;
        }
        int [] ret = new int[size];

        for (int i = 0, b = -1; i < a.length; i++){
            if (a.length < sum){
                ret = a.clone();
            }else if (idx <= i && i < sum){
                continue;
            }else {
                b++;
                ret[b] += a[i];
            }
        }
        return ret;
    }

    public int [] ex6_9(int [] a, int idx, int x){

        int [] ret;
        if (idx >= 0 && idx < a.length ){
            ret = new int[a.length + 1];
            int src = 0;
            int dst = 0;
            while (src < a.length) {
                if (src == idx){
                    ret[dst++] = x;
                }
                ret[dst++] = a[src++];
            }
        }else {
            ret = new int[a.length];
            ret = a.clone();
        }
        return ret;
    }

    public void ex6_10(int [] a, int [] b){

        int min = Math.min(a.length, b.length);
        int[] A = a.clone();
        int[] B = b.clone();

        for(int i = 0; i < min; i++){
            a[i] = B[i];
            b[i] = A[i];
        }


    }

    public int [] ex6_11(int [] a){

        return a;
    }

    public int [] ex6_12(int [] a, int x){

        List<Integer> ret1 = new ArrayList<Integer>();

        for (int i = 0; i < a.length; i++){
            if (a[i] == x){
                ret1.add(i);
            }
        }

        int [] ret = new int[ret1.size()];
        for (int z = 0; z < ret1.size(); z++){
            ret[z] = ret1.get(z);
        }

        return ret;
    }

    public int [] ex6_13(int [] a, int idx){

        List<Integer> ret1 = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++){
            if (i != idx){
                ret1.add(a[i]);
            }
        }

        int [] ret = new int[ret1.size()];
        for (int z = 0; z < ret1.size(); z++){
            ret[z] = ret1.get(z);
        }

        return ret;
    }

    public int [] ex6_14(int [] a, int idx, int n){

        List<Integer> ret1 = new ArrayList<Integer>();

        for (int i = 0; i < a.length; i++){
            if (!(idx <= i && i < idx + n)){
                ret1.add(a[i]);
            }
        }

        int [] ret = new int[ret1.size()];
        for (int z = 0; z < ret1.size(); z++){
            ret[z] = ret1.get(z);
        }

        return ret;
    }

    public int [] ex6_15(int [] a, int idx, int x){

        int [] ret = new int[a.length + 1];
        idx = idx - 1;

        for (int i = 0; i < a.length; i++) {
            if (i == idx) {
                ret[i] = x;
            }
            ret[i] = a[i];
        }
        return ret;
    }
}
