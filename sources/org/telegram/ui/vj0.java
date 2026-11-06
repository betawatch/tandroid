package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class vj0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ xj0 b;

    public vj0(xj0 xj0Var, int i7) {
        this.b = xj0Var;
        this.a = i7;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        xj0 xj0Var = this.b;
        if (!xj0Var.H && (length = editable.length()) >= 1) {
            int i7 = this.a;
            if (length > 1) {
                String obj = editable.toString();
                xj0Var.H = true;
                for (int i10 = 0; i10 < Math.min(xj0Var.O - i7, length); i10++) {
                    if (i10 == 0) {
                        editable.replace(0, length, obj.substring(i10, i10 + 1));
                    } else {
                        xj0Var.d[i7 + i10].setText(obj.substring(i10, i10 + 1));
                    }
                }
                xj0Var.H = false;
            }
            if (i7 != xj0Var.O - 1) {
                int i11 = i7 + 1;
                EditTextBoldCursor editTextBoldCursor = xj0Var.d[i11];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                xj0Var.d[i11].requestFocus();
            }
            int i12 = xj0Var.O;
            if (i7 == i12 - 1 || (i7 == i12 - 2 && length >= 2)) {
                code = xj0Var.getCode();
                if (code.length() == xj0Var.O) {
                    xj0Var.h(null);
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
