package rh;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.j9;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class p5 implements c1 {
    public final /* synthetic */ t5 a;

    public p5(t5 t5Var) {
        this.a = t5Var;
    }

    @Override // rh.c1
    public final void B(int i10, int i11) {
        b2 b2Var;
        t5 t5Var = this.a;
        q5 q5Var = t5Var.y;
        if (q5Var == null || t5Var.x == null || (b2Var = ((y2) q5Var).a.F3) == null) {
            return;
        }
        b2Var.f(i10, i11);
    }

    @Override // rh.c1
    public final void N1(d1 d1Var, int i10, int i11) {
        q5 q5Var;
        j9 textSelectionHelper;
        t5 t5Var = this.a;
        if (t5Var.n || i10 == i11 || (q5Var = t5Var.y) == null || (textSelectionHelper = ((y2) q5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        d1Var.post(new nh.j4(this, d1Var, i11, textSelectionHelper, i10, 8));
    }

    @Override // rh.c1
    public final /* synthetic */ boolean T1(boolean z10) {
        return false;
    }

    @Override // rh.c1
    public final boolean f1(d1 d1Var) {
        t5 t5Var = this.a;
        t5Var.f.r();
        d1 d1Var2 = t5Var.f;
        d1Var2.setSelection(d1Var2.length());
        return true;
    }

    @Override // rh.c1
    public final void g(d1 d1Var) {
        q5 q5Var = this.a.y;
        if (q5Var != null) {
            p3 p3Var = ((y2) q5Var).a;
            p3.M1(p3Var, d1Var);
            p3Var.d3.n0(d1Var, true);
        }
    }

    @Override // rh.c1
    public final void g1(CharSequence charSequence) {
        q5 q5Var = this.a.y;
        if (q5Var != null) {
            y2 y2Var = (y2) q5Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            y2Var.a.t4(charSequence.toString());
        }
    }

    @Override // rh.c1
    public final boolean n() {
        t5 t5Var = this.a;
        q5 q5Var = t5Var.y;
        if (q5Var == null || t5Var.x == null) {
            return false;
        }
        return ((y2) q5Var).a.S4();
    }

    @Override // rh.c1
    public final /* synthetic */ boolean o0(d1 d1Var) {
        return false;
    }

    @Override // rh.c1
    public final void r1(Editable editable) {
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

    @Override // rh.c1
    public final void w1(d1 d1Var) {
        a aVar;
        t5 t5Var = this.a;
        q5 q5Var = t5Var.y;
        if (q5Var == null || (aVar = t5Var.x) == null) {
            return;
        }
        p3.P1(((y2) q5Var).a, aVar);
    }

    @Override // rh.c1
    public final void K0() {
    }
}
