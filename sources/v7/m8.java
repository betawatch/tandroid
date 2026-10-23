package v7;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
