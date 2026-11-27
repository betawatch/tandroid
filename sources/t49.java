// default package

import java.util.Comparator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class t49 implements Comparator {
    public long a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        int i4;
        u49 u49Var = (u49) obj;
        u49 u49Var2 = (u49) obj2;
        if (this.a >= 0) {
            boolean z = u49Var.l;
            if (z != u49Var2.l) {
                return z ? -1 : 1;
            }
            boolean z2 = u49Var.P;
            if (z2 != u49Var2.P) {
                return z2 ? -1 : 1;
            }
            if (z2 && (i3 = u49Var.j) != (i4 = u49Var2.j)) {
                return i3 - i4;
            }
            i = u49Var.a.lastDrawnPosition;
            i2 = u49Var2.a.lastDrawnPosition;
        } else {
            boolean z3 = u49Var.l;
            if (z3 != u49Var2.l) {
                return z3 ? -1 : 1;
            }
            int i5 = u49Var.i;
            int i6 = u49Var2.i;
            if (i5 != i6) {
                return i6 - i5;
            }
            i = u49Var.a.lastDrawnPosition;
            i2 = u49Var2.a.lastDrawnPosition;
        }
        return i - i2;
    }
}
