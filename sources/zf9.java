// default package

import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class zf9 implements TextWatcher {
    public final /* synthetic */ dg9 a;

    public zf9(dg9 dg9Var) {
        this.a = dg9Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Editable editable2;
        dg9 dg9Var = this.a;
        if (dg9Var.j2 || dg9Var.f2 == null) {
            return;
        }
        if (!dg9Var.r2 || editable.length() <= 0) {
            editable2 = editable;
        } else {
            editable2 = editable;
            mm9.o(editable2, 0, editable.length(), 1, true, dg9Var.y2);
        }
        if (dg9Var.o2 || dg9Var.k2 || dg9Var.l2) {
            dg9Var.f2.Q(editable2);
            return;
        }
        dg9Var.j2 = true;
        boolean z = false;
        for (int length = editable2.length() - 1; length >= 0; length--) {
            if (editable2.charAt(length) == '\n') {
                editable2.delete(length, length + 1);
                z = true;
            }
        }
        dg9Var.j2 = false;
        cg9 cg9Var = dg9Var.f2;
        if (z) {
            cg9Var.U(dg9Var);
        } else {
            cg9Var.Q(editable2);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        cg9 cg9Var;
        dg9 dg9Var = this.a;
        if (dg9Var.j2 || (cg9Var = dg9Var.f2) == null) {
            return;
        }
        cg9Var.l(i2, i3);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        dg9 dg9Var = this.a;
        if (i2 > 0 && i3 == 0) {
            dg9Var.z2 = SystemClock.uptimeMillis();
        }
        dg9Var.w2 = true;
        dg9Var.N();
        dg9Var.setLongClickable(dg9Var.length() == 0);
    }
}
