package th;

import android.text.Editable;
import org.telegram.messenger.o6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.k9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class p5 implements c1 {
    public final /* synthetic */ t5 a;

    public p5(t5 t5Var) {
        this.a = t5Var;
    }

    @Override // th.c1
    public final void S0(d1 d1Var) {
        a aVar;
        t5 t5Var = this.a;
        q5 q5Var = t5Var.y;
        if (q5Var == null || (aVar = t5Var.x) == null) {
            return;
        }
        p3.P1(((y2) q5Var).a, aVar);
    }

    @Override // th.c1
    public final void T0(d1 d1Var, int i10, int i11) {
        q5 q5Var;
        k9 textSelectionHelper;
        t5 t5Var = this.a;
        if (t5Var.n || i10 == i11 || (q5Var = t5Var.y) == null || (textSelectionHelper = ((y2) q5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        d1Var.post(new o6(this, d1Var, i11, textSelectionHelper, i10, 8));
    }

    @Override // th.c1
    public final void Z0(CharSequence charSequence) {
        q5 q5Var = this.a.y;
        if (q5Var != null) {
            y2 y2Var = (y2) q5Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            y2Var.a.t4(charSequence.toString());
        }
    }

    @Override // th.c1
    public final void e(d1 d1Var) {
        q5 q5Var = this.a.y;
        if (q5Var != null) {
            p3 p3Var = ((y2) q5Var).a;
            p3.M1(p3Var, d1Var);
            p3Var.d3.U(d1Var, true);
        }
    }

    @Override // th.c1
    public final /* synthetic */ boolean i1(d1 d1Var) {
        return false;
    }

    @Override // th.c1
    public final boolean m() {
        t5 t5Var = this.a;
        q5 q5Var = t5Var.y;
        if (q5Var == null || t5Var.x == null) {
            return false;
        }
        return ((y2) q5Var).a.S4();
    }

    @Override // th.c1
    public final void n1(Editable editable) {
        t5 t5Var = this.a;
        if (t5Var.x == null) {
            return;
        }
        t5Var.w();
        q5 q5Var = t5Var.y;
        if (q5Var != null) {
            p3 p3Var = ((y2) q5Var).a;
            b2 b2Var = p3Var.F3;
            if (b2Var != null) {
                b2Var.g();
            }
            p3Var.d3.onContentChanged();
        }
        TL_iv.PageBlock pageBlock = t5Var.x.b;
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            t5Var.invalidate();
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            t5Var.invalidate();
            int measuredWidth = t5Var.getMeasuredWidth();
            if (measuredWidth > 0) {
                if (t5Var.h(measuredWidth, t5Var.getPaddingBottom() + t5Var.h.getMeasuredHeight() + t5Var.b.getMeasuredHeight() + t5Var.getPaddingTop()) == t5Var.K) {
                    return;
                }
            }
            t5Var.requestLayout();
        }
    }

    @Override // th.c1
    public final boolean r0(d1 d1Var) {
        t5 t5Var = this.a;
        t5Var.f.r();
        d1 d1Var2 = t5Var.f;
        d1Var2.setSelection(d1Var2.length());
        return true;
    }

    @Override // th.c1
    public final /* synthetic */ boolean t1(boolean z10) {
        return false;
    }

    @Override // th.c1
    public final void z(int i10, int i11) {
        b2 b2Var;
        t5 t5Var = this.a;
        q5 q5Var = t5Var.y;
        if (q5Var == null || t5Var.x == null || (b2Var = ((y2) q5Var).a.F3) == null) {
            return;
        }
        b2Var.f(i10, i11);
    }

    @Override // th.c1
    public final void u0() {
    }
}
