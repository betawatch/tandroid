package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.bi;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.Components.y61;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class g1 extends f5 {
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
        if (lowerCase.startsWith(lowerCase2) || bi.u(" ", lowerCase2, lowerCase) || bi.u(".", lowerCase2, lowerCase)) {
            return true;
        }
        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
        String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
        return translitSafe.startsWith(translitSafe2) || bi.u(" ", translitSafe2, translitSafe) || bi.u(".", translitSafe2, translitSafe);
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void m() {
        h1 h1Var = this.h;
        h1Var.r = null;
        h1Var.n = false;
        AndroidUtilities.cancelRunOnUIThread(this.f);
        y61 y61Var = h1Var.a;
        if (y61Var != null) {
            y61Var.f3.N(true);
            h1Var.a.e3.h1(0, 0);
        }
        h1Var.x.d.setText(LocaleController.getString(TextUtils.isEmpty(h1Var.r) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
    }

    @Override // org.telegram.ui.ActionBar.f5
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
        y61 y61Var = h1Var.a;
        if (y61Var != null) {
            y61Var.f3.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                h1Var.a.e3.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void n() {
    }
}
