package zg;

import java.util.Comparator;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class k0 implements Comparator {
    public long a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12;
        int i13;
        l0 l0Var = (l0) obj;
        l0 l0Var2 = (l0) obj2;
        if (this.a >= 0) {
            boolean z10 = l0Var.m;
            if (z10 != l0Var2.m) {
                return z10 ? -1 : 1;
            }
            boolean z11 = l0Var.Q;
            if (z11 != l0Var2.Q) {
                return z11 ? -1 : 1;
            }
            if (z11 && (i12 = l0Var.k) != (i13 = l0Var2.k)) {
                return i12 - i13;
            }
            i10 = l0Var.a.lastDrawnPosition;
            i11 = l0Var2.a.lastDrawnPosition;
        } else {
            boolean z12 = l0Var.m;
            if (z12 != l0Var2.m) {
                return z12 ? -1 : 1;
            }
            int i14 = l0Var.j;
            int i15 = l0Var2.j;
            if (i14 != i15) {
                return i15 - i14;
            }
            i10 = l0Var.a.lastDrawnPosition;
            i11 = l0Var2.a.lastDrawnPosition;
        }
        return i10 - i11;
    }
}
