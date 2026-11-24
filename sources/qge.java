// default package

import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class qge {
    public static ld7 a(ja3 ja3Var, boolean z, boolean z2) {
        ld7 O = new s34((byte) 8).O(ja3Var, !z ? tj5.b : z2 ? tj5.c : null, 0);
        if (O == null || O.a.length == 0) {
            return null;
        }
        return O;
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
