// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class zve {
    public static long a(xu7 xu7Var, int i, int i2) {
        xu7Var.N(i);
        if (xu7Var.a() < 5) {
            return -9223372036854775807L;
        }
        int m = xu7Var.m();
        if ((8388608 & m) != 0 || ((2096896 & m) >> 8) != i2 || (m & 32) == 0 || xu7Var.A() < 7 || xu7Var.a() < 7 || (xu7Var.A() & 16) != 16) {
            return -9223372036854775807L;
        }
        xu7Var.k(0, 6, new byte[6]);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
    }
}
