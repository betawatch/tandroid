package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.a61;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class f1 extends h5 {
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
        if (lowerCase.startsWith(lowerCase2) || y3.w(" ", lowerCase2, lowerCase) || y3.w(".", lowerCase2, lowerCase)) {
            return true;
        }
        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
        String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
        return translitSafe.startsWith(translitSafe2) || y3.w(" ", translitSafe2, translitSafe) || y3.w(".", translitSafe2, translitSafe);
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void m() {
        g1 g1Var = this.h;
        g1Var.n = null;
        g1Var.h = false;
        AndroidUtilities.cancelRunOnUIThread(this.f);
        a61 a61Var = g1Var.a;
        if (a61Var != null) {
            a61Var.V2.N(true);
            g1Var.a.U2.h1(0, 0);
        }
        g1Var.w.d.setText(LocaleController.getString(TextUtils.isEmpty(g1Var.n) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void q(EditText editText) {
        g1 g1Var = this.h;
        boolean z4 = !TextUtils.isEmpty(g1Var.n);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(g1Var.n, obj)) {
            g1Var.n = obj;
            g1Var.h = true;
            q0 q0Var = this.f;
            AndroidUtilities.cancelRunOnUIThread(q0Var);
            AndroidUtilities.runOnUIThread(q0Var, 500L);
            g1Var.w.d.setText(LocaleController.getString(TextUtils.isEmpty(obj) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
        }
        a61 a61Var = g1Var.a;
        if (a61Var != null) {
            a61Var.V2.N(true);
            if (z4 != (!TextUtils.isEmpty(obj))) {
                g1Var.a.U2.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void n() {
    }
}
