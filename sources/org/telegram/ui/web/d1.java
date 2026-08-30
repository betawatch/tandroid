package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.a61;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class d1 extends h5 {
    public final o0 f = new o0(this, 2);
    public final /* synthetic */ e1 h;

    public d1(e1 e1Var) {
        this.h = e1Var;
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
        e1 e1Var = this.h;
        e1Var.n = null;
        e1Var.h = false;
        AndroidUtilities.cancelRunOnUIThread(this.f);
        a61 a61Var = e1Var.a;
        if (a61Var != null) {
            a61Var.V2.N(true);
            e1Var.a.U2.h1(0, 0);
        }
        e1Var.w.d.setText(LocaleController.getString(TextUtils.isEmpty(e1Var.n) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void q(EditText editText) {
        e1 e1Var = this.h;
        boolean z4 = !TextUtils.isEmpty(e1Var.n);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(e1Var.n, obj)) {
            e1Var.n = obj;
            e1Var.h = true;
            o0 o0Var = this.f;
            AndroidUtilities.cancelRunOnUIThread(o0Var);
            AndroidUtilities.runOnUIThread(o0Var, 500L);
            e1Var.w.d.setText(LocaleController.getString(TextUtils.isEmpty(obj) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
        }
        a61 a61Var = e1Var.a;
        if (a61Var != null) {
            a61Var.V2.N(true);
            if (z4 != (!TextUtils.isEmpty(obj))) {
                e1Var.a.U2.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void n() {
    }
}
