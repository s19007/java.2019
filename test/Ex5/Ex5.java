class Ex5{

    public double ex5_1(int [] a){
        double ret = 0;
        for (int i: a) {
            ret += i;
        }
        ret = ret / a.length;
        return ret;
    }
}