package zg;

import java.util.Comparator;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
            boolean z10 = m0Var.m;
            if (z10 != m0Var2.m) {
                return z10 ? -1 : 1;
            }
            boolean z11 = m0Var.Q;
            if (z11 != m0Var2.Q) {
                return z11 ? -1 : 1;
            }
            if (z11 && (i12 = m0Var.k) != (i13 = m0Var2.k)) {
                return i12 - i13;
            }
            i10 = m0Var.a.lastDrawnPosition;
            i11 = m0Var2.a.lastDrawnPosition;
        } else {
            boolean z12 = m0Var.m;
            if (z12 != m0Var2.m) {
                return z12 ? -1 : 1;
            }
            int i14 = m0Var.j;
            int i15 = m0Var2.j;
            if (i14 != i15) {
                return i15 - i14;
            }
            i10 = m0Var.a.lastDrawnPosition;
            i11 = m0Var2.a.lastDrawnPosition;
        }
        return i10 - i11;
    }
}
