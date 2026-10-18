package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class rm0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ tm0 b;

    public rm0(tm0 tm0Var, int i10) {
        this.b = tm0Var;
        this.a = i10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        tm0 tm0Var = this.b;
        if (!tm0Var.H && (length = editable.length()) >= 1) {
            int i10 = this.a;
            if (length > 1) {
                String obj = editable.toString();
                tm0Var.H = true;
                for (int i11 = 0; i11 < Math.min(tm0Var.O - i10, length); i11++) {
                    if (i11 == 0) {
                        editable.replace(0, length, obj.substring(i11, i11 + 1));
                    } else {
                        tm0Var.d[i10 + i11].setText(obj.substring(i11, i11 + 1));
                    }
                }
                tm0Var.H = false;
            }
            if (i10 != tm0Var.O - 1) {
                int i12 = i10 + 1;
                EditTextBoldCursor editTextBoldCursor = tm0Var.d[i12];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                tm0Var.d[i12].requestFocus();
            }
            int i13 = tm0Var.O;
            if (i10 == i13 - 1 || (i10 == i13 - 2 && length >= 2)) {
                code = tm0Var.getCode();
                if (code.length() == tm0Var.O) {
                    tm0Var.h(null);
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
