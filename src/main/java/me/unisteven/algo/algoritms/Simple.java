package me.unisteven.algo.algoritms;

public class Simple {

    public void testTimes(int i) {
        System.out.println("testing results for n = " + i);
        System.out.println("fragment 1 took" + fragment1(i) + "ms");
        System.out.println("fragment 2 took" + fragment2(i) + "ms");
        System.out.println("fragment 3 took" + fragment3(i) + "ms");
        System.out.println("fragment 4 took" + fragment4(i) + "ms");
        System.out.println("fragment 5 took" + fragment5(i) + "ms");
        System.out.println("fragment 6 took" + fragment6(i) + "ms");
        System.out.println("fragment 7 took" + fragment7(i) + "ms");
        System.out.println("fragment 8 took" + fragment8(i) + "ms");
    }

    public long fragment1(int n) {
        long startTime = System.currentTimeMillis();
        long sum = 0;
        for (long i = 0; i < n; i++) {
            sum++;
        }
        System.out.println("Fragment 1 has ran for a total of " + sum + " times.");
        long finishTime = System.currentTimeMillis();
        return (finishTime - startTime);
    }

    public long fragment2(int n) {
        long startTime = System.currentTimeMillis();
        long sum = 0;
        for (long i = 0; i < n; i += 2) {
            sum++;
        }
        System.out.println("Fragment 2 has ran for a total of " + sum + " times.");
        long finishTime = System.currentTimeMillis();
        return (finishTime - startTime);
    }

    public long fragment3(int n) {
        long startTime = System.currentTimeMillis();
        long sum = 0;
        for (long i = 0; i < n; i++) {
            for (long j = 0; j < n; j++) {
                sum++;
            }
        }
        System.out.println("Fragment 3 has ran for a total of " + sum + " times.");
        long finishTime = System.currentTimeMillis();
        return (finishTime - startTime);
    }

    public long fragment4(int n) {
        long startTime = System.currentTimeMillis();
        long sum = 0;
        for (long i = 0; i < n; i++) {
            sum++;
        }
        for (long j = 0; j < n; j++) {
            sum++;
        }
        System.out.println("Fragment 4 has ran for a total of " + sum + " times.");
        long finishTime = System.currentTimeMillis();
        return (finishTime - startTime);
    }

    public long fragment5(int n) {
        long startTime = System.currentTimeMillis();
        long sum = 0;
        for (long i = 0; i < n; i++) {
            for (long j = 0; j < n * n; j++) {
                sum++;
            }
        }
        System.out.println("Fragment 5 has ran for a total of " + sum + " times.");
        long finishTime = System.currentTimeMillis();
        return (finishTime - startTime);
    }

    public long fragment6(int n) {
        long startTime = System.currentTimeMillis();
        long sum = 0;
        for (long i = 0; i < n; i++) {
            for (long j = 0; j < i; j++) {
                sum++;
            }
        }
        System.out.println("Fragment 6 has ran for a total of " + sum + " times.");
        long finishTime = System.currentTimeMillis();
        return (finishTime - startTime);
    }

    public long fragment7(int n) {
        long startTime = System.currentTimeMillis();
        long sum = 0;
        for (long i = 0; i < n; i++) {
            for (long j = 0; j < n * n; j++) {
                for (long k = 0; k < j; k++) {
                    sum++;
                }
            }
        }
        System.out.println("Fragment 7 has ran for a total of " + sum + " times.");
        long finishTime = System.currentTimeMillis();
        return (finishTime - startTime);
    }

    public long fragment8(int n) {
        long startTime = System.currentTimeMillis();
        long sum = 0;
        for (long i = 1; i < n; i = i * 2) {
            sum++;
        }
        System.out.println("Fragment 8 has ran for a total of " + sum + " times.");
        long finishTime = System.currentTimeMillis();
        return (finishTime - startTime);
    }

}
