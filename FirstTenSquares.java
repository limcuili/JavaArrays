class FirstTenSquares {

    public static void main (String[] args) {
        int[] a = new int[10];
        for (int i=0; i<a.length; i++) {
            a[i] = (i+1)*(i+1);
        }
        System.out.println(a[0]);
        System.out.println(a[5]);
    }

}