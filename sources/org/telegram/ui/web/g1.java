package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.z51;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class g1 extends h5 {
    public final u0 f = new u0(this, 1);
    public final /* synthetic */ h1 h;

    public g1(h1 h1Var) {
        this.h = h1Var;
    }

    public static boolean t(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (lowerCase.startsWith(lowerCase2) || org.telegram.messenger.w1.w(" ", lowerCase2, lowerCase) || org.telegram.messenger.w1.w(".", lowerCase2, lowerCase)) {
            return true;
        }
        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
        String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
        return translitSafe.startsWith(translitSafe2) || org.telegram.messenger.w1.w(" ", translitSafe2, translitSafe) || org.telegram.messenger.w1.w(".", translitSafe2, translitSafe);
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void m() {
        h1 h1Var = this.h;
        h1Var.r = null;
        h1Var.n = false;
        AndroidUtilities.cancelRunOnUIThread(this.f);
        z51 z51Var = h1Var.a;
        if (z51Var != null) {
            z51Var.Y2.N(true);
            h1Var.a.X2.h1(0, 0);
        }
        h1Var.x.d.setText(LocaleController.getString(TextUtils.isEmpty(h1Var.r) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void q(EditText editText) {
        h1 h1Var = this.h;
        boolean z10 = !TextUtils.isEmpty(h1Var.r);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(h1Var.r, obj)) {
            h1Var.r = obj;
            h1Var.n = true;
            u0 u0Var = this.f;
            AndroidUtilities.cancelRunOnUIThread(u0Var);
            AndroidUtilities.runOnUIThread(u0Var, 500L);
            h1Var.x.d.setText(LocaleController.getString(TextUtils.isEmpty(obj) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
        }
        z51 z51Var = h1Var.a;
        if (z51Var != null) {
            z51Var.Y2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                h1Var.a.X2.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void n() {
    }
}
