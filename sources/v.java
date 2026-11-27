// default package

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class v implements TextWatcher {
    public final /* synthetic */ b1 a;

    public v(b1 b1Var) {
        this.a = b1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        a1 a1Var;
        b1 b1Var = this.a;
        a1 a1Var2 = b1Var.t2;
        if ((a1Var2 != null ? a1Var2.getSelectedTab() : 0) == 1 && (a1Var = b1Var.u2) != null && (a1Var.getSelectedTone() instanceof u0)) {
            b1Var.b1();
            b1Var.v1();
            b1Var.u1(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
