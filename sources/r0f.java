// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class r0f {
    public static long a(ey7 ey7Var, int i, int i2) {
        ey7Var.N(i);
        if (ey7Var.a() < 5) {
            return -9223372036854775807L;
        }
        int m = ey7Var.m();
        if ((8388608 & m) != 0 || ((2096896 & m) >> 8) != i2 || (m & 32) == 0 || ey7Var.A() < 7 || ey7Var.a() < 7 || (ey7Var.A() & 16) != 16) {
            return -9223372036854775807L;
        }
        ey7Var.k(0, 6, new byte[6]);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
    }
}
