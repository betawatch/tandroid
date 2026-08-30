package org.telegram.ui;

import android.app.Dialog;
import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zd0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ de0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ zd0(de0 de0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.b = de0Var;
        this.c = tL_error;
        this.d = str;
        this.e = str2;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11 = this.a;
        TLObject tLObject = this.f;
        String str = this.e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.c;
        de0 de0Var = this.b;
        switch (i11) {
            case 0:
                de0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    de0Var.s = password;
                    TwoStepVerificationActivity.m0(password);
                    de0Var.o(str2, str);
                    break;
                }
                break;
            default:
                ng0 ng0Var = de0Var.B;
                int i12 = 1;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.p2) ng0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ce0(de0Var, str2, str, i12), 8);
                    break;
                } else {
                    ng0Var.k1(false, true);
                    if (!(tLObject instanceof TLRPC.auth_Authorization)) {
                        if (tL_error != null) {
                            de0Var.w = false;
                            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                                ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                                break;
                            } else {
                                int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                                ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                                break;
                            }
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ng0Var.getParentActivity());
                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new qs(24, de0Var, tLObject));
                        boolean isEmpty = TextUtils.isEmpty(str2);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        if (isEmpty) {
                            d2Var.Q = LocaleController.getString(R.string.YourPasswordReset);
                        } else {
                            d2Var.Q = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
                        }
                        d2Var.O = LocaleController.getString(R.string.TwoStepVerificationTitle);
                        Dialog showDialog = ng0Var.showDialog(d2Var);
                        if (showDialog != null) {
                            showDialog.setCanceledOnTouchOutside(false);
                            showDialog.setCancelable(false);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ zd0(de0 de0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.b = de0Var;
        this.c = tL_error;
        this.f = tLObject;
        this.d = str;
        this.e = str2;
    }
}
