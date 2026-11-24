// default package

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wj1 implements TextWatcher {
    public final /* synthetic */ ik1 a;

    public wj1(ik1 ik1Var) {
        this.a = ik1Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ik1 ik1Var = this.a;
        nj1 nj1Var = ik1Var.f1;
        vc vcVar = ik1Var.O0;
        if (ik1Var.L0) {
            return;
        }
        long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
        ik1Var.N0 = parseLong;
        long j = ik1Var.D0.amount;
        if (parseLong > j) {
            ik1Var.N0 = j;
            ik1Var.L0 = true;
            vcVar.setText(Long.toString(j));
            vcVar.setSelection(vcVar.getText().length());
            ik1Var.L0 = false;
        }
        ik1Var.M0 = ik1Var.N0 == ik1Var.D0.amount;
        gm.r(nj1Var);
        nj1Var.run();
        ik1Var.M0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
