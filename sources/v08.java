// default package

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class v08 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ x08 b;

    public v08(x08 x08Var, int i) {
        this.b = x08Var;
        this.a = i;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        x08 x08Var = this.b;
        if (x08Var.I || (length = editable.length()) < 1) {
            return;
        }
        int i = this.a;
        if (length > 1) {
            String obj = editable.toString();
            x08Var.I = true;
            for (int i2 = 0; i2 < Math.min(x08Var.P - i, length); i2++) {
                if (i2 == 0) {
                    editable.replace(0, length, obj.substring(i2, i2 + 1));
                } else {
                    x08Var.d[i + i2].setText(obj.substring(i2, i2 + 1));
                }
            }
            x08Var.I = false;
        }
        if (i != x08Var.P - 1) {
            int i3 = i + 1;
            EditTextBoldCursor editTextBoldCursor = x08Var.d[i3];
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
            x08Var.d[i3].requestFocus();
        }
        int i4 = x08Var.P;
        if (i == i4 - 1 || (i == i4 - 2 && length >= 2)) {
            code = x08Var.getCode();
            if (code.length() == x08Var.P) {
                x08Var.h(null);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
