package SIngletonTest;

import Singleton.Singleton;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SingletonTest {
    @Test
    public void could_only_create_one_instance_in_single_thread() throws Exception {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        assertTrue(s1 == s2);
    }

    @Test
    public void could_create_only_one_instance_in_multithreading() throws Exception {


    }
}
