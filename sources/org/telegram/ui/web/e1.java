package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class e1 extends g5 {
    public final ki.u r = new ki.u(this, 26);
    public final /* synthetic */ f1 s;

    public e1(f1 f1Var) {
        this.s = f1Var;
    }

    public static boolean w(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (lowerCase.startsWith(lowerCase2) || org.telegram.messenger.g0.w(" ", lowerCase2, lowerCase) || org.telegram.messenger.g0.w(".", lowerCase2, lowerCase)) {
            return true;
        }
        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
        String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
        return translitSafe.startsWith(translitSafe2) || org.telegram.messenger.g0.w(" ", translitSafe2, translitSafe) || org.telegram.messenger.g0.w(".", translitSafe2, translitSafe);
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        f1 f1Var = this.s;
        f1Var.n = null;
        f1Var.h = false;
        AndroidUtilities.cancelRunOnUIThread(this.r);
        u61 u61Var = f1Var.a;
        if (u61Var != null) {
            u61Var.W2.N(true);
            f1Var.a.V2.h1(0, 0);
        }
        f1Var.w.d.setText(LocaleController.getString(TextUtils.isEmpty(f1Var.n) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        f1 f1Var = this.s;
        boolean z10 = !TextUtils.isEmpty(f1Var.n);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(f1Var.n, obj)) {
            f1Var.n = obj;
            f1Var.h = true;
            ki.u uVar = this.r;
            AndroidUtilities.cancelRunOnUIThread(uVar);
            AndroidUtilities.runOnUIThread(uVar, 500L);
            f1Var.w.d.setText(LocaleController.getString(TextUtils.isEmpty(obj) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
        }
        u61 u61Var = f1Var.a;
        if (u61Var != null) {
            u61Var.W2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                f1Var.a.V2.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
    }
}
