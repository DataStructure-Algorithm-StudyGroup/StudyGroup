public class SimpleSort {

    public void findOldestAndNewestTweet(int[] tweetArray) {

        // assigning the first value to the oldest
        int oldest=tweetArray[0];
        int newest=0;
        for(int i=0; i<tweetArray.length; i++) {
            if(oldest > tweetArray[i]) {
                oldest = tweetArray[i];
            } else if(newest < tweetArray[i]){
                newest = tweetArray[i];
            }
        }

        System.out.println("oldest -" +oldest);
        System.out.println("newest -" +newest);
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] tweetArray = {2012, 2014, 2016};
        OldestAndNewestTweet oldestAndNewestTweet = new OldestAndNewestTweet();
        oldestAndNewestTweet.findOldestAndNewestTweet(tweetArray);
    }

}