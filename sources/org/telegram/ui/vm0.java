package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class vm0 implements TextWatcher {
    public final /* synthetic */ in0 a;

    public vm0(in0 in0Var) {
        this.a = in0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z10;
        int indexOf;
        in0 in0Var = this.a;
        ArrayList arrayList = in0Var.U0;
        HashMap hashMap = in0Var.W0;
        if (in0Var.Z0) {
            return;
        }
        in0Var.Z0 = true;
        String d = gf.b.d(in0Var.Y[1].getText().toString(), false);
        in0Var.Y[1].setText(d);
        org.telegram.ui.Components.g40 g40Var = (org.telegram.ui.Components.g40) in0Var.Y[2];
        if (d.length() == 0) {
            g40Var.setHintText((String) null);
            g40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            in0Var.Y[0].setText(LocaleController.getString(R.string.ChooseCountry));
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
                        String str2 = d.substring(i10) + in0Var.Y[2].getText().toString();
                        in0Var.Y[1].setText(substring);
                        str = str2;
                        d = substring;
                        z10 = true;
                        break;
                    }
                    i10--;
                }
                if (!z10) {
                    str = d.substring(1) + in0Var.Y[2].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = in0Var.Y[1];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                str = null;
                z10 = false;
            }
            String str3 = (String) hashMap.get(d);
            if (str3 == null || (indexOf = arrayList.indexOf(str3)) == -1) {
                g40Var.setHintText((String) null);
                g40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                in0Var.Y[0].setText(LocaleController.getString(R.string.WrongCountry));
            } else {
                in0Var.Y[0].setText((CharSequence) arrayList.get(indexOf));
                String str4 = (String) in0Var.X0.get(d);
                if (str4 != null) {
                    g40Var.setHintText(str4.replace('X', (char) 8211));
                    g40Var.setHint((CharSequence) null);
                }
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = in0Var.Y[1];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                g40Var.requestFocus();
                g40Var.setText(str);
                g40Var.setSelection(g40Var.length());
            }
        }
        in0Var.Z0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
