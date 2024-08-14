public class maze {
    public static void main(String[] args) {
        System.out.println(maizee(3,3));

    }
    public static int maizee(int r,int c){
        if (r==1||c==1){
            return 1;
        }
        int left=maizee(r-1,c);
        int right=maizee(r,c-1);
        int ans=left+right;
        return ans;

    }
}
