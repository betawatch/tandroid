package org.telegram.ui;

import android.text.TextUtils;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ul0 implements r9 {
    public final /* synthetic */ wm0 a;

    public ul0(wm0 wm0Var) {
        this.a = wm0Var;
    }

    @Override // org.telegram.ui.r9
    public final /* synthetic */ String C0() {
        return null;
    }

    @Override // org.telegram.ui.r9
    public final void T0(MrzRecognizer.Result result) {
        boolean isEmpty = TextUtils.isEmpty(result.firstName);
        wm0 wm0Var = this.a;
        if (!isEmpty) {
            wm0Var.U[0].setText(result.firstName);
        }
        if (!TextUtils.isEmpty(result.middleName)) {
            wm0Var.U[1].setText(result.middleName);
        }
        if (!TextUtils.isEmpty(result.lastName)) {
            wm0Var.U[2].setText(result.lastName);
        }
        int i9 = result.gender;
        if (i9 != 0) {
            if (i9 == 1) {
                wm0Var.w = "male";
                wm0Var.U[4].setText(LocaleController.getString(R.string.PassportMale));
            } else if (i9 == 2) {
                wm0Var.w = "female";
                wm0Var.U[4].setText(LocaleController.getString(R.string.PassportFemale));
            }
        }
        if (!TextUtils.isEmpty(result.nationality)) {
            String str = result.nationality;
            wm0Var.s = str;
            String str2 = (String) wm0Var.U0.get(str);
            if (str2 != null) {
                wm0Var.U[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(result.issuingCountry)) {
            String str3 = result.issuingCountry;
            wm0Var.v = str3;
            String str4 = (String) wm0Var.U0.get(str3);
            if (str4 != null) {
                wm0Var.U[6].setText(str4);
            }
        }
        int i10 = result.birthDay;
        if (i10 <= 0 || result.birthMonth <= 0 || result.birthYear <= 0) {
            return;
        }
        wm0Var.U[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i10), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
    }

    @Override // org.telegram.ui.r9
    public final /* synthetic */ boolean i1(String str, j9 j9Var) {
        return false;
    }

    @Override // org.telegram.ui.r9
    public final /* synthetic */ void K(String str) {
    }

    @Override // org.telegram.ui.r9
    public final /* synthetic */ void onDismiss() {
    }
}
