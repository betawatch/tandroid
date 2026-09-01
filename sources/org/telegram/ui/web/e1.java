package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.Components.b61;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class e1 extends i5 {
    public final s0 f = new s0(this, 1);
    public final /* synthetic */ f1 h;

    public e1(f1 f1Var) {
        this.h = f1Var;
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

    @Override // org.telegram.ui.ActionBar.i5
    public final void m() {
        f1 f1Var = this.h;
        f1Var.n = null;
        f1Var.h = false;
        AndroidUtilities.cancelRunOnUIThread(this.f);
        b61 b61Var = f1Var.a;
        if (b61Var != null) {
            b61Var.V2.N(true);
            f1Var.a.U2.h1(0, 0);
        }
        f1Var.w.d.setText(LocaleController.getString(TextUtils.isEmpty(f1Var.n) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void q(EditText editText) {
        f1 f1Var = this.h;
        boolean z4 = !TextUtils.isEmpty(f1Var.n);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(f1Var.n, obj)) {
            f1Var.n = obj;
            f1Var.h = true;
            s0 s0Var = this.f;
            AndroidUtilities.cancelRunOnUIThread(s0Var);
            AndroidUtilities.runOnUIThread(s0Var, 500L);
            f1Var.w.d.setText(LocaleController.getString(TextUtils.isEmpty(obj) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
        }
        b61 b61Var = f1Var.a;
        if (b61Var != null) {
            b61Var.V2.N(true);
            if (z4 != (!TextUtils.isEmpty(obj))) {
                f1Var.a.U2.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void n() {
    }
}
