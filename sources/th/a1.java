package th;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class a1 implements TextWatcher {
    public final /* synthetic */ d1 a;

    public a1(d1 d1Var) {
        this.a = d1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Editable editable2;
        d1 d1Var = this.a;
        if (d1Var.h || d1Var.c == null) {
            return;
        }
        if (!d1Var.A || editable.length() <= 0) {
            editable2 = editable;
        } else {
            editable2 = editable;
            v5.o(editable2, 0, editable.length(), 1, true, d1Var.H);
        }
        if (d1Var.w || d1Var.n || d1Var.r) {
            d1Var.c.n1(editable2);
            return;
        }
        d1Var.h = true;
        boolean z10 = false;
        for (int length = editable2.length() - 1; length >= 0; length--) {
            if (editable2.charAt(length) == '\n') {
                editable2.delete(length, length + 1);
                z10 = true;
            }
        }
        d1Var.h = false;
        if (z10) {
            d1Var.c.S0(d1Var);
        } else {
            d1Var.c.n1(editable2);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        c1 c1Var;
        d1 d1Var = this.a;
        if (d1Var.h || (c1Var = d1Var.c) == null) {
            return;
        }
        c1Var.z(i11, i12);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        d1 d1Var = this.a;
        d1Var.F = true;
        d1Var.q();
        d1Var.setLongClickable(d1Var.length() == 0);
    }
}
