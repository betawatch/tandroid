package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class tn0 implements TextWatcher {
    public boolean a;
    public String b;
    public boolean c;
    public int d;
    public int e;
    public boolean f;
    public final char[] h = {',', '.', 1643, 12289, 11841, 65040, 65041, 65104, 65105, 65292, 65380, 699};
    public final /* synthetic */ ro0 n;

    public tn0(ro0 ro0Var) {
        this.n = ro0Var;
    }

    public final int a(String str) {
        int i10 = 0;
        while (true) {
            char[] cArr = this.h;
            if (i10 >= cArr.length) {
                return -1;
            }
            int indexOf = str.indexOf(cArr[i10]);
            if (indexOf >= 0) {
                return indexOf;
            }
            i10++;
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ro0 ro0Var = this.n;
        if (ro0Var.m0) {
            return;
        }
        Long l4 = ro0Var.H0;
        long longValue = l4 != null ? l4.longValue() : 0L;
        String str = this.b;
        if (str == null) {
            str = LocaleController.fixNumbers(editable.toString());
        }
        int a2 = a(str);
        boolean z10 = a2 >= 0;
        int currencyExpDivider = LocaleController.getCurrencyExpDivider(ro0Var.C0.invoice.currency);
        String substring = a2 >= 0 ? str.substring(0, a2) : str;
        String str2 = "";
        String substring2 = a2 >= 0 ? str.substring(a2 + 1) : "";
        long longValue2 = Utilities.parseLong(kf.b.d(substring, false)).longValue() * currencyExpDivider;
        long longValue3 = Utilities.parseLong(kf.b.d(substring2, false)).longValue();
        String o10 = a1.g.o(longValue3, "");
        String str3 = "" + (currencyExpDivider - 1);
        if (a2 > 0 && o10.length() > str3.length()) {
            longValue3 = Utilities.parseLong(this.e - a2 < o10.length() ? o10.substring(0, str3.length()) : o10.substring(o10.length() - str3.length())).longValue();
        }
        Long valueOf = Long.valueOf(longValue2 + longValue3);
        ro0Var.H0 = valueOf;
        if (ro0Var.C0.invoice.max_tip_amount != 0) {
            long longValue4 = valueOf.longValue();
            long j10 = ro0Var.C0.invoice.max_tip_amount;
            if (longValue4 > j10) {
                ro0Var.H0 = Long.valueOf(j10);
            }
        }
        int selectionStart = ro0Var.f[0].getSelectionStart();
        ro0Var.m0 = true;
        if (ro0Var.H0.longValue() == 0) {
            ro0Var.f[0].setText("");
        } else {
            EditTextBoldCursor editTextBoldCursor = ro0Var.f[0];
            str2 = LocaleController.getInstance().formatCurrencyString(ro0Var.H0.longValue(), false, z10, true, ro0Var.C0.invoice.currency);
            editTextBoldCursor.setText(str2);
        }
        if (longValue < ro0Var.H0.longValue() && longValue != 0 && this.a && selectionStart >= 0) {
            EditTextBoldCursor editTextBoldCursor2 = ro0Var.f[0];
            editTextBoldCursor2.setSelection(Math.min(selectionStart, editTextBoldCursor2.length()));
        } else if (this.c && this.d != ro0Var.f[0].length()) {
            EditTextBoldCursor editTextBoldCursor3 = ro0Var.f[0];
            editTextBoldCursor3.setSelection(Math.max(0, Math.min(selectionStart, editTextBoldCursor3.length())));
        } else if (this.f || !z10 || a2 < 0) {
            EditTextBoldCursor editTextBoldCursor4 = ro0Var.f[0];
            editTextBoldCursor4.setSelection(editTextBoldCursor4.length());
        } else {
            int a10 = a(str2);
            if (a10 > 0) {
                ro0Var.f[0].setSelection(a10 + 1);
            } else {
                EditTextBoldCursor editTextBoldCursor5 = ro0Var.f[0];
                editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
            }
        }
        this.f = z10;
        ro0Var.M0();
        this.b = null;
        ro0Var.m0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.n.m0) {
            return;
        }
        this.a = !TextUtils.isEmpty(charSequence);
        this.b = null;
        this.d = charSequence == null ? 0 : charSequence.length();
        this.e = i10;
        boolean z10 = i11 == 1 && i12 == 0;
        this.c = z10;
        if (!z10) {
            return;
        }
        String fixNumbers = LocaleController.fixNumbers(charSequence);
        char charAt = fixNumbers.charAt(i10);
        int a2 = a(fixNumbers);
        String substring = a2 >= 0 ? fixNumbers.substring(a2 + 1) : "";
        long longValue = Utilities.parseLong(kf.b.d(substring, false)).longValue();
        if ((charAt >= '0' && charAt <= '9') || (substring.length() != 0 && longValue == 0)) {
            if (a2 <= 0 || i10 <= a2 || longValue != 0) {
                return;
            }
            this.b = fixNumbers.substring(0, a2 - 1);
            return;
        }
        while (true) {
            int i13 = i10 - 1;
            if (i13 < 0) {
                return;
            }
            char charAt2 = fixNumbers.charAt(i13);
            if (charAt2 >= '0' && charAt2 <= '9') {
                this.b = fixNumbers.substring(0, i13) + fixNumbers.substring(i10);
                return;
            }
            i10 = i13;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
