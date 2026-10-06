package zg;

import java.util.Comparator;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class j0 implements Comparator {
    public long a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12;
        int i13;
        k0 k0Var = (k0) obj;
        k0 k0Var2 = (k0) obj2;
        if (this.a >= 0) {
            boolean z10 = k0Var.m;
            if (z10 != k0Var2.m) {
                return z10 ? -1 : 1;
            }
            boolean z11 = k0Var.Q;
            if (z11 != k0Var2.Q) {
                return z11 ? -1 : 1;
            }
            if (z11 && (i12 = k0Var.k) != (i13 = k0Var2.k)) {
                return i12 - i13;
            }
            i10 = k0Var.a.lastDrawnPosition;
            i11 = k0Var2.a.lastDrawnPosition;
        } else {
            boolean z12 = k0Var.m;
            if (z12 != k0Var2.m) {
                return z12 ? -1 : 1;
            }
            int i14 = k0Var.j;
            int i15 = k0Var2.j;
            if (i14 != i15) {
                return i15 - i14;
            }
            i10 = k0Var.a.lastDrawnPosition;
            i11 = k0Var2.a.lastDrawnPosition;
        }
        return i10 - i11;
    }
}
