package th;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.k9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class a5 implements c1 {
    public final /* synthetic */ j5 a;
    public final /* synthetic */ g5 b;

    public a5(g5 g5Var, j5 j5Var) {
        this.b = g5Var;
        this.a = j5Var;
    }

    @Override // th.c1
    public final void T0(final d1 d1Var, final int i10, final int i11) {
        w2 w2Var;
        final k9 textSelectionHelper;
        final int k9;
        g5 g5Var = this.b;
        if (g5Var.C || i10 == i11 || (w2Var = g5Var.A) == null || (textSelectionHelper = w2Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (!(textSelectionHelper.y() && textSelectionHelper.W == g5Var) && (k9 = g5Var.k(this.a.b)) >= 0) {
            g5Var.post(new Runnable() { // from class: th.z4
                @Override // java.lang.Runnable
                public final void run() {
                    g5 g5Var2 = a5.this.b;
                    d1 d1Var2 = d1Var;
                    int length = d1Var2.length();
                    int i12 = i11;
                    if (length < i12 || d1Var2.getSelectionStart() == d1Var2.getSelectionEnd() || !textSelectionHelper.k0(g5Var2, k9, i10, i12)) {
                        return;
                    }
                    g5Var2.C = true;
                    d1Var2.setSelection(i12);
                    g5Var2.C = false;
                }
            });
        }
    }

    @Override // th.c1
    public final void Z0(CharSequence charSequence) {
        w2 w2Var = this.b.A;
        if (w2Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        w2Var.a.t4(charSequence.toString());
    }

    @Override // th.c1
    public final void e(d1 d1Var) {
        w2 w2Var = this.b.A;
        if (w2Var != null) {
            p3 p3Var = w2Var.a;
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
        g5 g5Var = this.b;
        w2 w2Var = g5Var.A;
        if (w2Var == null || g5Var.a == null) {
            return false;
        }
        return w2Var.a.S4();
    }

    @Override // th.c1
    public final void n1(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.a.b;
        if (pagetablecell != null) {
            x5.d(pagetablecell, editable);
        }
        g5 g5Var = this.b;
        g5Var.v.requestLayout();
        w2 w2Var = g5Var.A;
        if (w2Var == null || g5Var.a == null) {
            return;
        }
        w2Var.a();
    }

    @Override // th.c1
    public final /* synthetic */ boolean r0(d1 d1Var) {
        return false;
    }

    @Override // th.c1
    public final boolean t1(boolean z10) {
        return this.b.s(this.a, z10);
    }

    @Override // th.c1
    public final void z(int i10, int i11) {
        b2 b2Var;
        g5 g5Var = this.b;
        w2 w2Var = g5Var.A;
        if (w2Var == null || g5Var.a == null || (b2Var = w2Var.a.F3) == null) {
            return;
        }
        b2Var.f(i10, i11);
    }

    @Override // th.c1
    public final /* synthetic */ void u0() {
    }

    @Override // th.c1
    public final /* synthetic */ void S0(d1 d1Var) {
    }
}
