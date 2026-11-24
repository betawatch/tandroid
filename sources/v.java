// default package

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class v implements TextWatcher {
    public final /* synthetic */ a1 a;

    public v(a1 a1Var) {
        this.a = a1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        z0 z0Var;
        a1 a1Var = this.a;
        z0 z0Var2 = a1Var.t2;
        if ((z0Var2 != null ? z0Var2.getSelectedTab() : 0) == 1 && (z0Var = a1Var.u2) != null && (z0Var.getSelectedTone() instanceof t0)) {
            a1Var.a1();
            a1Var.t1();
            a1Var.s1(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
