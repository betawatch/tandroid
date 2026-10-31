package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class qj0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasscodeActivity b;

    public /* synthetic */ qj0(PasscodeActivity passcodeActivity, int i10) {
        this.a = i10;
        this.b = passcodeActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                PasscodeActivity passcodeActivity = this.b;
                lj0 lj0Var = passcodeActivity.S;
                if (passcodeActivity.R) {
                    passcodeActivity.n.removeCallbacks(lj0Var);
                    lj0Var.run();
                    break;
                }
                break;
            default:
                PasscodeActivity passcodeActivity2 = this.b;
                lj0 lj0Var2 = passcodeActivity2.S;
                if (passcodeActivity2.R) {
                    passcodeActivity2.n.removeCallbacks(lj0Var2);
                    lj0Var2.run();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
