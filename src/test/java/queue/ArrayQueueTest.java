package queue;

import model.Person;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by eric on 17-11-8
 */
public class ArrayQueueTest {

    @Test
    public void enqueue() throws Exception {
        Queue queue = new ArrayQueue();
        for (int i = 0; i < 3; i++) {
            queue.enQueue(Person.instance());
        }
        Assert.assertEquals(3, queue.length());
    }

    @Test
    public void clear() throws Exception {
        Queue queue = new ArrayQueue();
        for (int i = 0; i < 3; i++) {
            queue.enQueue(Person.instance());
        }
        queue.clear();
        Assert.assertEquals(0, queue.length());
    }

    @Test
    public void isEmpty() throws Exception {
        Queue queue = new ArrayQueue();
        for (int i = 0; i < 3; i++) {
            queue.enQueue(Person.instance());
        }
        Assert.assertTrue(queue.length() == 3);
        queue.clear();
        Assert.assertTrue(queue.length() == 0);
    }

    @Test
    public void get() throws Exception {
        Queue queue = new ArrayQueue();
        queue.enQueue(new Person("tom", 12));
        queue.enQueue(Person.instance());
        Assert.assertTrue("tom".equals(queue.get().getName()));
    }

    @Test
    public void dequeue() throws Exception {
        Queue queue = new ArrayQueue();
        queue.enQueue(new Person("tom", 12));
        for (int i = 0; i < 3; i++) {
            queue.enQueue(Person.instance());
        }
        Person person = queue.deQueue();
        Assert.assertEquals("tom", person.getName());
        Assert.assertEquals(3, queue.length());
    }
}
