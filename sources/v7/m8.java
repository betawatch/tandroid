package v7;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public abstract class m8 {
    public static long a(e2.x xVar, int i10, int i11) {
        xVar.N(i10);
        if (xVar.a() < 5) {
            return -9223372036854775807L;
        }
        int m10 = xVar.m();
        if ((8388608 & m10) != 0 || ((2096896 & m10) >> 8) != i11 || (m10 & 32) == 0 || xVar.A() < 7 || xVar.a() < 7 || (xVar.A() & 16) != 16) {
            return -9223372036854775807L;
        }
        xVar.k(0, 6, new byte[6]);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((255 & r0[4]) >> 7);
    }
}
