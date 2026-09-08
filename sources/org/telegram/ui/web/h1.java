package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class h1 extends g5 {
    public final b f = new b(this, 4);
    public final /* synthetic */ i1 h;

    public h1(i1 i1Var) {
        this.h = i1Var;
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

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        i1 i1Var = this.h;
        i1Var.n = null;
        i1Var.h = false;
        AndroidUtilities.cancelRunOnUIThread(this.f);
        x51 x51Var = i1Var.a;
        if (x51Var != null) {
            x51Var.Y2.N(true);
            i1Var.a.X2.h1(0, 0);
        }
        i1Var.w.d.setText(LocaleController.getString(TextUtils.isEmpty(i1Var.n) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        i1 i1Var = this.h;
        boolean z10 = !TextUtils.isEmpty(i1Var.n);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(i1Var.n, obj)) {
            i1Var.n = obj;
            i1Var.h = true;
            b bVar = this.f;
            AndroidUtilities.cancelRunOnUIThread(bVar);
            AndroidUtilities.runOnUIThread(bVar, 500L);
            i1Var.w.d.setText(LocaleController.getString(TextUtils.isEmpty(obj) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
        }
        x51 x51Var = i1Var.a;
        if (x51Var != null) {
            x51Var.Y2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                i1Var.a.X2.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
    }
}
