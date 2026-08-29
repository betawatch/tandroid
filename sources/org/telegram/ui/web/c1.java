package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import nh.m6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.x3;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.Components.o51;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class c1 extends e5 {
    public final m6 f = new m6(this, 27);
    public final /* synthetic */ d1 h;

    public c1(d1 d1Var) {
        this.h = d1Var;
    }

    public static boolean t(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (lowerCase.startsWith(lowerCase2) || x3.w(" ", lowerCase2, lowerCase) || x3.w(".", lowerCase2, lowerCase)) {
            return true;
        }
        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
        String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
        return translitSafe.startsWith(translitSafe2) || x3.w(" ", translitSafe2, translitSafe) || x3.w(".", translitSafe2, translitSafe);
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void m() {
        d1 d1Var = this.h;
        d1Var.n = null;
        d1Var.h = false;
        AndroidUtilities.cancelRunOnUIThread(this.f);
        o51 o51Var = d1Var.a;
        if (o51Var != null) {
            o51Var.U2.N(true);
            d1Var.a.T2.h1(0, 0);
        }
        d1Var.w.d.setText(LocaleController.getString(TextUtils.isEmpty(d1Var.n) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        d1 d1Var = this.h;
        boolean z10 = !TextUtils.isEmpty(d1Var.n);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(d1Var.n, obj)) {
            d1Var.n = obj;
            d1Var.h = true;
            m6 m6Var = this.f;
            AndroidUtilities.cancelRunOnUIThread(m6Var);
            AndroidUtilities.runOnUIThread(m6Var, 500L);
            d1Var.w.d.setText(LocaleController.getString(TextUtils.isEmpty(obj) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
        }
        o51 o51Var = d1Var.a;
        if (o51Var != null) {
            o51Var.U2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                d1Var.a.T2.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void n() {
    }
}
