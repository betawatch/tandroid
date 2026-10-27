package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class xm0 implements TextWatcher {
    public final /* synthetic */ kn0 a;

    public xm0(kn0 kn0Var) {
        this.a = kn0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        String str;
        int indexOf;
        kn0 kn0Var = this.a;
        ArrayList arrayList = kn0Var.U0;
        HashMap hashMap = kn0Var.W0;
        if (kn0Var.Z0) {
            return;
        }
        kn0Var.Z0 = true;
        String d = kf.b.d(kn0Var.Y[1].getText().toString(), false);
        kn0Var.Y[1].setText(d);
        org.telegram.ui.Components.q40 q40Var = (org.telegram.ui.Components.q40) kn0Var.Y[2];
        if (d.length() == 0) {
            q40Var.setHintText((String) null);
            q40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            kn0Var.Y[0].setText(LocaleController.getString(R.string.ChooseCountry));
        } else {
            int i10 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i10 < 1) {
                        z10 = false;
                        str = null;
                        break;
                    }
                    String substring = d.substring(0, i10);
                    if (((String) hashMap.get(substring)) != null) {
                        String str2 = d.substring(i10) + kn0Var.Y[2].getText().toString();
                        kn0Var.Y[1].setText(substring);
                        str = str2;
                        d = substring;
                        z10 = true;
                        break;
                    }
                    i10--;
                }
                if (!z10) {
                    str = d.substring(1) + kn0Var.Y[2].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = kn0Var.Y[1];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                z10 = false;
                str = null;
            }
            String str3 = (String) hashMap.get(d);
            if (str3 == null || (indexOf = arrayList.indexOf(str3)) == -1) {
                q40Var.setHintText((String) null);
                q40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                kn0Var.Y[0].setText(LocaleController.getString(R.string.WrongCountry));
            } else {
                kn0Var.Y[0].setText((CharSequence) arrayList.get(indexOf));
                String str4 = (String) kn0Var.X0.get(d);
                if (str4 != null) {
                    q40Var.setHintText(str4.replace('X', (char) 8211));
                    q40Var.setHint((CharSequence) null);
                }
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = kn0Var.Y[1];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                q40Var.requestFocus();
                q40Var.setText(str);
                q40Var.setSelection(q40Var.length());
            }
        }
        kn0Var.Z0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
