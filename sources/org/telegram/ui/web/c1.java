package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.Components.e51;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class c1 extends e5 {
    public final nh.f0 f = new nh.f0(this, 24);
    public final /* synthetic */ d1 h;

    public c1(d1 d1Var) {
        this.h = d1Var;
    }

    public static boolean t(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (lowerCase.startsWith(lowerCase2) || org.telegram.messenger.y1.x(" ", lowerCase2, lowerCase) || org.telegram.messenger.y1.x(".", lowerCase2, lowerCase)) {
            return true;
        }
        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
        String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
        return translitSafe.startsWith(translitSafe2) || org.telegram.messenger.y1.x(" ", translitSafe2, translitSafe) || org.telegram.messenger.y1.x(".", translitSafe2, translitSafe);
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void m() {
        d1 d1Var = this.h;
        d1Var.n = null;
        d1Var.h = false;
        AndroidUtilities.cancelRunOnUIThread(this.f);
        e51 e51Var = d1Var.a;
        if (e51Var != null) {
            e51Var.U2.N(true);
            d1Var.a.T2.h1(0, 0);
        }
        d1Var.w.d.setText(LocaleController.getString(TextUtils.isEmpty(d1Var.n) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        d1 d1Var = this.h;
        boolean z10 = !TextUtils.isEmpty(d1Var.n);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(d1Var.n, obj)) {
            d1Var.n = obj;
            d1Var.h = true;
            nh.f0 f0Var = this.f;
            AndroidUtilities.cancelRunOnUIThread(f0Var);
            AndroidUtilities.runOnUIThread(f0Var, 500L);
            d1Var.w.d.setText(LocaleController.getString(TextUtils.isEmpty(obj) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
        }
        e51 e51Var = d1Var.a;
        if (e51Var != null) {
            e51Var.U2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                d1Var.a.T2.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void n() {
    }
}
