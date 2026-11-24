// default package

import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class qge {
    public static ld7 a(ja3 ja3Var, boolean z, boolean z2) {
        ld7 M = new s34((byte) 8).M(ja3Var, !z ? tj5.b : z2 ? tj5.c : null, 0);
        if (M == null || M.a.length == 0) {
            return null;
        }
        return M;
    }

    public static lv6 b(xu7 xu7Var) {
        xu7Var.O(1);
        int D = xu7Var.D();
        long j = xu7Var.b + D;
        int i = D / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long u = xu7Var.u();
            if (u == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = u;
            jArr2[i2] = xu7Var.u();
            xu7Var.O(2);
            i2++;
        }
        xu7Var.O((int) (j - xu7Var.b));
        return new lv6(jArr, jArr2, false, (byte) 28);
    }
}
