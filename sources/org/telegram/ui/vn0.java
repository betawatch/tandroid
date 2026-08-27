package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class vn0 implements TextWatcher {
    public final /* synthetic */ do0 a;

    public vn0(do0 do0Var) {
        this.a = do0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z10;
        String str2;
        do0 do0Var = this.a;
        HashMap hashMap = do0Var.c;
        if (do0Var.i0) {
            return;
        }
        do0Var.i0 = true;
        String d = oe.b.d(do0Var.f[8].getText().toString(), false);
        do0Var.f[8].setText(d);
        org.telegram.ui.Components.u30 u30Var = (org.telegram.ui.Components.u30) do0Var.f[9];
        if (d.length() == 0) {
            u30Var.setHintText((String) null);
            u30Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
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
                        String str3 = d.substring(i10) + do0Var.f[9].getText().toString();
                        do0Var.f[8].setText(substring);
                        str = str3;
                        d = substring;
                        z10 = true;
                        break;
                    }
                    i10--;
                }
                if (!z10) {
                    str = d.substring(1) + do0Var.f[9].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = do0Var.f[8];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                str = null;
                z10 = false;
            }
            String str4 = (String) hashMap.get(d);
            if (str4 == null || do0Var.a.indexOf(str4) == -1 || (str2 = (String) do0Var.d.get(d)) == null) {
                u30Var.setHintText((String) null);
                u30Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            } else {
                u30Var.setHintText(str2.replace('X', (char) 8211));
                u30Var.setHint((CharSequence) null);
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = do0Var.f[8];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                u30Var.requestFocus();
                u30Var.setText(str);
                u30Var.setSelection(u30Var.length());
            }
        }
        do0Var.i0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
