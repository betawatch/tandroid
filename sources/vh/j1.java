package vh;

import android.content.Context;
import org.telegram.ui.Components.mv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j1 extends mv {
    public final /* synthetic */ l1 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(l1 l1Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.v6, p6Var), false);
        this.g0 = l1Var;
    }

    @Override // org.telegram.ui.Components.mv
    public final boolean h(int i10) {
        int i11;
        int paddingTop;
        o1 o1Var;
        l1 l1Var = this.g0;
        b1 b1Var = l1Var.b;
        k1 k1Var = l1Var.c;
        p1 p1Var = l1Var.f;
        int i12 = 0;
        if (this.d) {
            return false;
        }
        if (p1Var != null && (o1Var = p1Var.h) != null) {
            if (o1Var.getSelectedCategory() != null) {
                b1.z1(b1Var, 0, 0);
                p1Var.h.I1(null);
            }
            p1Var.h.G1();
            p1Var.b();
        }
        if (k1Var != null) {
            k1Var.D(null);
        }
        while (true) {
            if (i12 >= k1Var.D.size()) {
                i11 = -1;
                break;
            }
            i11 = k1Var.D.keyAt(i12);
            if (k1Var.D.valueAt(i12) == i10) {
                break;
            }
            i12++;
        }
        if (i11 >= 0) {
            float f7 = l1Var.n;
            if (f7 >= 0.0f) {
                paddingTop = b1Var.getPaddingTop();
            } else {
                f7 = l1Var.b();
                l1Var.n = f7;
                paddingTop = b1Var.getPaddingTop();
            }
            b1.z1(b1Var, i11, ((int) (f7 + paddingTop)) - org.telegram.messenger.i0.L(102.0f));
        }
        return true;
    }
}
