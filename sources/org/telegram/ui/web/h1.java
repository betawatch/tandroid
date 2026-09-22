package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.Components.o61;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class h1 extends g5 {
    public final r0 f = new r0(this, 2);
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
        if (lowerCase.startsWith(lowerCase2) || org.telegram.messenger.l0.v(" ", lowerCase2, lowerCase) || org.telegram.messenger.l0.v(".", lowerCase2, lowerCase)) {
            return true;
        }
        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
        String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
        return translitSafe.startsWith(translitSafe2) || org.telegram.messenger.l0.v(" ", translitSafe2, translitSafe) || org.telegram.messenger.l0.v(".", translitSafe2, translitSafe);
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        i1 i1Var = this.h;
        i1Var.r = null;
        i1Var.n = false;
        AndroidUtilities.cancelRunOnUIThread(this.f);
        o61 o61Var = i1Var.a;
        if (o61Var != null) {
            o61Var.Y2.N(true);
            i1Var.a.X2.h1(0, 0);
        }
        i1Var.x.d.setText(LocaleController.getString(TextUtils.isEmpty(i1Var.r) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        i1 i1Var = this.h;
        boolean z10 = !TextUtils.isEmpty(i1Var.r);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(i1Var.r, obj)) {
            i1Var.r = obj;
            i1Var.n = true;
            r0 r0Var = this.f;
            AndroidUtilities.cancelRunOnUIThread(r0Var);
            AndroidUtilities.runOnUIThread(r0Var, 500L);
            i1Var.x.d.setText(LocaleController.getString(TextUtils.isEmpty(obj) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
        }
        o61 o61Var = i1Var.a;
        if (o61Var != null) {
            o61Var.Y2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                i1Var.a.X2.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
    }
}
