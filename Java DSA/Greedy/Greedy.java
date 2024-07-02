import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Greedy {
    public static int activitySelection(int[] start, int[] end) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        int n = start.length;
        int count = 1;
        int lastEnd = end[0];
        for (int i = 1; i < n; i++) {
            if (lastEnd <= start[i]) {
                count++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        for (int i : ans) {
            System.out.print("A" + i + " ");
        }
        return count;
    }

    public static int knap(int[] w, int[] v, int wi) {
        int n = v.length;
        double[][] ratio = new double[n][2];

        // Calculate value-to-weight ratio for each item
        for (int i = 0; i < n; i++) {
            ratio[i][0] = (int) i;
            ratio[i][1] = (double) v[i] / w[i];
        }
        // Sort items by value-to-weight ratio in descending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int capacity = wi;
        int finalVal = 0;

        // Add items to the knapsack
        for (int i = n - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= w[idx]) {
                capacity -= w[idx];
                finalVal += v[idx];
            } else {
                finalVal += capacity * ratio[i][1];
                break;
            }
        }

        return finalVal;
    }

    public static int minAbsDiff(int[] a, int[] b) {
        int n = a.length;
        int minDiff = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < n; i++) {
            minDiff += Math.abs(a[i] - b[i]);
        }
        return minDiff;
    }

    public static int maxChainLength(int[][] arr) {
        int n = arr.length;
        Arrays.sort(arr, Comparator.comparingInt(o -> o[1]));
        int chain = 1;
        int endChain = arr[0][1];
        for (int i = 1; i < n; i++) {
            if (arr[i][0] > endChain) {
                chain++;
                endChain = arr[i][1];
            }
        }
        return chain;
    }

    public static int indianCoins(int m, Integer[] coins) {
        int n = coins.length;
        Arrays.sort(coins, Collections.reverseOrder());
        int count = 0;
        int amount = m;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    ans.add(coins[i]);
                    amount -= coins[i];
                    count++;
                }
            }
        }
        System.out.println(ans);
        return count;
    }

    static class Job {
        int id;
        int deadLine;
        int profit;

        Job(int i, int d, int p) {
            id = i;
            deadLine = d;
            profit = p;
        }
    }

    public static void jobSequence(int[][] jobInfo) {
        int n = jobInfo.length;
        ArrayList<Job> job = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            job.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }
        Collections.sort(job, (obj1, obj2) -> obj2.profit - obj1.profit);
        // for (Job job1 : job) {
        // System.out.println(job1.id + " " + job1.deadLine + " " + job1.profit);
        // }
        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < n; i++) {
            Job curr = job.get(i);
            if (curr.deadLine > time) {
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("Max jobs = " + seq.size());
        System.out.println(seq);
    }

    public static void chocolateProblem(Integer[] costVer, Integer[] costHor) {
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while (h < costHor.length && v < costVer.length) {
            if (costHor[h] >= costVer[v]) { // horizontal cut
                cost += costHor[h] * vp;
                hp++;
                h++;
            } else { // vertical cut
                cost += costVer[v] * hp;
                vp++;
                v++;
            }
        }

        while (h < costHor.length) {
            cost += costHor[h] * vp;
            h++;
        }

        while (v < costVer.length) {
            cost += costVer[v] * hp;
            v++;
        }

        System.out.println("Cost = " + cost);
    }

    public static void main(String[] args) {
        // Activity Selection
        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] end = { 2, 4, 6, 7, 9, 9 };
        System.out.println(activitySelection(start, end));
        // Fractional Knapsack
        int v[] = { 60, 100, 120 };
        int w[] = { 10, 20, 30 };
        int wi = 50;
        System.out.println(knap(w, v, wi));
        // Minimum Absolute Difference
        int a[] = { 4, 1, 8, 7 };
        int b[] = { 2, 3, 6, 5 };
        System.out.println(minAbsDiff(a, b));
        // Maximum length chain of pair
        int arr[][] = { { 2, 14 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
        System.out.println(maxChainLength(arr));
        // Indian coins
        Integer[] coins = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        System.out.println(indianCoins(159, coins));
        // Job sequence
        int jobInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
        jobSequence(jobInfo);
        // chocola problem
        // int n = 4, m = 6;
        Integer[] costVer = {2, 1, 3, 1, 4};
        Integer[] costHor = {4, 1, 2};
        chocolateProblem(costVer, costHor);
    }
}