package qh;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
            u5.o(editable2, 0, editable.length(), 1, true, d1Var.H);
        }
        if (d1Var.w || d1Var.n || d1Var.r) {
            d1Var.c.B1(editable2);
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
            d1Var.c.L0(d1Var);
        } else {
            d1Var.c.B1(editable2);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        c1 c1Var;
        d1 d1Var = this.a;
        if (d1Var.h || (c1Var = d1Var.c) == null) {
            return;
        }
        c1Var.E(i10, i11);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        d1 d1Var = this.a;
        d1Var.F = true;
        d1Var.q();
        d1Var.setLongClickable(d1Var.length() == 0);
    }
}
