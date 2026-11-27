// default package

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class wi1 implements TextWatcher {
    public final /* synthetic */ ij1 a;

    public wi1(ij1 ij1Var) {
        this.a = ij1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ij1 ij1Var = this.a;
        oi1 oi1Var = ij1Var.f1;
        xs0 xs0Var = ij1Var.O0;
        if (ij1Var.L0) {
            return;
        }
        long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
        ij1Var.N0 = parseLong;
        long j = ij1Var.D0.amount;
        if (parseLong > j) {
            ij1Var.N0 = j;
            ij1Var.L0 = true;
            xs0Var.setText(Long.toString(j));
            xs0Var.setSelection(xs0Var.getText().length());
            ij1Var.L0 = false;
        }
        ij1Var.M0 = ij1Var.N0 == ij1Var.D0.amount;
        hl.r(oi1Var);
        oi1Var.run();
        ij1Var.M0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
