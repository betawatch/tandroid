package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yk0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasscodeActivity b;

    public /* synthetic */ yk0(PasscodeActivity passcodeActivity, int i9) {
        this.a = i9;
        this.b = passcodeActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i9 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        switch (this.a) {
            case 0:
                PasscodeActivity passcodeActivity = this.b;
                uk0 uk0Var = passcodeActivity.K;
                if (passcodeActivity.J) {
                    passcodeActivity.n.removeCallbacks(uk0Var);
                    uk0Var.run();
                    break;
                }
                break;
            default:
                PasscodeActivity passcodeActivity2 = this.b;
                uk0 uk0Var2 = passcodeActivity2.K;
                if (passcodeActivity2.J) {
                    passcodeActivity2.n.removeCallbacks(uk0Var2);
                    uk0Var2.run();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int i12 = this.a;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i9, int i10, int i11, CharSequence charSequence) {
    }
}
