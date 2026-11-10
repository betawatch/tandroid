package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class yj0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ ak0 b;

    public yj0(ak0 ak0Var, int i7) {
        this.b = ak0Var;
        this.a = i7;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        ak0 ak0Var = this.b;
        if (!ak0Var.H && (length = editable.length()) >= 1) {
            int i7 = this.a;
            if (length > 1) {
                String obj = editable.toString();
                ak0Var.H = true;
                for (int i10 = 0; i10 < Math.min(ak0Var.O - i7, length); i10++) {
                    if (i10 == 0) {
                        editable.replace(0, length, obj.substring(i10, i10 + 1));
                    } else {
                        ak0Var.d[i7 + i10].setText(obj.substring(i10, i10 + 1));
                    }
                }
                ak0Var.H = false;
            }
            if (i7 != ak0Var.O - 1) {
                int i11 = i7 + 1;
                EditTextBoldCursor editTextBoldCursor = ak0Var.d[i11];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                ak0Var.d[i11].requestFocus();
            }
            int i12 = ak0Var.O;
            if (i7 == i12 - 1 || (i7 == i12 - 2 && length >= 2)) {
                code = ak0Var.getCode();
                if (code.length() == ak0Var.O) {
                    ak0Var.h(null);
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
