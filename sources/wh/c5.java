package wh;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.m9;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class c5 implements d1 {
    public final /* synthetic */ l5 a;
    public final /* synthetic */ i5 b;

    public c5(i5 i5Var, l5 l5Var) {
        this.b = i5Var;
        this.a = l5Var;
    }

    @Override // wh.d1
    public final /* synthetic */ boolean D(e1 e1Var) {
        return false;
    }

    @Override // wh.d1
    public final void H(CharSequence charSequence) {
        y2 y2Var = this.b.B;
        if (y2Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        y2Var.a.t4(charSequence.toString());
    }

    @Override // wh.d1
    public final void O(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.a.b;
        if (pagetablecell != null) {
            z5.d(pagetablecell, editable);
        }
        i5 i5Var = this.b;
        i5Var.v.requestLayout();
        y2 y2Var = i5Var.B;
        if (y2Var == null || i5Var.a == null) {
            return;
        }
        y2Var.a();
    }

    @Override // wh.d1
    public final boolean T(boolean z4) {
        return this.b.s(this.a, z4);
    }

    @Override // wh.d1
    public final void c(e1 e1Var) {
        y2 y2Var = this.b.B;
        if (y2Var != null) {
            r3 r3Var = y2Var.a;
            r3.M1(r3Var, e1Var);
            r3Var.e3.h(e1Var, true);
        }
    }

    @Override // wh.d1
    public final boolean e() {
        i5 i5Var = this.b;
        y2 y2Var = i5Var.B;
        if (y2Var == null || i5Var.a == null) {
            return false;
        }
        return y2Var.a.S4();
    }

    @Override // wh.d1
    public final void j(int i10, int i11) {
        d2 d2Var;
        i5 i5Var = this.b;
        y2 y2Var = i5Var.B;
        if (y2Var == null || i5Var.a == null || (d2Var = y2Var.a.G3) == null) {
            return;
        }
        d2Var.f(i10, i11);
    }

    @Override // wh.d1
    public final /* synthetic */ boolean r(e1 e1Var) {
        return false;
    }

    @Override // wh.d1
    public final void s(final e1 e1Var, final int i10, final int i11) {
        y2 y2Var;
        final m9 textSelectionHelper;
        final int k10;
        i5 i5Var = this.b;
        if (i5Var.D || i10 == i11 || (y2Var = i5Var.B) == null || (textSelectionHelper = y2Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (!(textSelectionHelper.y() && textSelectionHelper.W == i5Var) && (k10 = i5Var.k(this.a.b)) >= 0) {
            i5Var.post(new Runnable() { // from class: wh.b5
                @Override // java.lang.Runnable
                public final void run() {
                    i5 i5Var2 = c5.this.b;
                    e1 e1Var2 = e1Var;
                    int length = e1Var2.length();
                    int i12 = i11;
                    if (length < i12 || e1Var2.getSelectionStart() == e1Var2.getSelectionEnd() || !textSelectionHelper.k0(i5Var2, k10, i10, i12)) {
                        return;
                    }
                    i5Var2.D = true;
                    e1Var2.setSelection(i12);
                    i5Var2.D = false;
                }
            });
        }
    }

    @Override // wh.d1
    public final /* synthetic */ void v() {
    }

    @Override // wh.d1
    public final /* synthetic */ void o(e1 e1Var) {
    }
}
