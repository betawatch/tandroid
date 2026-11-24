// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class rie {
    public static nf7 a(vb3 vb3Var, boolean z, boolean z2) {
        nf7 Z = new fk3((byte) 11).Z(vb3Var, !z ? sl5.b : z2 ? sl5.c : null, 0);
        if (Z == null || Z.a.length == 0) {
            return null;
        }
        return Z;
    }

    public static lx6 b(yw7 yw7Var) {
        yw7Var.O(1);
        int D = yw7Var.D();
        long j = yw7Var.b + D;
        int i = D / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long u = yw7Var.u();
            if (u == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = u;
            jArr2[i2] = yw7Var.u();
            yw7Var.O(2);
            i2++;
        }
        yw7Var.O((int) (j - yw7Var.b));
        return new lx6(jArr, jArr2, (byte) 28);
    }
}
