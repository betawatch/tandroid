package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class xj0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ zj0 b;

    public xj0(zj0 zj0Var, int i7) {
        this.b = zj0Var;
        this.a = i7;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        zj0 zj0Var = this.b;
        if (!zj0Var.H && (length = editable.length()) >= 1) {
            int i7 = this.a;
            if (length > 1) {
                String obj = editable.toString();
                zj0Var.H = true;
                for (int i10 = 0; i10 < Math.min(zj0Var.O - i7, length); i10++) {
                    if (i10 == 0) {
                        editable.replace(0, length, obj.substring(i10, i10 + 1));
                    } else {
                        zj0Var.d[i7 + i10].setText(obj.substring(i10, i10 + 1));
                    }
                }
                zj0Var.H = false;
            }
            if (i7 != zj0Var.O - 1) {
                int i11 = i7 + 1;
                EditTextBoldCursor editTextBoldCursor = zj0Var.d[i11];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                zj0Var.d[i11].requestFocus();
            }
            int i12 = zj0Var.O;
            if (i7 == i12 - 1 || (i7 == i12 - 2 && length >= 2)) {
                code = zj0Var.getCode();
                if (code.length() == zj0Var.O) {
                    zj0Var.h(null);
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
