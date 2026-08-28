package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import mh.m2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.Components.c51;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class b1 extends e5 {
    public final m2 f = new m2(this, 18);
    public final /* synthetic */ c1 h;

    public b1(c1 c1Var) {
        this.h = c1Var;
    }

    public static boolean t(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (lowerCase.startsWith(lowerCase2) || org.telegram.messenger.l0.w(" ", lowerCase2, lowerCase) || org.telegram.messenger.l0.w(".", lowerCase2, lowerCase)) {
            return true;
        }
        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
        String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
        return translitSafe.startsWith(translitSafe2) || org.telegram.messenger.l0.w(" ", translitSafe2, translitSafe) || org.telegram.messenger.l0.w(".", translitSafe2, translitSafe);
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void m() {
        c1 c1Var = this.h;
        c1Var.n = null;
        c1Var.h = false;
        AndroidUtilities.cancelRunOnUIThread(this.f);
        c51 c51Var = c1Var.a;
        if (c51Var != null) {
            c51Var.U2.N(true);
            c1Var.a.T2.h1(0, 0);
        }
        c1Var.w.d.setText(LocaleController.getString(TextUtils.isEmpty(c1Var.n) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        c1 c1Var = this.h;
        boolean z10 = !TextUtils.isEmpty(c1Var.n);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(c1Var.n, obj)) {
            c1Var.n = obj;
            c1Var.h = true;
            m2 m2Var = this.f;
            AndroidUtilities.cancelRunOnUIThread(m2Var);
            AndroidUtilities.runOnUIThread(m2Var, 500L);
            c1Var.w.d.setText(LocaleController.getString(TextUtils.isEmpty(obj) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
        }
        c51 c51Var = c1Var.a;
        if (c51Var != null) {
            c51Var.U2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                c1Var.a.T2.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void n() {
    }
}
