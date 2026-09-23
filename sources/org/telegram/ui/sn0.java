package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class sn0 implements TextWatcher {
    public boolean a;
    public String b;
    public boolean c;
    public int d;
    public int e;
    public boolean f;
    public final char[] h = {',', '.', 1643, 12289, 11841, 65040, 65041, 65104, 65105, 65292, 65380, 699};
    public final /* synthetic */ qo0 n;

    public sn0(qo0 qo0Var) {
        this.n = qo0Var;
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
        qo0 qo0Var = this.n;
        if (qo0Var.m0) {
            return;
        }
        Long l4 = qo0Var.H0;
        long longValue = l4 != null ? l4.longValue() : 0L;
        String str = this.b;
        if (str == null) {
            str = LocaleController.fixNumbers(editable.toString());
        }
        int a2 = a(str);
        boolean z10 = a2 >= 0;
        int currencyExpDivider = LocaleController.getCurrencyExpDivider(qo0Var.C0.invoice.currency);
        String substring = a2 >= 0 ? str.substring(0, a2) : str;
        String str2 = "";
        String substring2 = a2 >= 0 ? str.substring(a2 + 1) : "";
        long longValue2 = Utilities.parseLong(gf.b.d(substring, false)).longValue() * currencyExpDivider;
        long longValue3 = Utilities.parseLong(gf.b.d(substring2, false)).longValue();
        String p5 = a4.a.p(longValue3, "");
        String str3 = "" + (currencyExpDivider - 1);
        if (a2 > 0 && p5.length() > str3.length()) {
            longValue3 = Utilities.parseLong(this.e - a2 < p5.length() ? p5.substring(0, str3.length()) : p5.substring(p5.length() - str3.length())).longValue();
        }
        Long valueOf = Long.valueOf(longValue2 + longValue3);
        qo0Var.H0 = valueOf;
        if (qo0Var.C0.invoice.max_tip_amount != 0) {
            long longValue4 = valueOf.longValue();
            long j3 = qo0Var.C0.invoice.max_tip_amount;
            if (longValue4 > j3) {
                qo0Var.H0 = Long.valueOf(j3);
            }
        }
        int selectionStart = qo0Var.f[0].getSelectionStart();
        qo0Var.m0 = true;
        if (qo0Var.H0.longValue() == 0) {
            qo0Var.f[0].setText("");
        } else {
            EditTextBoldCursor editTextBoldCursor = qo0Var.f[0];
            str2 = LocaleController.getInstance().formatCurrencyString(qo0Var.H0.longValue(), false, z10, true, qo0Var.C0.invoice.currency);
            editTextBoldCursor.setText(str2);
        }
        if (longValue < qo0Var.H0.longValue() && longValue != 0 && this.a && selectionStart >= 0) {
            EditTextBoldCursor editTextBoldCursor2 = qo0Var.f[0];
            editTextBoldCursor2.setSelection(Math.min(selectionStart, editTextBoldCursor2.length()));
        } else if (this.c && this.d != qo0Var.f[0].length()) {
            EditTextBoldCursor editTextBoldCursor3 = qo0Var.f[0];
            editTextBoldCursor3.setSelection(Math.max(0, Math.min(selectionStart, editTextBoldCursor3.length())));
        } else if (this.f || !z10 || a2 < 0) {
            EditTextBoldCursor editTextBoldCursor4 = qo0Var.f[0];
            editTextBoldCursor4.setSelection(editTextBoldCursor4.length());
        } else {
            int a10 = a(str2);
            if (a10 > 0) {
                qo0Var.f[0].setSelection(a10 + 1);
            } else {
                EditTextBoldCursor editTextBoldCursor5 = qo0Var.f[0];
                editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
            }
        }
        this.f = z10;
        qo0Var.L0();
        this.b = null;
        qo0Var.m0 = false;
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
