package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class zm0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn0 b;

    public zm0(bn0 bn0Var, int i10) {
        this.b = bn0Var;
        this.a = i10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        bn0 bn0Var = this.b;
        if (!bn0Var.E && (length = editable.length()) >= 1) {
            int i10 = this.a;
            if (length > 1) {
                String obj = editable.toString();
                bn0Var.E = true;
                for (int i11 = 0; i11 < Math.min(bn0Var.L - i10, length); i11++) {
                    if (i11 == 0) {
                        editable.replace(0, length, obj.substring(i11, i11 + 1));
                    } else {
                        bn0Var.d[i10 + i11].setText(obj.substring(i11, i11 + 1));
                    }
                }
                bn0Var.E = false;
            }
            if (i10 != bn0Var.L - 1) {
                int i12 = i10 + 1;
                EditTextBoldCursor editTextBoldCursor = bn0Var.d[i12];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                bn0Var.d[i12].requestFocus();
            }
            int i13 = bn0Var.L;
            if (i10 == i13 - 1 || (i10 == i13 - 2 && length >= 2)) {
                code = bn0Var.getCode();
                if (code.length() == bn0Var.L) {
                    bn0Var.h(null);
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
