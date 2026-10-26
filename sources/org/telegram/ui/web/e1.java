package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.vh;
import org.telegram.ui.Components.l71;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class e1 extends org.telegram.ui.ActionBar.s0 {
    public final k2.c a = new k2.c(this, 29);
    public final /* synthetic */ f1 b;

    public e1(f1 f1Var) {
        this.b = f1Var;
    }

    public static boolean n(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (lowerCase.startsWith(lowerCase2) || vh.u(" ", lowerCase2, lowerCase) || vh.u(".", lowerCase2, lowerCase)) {
            return true;
        }
        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
        String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
        return translitSafe.startsWith(translitSafe2) || vh.u(" ", translitSafe2, translitSafe) || vh.u(".", translitSafe2, translitSafe);
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void h() {
        f1 f1Var = this.b;
        f1Var.r = null;
        f1Var.n = false;
        AndroidUtilities.cancelRunOnUIThread(this.a);
        l71 l71Var = f1Var.a;
        if (l71Var != null) {
            l71Var.g3.O(true);
            f1Var.a.f3.h1(0, 0);
        }
        f1Var.x.d.setText(LocaleController.getString(TextUtils.isEmpty(f1Var.r) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void l(EditText editText) {
        f1 f1Var = this.b;
        boolean z10 = !TextUtils.isEmpty(f1Var.r);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(f1Var.r, obj)) {
            f1Var.r = obj;
            f1Var.n = true;
            k2.c cVar = this.a;
            AndroidUtilities.cancelRunOnUIThread(cVar);
            AndroidUtilities.runOnUIThread(cVar, 500L);
            f1Var.x.d.setText(LocaleController.getString(TextUtils.isEmpty(obj) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
        }
        l71 l71Var = f1Var.a;
        if (l71Var != null) {
            l71Var.g3.O(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                f1Var.a.f3.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void i() {
    }
}
