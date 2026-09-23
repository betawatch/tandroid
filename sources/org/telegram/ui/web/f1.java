package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class f1 extends f5 {
    public final t0 f = new t0(this, 1);
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
        if (lowerCase.startsWith(lowerCase2) || org.telegram.messenger.z0.w(" ", lowerCase2, lowerCase) || org.telegram.messenger.z0.w(".", lowerCase2, lowerCase)) {
            return true;
        }
        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
        String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
        return translitSafe.startsWith(translitSafe2) || org.telegram.messenger.z0.w(" ", translitSafe2, translitSafe) || org.telegram.messenger.z0.w(".", translitSafe2, translitSafe);
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void m() {
        g1 g1Var = this.h;
        g1Var.n = null;
        g1Var.h = false;
        AndroidUtilities.cancelRunOnUIThread(this.f);
        x51 x51Var = g1Var.a;
        if (x51Var != null) {
            x51Var.Y2.N(true);
            g1Var.a.X2.h1(0, 0);
        }
        g1Var.w.d.setText(LocaleController.getString(TextUtils.isEmpty(g1Var.n) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void q(EditText editText) {
        g1 g1Var = this.h;
        boolean z10 = !TextUtils.isEmpty(g1Var.n);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(g1Var.n, obj)) {
            g1Var.n = obj;
            g1Var.h = true;
            t0 t0Var = this.f;
            AndroidUtilities.cancelRunOnUIThread(t0Var);
            AndroidUtilities.runOnUIThread(t0Var, 500L);
            g1Var.w.d.setText(LocaleController.getString(TextUtils.isEmpty(obj) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
        }
        x51 x51Var = g1Var.a;
        if (x51Var != null) {
            x51Var.Y2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                g1Var.a.X2.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void n() {
    }
}
