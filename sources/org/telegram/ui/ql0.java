package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class ql0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasscodeActivity b;

    public /* synthetic */ ql0(PasscodeActivity passcodeActivity, int i10) {
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
                ml0 ml0Var = passcodeActivity.O;
                if (passcodeActivity.N) {
                    passcodeActivity.n.removeCallbacks(ml0Var);
                    ml0Var.run();
                    break;
                }
                break;
            default:
                PasscodeActivity passcodeActivity2 = this.b;
                ml0 ml0Var2 = passcodeActivity2.O;
                if (passcodeActivity2.N) {
                    passcodeActivity2.n.removeCallbacks(ml0Var2);
                    ml0Var2.run();
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
