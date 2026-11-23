package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class zj0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ bk0 b;

    public zj0(bk0 bk0Var, int i7) {
        this.b = bk0Var;
        this.a = i7;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        bk0 bk0Var = this.b;
        if (!bk0Var.I && (length = editable.length()) >= 1) {
            int i7 = this.a;
            if (length > 1) {
                String obj = editable.toString();
                bk0Var.I = true;
                for (int i10 = 0; i10 < Math.min(bk0Var.P - i7, length); i10++) {
                    if (i10 == 0) {
                        editable.replace(0, length, obj.substring(i10, i10 + 1));
                    } else {
                        bk0Var.d[i7 + i10].setText(obj.substring(i10, i10 + 1));
                    }
                }
                bk0Var.I = false;
            }
            if (i7 != bk0Var.P - 1) {
                int i11 = i7 + 1;
                EditTextBoldCursor editTextBoldCursor = bk0Var.d[i11];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                bk0Var.d[i11].requestFocus();
            }
            int i12 = bk0Var.P;
            if (i7 == i12 - 1 || (i7 == i12 - 2 && length >= 2)) {
                code = bk0Var.getCode();
                if (code.length() == bk0Var.P) {
                    bk0Var.h(null);
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
