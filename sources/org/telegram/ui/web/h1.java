package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.Components.m61;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        m61 m61Var = i1Var.a;
        if (m61Var != null) {
            m61Var.Y2.N(true);
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
        m61 m61Var = i1Var.a;
        if (m61Var != null) {
            m61Var.Y2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                i1Var.a.X2.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
    }
}
