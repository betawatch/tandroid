package qh;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.n9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class o5 implements c1 {
    public final /* synthetic */ s5 a;

    public o5(s5 s5Var) {
        this.a = s5Var;
    }

    @Override // qh.c1
    public final boolean A(d1 d1Var) {
        s5 s5Var = this.a;
        s5Var.f.r();
        d1 d1Var2 = s5Var.f;
        d1Var2.setSelection(d1Var2.length());
        return true;
    }

    @Override // qh.c1
    public final void B1(Editable editable) {
        s5 s5Var = this.a;
        if (s5Var.x == null) {
            return;
        }
        s5Var.w();
        p5 p5Var = s5Var.y;
        if (p5Var != null) {
            o3 o3Var = ((x2) p5Var).a;
            b2 b2Var = o3Var.F3;
            if (b2Var != null) {
                b2Var.g();
            }
            o3Var.d3.onContentChanged();
        }
        TL_iv.PageBlock pageBlock = s5Var.x.b;
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            s5Var.invalidate();
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            s5Var.invalidate();
            int measuredWidth = s5Var.getMeasuredWidth();
            if (measuredWidth > 0) {
                if (s5Var.h(measuredWidth, s5Var.getPaddingBottom() + s5Var.h.getMeasuredHeight() + s5Var.b.getMeasuredHeight() + s5Var.getPaddingTop()) == s5Var.K) {
                    return;
                }
            }
            s5Var.requestLayout();
        }
    }

    @Override // qh.c1
    public final void E(int i9, int i10) {
        b2 b2Var;
        s5 s5Var = this.a;
        p5 p5Var = s5Var.y;
        if (p5Var == null || s5Var.x == null || (b2Var = ((x2) p5Var).a.F3) == null) {
            return;
        }
        b2Var.f(i9, i10);
    }

    @Override // qh.c1
    public final void L0(d1 d1Var) {
        a aVar;
        s5 s5Var = this.a;
        p5 p5Var = s5Var.y;
        if (p5Var == null || (aVar = s5Var.x) == null) {
            return;
        }
        o3.P1(((x2) p5Var).a, aVar);
    }

    @Override // qh.c1
    public final /* synthetic */ boolean T1(boolean z10) {
        return false;
    }

    @Override // qh.c1
    public final /* synthetic */ boolean U1(d1 d1Var) {
        return false;
    }

    @Override // qh.c1
    public final void d(d1 d1Var) {
        p5 p5Var = this.a.y;
        if (p5Var != null) {
            o3 o3Var = ((x2) p5Var).a;
            o3.M1(o3Var, d1Var);
            o3Var.d3.f1(d1Var, true);
        }
    }

    @Override // qh.c1
    public final void h1(CharSequence charSequence) {
        p5 p5Var = this.a.y;
        if (p5Var != null) {
            x2 x2Var = (x2) p5Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            x2Var.a.t4(charSequence.toString());
        }
    }

    @Override // qh.c1
    public final void k1(d1 d1Var, int i9, int i10) {
        p5 p5Var;
        n9 textSelectionHelper;
        s5 s5Var = this.a;
        if (s5Var.n || i9 == i10 || (p5Var = s5Var.y) == null || (textSelectionHelper = ((x2) p5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        d1Var.post(new mh.l4(this, d1Var, i10, textSelectionHelper, i9, 8));
    }

    @Override // qh.c1
    public final boolean p() {
        s5 s5Var = this.a;
        p5 p5Var = s5Var.y;
        if (p5Var == null || s5Var.x == null) {
            return false;
        }
        return ((x2) p5Var).a.S4();
    }

    @Override // qh.c1
    public final void J0() {
    }
}
