import org.junit.Test;

import static org.example.Main.S0;
import static org.example.Main.S1;
import static org.example.Main.S2;
import static org.example.Main.S3;
import static org.example.Main.S4;
import static org.junit.Assert.assertEquals;

public class MainTest {
    public static int N = 10;
    public static int k = 1;
    public static double t = 0;
    @Test
    public void TestS0() {
        assertEquals(4.9875568, S0(N), 1e-7);
    }
    @Test
    public void TestS1() {
        assertEquals(4.9875568, S1(N, k), 1e-7);
    }
    @Test
    public void TestS2() {
        assertEquals(4.9875568, S2(N, N), 1e-7);
    }
    @Test
    public void TestS3() {
        assertEquals(4.9875568, S3(N, k, t), 1e-7);
    }
    @Test
    public void TestS4() {
        assertEquals(4.9875568, S4(N, N, t), 1e-7);
    }
}
