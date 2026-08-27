package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        if (!tm0Var.D && (length = editable.length()) >= 1) {
            int i10 = this.a;
            if (length > 1) {
                String obj = editable.toString();
                tm0Var.D = true;
                for (int i11 = 0; i11 < Math.min(tm0Var.K - i10, length); i11++) {
                    if (i11 == 0) {
                        editable.replace(0, length, obj.substring(i11, i11 + 1));
                    } else {
                        tm0Var.d[i10 + i11].setText(obj.substring(i11, i11 + 1));
                    }
                }
                tm0Var.D = false;
            }
            if (i10 != tm0Var.K - 1) {
                int i12 = i10 + 1;
                EditTextBoldCursor editTextBoldCursor = tm0Var.d[i12];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                tm0Var.d[i12].requestFocus();
            }
            int i13 = tm0Var.K;
            if (i10 == i13 - 1 || (i10 == i13 - 2 && length >= 2)) {
                code = tm0Var.getCode();
                if (code.length() == tm0Var.K) {
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
