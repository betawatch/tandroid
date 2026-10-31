package sg;

import java.util.Comparator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l0 implements Comparator {
    public long a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12;
        int i13;
        m0 m0Var = (m0) obj;
        m0 m0Var2 = (m0) obj2;
        if (this.a >= 0) {
            boolean z10 = m0Var.l;
            if (z10 != m0Var2.l) {
                return z10 ? -1 : 1;
            }
            boolean z11 = m0Var.P;
            if (z11 != m0Var2.P) {
                return z11 ? -1 : 1;
            }
            if (z11 && (i12 = m0Var.j) != (i13 = m0Var2.j)) {
                return i12 - i13;
            }
            i10 = m0Var.a.lastDrawnPosition;
            i11 = m0Var2.a.lastDrawnPosition;
        } else {
            boolean z12 = m0Var.l;
            if (z12 != m0Var2.l) {
                return z12 ? -1 : 1;
            }
            int i14 = m0Var.i;
            int i15 = m0Var2.i;
            if (i14 != i15) {
                return i15 - i14;
            }
            i10 = m0Var.a.lastDrawnPosition;
            i11 = m0Var2.a.lastDrawnPosition;
        }
        return i10 - i11;
    }
}
