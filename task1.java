
public class task1 {

    static int numberOfPaths( int x, int y, int N) {
        if (x==N-1 && y==N-1){
            return 1;
        }
        if (x>N-1 || y> N-1){
            return 0;
        }
        return numberOfPaths(x+1,y,N)+numberOfPaths(x, y+1,N);
    }
    public static  void main (String [] args)  {
        int res = numberOfPaths(0,0,8);
        System.out.println(res);
    }
}



