package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class un0 implements TextWatcher {
    public final /* synthetic */ co0 a;

    public un0(co0 co0Var) {
        this.a = co0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z10;
        String str2;
        co0 co0Var = this.a;
        HashMap hashMap = co0Var.c;
        if (co0Var.i0) {
            return;
        }
        co0Var.i0 = true;
        String d = ne.b.d(co0Var.f[8].getText().toString(), false);
        co0Var.f[8].setText(d);
        org.telegram.ui.Components.p30 p30Var = (org.telegram.ui.Components.p30) co0Var.f[9];
        if (d.length() == 0) {
            p30Var.setHintText((String) null);
            p30Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
        } else {
            int i9 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i9 < 1) {
                        str = null;
                        z10 = false;
                        break;
                    }
                    String substring = d.substring(0, i9);
                    if (((String) hashMap.get(substring)) != null) {
                        String str3 = d.substring(i9) + co0Var.f[9].getText().toString();
                        co0Var.f[8].setText(substring);
                        str = str3;
                        d = substring;
                        z10 = true;
                        break;
                    }
                    i9--;
                }
                if (!z10) {
                    str = d.substring(1) + co0Var.f[9].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = co0Var.f[8];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                str = null;
                z10 = false;
            }
            String str4 = (String) hashMap.get(d);
            if (str4 == null || co0Var.a.indexOf(str4) == -1 || (str2 = (String) co0Var.d.get(d)) == null) {
                p30Var.setHintText((String) null);
                p30Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            } else {
                p30Var.setHintText(str2.replace('X', (char) 8211));
                p30Var.setHint((CharSequence) null);
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = co0Var.f[8];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                p30Var.requestFocus();
                p30Var.setText(str);
                p30Var.setSelection(p30Var.length());
            }
        }
        co0Var.i0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
