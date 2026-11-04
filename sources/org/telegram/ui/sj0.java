package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sj0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ uj0 b;

    public sj0(uj0 uj0Var, int i3) {
        this.b = uj0Var;
        this.a = i3;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        uj0 uj0Var = this.b;
        if (!uj0Var.I && (length = editable.length()) >= 1) {
            int i3 = this.a;
            if (length > 1) {
                String obj = editable.toString();
                uj0Var.I = true;
                for (int i10 = 0; i10 < Math.min(uj0Var.P - i3, length); i10++) {
                    if (i10 == 0) {
                        editable.replace(0, length, obj.substring(i10, i10 + 1));
                    } else {
                        uj0Var.d[i3 + i10].setText(obj.substring(i10, i10 + 1));
                    }
                }
                uj0Var.I = false;
            }
            if (i3 != uj0Var.P - 1) {
                int i11 = i3 + 1;
                EditTextBoldCursor editTextBoldCursor = uj0Var.d[i11];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                uj0Var.d[i11].requestFocus();
            }
            int i12 = uj0Var.P;
            if (i3 == i12 - 1 || (i3 == i12 - 2 && length >= 2)) {
                code = uj0Var.getCode();
                if (code.length() == uj0Var.P) {
                    uj0Var.h(null);
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
