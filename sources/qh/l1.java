package qh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.zv;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class l1 extends zv {
    public final /* synthetic */ o1 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(o1 o1Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.v6, g6Var), false);
        this.d0 = o1Var;
    }

    @Override // org.telegram.ui.Components.zv
    public final boolean h(int i10) {
        int i11;
        int paddingTop;
        r1 r1Var;
        o1 o1Var = this.d0;
        d1 d1Var = o1Var.b;
        n1 n1Var = o1Var.c;
        s1 s1Var = o1Var.f;
        int i12 = 0;
        if (this.d) {
            return false;
        }
        if (s1Var != null && (r1Var = s1Var.f) != null) {
            if (r1Var.getSelectedCategory() != null) {
                d1.w1(d1Var, 0, 0);
                s1Var.f.F1(null);
            }
            s1Var.f.D1();
            s1Var.b();
        }
        if (n1Var != null) {
            n1Var.D(null);
        }
        while (true) {
            if (i12 >= n1Var.y.size()) {
                i11 = -1;
                break;
            }
            i11 = n1Var.y.keyAt(i12);
            if (n1Var.y.valueAt(i12) == i10) {
                break;
            }
            i12++;
        }
        if (i11 >= 0) {
            float f10 = o1Var.n;
            if (f10 >= 0.0f) {
                paddingTop = d1Var.getPaddingTop();
            } else {
                f10 = o1Var.b();
                o1Var.n = f10;
                paddingTop = d1Var.getPaddingTop();
            }
            d1.w1(d1Var, i11, ((int) (f10 + paddingTop)) - AndroidUtilities.dp(102.0f));
        }
        return true;
    }
}
