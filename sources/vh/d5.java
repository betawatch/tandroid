package vh;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.l9;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class d5 implements d1 {
    public final /* synthetic */ m5 a;
    public final /* synthetic */ j5 b;

    public d5(j5 j5Var, m5 m5Var) {
        this.b = j5Var;
        this.a = m5Var;
    }

    @Override // vh.d1
    public final void Q0(CharSequence charSequence) {
        z2 z2Var = this.b.B;
        if (z2Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        z2Var.a.s4(charSequence.toString());
    }

    @Override // vh.d1
    public final /* synthetic */ boolean V0(e1 e1Var) {
        return false;
    }

    @Override // vh.d1
    public final void c(e1 e1Var) {
        z2 z2Var = this.b.B;
        if (z2Var != null) {
            s3 s3Var = z2Var.a;
            s3.L1(s3Var, e1Var);
            s3Var.e3.d(e1Var, true);
        }
    }

    @Override // vh.d1
    public final boolean h() {
        j5 j5Var = this.b;
        z2 z2Var = j5Var.B;
        if (z2Var == null || j5Var.a == null) {
            return false;
        }
        return z2Var.a.R4();
    }

    @Override // vh.d1
    public final /* synthetic */ boolean h0(e1 e1Var) {
        return false;
    }

    @Override // vh.d1
    public final void l1(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.a.b;
        if (pagetablecell != null) {
            a6.d(pagetablecell, editable);
        }
        j5 j5Var = this.b;
        j5Var.v.requestLayout();
        z2 z2Var = j5Var.B;
        if (z2Var == null || j5Var.a == null) {
            return;
        }
        z2Var.a();
    }

    @Override // vh.d1
    public final void n1(final e1 e1Var, final int i10, final int i11) {
        z2 z2Var;
        final l9 textSelectionHelper;
        final int k10;
        j5 j5Var = this.b;
        if (j5Var.D || i10 == i11 || (z2Var = j5Var.B) == null || (textSelectionHelper = z2Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (!(textSelectionHelper.y() && textSelectionHelper.W == j5Var) && (k10 = j5Var.k(this.a.b)) >= 0) {
            j5Var.post(new Runnable() { // from class: vh.c5
                @Override // java.lang.Runnable
                public final void run() {
                    j5 j5Var2 = d5.this.b;
                    e1 e1Var2 = e1Var;
                    int length = e1Var2.length();
                    int i12 = i11;
                    if (length < i12 || e1Var2.getSelectionStart() == e1Var2.getSelectionEnd() || !textSelectionHelper.k0(j5Var2, k10, i10, i12)) {
                        return;
                    }
                    j5Var2.D = true;
                    e1Var2.setSelection(i12);
                    j5Var2.D = false;
                }
            });
        }
    }

    @Override // vh.d1
    public final void r(int i10, int i11) {
        d2 d2Var;
        j5 j5Var = this.b;
        z2 z2Var = j5Var.B;
        if (z2Var == null || j5Var.a == null || (d2Var = z2Var.a.G3) == null) {
            return;
        }
        d2Var.f(i10, i11);
    }

    @Override // vh.d1
    public final boolean w1(boolean z4) {
        return this.b.s(this.a, z4);
    }

    @Override // vh.d1
    public final /* synthetic */ void q0() {
    }

    @Override // vh.d1
    public final /* synthetic */ void g1(e1 e1Var) {
    }
}
