package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class tn0 implements TextWatcher {
    public final /* synthetic */ bo0 a;

    public tn0(bo0 bo0Var) {
        this.a = bo0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z10;
        String str2;
        bo0 bo0Var = this.a;
        HashMap hashMap = bo0Var.c;
        if (bo0Var.i0) {
            return;
        }
        bo0Var.i0 = true;
        String d = qe.b.d(bo0Var.f[8].getText().toString(), false);
        bo0Var.f[8].setText(d);
        org.telegram.ui.Components.d40 d40Var = (org.telegram.ui.Components.d40) bo0Var.f[9];
        if (d.length() == 0) {
            d40Var.setHintText((String) null);
            d40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
        } else {
            int i10 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i10 < 1) {
                        str = null;
                        z10 = false;
                        break;
                    }
                    String substring = d.substring(0, i10);
                    if (((String) hashMap.get(substring)) != null) {
                        String str3 = d.substring(i10) + bo0Var.f[9].getText().toString();
                        bo0Var.f[8].setText(substring);
                        str = str3;
                        d = substring;
                        z10 = true;
                        break;
                    }
                    i10--;
                }
                if (!z10) {
                    str = d.substring(1) + bo0Var.f[9].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = bo0Var.f[8];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                str = null;
                z10 = false;
            }
            String str4 = (String) hashMap.get(d);
            if (str4 == null || bo0Var.a.indexOf(str4) == -1 || (str2 = (String) bo0Var.d.get(d)) == null) {
                d40Var.setHintText((String) null);
                d40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            } else {
                d40Var.setHintText(str2.replace('X', (char) 8211));
                d40Var.setHint((CharSequence) null);
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = bo0Var.f[8];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                d40Var.requestFocus();
                d40Var.setText(str);
                d40Var.setSelection(d40Var.length());
            }
        }
        bo0Var.i0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
