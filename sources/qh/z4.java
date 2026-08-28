package qh;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.n9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class z4 implements c1 {
    public final /* synthetic */ i5 a;
    public final /* synthetic */ f5 b;

    public z4(f5 f5Var, i5 i5Var) {
        this.b = f5Var;
        this.a = i5Var;
    }

    @Override // qh.c1
    public final /* synthetic */ boolean A(d1 d1Var) {
        return false;
    }

    @Override // qh.c1
    public final void B1(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.a.b;
        if (pagetablecell != null) {
            w5.d(pagetablecell, editable);
        }
        f5 f5Var = this.b;
        f5Var.v.requestLayout();
        v2 v2Var = f5Var.A;
        if (v2Var == null || f5Var.a == null) {
            return;
        }
        v2Var.a();
    }

    @Override // qh.c1
    public final void E(int i9, int i10) {
        b2 b2Var;
        f5 f5Var = this.b;
        v2 v2Var = f5Var.A;
        if (v2Var == null || f5Var.a == null || (b2Var = v2Var.a.F3) == null) {
            return;
        }
        b2Var.f(i9, i10);
    }

    @Override // qh.c1
    public final boolean T1(boolean z10) {
        return this.b.s(this.a, z10);
    }

    @Override // qh.c1
    public final /* synthetic */ boolean U1(d1 d1Var) {
        return false;
    }

    @Override // qh.c1
    public final void d(d1 d1Var) {
        v2 v2Var = this.b.A;
        if (v2Var != null) {
            o3 o3Var = v2Var.a;
            o3.M1(o3Var, d1Var);
            o3Var.d3.f1(d1Var, true);
        }
    }

    @Override // qh.c1
    public final void h1(CharSequence charSequence) {
        v2 v2Var = this.b.A;
        if (v2Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        v2Var.a.t4(charSequence.toString());
    }

    @Override // qh.c1
    public final void k1(final d1 d1Var, final int i9, final int i10) {
        v2 v2Var;
        final n9 textSelectionHelper;
        final int k10;
        f5 f5Var = this.b;
        if (f5Var.C || i9 == i10 || (v2Var = f5Var.A) == null || (textSelectionHelper = v2Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (!(textSelectionHelper.y() && textSelectionHelper.W == f5Var) && (k10 = f5Var.k(this.a.b)) >= 0) {
            f5Var.post(new Runnable() { // from class: qh.y4
                @Override // java.lang.Runnable
                public final void run() {
                    f5 f5Var2 = z4.this.b;
                    d1 d1Var2 = d1Var;
                    int length = d1Var2.length();
                    int i11 = i10;
                    if (length < i11 || d1Var2.getSelectionStart() == d1Var2.getSelectionEnd() || !textSelectionHelper.k0(f5Var2, k10, i9, i11)) {
                        return;
                    }
                    f5Var2.C = true;
                    d1Var2.setSelection(i11);
                    f5Var2.C = false;
                }
            });
        }
    }

    @Override // qh.c1
    public final boolean p() {
        f5 f5Var = this.b;
        v2 v2Var = f5Var.A;
        if (v2Var == null || f5Var.a == null) {
            return false;
        }
        return v2Var.a.S4();
    }

    @Override // qh.c1
    public final /* synthetic */ void J0() {
    }

    @Override // qh.c1
    public final /* synthetic */ void L0(d1 d1Var) {
    }
}
