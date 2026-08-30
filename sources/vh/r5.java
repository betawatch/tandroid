package vh;

import android.text.Editable;
import org.telegram.messenger.p6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.m9;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class r5 implements c1 {
    public final /* synthetic */ v5 a;

    public r5(v5 v5Var) {
        this.a = v5Var;
    }

    @Override // vh.c1
    public final void D(CharSequence charSequence) {
        s5 s5Var = this.a.y;
        if (s5Var != null) {
            a3 a3Var = (a3) s5Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            a3Var.a.t4(charSequence.toString());
        }
    }

    @Override // vh.c1
    public final /* synthetic */ boolean F(d1 d1Var) {
        return false;
    }

    @Override // vh.c1
    public final void G(d1 d1Var) {
        a aVar;
        v5 v5Var = this.a;
        s5 s5Var = v5Var.y;
        if (s5Var == null || (aVar = v5Var.x) == null) {
            return;
        }
        r3.P1(((a3) s5Var).a, aVar);
    }

    @Override // vh.c1
    public final void N(Editable editable) {
        v5 v5Var = this.a;
        if (v5Var.x == null) {
            return;
        }
        v5Var.w();
        s5 s5Var = v5Var.y;
        if (s5Var != null) {
            r3 r3Var = ((a3) s5Var).a;
            c2 c2Var = r3Var.G3;
            if (c2Var != null) {
                c2Var.g();
            }
            r3Var.e3.onContentChanged();
        }
        TL_iv.PageBlock pageBlock = v5Var.x.b;
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            v5Var.invalidate();
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            v5Var.invalidate();
            int measuredWidth = v5Var.getMeasuredWidth();
            if (measuredWidth > 0) {
                if (v5Var.h(measuredWidth, v5Var.getPaddingBottom() + v5Var.h.getMeasuredHeight() + v5Var.b.getMeasuredHeight() + v5Var.getPaddingTop()) == v5Var.L) {
                    return;
                }
            }
            v5Var.requestLayout();
        }
    }

    @Override // vh.c1
    public final void O(d1 d1Var, int i10, int i11) {
        s5 s5Var;
        m9 textSelectionHelper;
        v5 v5Var = this.a;
        if (v5Var.n || i10 == i11 || (s5Var = v5Var.y) == null || (textSelectionHelper = ((a3) s5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        d1Var.post(new p6(this, d1Var, i11, textSelectionHelper, i10, 8));
    }

    @Override // vh.c1
    public final /* synthetic */ boolean R(boolean z4) {
        return false;
    }

    @Override // vh.c1
    public final void c(d1 d1Var) {
        s5 s5Var = this.a.y;
        if (s5Var != null) {
            r3 r3Var = ((a3) s5Var).a;
            r3.M1(r3Var, d1Var);
            r3Var.e3.e(d1Var, true);
        }
    }

    @Override // vh.c1
    public final boolean d() {
        v5 v5Var = this.a;
        s5 s5Var = v5Var.y;
        if (s5Var == null || v5Var.x == null) {
            return false;
        }
        return ((a3) s5Var).a.S4();
    }

    @Override // vh.c1
    public final void i(int i10, int i11) {
        c2 c2Var;
        v5 v5Var = this.a;
        s5 s5Var = v5Var.y;
        if (s5Var == null || v5Var.x == null || (c2Var = ((a3) s5Var).a.G3) == null) {
            return;
        }
        c2Var.f(i10, i11);
    }

    @Override // vh.c1
    public final boolean o(d1 d1Var) {
        v5 v5Var = this.a;
        v5Var.f.r();
        d1 d1Var2 = v5Var.f;
        d1Var2.setSelection(d1Var2.length());
        return true;
    }

    @Override // vh.c1
    public final void r() {
    }
}
