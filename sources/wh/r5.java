package wh;

import android.text.Editable;
import org.telegram.messenger.p6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.m9;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class r5 implements d1 {
    public final /* synthetic */ v5 a;

    public r5(v5 v5Var) {
        this.a = v5Var;
    }

    @Override // wh.d1
    public final boolean D(e1 e1Var) {
        v5 v5Var = this.a;
        v5Var.f.r();
        e1 e1Var2 = v5Var.f;
        e1Var2.setSelection(e1Var2.length());
        return true;
    }

    @Override // wh.d1
    public final void H(CharSequence charSequence) {
        s5 s5Var = this.a.y;
        if (s5Var != null) {
            a3 a3Var = (a3) s5Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            a3Var.a.s4(charSequence.toString());
        }
    }

    @Override // wh.d1
    public final void O(Editable editable) {
        v5 v5Var = this.a;
        if (v5Var.x == null) {
            return;
        }
        v5Var.w();
        s5 s5Var = v5Var.y;
        if (s5Var != null) {
            r3 r3Var = ((a3) s5Var).a;
            d2 d2Var = r3Var.G3;
            if (d2Var != null) {
                d2Var.g();
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

    @Override // wh.d1
    public final /* synthetic */ boolean T(boolean z4) {
        return false;
    }

    @Override // wh.d1
    public final void c(e1 e1Var) {
        s5 s5Var = this.a.y;
        if (s5Var != null) {
            r3 r3Var = ((a3) s5Var).a;
            r3.L1(r3Var, e1Var);
            r3Var.e3.h(e1Var, true);
        }
    }

    @Override // wh.d1
    public final boolean e() {
        v5 v5Var = this.a;
        s5 s5Var = v5Var.y;
        if (s5Var == null || v5Var.x == null) {
            return false;
        }
        return ((a3) s5Var).a.R4();
    }

    @Override // wh.d1
    public final void j(int i10, int i11) {
        d2 d2Var;
        v5 v5Var = this.a;
        s5 s5Var = v5Var.y;
        if (s5Var == null || v5Var.x == null || (d2Var = ((a3) s5Var).a.G3) == null) {
            return;
        }
        d2Var.f(i10, i11);
    }

    @Override // wh.d1
    public final void o(e1 e1Var) {
        a aVar;
        v5 v5Var = this.a;
        s5 s5Var = v5Var.y;
        if (s5Var == null || (aVar = v5Var.x) == null) {
            return;
        }
        r3.O1(((a3) s5Var).a, aVar);
    }

    @Override // wh.d1
    public final /* synthetic */ boolean r(e1 e1Var) {
        return false;
    }

    @Override // wh.d1
    public final void s(e1 e1Var, int i10, int i11) {
        s5 s5Var;
        m9 textSelectionHelper;
        v5 v5Var = this.a;
        if (v5Var.n || i10 == i11 || (s5Var = v5Var.y) == null || (textSelectionHelper = ((a3) s5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        e1Var.post(new p6(this, e1Var, i11, textSelectionHelper, i10, 8));
    }

    @Override // wh.d1
    public final void v() {
    }
}
