package org.telegram.ui;

import android.text.TextUtils;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class vl0 implements s9 {
    public final /* synthetic */ xm0 a;

    public vl0(xm0 xm0Var) {
        this.a = xm0Var;
    }

    @Override // org.telegram.ui.s9
    public final void T0(MrzRecognizer.Result result) {
        boolean isEmpty = TextUtils.isEmpty(result.firstName);
        xm0 xm0Var = this.a;
        if (!isEmpty) {
            xm0Var.U[0].setText(result.firstName);
        }
        if (!TextUtils.isEmpty(result.middleName)) {
            xm0Var.U[1].setText(result.middleName);
        }
        if (!TextUtils.isEmpty(result.lastName)) {
            xm0Var.U[2].setText(result.lastName);
        }
        int i10 = result.gender;
        if (i10 != 0) {
            if (i10 == 1) {
                xm0Var.w = "male";
                xm0Var.U[4].setText(LocaleController.getString(R.string.PassportMale));
            } else if (i10 == 2) {
                xm0Var.w = "female";
                xm0Var.U[4].setText(LocaleController.getString(R.string.PassportFemale));
            }
        }
        if (!TextUtils.isEmpty(result.nationality)) {
            String str = result.nationality;
            xm0Var.s = str;
            String str2 = (String) xm0Var.U0.get(str);
            if (str2 != null) {
                xm0Var.U[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(result.issuingCountry)) {
            String str3 = result.issuingCountry;
            xm0Var.v = str3;
            String str4 = (String) xm0Var.U0.get(str3);
            if (str4 != null) {
                xm0Var.U[6].setText(str4);
            }
        }
        int i11 = result.birthDay;
        if (i11 <= 0 || result.birthMonth <= 0 || result.birthYear <= 0) {
            return;
        }
        xm0Var.U[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i11), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
    }

    @Override // org.telegram.ui.s9
    public final /* synthetic */ boolean i1(String str, k9 k9Var) {
        return false;
    }

    @Override // org.telegram.ui.s9
    public final /* synthetic */ String z0() {
        return null;
    }

    @Override // org.telegram.ui.s9
    public final /* synthetic */ void C(String str) {
    }

    @Override // org.telegram.ui.s9
    public final /* synthetic */ void onDismiss() {
    }
}
