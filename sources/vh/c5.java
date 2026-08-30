package vh;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.m9;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class c5 implements c1 {
    public final /* synthetic */ l5 a;
    public final /* synthetic */ i5 b;

    public c5(i5 i5Var, l5 l5Var) {
        this.b = i5Var;
        this.a = l5Var;
    }

    @Override // vh.c1
    public final void D(CharSequence charSequence) {
        y2 y2Var = this.b.B;
        if (y2Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        y2Var.a.t4(charSequence.toString());
    }

    @Override // vh.c1
    public final /* synthetic */ boolean F(d1 d1Var) {
        return false;
    }

    @Override // vh.c1
    public final void N(Editable editable) {
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

    @Override // vh.c1
    public final void O(final d1 d1Var, final int i10, final int i11) {
        y2 y2Var;
        final m9 textSelectionHelper;
        final int k10;
        i5 i5Var = this.b;
        if (i5Var.D || i10 == i11 || (y2Var = i5Var.B) == null || (textSelectionHelper = y2Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (!(textSelectionHelper.y() && textSelectionHelper.W == i5Var) && (k10 = i5Var.k(this.a.b)) >= 0) {
            i5Var.post(new Runnable() { // from class: vh.b5
                @Override // java.lang.Runnable
                public final void run() {
                    i5 i5Var2 = c5.this.b;
                    d1 d1Var2 = d1Var;
                    int length = d1Var2.length();
                    int i12 = i11;
                    if (length < i12 || d1Var2.getSelectionStart() == d1Var2.getSelectionEnd() || !textSelectionHelper.k0(i5Var2, k10, i10, i12)) {
                        return;
                    }
                    i5Var2.D = true;
                    d1Var2.setSelection(i12);
                    i5Var2.D = false;
                }
            });
        }
    }

    @Override // vh.c1
    public final boolean R(boolean z4) {
        return this.b.s(this.a, z4);
    }

    @Override // vh.c1
    public final void c(d1 d1Var) {
        y2 y2Var = this.b.B;
        if (y2Var != null) {
            r3 r3Var = y2Var.a;
            r3.M1(r3Var, d1Var);
            r3Var.e3.e(d1Var, true);
        }
    }

    @Override // vh.c1
    public final boolean d() {
        i5 i5Var = this.b;
        y2 y2Var = i5Var.B;
        if (y2Var == null || i5Var.a == null) {
            return false;
        }
        return y2Var.a.S4();
    }

    @Override // vh.c1
    public final void i(int i10, int i11) {
        c2 c2Var;
        i5 i5Var = this.b;
        y2 y2Var = i5Var.B;
        if (y2Var == null || i5Var.a == null || (c2Var = y2Var.a.G3) == null) {
            return;
        }
        c2Var.f(i10, i11);
    }

    @Override // vh.c1
    public final /* synthetic */ boolean o(d1 d1Var) {
        return false;
    }

    @Override // vh.c1
    public final /* synthetic */ void r() {
    }

    @Override // vh.c1
    public final /* synthetic */ void G(d1 d1Var) {
    }
}
