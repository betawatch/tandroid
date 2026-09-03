package vh;

import android.text.Editable;
import org.telegram.messenger.p6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.l9;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class s5 implements d1 {
    public final /* synthetic */ w5 a;

    public s5(w5 w5Var) {
        this.a = w5Var;
    }

    @Override // vh.d1
    public final void Q0(CharSequence charSequence) {
        t5 t5Var = this.a.y;
        if (t5Var != null) {
            b3 b3Var = (b3) t5Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            b3Var.a.s4(charSequence.toString());
        }
    }

    @Override // vh.d1
    public final /* synthetic */ boolean V0(e1 e1Var) {
        return false;
    }

    @Override // vh.d1
    public final void c(e1 e1Var) {
        t5 t5Var = this.a.y;
        if (t5Var != null) {
            s3 s3Var = ((b3) t5Var).a;
            s3.L1(s3Var, e1Var);
            s3Var.e3.d(e1Var, true);
        }
    }

    @Override // vh.d1
    public final void g1(e1 e1Var) {
        a aVar;
        w5 w5Var = this.a;
        t5 t5Var = w5Var.y;
        if (t5Var == null || (aVar = w5Var.x) == null) {
            return;
        }
        s3.O1(((b3) t5Var).a, aVar);
    }

    @Override // vh.d1
    public final boolean h() {
        w5 w5Var = this.a;
        t5 t5Var = w5Var.y;
        if (t5Var == null || w5Var.x == null) {
            return false;
        }
        return ((b3) t5Var).a.R4();
    }

    @Override // vh.d1
    public final boolean h0(e1 e1Var) {
        w5 w5Var = this.a;
        w5Var.f.r();
        e1 e1Var2 = w5Var.f;
        e1Var2.setSelection(e1Var2.length());
        return true;
    }

    @Override // vh.d1
    public final void l1(Editable editable) {
        w5 w5Var = this.a;
        if (w5Var.x == null) {
            return;
        }
        w5Var.w();
        t5 t5Var = w5Var.y;
        if (t5Var != null) {
            s3 s3Var = ((b3) t5Var).a;
            d2 d2Var = s3Var.G3;
            if (d2Var != null) {
                d2Var.g();
            }
            s3Var.e3.onContentChanged();
        }
        TL_iv.PageBlock pageBlock = w5Var.x.b;
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            w5Var.invalidate();
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            w5Var.invalidate();
            int measuredWidth = w5Var.getMeasuredWidth();
            if (measuredWidth > 0) {
                if (w5Var.h(measuredWidth, w5Var.getPaddingBottom() + w5Var.h.getMeasuredHeight() + w5Var.b.getMeasuredHeight() + w5Var.getPaddingTop()) == w5Var.L) {
                    return;
                }
            }
            w5Var.requestLayout();
        }
    }

    @Override // vh.d1
    public final void n1(e1 e1Var, int i10, int i11) {
        t5 t5Var;
        l9 textSelectionHelper;
        w5 w5Var = this.a;
        if (w5Var.n || i10 == i11 || (t5Var = w5Var.y) == null || (textSelectionHelper = ((b3) t5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        e1Var.post(new p6(this, e1Var, i11, textSelectionHelper, i10, 8));
    }

    @Override // vh.d1
    public final void r(int i10, int i11) {
        d2 d2Var;
        w5 w5Var = this.a;
        t5 t5Var = w5Var.y;
        if (t5Var == null || w5Var.x == null || (d2Var = ((b3) t5Var).a.G3) == null) {
            return;
        }
        d2Var.f(i10, i11);
    }

    @Override // vh.d1
    public final /* synthetic */ boolean w1(boolean z4) {
        return false;
    }

    @Override // vh.d1
    public final void q0() {
    }
}
