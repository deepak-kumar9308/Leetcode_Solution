class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
           int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    int aStart = getDays(arriveAlice, days);
    int aEnd = getDays(leaveAlice, days);
    int bStart = getDays(arriveBob, days);
    int bEnd = getDays(leaveBob, days);

    int start = Math.max(aStart, bStart);
    int end = Math.min(aEnd, bEnd);
    return Math.max(0, end - start + 1);
}
    private int getDays(String date, int[] days) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3));

        int total = day;

        for (int i = 1; i < month; i++) {
            total += days[i];
        }
        return total;
    }
}