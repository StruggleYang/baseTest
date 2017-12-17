package base.thread.conpro;

import org.apache.log4j.Logger;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 多线程生产者消费者模型
 */
public class Main {

    public static void main(String[] args) {
        final Logger logger = Logger.getLogger("main");
        final Queue sharedQ = new LinkedList();
        logger.info(sharedQ);
        Thread producer = new Producer(sharedQ);
        Thread consumer = new Consumer(sharedQ);

        producer.start();
        consumer.start();
    }
}
