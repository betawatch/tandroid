package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.wh;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.Components.n61;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class g1 extends g5 {
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
        if (lowerCase.startsWith(lowerCase2) || wh.u(" ", lowerCase2, lowerCase) || wh.u(".", lowerCase2, lowerCase)) {
            return true;
        }
        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
        String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
        return translitSafe.startsWith(translitSafe2) || wh.u(" ", translitSafe2, translitSafe) || wh.u(".", translitSafe2, translitSafe);
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        h1 h1Var = this.h;
        h1Var.r = null;
        h1Var.n = false;
        AndroidUtilities.cancelRunOnUIThread(this.f);
        n61 n61Var = h1Var.a;
        if (n61Var != null) {
            n61Var.Y2.N(true);
            h1Var.a.X2.h1(0, 0);
        }
        h1Var.x.d.setText(LocaleController.getString(TextUtils.isEmpty(h1Var.r) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
    }

    @Override // org.telegram.ui.ActionBar.g5
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
        n61 n61Var = h1Var.a;
        if (n61Var != null) {
            n61Var.Y2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                h1Var.a.X2.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
    }
}
