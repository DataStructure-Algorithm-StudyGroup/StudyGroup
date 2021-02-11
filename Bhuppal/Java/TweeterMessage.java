```Java
class Main {
    public static void main(String args[]) {

        int[] tweetArray = {2012, 2014, 2016};

        String oldestTweetMessage = "No Tweet found";
        String earliestTweetMessage = "No Tweet found";
        int tweetLength = tweetArray.length;

        oldestTweetMessage = tweetLength > 0 ? String.valueOf(tweetArray[0]) : oldestTweetMessage;
        System.out.println("Oldest Tweet Message: " + oldestTweetMessage);

        earliestTweetMessage = (tweetLength > 1)  ? String.valueOf(tweetArray[tweetLength -1]) : (tweetLength == 1) ? String.valueOf(tweetArray[0]) :  "No Tweet found";
        System.out.println("Earliest Tweet Message: " + earliestTweetMessage);
    }
}
```

