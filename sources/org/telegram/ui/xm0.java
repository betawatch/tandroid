package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class xm0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ zm0 b;

    public xm0(zm0 zm0Var, int i10) {
        this.b = zm0Var;
        this.a = i10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        zm0 zm0Var = this.b;
        if (!zm0Var.E && (length = editable.length()) >= 1) {
            int i10 = this.a;
            if (length > 1) {
                String obj = editable.toString();
                zm0Var.E = true;
                for (int i11 = 0; i11 < Math.min(zm0Var.L - i10, length); i11++) {
                    if (i11 == 0) {
                        editable.replace(0, length, obj.substring(i11, i11 + 1));
                    } else {
                        zm0Var.d[i10 + i11].setText(obj.substring(i11, i11 + 1));
                    }
                }
                zm0Var.E = false;
            }
            if (i10 != zm0Var.L - 1) {
                int i12 = i10 + 1;
                EditTextBoldCursor editTextBoldCursor = zm0Var.d[i12];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                zm0Var.d[i12].requestFocus();
            }
            int i13 = zm0Var.L;
            if (i10 == i13 - 1 || (i10 == i13 - 2 && length >= 2)) {
                code = zm0Var.getCode();
                if (code.length() == zm0Var.L) {
                    zm0Var.h(null);
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
