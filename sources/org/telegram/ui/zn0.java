package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class zn0 implements TextWatcher {
    public boolean a;
    public String b;
    public boolean c;
    public int d;
    public int e;
    public boolean f;
    public final char[] h = {',', '.', 1643, 12289, 11841, 65040, 65041, 65104, 65105, 65292, 65380, 699};
    public final /* synthetic */ xo0 n;

    public zn0(xo0 xo0Var) {
        this.n = xo0Var;
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
        xo0 xo0Var = this.n;
        if (xo0Var.m0) {
            return;
        }
        Long l4 = xo0Var.H0;
        long longValue = l4 != null ? l4.longValue() : 0L;
        String str = this.b;
        if (str == null) {
            str = LocaleController.fixNumbers(editable.toString());
        }
        int a2 = a(str);
        boolean z10 = a2 >= 0;
        int currencyExpDivider = LocaleController.getCurrencyExpDivider(xo0Var.C0.invoice.currency);
        String substring = a2 >= 0 ? str.substring(0, a2) : str;
        String str2 = "";
        String substring2 = a2 >= 0 ? str.substring(a2 + 1) : "";
        long longValue2 = Utilities.parseLong(gf.b.d(substring, false)).longValue() * currencyExpDivider;
        long longValue3 = Utilities.parseLong(gf.b.d(substring2, false)).longValue();
        String o9 = a4.a.o(longValue3, "");
        String str3 = "" + (currencyExpDivider - 1);
        if (a2 > 0 && o9.length() > str3.length()) {
            longValue3 = Utilities.parseLong(this.e - a2 < o9.length() ? o9.substring(0, str3.length()) : o9.substring(o9.length() - str3.length())).longValue();
        }
        Long valueOf = Long.valueOf(longValue2 + longValue3);
        xo0Var.H0 = valueOf;
        if (xo0Var.C0.invoice.max_tip_amount != 0) {
            long longValue4 = valueOf.longValue();
            long j3 = xo0Var.C0.invoice.max_tip_amount;
            if (longValue4 > j3) {
                xo0Var.H0 = Long.valueOf(j3);
            }
        }
        int selectionStart = xo0Var.f[0].getSelectionStart();
        xo0Var.m0 = true;
        if (xo0Var.H0.longValue() == 0) {
            xo0Var.f[0].setText("");
        } else {
            EditTextBoldCursor editTextBoldCursor = xo0Var.f[0];
            str2 = LocaleController.getInstance().formatCurrencyString(xo0Var.H0.longValue(), false, z10, true, xo0Var.C0.invoice.currency);
            editTextBoldCursor.setText(str2);
        }
        if (longValue < xo0Var.H0.longValue() && longValue != 0 && this.a && selectionStart >= 0) {
            EditTextBoldCursor editTextBoldCursor2 = xo0Var.f[0];
            editTextBoldCursor2.setSelection(Math.min(selectionStart, editTextBoldCursor2.length()));
        } else if (this.c && this.d != xo0Var.f[0].length()) {
            EditTextBoldCursor editTextBoldCursor3 = xo0Var.f[0];
            editTextBoldCursor3.setSelection(Math.max(0, Math.min(selectionStart, editTextBoldCursor3.length())));
        } else if (this.f || !z10 || a2 < 0) {
            EditTextBoldCursor editTextBoldCursor4 = xo0Var.f[0];
            editTextBoldCursor4.setSelection(editTextBoldCursor4.length());
        } else {
            int a10 = a(str2);
            if (a10 > 0) {
                xo0Var.f[0].setSelection(a10 + 1);
            } else {
                EditTextBoldCursor editTextBoldCursor5 = xo0Var.f[0];
                editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
            }
        }
        this.f = z10;
        xo0Var.L0();
        this.b = null;
        xo0Var.m0 = false;
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
        long longValue = Utilities.parseLong(gf.b.d(substring, false)).longValue();
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
