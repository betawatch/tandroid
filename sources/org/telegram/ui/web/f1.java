package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Components.d71;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class f1 extends k5 {
    public final ki.u r = new ki.u(this, 26);
    public final /* synthetic */ g1 s;

    public f1(g1 g1Var) {
        this.s = g1Var;
    }

    public static boolean w(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (lowerCase.startsWith(lowerCase2) || org.telegram.messenger.v0.w(" ", lowerCase2, lowerCase) || org.telegram.messenger.v0.w(".", lowerCase2, lowerCase)) {
            return true;
        }
        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
        String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
        return translitSafe.startsWith(translitSafe2) || org.telegram.messenger.v0.w(" ", translitSafe2, translitSafe) || org.telegram.messenger.v0.w(".", translitSafe2, translitSafe);
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void m() {
        g1 g1Var = this.s;
        g1Var.n = null;
        g1Var.h = false;
        AndroidUtilities.cancelRunOnUIThread(this.r);
        d71 d71Var = g1Var.a;
        if (d71Var != null) {
            d71Var.Z2.N(true);
            g1Var.a.Y2.h1(0, 0);
        }
        g1Var.w.d.setText(LocaleController.getString(TextUtils.isEmpty(g1Var.n) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void q(EditText editText) {
        g1 g1Var = this.s;
        boolean z10 = !TextUtils.isEmpty(g1Var.n);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(g1Var.n, obj)) {
            g1Var.n = obj;
            g1Var.h = true;
            ki.u uVar = this.r;
            AndroidUtilities.cancelRunOnUIThread(uVar);
            AndroidUtilities.runOnUIThread(uVar, 500L);
            g1Var.w.d.setText(LocaleController.getString(TextUtils.isEmpty(obj) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
        }
        d71 d71Var = g1Var.a;
        if (d71Var != null) {
            d71Var.Z2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                g1Var.a.Y2.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void n() {
    }
}
