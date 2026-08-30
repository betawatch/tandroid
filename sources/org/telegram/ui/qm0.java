package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class qm0 implements TextWatcher {
    public final /* synthetic */ dn0 a;

    public qm0(dn0 dn0Var) {
        this.a = dn0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z4;
        int indexOf;
        dn0 dn0Var = this.a;
        ArrayList arrayList = dn0Var.R0;
        HashMap hashMap = dn0Var.T0;
        if (dn0Var.W0) {
            return;
        }
        dn0Var.W0 = true;
        String d = se.b.d(dn0Var.V[1].getText().toString(), false);
        dn0Var.V[1].setText(d);
        org.telegram.ui.Components.h40 h40Var = (org.telegram.ui.Components.h40) dn0Var.V[2];
        if (d.length() == 0) {
            h40Var.setHintText((String) null);
            h40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            dn0Var.V[0].setText(LocaleController.getString(R.string.ChooseCountry));
        } else {
            int i10 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i10 < 1) {
                        str = null;
                        z4 = false;
                        break;
                    }
                    String substring = d.substring(0, i10);
                    if (((String) hashMap.get(substring)) != null) {
                        String str2 = d.substring(i10) + dn0Var.V[2].getText().toString();
                        dn0Var.V[1].setText(substring);
                        str = str2;
                        d = substring;
                        z4 = true;
                        break;
                    }
                    i10--;
                }
                if (!z4) {
                    str = d.substring(1) + dn0Var.V[2].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = dn0Var.V[1];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                str = null;
                z4 = false;
            }
            String str3 = (String) hashMap.get(d);
            if (str3 == null || (indexOf = arrayList.indexOf(str3)) == -1) {
                h40Var.setHintText((String) null);
                h40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                dn0Var.V[0].setText(LocaleController.getString(R.string.WrongCountry));
            } else {
                dn0Var.V[0].setText((CharSequence) arrayList.get(indexOf));
                String str4 = (String) dn0Var.U0.get(d);
                if (str4 != null) {
                    h40Var.setHintText(str4.replace('X', (char) 8211));
                    h40Var.setHint((CharSequence) null);
                }
            }
            if (!z4) {
                EditTextBoldCursor editTextBoldCursor2 = dn0Var.V[1];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                h40Var.requestFocus();
                h40Var.setText(str);
                h40Var.setSelection(h40Var.length());
            }
        }
        dn0Var.W0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
