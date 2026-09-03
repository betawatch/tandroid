package vh;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class b1 implements TextWatcher {
    public final /* synthetic */ e1 a;

    public b1(e1 e1Var) {
        this.a = e1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Editable editable2;
        e1 e1Var = this.a;
        if (e1Var.h || e1Var.c == null) {
            return;
        }
        if (!e1Var.B || editable.length() <= 0) {
            editable2 = editable;
        } else {
            editable2 = editable;
            y5.o(editable2, 0, editable.length(), 1, true, e1Var.I);
        }
        if (e1Var.w || e1Var.n || e1Var.r) {
            e1Var.c.l1(editable2);
            return;
        }
        e1Var.h = true;
        boolean z4 = false;
        for (int length = editable2.length() - 1; length >= 0; length--) {
            if (editable2.charAt(length) == '\n') {
                editable2.delete(length, length + 1);
                z4 = true;
            }
        }
        e1Var.h = false;
        if (z4) {
            e1Var.c.g1(e1Var);
        } else {
            e1Var.c.l1(editable2);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        d1 d1Var;
        e1 e1Var = this.a;
        if (e1Var.h || (d1Var = e1Var.c) == null) {
            return;
        }
        d1Var.r(i11, i12);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        e1 e1Var = this.a;
        e1Var.G = true;
        e1Var.q();
        e1Var.setLongClickable(e1Var.length() == 0);
    }
}
