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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qd0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ud0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ qd0(ud0 ud0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.b = ud0Var;
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
        ud0 ud0Var = this.b;
        switch (i11) {
            case 0:
                ud0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    ud0Var.s = password;
                    TwoStepVerificationActivity.m0(password);
                    ud0Var.o(str2, str);
                    break;
                }
                break;
            default:
                fg0 fg0Var = ud0Var.A;
                int i12 = 1;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new td0(ud0Var, str2, str, i12), 8);
                    break;
                } else {
                    fg0Var.k1(false, true);
                    if (!(tLObject instanceof TLRPC.auth_Authorization)) {
                        if (tL_error != null) {
                            ud0Var.w = false;
                            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                                break;
                            } else {
                                int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                                break;
                            }
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var.getParentActivity());
                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new xr(25, ud0Var, tLObject));
                        boolean isEmpty = TextUtils.isEmpty(str2);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        if (isEmpty) {
                            c2Var.P = LocaleController.getString(R.string.YourPasswordReset);
                        } else {
                            c2Var.P = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
                        }
                        c2Var.N = LocaleController.getString(R.string.TwoStepVerificationTitle);
                        Dialog showDialog = fg0Var.showDialog(c2Var);
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

    public /* synthetic */ qd0(ud0 ud0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.b = ud0Var;
        this.c = tL_error;
        this.f = tLObject;
        this.d = str;
        this.e = str2;
    }
}
