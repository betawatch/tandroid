package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.voip.r2;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class g1 extends e5 {
    public final r2 f = new r2(this, 6);
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
        if (lowerCase.startsWith(lowerCase2) || org.telegram.messenger.g0.w(" ", lowerCase2, lowerCase) || org.telegram.messenger.g0.w(".", lowerCase2, lowerCase)) {
            return true;
        }
        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
        String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
        return translitSafe.startsWith(translitSafe2) || org.telegram.messenger.g0.w(" ", translitSafe2, translitSafe) || org.telegram.messenger.g0.w(".", translitSafe2, translitSafe);
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void m() {
        h1 h1Var = this.h;
        h1Var.n = null;
        h1Var.h = false;
        AndroidUtilities.cancelRunOnUIThread(this.f);
        c71 c71Var = h1Var.a;
        if (c71Var != null) {
            c71Var.W2.N(true);
            h1Var.a.V2.h1(0, 0);
        }
        h1Var.w.d.setText(LocaleController.getString(TextUtils.isEmpty(h1Var.n) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        h1 h1Var = this.h;
        boolean z10 = !TextUtils.isEmpty(h1Var.n);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(h1Var.n, obj)) {
            h1Var.n = obj;
            h1Var.h = true;
            r2 r2Var = this.f;
            AndroidUtilities.cancelRunOnUIThread(r2Var);
            AndroidUtilities.runOnUIThread(r2Var, 500L);
            h1Var.w.d.setText(LocaleController.getString(TextUtils.isEmpty(obj) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
        }
        c71 c71Var = h1Var.a;
        if (c71Var != null) {
            c71Var.W2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                h1Var.a.V2.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void n() {
    }
}
