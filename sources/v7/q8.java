package v7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class q8 {
    public static long a(e2.v vVar, int i10, int i11) {
        vVar.J(i10);
        if (vVar.a() < 5) {
            return -9223372036854775807L;
        }
        int j3 = vVar.j();
        if ((8388608 & j3) != 0 || ((2096896 & j3) >> 8) != i11 || (j3 & 32) == 0 || vVar.x() < 7 || vVar.a() < 7 || (vVar.x() & 16) != 16) {
            return -9223372036854775807L;
        }
        vVar.h(0, 6, new byte[6]);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((255 & r0[4]) >> 7);
    }
}
