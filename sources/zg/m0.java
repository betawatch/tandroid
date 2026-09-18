package zg;

import java.util.Comparator;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class m0 implements Comparator {
    public long a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12;
        int i13;
        n0 n0Var = (n0) obj;
        n0 n0Var2 = (n0) obj2;
        if (this.a >= 0) {
            boolean z10 = n0Var.m;
            if (z10 != n0Var2.m) {
                return z10 ? -1 : 1;
            }
            boolean z11 = n0Var.Q;
            if (z11 != n0Var2.Q) {
                return z11 ? -1 : 1;
            }
            if (z11 && (i12 = n0Var.k) != (i13 = n0Var2.k)) {
                return i12 - i13;
            }
            i10 = n0Var.a.lastDrawnPosition;
            i11 = n0Var2.a.lastDrawnPosition;
        } else {
            boolean z12 = n0Var.m;
            if (z12 != n0Var2.m) {
                return z12 ? -1 : 1;
            }
            int i14 = n0Var.j;
            int i15 = n0Var2.j;
            if (i14 != i15) {
                return i15 - i14;
            }
            i10 = n0Var.a.lastDrawnPosition;
            i11 = n0Var2.a.lastDrawnPosition;
        }
        return i10 - i11;
    }
}
