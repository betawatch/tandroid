// default package

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class qy7 implements TextWatcher {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PasscodeActivity b;

    public /* synthetic */ qy7(PasscodeActivity passcodeActivity, byte b) {
        this.a = b;
        this.b = passcodeActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        byte b = this.a;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
        PasscodeActivity passcodeActivity = this.b;
        switch (b) {
            case 0:
                ly7 ly7Var = passcodeActivity.T;
                if (passcodeActivity.S) {
                    passcodeActivity.n.removeCallbacks(ly7Var);
                    ly7Var.run();
                    break;
                }
                break;
            default:
                ly7 ly7Var2 = passcodeActivity.T;
                if (passcodeActivity.S) {
                    passcodeActivity.n.removeCallbacks(ly7Var2);
                    ly7Var2.run();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }
}
