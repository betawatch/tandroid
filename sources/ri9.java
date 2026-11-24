// default package

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class ri9 implements lc9 {
    public final /* synthetic */ wi9 a;

    public ri9(wi9 wi9Var) {
        this.a = wi9Var;
    }

    @Override // lc9
    public final boolean A(mc9 mc9Var) {
        return false;
    }

    @Override // lc9
    public final boolean H(mc9 mc9Var) {
        mc9 mc9Var2 = this.a.f;
        mc9Var2.O();
        mc9Var2.setSelection(mc9Var2.length());
        return true;
    }

    @Override // lc9
    public final void O(CharSequence charSequence) {
        ti9 ti9Var = this.a.E;
        if (ti9Var != null) {
            ie9 ie9Var = (ie9) ti9Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            ie9Var.a.u4(charSequence.toString());
        }
    }

    @Override // lc9
    public final void U(Editable editable) {
        wi9 wi9Var = this.a;
        if (wi9Var.y != null) {
            wi9Var.v();
            ti9 ti9Var = wi9Var.E;
            if (ti9Var != null) {
                ye9 ye9Var = ((ie9) ti9Var).a;
                ld9 ld9Var = ye9Var.R3;
                if (ld9Var != null) {
                    ld9Var.g();
                }
                ye9Var.p3.onContentChanged();
            }
            TL_iv.PageBlock pageBlock = wi9Var.y.b;
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                wi9Var.invalidate();
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                wi9Var.invalidate();
                int measuredWidth = wi9Var.getMeasuredWidth();
                if (measuredWidth > 0) {
                    if (wi9Var.e(measuredWidth, wi9Var.getPaddingBottom() + wi9Var.h.getMeasuredHeight() + wi9Var.b.getMeasuredHeight() + wi9Var.getPaddingTop()) == wi9Var.P) {
                        return;
                    }
                }
                wi9Var.requestLayout();
            }
        }
    }

    @Override // lc9
    public final void Y(mc9 mc9Var) {
        lk0 lk0Var;
        wi9 wi9Var = this.a;
        ti9 ti9Var = wi9Var.E;
        if (ti9Var == null || (lk0Var = wi9Var.y) == null) {
            return;
        }
        ((ie9) ti9Var).a.T3(lk0Var);
    }

    @Override // lc9
    public final boolean c0(boolean z) {
        return false;
    }

    @Override // lc9
    public final void d(mc9 mc9Var) {
        ti9 ti9Var = this.a.E;
        if (ti9Var != null) {
            ye9 ye9Var = ((ie9) ti9Var).a;
            ye9Var.i4(mc9Var);
            ye9Var.p3.g(mc9Var, true);
        }
    }

    @Override // lc9
    public final boolean i() {
        wi9 wi9Var = this.a;
        ti9 ti9Var = wi9Var.E;
        if (ti9Var == null || wi9Var.y == null) {
            return false;
        }
        return ((ie9) ti9Var).a.V4();
    }

    @Override // lc9
    public final void l(int i, int i2) {
        ld9 ld9Var;
        wi9 wi9Var = this.a;
        ti9 ti9Var = wi9Var.E;
        if (ti9Var == null || wi9Var.y == null || (ld9Var = ((ie9) ti9Var).a.R3) == null) {
            return;
        }
        ld9Var.f(i, i2);
    }

    @Override // lc9
    public final void t(mc9 mc9Var, int i, int i2) {
        ti9 ti9Var;
        fib textSelectionHelper;
        wi9 wi9Var = this.a;
        if (wi9Var.n || i == i2 || (ti9Var = wi9Var.E) == null || (textSelectionHelper = ((ie9) ti9Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        mc9Var.post(new zy0(this, mc9Var, i2, textSelectionHelper, i, (byte) 7));
    }

    @Override // lc9
    public final void I() {
    }
}
