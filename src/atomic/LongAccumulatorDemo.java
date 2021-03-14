package atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.stream.IntStream;

/**
 * 描述：演示LongAccumulator的用法
 */
public class LongAccumulatorDemo {

    public static void main(String[] args) {
        // 1.
//        LongAccumulator accumulator = new LongAccumulator((x, y) -> x + y, 0);
//        accumulator.accumulate(1);
//        accumulator.accumulate(2);
//        System.out.println(accumulator.getThenReset());
        // 2.
        LongAccumulator accumulator = new LongAccumulator((x, y) -> x + y, 0);
//        LongAccumulator accumulator = new LongAccumulator((x, y) -> 2 + x * y, 1);
//        LongAccumulator accumulator = new LongAccumulator((x, y) -> 2 * x * y, 1);
        ExecutorService executor = Executors.newFixedThreadPool(8);
        // 0-9加合
        IntStream.range(1, 10).forEach(i -> executor.submit(() -> accumulator.accumulate(i)));

        executor.shutdown();
        while (!executor.isTerminated()) {

        }
        System.out.println(accumulator.getThenReset());
    }
}
