package vh;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        if (!d1Var.B || editable.length() <= 0) {
            editable2 = editable;
        } else {
            editable2 = editable;
            x5.o(editable2, 0, editable.length(), 1, true, d1Var.I);
        }
        if (d1Var.w || d1Var.n || d1Var.r) {
            d1Var.c.N(editable2);
            return;
        }
        d1Var.h = true;
        boolean z4 = false;
        for (int length = editable2.length() - 1; length >= 0; length--) {
            if (editable2.charAt(length) == '\n') {
                editable2.delete(length, length + 1);
                z4 = true;
            }
        }
        d1Var.h = false;
        if (z4) {
            d1Var.c.G(d1Var);
        } else {
            d1Var.c.N(editable2);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        c1 c1Var;
        d1 d1Var = this.a;
        if (d1Var.h || (c1Var = d1Var.c) == null) {
            return;
        }
        c1Var.i(i11, i12);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        d1 d1Var = this.a;
        d1Var.G = true;
        d1Var.q();
        d1Var.setLongClickable(d1Var.length() == 0);
    }
}
