package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.Components.l61;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class g1 extends i5 {
    public final org.telegram.ui.Components.voip.x f = new org.telegram.ui.Components.voip.x(this, 13);
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
        if (lowerCase.startsWith(lowerCase2) || org.telegram.messenger.a2.w(" ", lowerCase2, lowerCase) || org.telegram.messenger.a2.w(".", lowerCase2, lowerCase)) {
            return true;
        }
        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
        String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
        return translitSafe.startsWith(translitSafe2) || org.telegram.messenger.a2.w(" ", translitSafe2, translitSafe) || org.telegram.messenger.a2.w(".", translitSafe2, translitSafe);
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void m() {
        h1 h1Var = this.h;
        h1Var.n = null;
        h1Var.h = false;
        AndroidUtilities.cancelRunOnUIThread(this.f);
        l61 l61Var = h1Var.a;
        if (l61Var != null) {
            l61Var.Y2.N(true);
            h1Var.a.X2.h1(0, 0);
        }
        h1Var.w.d.setText(LocaleController.getString(TextUtils.isEmpty(h1Var.n) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void q(EditText editText) {
        h1 h1Var = this.h;
        boolean z10 = !TextUtils.isEmpty(h1Var.n);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(h1Var.n, obj)) {
            h1Var.n = obj;
            h1Var.h = true;
            org.telegram.ui.Components.voip.x xVar = this.f;
            AndroidUtilities.cancelRunOnUIThread(xVar);
            AndroidUtilities.runOnUIThread(xVar, 500L);
            h1Var.w.d.setText(LocaleController.getString(TextUtils.isEmpty(obj) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
        }
        l61 l61Var = h1Var.a;
        if (l61Var != null) {
            l61Var.Y2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                h1Var.a.X2.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void n() {
    }
}
