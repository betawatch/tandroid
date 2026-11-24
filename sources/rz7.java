// default package

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rz7 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ tz7 b;

    public rz7(tz7 tz7Var, int i) {
        this.b = tz7Var;
        this.a = i;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        tz7 tz7Var = this.b;
        if (tz7Var.I || (length = editable.length()) < 1) {
            return;
        }
        int i = this.a;
        if (length > 1) {
            String obj = editable.toString();
            tz7Var.I = true;
            for (int i2 = 0; i2 < Math.min(tz7Var.P - i, length); i2++) {
                if (i2 == 0) {
                    editable.replace(0, length, obj.substring(i2, i2 + 1));
                } else {
                    tz7Var.d[i + i2].setText(obj.substring(i2, i2 + 1));
                }
            }
            tz7Var.I = false;
        }
        if (i != tz7Var.P - 1) {
            int i3 = i + 1;
            EditTextBoldCursor editTextBoldCursor = tz7Var.d[i3];
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
            tz7Var.d[i3].requestFocus();
        }
        int i4 = tz7Var.P;
        if (i == i4 - 1 || (i == i4 - 2 && length >= 2)) {
            code = tz7Var.getCode();
            if (code.length() == tz7Var.P) {
                tz7Var.h(null);
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
