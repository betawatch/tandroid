package ph;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wv;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class k1 extends wv {
    public final /* synthetic */ n1 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(n1 n1Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v6, f6Var), false);
        this.d0 = n1Var;
    }

    @Override // org.telegram.ui.Components.wv
    public final boolean h(int i10) {
        int i11;
        int paddingTop;
        q1 q1Var;
        n1 n1Var = this.d0;
        d1 d1Var = n1Var.b;
        m1 m1Var = n1Var.c;
        r1 r1Var = n1Var.f;
        int i12 = 0;
        if (this.d) {
            return false;
        }
        if (r1Var != null && (q1Var = r1Var.f) != null) {
            if (q1Var.getSelectedCategory() != null) {
                d1.v1(d1Var, 0, 0);
                r1Var.f.E1(null);
            }
            r1Var.f.C1();
            r1Var.b();
        }
        if (m1Var != null) {
            m1Var.D(null);
        }
        while (true) {
            if (i12 >= m1Var.y.size()) {
                i11 = -1;
                break;
            }
            i11 = m1Var.y.keyAt(i12);
            if (m1Var.y.valueAt(i12) == i10) {
                break;
            }
            i12++;
        }
        if (i11 >= 0) {
            float f10 = n1Var.n;
            if (f10 >= 0.0f) {
                paddingTop = d1Var.getPaddingTop();
            } else {
                f10 = n1Var.b();
                n1Var.n = f10;
                paddingTop = d1Var.getPaddingTop();
            }
            d1.v1(d1Var, i11, ((int) (f10 + paddingTop)) - AndroidUtilities.dp(102.0f));
        }
        return true;
    }
}
