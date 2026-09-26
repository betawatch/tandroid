package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.Components.l61;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class f1 extends e5 {
    public final q0 f = new q0(this, 2);
    public final /* synthetic */ g1 h;

    public f1(g1 g1Var) {
        this.h = g1Var;
    }

    public static boolean t(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (lowerCase.startsWith(lowerCase2) || org.telegram.messenger.f0.w(" ", lowerCase2, lowerCase) || org.telegram.messenger.f0.w(".", lowerCase2, lowerCase)) {
            return true;
        }
        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
        String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
        return translitSafe.startsWith(translitSafe2) || org.telegram.messenger.f0.w(" ", translitSafe2, translitSafe) || org.telegram.messenger.f0.w(".", translitSafe2, translitSafe);
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void m() {
        g1 g1Var = this.h;
        g1Var.n = null;
        g1Var.h = false;
        AndroidUtilities.cancelRunOnUIThread(this.f);
        l61 l61Var = g1Var.a;
        if (l61Var != null) {
            l61Var.Y2.N(true);
            g1Var.a.X2.h1(0, 0);
        }
        g1Var.w.d.setText(LocaleController.getString(TextUtils.isEmpty(g1Var.n) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        g1 g1Var = this.h;
        boolean z10 = !TextUtils.isEmpty(g1Var.n);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(g1Var.n, obj)) {
            g1Var.n = obj;
            g1Var.h = true;
            q0 q0Var = this.f;
            AndroidUtilities.cancelRunOnUIThread(q0Var);
            AndroidUtilities.runOnUIThread(q0Var, 500L);
            g1Var.w.d.setText(LocaleController.getString(TextUtils.isEmpty(obj) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
        }
        l61 l61Var = g1Var.a;
        if (l61Var != null) {
            l61Var.Y2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                g1Var.a.X2.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void n() {
    }
}
