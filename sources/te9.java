// default package

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class te9 implements TextWatcher {
    public final /* synthetic */ ue9 a;

    public te9(ue9 ue9Var) {
        this.a = ue9Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ue9 ue9Var = this.a;
        if (ue9Var.d2 != null) {
            ue9Var.d2 = null;
            ue9Var.a2.i(ob6.M0(2131754052, null), true, true);
            l9c l9cVar = ue9Var.U1;
            if (l9cVar != null) {
                l9cVar.O(true);
            }
        }
        ue9Var.Z0();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
