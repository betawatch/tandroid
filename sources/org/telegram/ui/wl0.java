package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wl0 implements TextWatcher {
    public boolean a;
    public String b;
    public boolean c;
    public int d;
    public int e;
    public boolean f;
    public final char[] h = {',', '.', 1643, 12289, 11841, 65040, 65041, 65104, 65105, 65292, 65380, 699};
    public final /* synthetic */ sm0 n;

    public wl0(sm0 sm0Var) {
        this.n = sm0Var;
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
        int i10;
        sm0 sm0Var = this.n;
        if (sm0Var.m0) {
            return;
        }
        Long l4 = sm0Var.H0;
        long longValue = l4 != null ? l4.longValue() : 0L;
        String str = this.b;
        if (str == null) {
            str = org.telegram.messenger.cd.n(editable.toString());
        }
        int a2 = a(str);
        boolean z10 = a2 >= 0;
        String str2 = sm0Var.C0.invoice.currency;
        str2.getClass();
        i10 = 10;
        switch (str2) {
            case "BHD":
            case "IQD":
            case "JOD":
            case "KWD":
            case "LYD":
            case "OMR":
            case "TND":
                i10 = 1000;
                break;
            case "BIF":
            case "BYR":
            case "CLP":
            case "CVE":
            case "DJF":
            case "GNF":
            case "ISK":
            case "JPY":
            case "KMF":
            case "KRW":
            case "MGA":
            case "PYG":
            case "RWF":
            case "UGX":
            case "UYI":
            case "VND":
            case "VUV":
            case "XAF":
            case "XOF":
            case "XPF":
                i10 = 1;
                break;
            case "CLF":
                i10 = 10000;
                break;
            case "MRO":
                break;
            default:
                i10 = 100;
                break;
        }
        String substring = a2 >= 0 ? str.substring(0, a2) : str;
        String str3 = "";
        String substring2 = a2 >= 0 ? str.substring(a2 + 1) : "";
        long longValue2 = Utilities.A(af.b.d(substring, false)).longValue() * i10;
        long longValue3 = Utilities.A(af.b.d(substring2, false)).longValue();
        String l10 = a1.g.l(longValue3, "");
        String str4 = "" + (i10 - 1);
        if (a2 > 0 && l10.length() > str4.length()) {
            longValue3 = Utilities.A(this.e - a2 < l10.length() ? l10.substring(0, str4.length()) : l10.substring(l10.length() - str4.length())).longValue();
        }
        Long valueOf = Long.valueOf(longValue2 + longValue3);
        sm0Var.H0 = valueOf;
        if (sm0Var.C0.invoice.max_tip_amount != 0) {
            long longValue4 = valueOf.longValue();
            long j10 = sm0Var.C0.invoice.max_tip_amount;
            if (longValue4 > j10) {
                sm0Var.H0 = Long.valueOf(j10);
            }
        }
        int selectionStart = sm0Var.f[0].getSelectionStart();
        sm0Var.m0 = true;
        if (sm0Var.H0.longValue() == 0) {
            sm0Var.f[0].setText("");
        } else {
            EditTextBoldCursor editTextBoldCursor = sm0Var.f[0];
            str3 = org.telegram.messenger.cd.D0().q(sm0Var.H0.longValue(), false, z10, true, sm0Var.C0.invoice.currency);
            editTextBoldCursor.setText(str3);
        }
        if (longValue < sm0Var.H0.longValue() && longValue != 0 && this.a && selectionStart >= 0) {
            EditTextBoldCursor editTextBoldCursor2 = sm0Var.f[0];
            editTextBoldCursor2.setSelection(Math.min(selectionStart, editTextBoldCursor2.length()));
        } else if (this.c && this.d != sm0Var.f[0].length()) {
            EditTextBoldCursor editTextBoldCursor3 = sm0Var.f[0];
            editTextBoldCursor3.setSelection(Math.max(0, Math.min(selectionStart, editTextBoldCursor3.length())));
        } else if (this.f || !z10 || a2 < 0) {
            EditTextBoldCursor editTextBoldCursor4 = sm0Var.f[0];
            editTextBoldCursor4.setSelection(editTextBoldCursor4.length());
        } else {
            int a10 = a(str3);
            if (a10 > 0) {
                sm0Var.f[0].setSelection(a10 + 1);
            } else {
                EditTextBoldCursor editTextBoldCursor5 = sm0Var.f[0];
                editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
            }
        }
        this.f = z10;
        sm0Var.Q0();
        this.b = null;
        sm0Var.m0 = false;
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
        String n10 = org.telegram.messenger.cd.n(charSequence);
        char charAt = n10.charAt(i10);
        int a2 = a(n10);
        String substring = a2 >= 0 ? n10.substring(a2 + 1) : "";
        long longValue = Utilities.A(af.b.d(substring, false)).longValue();
        if ((charAt >= '0' && charAt <= '9') || (substring.length() != 0 && longValue == 0)) {
            if (a2 <= 0 || i10 <= a2 || longValue != 0) {
                return;
            }
            this.b = n10.substring(0, a2 - 1);
            return;
        }
        while (true) {
            int i13 = i10 - 1;
            if (i13 < 0) {
                return;
            }
            char charAt2 = n10.charAt(i13);
            if (charAt2 >= '0' && charAt2 <= '9') {
                this.b = n10.substring(0, i13) + n10.substring(i10);
                return;
            }
            i10 = i13;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
