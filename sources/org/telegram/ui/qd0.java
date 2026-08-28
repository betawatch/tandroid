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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qd0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ vd0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ qd0(vd0 vd0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.b = vd0Var;
        this.c = tL_error;
        this.d = str;
        this.e = str2;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9;
        int i10 = this.a;
        TLObject tLObject = this.f;
        String str = this.e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.c;
        vd0 vd0Var = this.b;
        switch (i10) {
            case 0:
                vd0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    vd0Var.s = password;
                    TwoStepVerificationActivity.l0(password);
                    vd0Var.o(str2, str);
                    break;
                }
                break;
            default:
                fg0 fg0Var = vd0Var.A;
                int i11 = 1;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i9 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                    ConnectionsManager.getInstance(i9).sendRequest(getpassword, new td0(vd0Var, str2, str, i11), 8);
                    break;
                } else {
                    fg0Var.k1(false, true);
                    if (!(tLObject instanceof TLRPC.auth_Authorization)) {
                        if (tL_error != null) {
                            vd0Var.w = false;
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
                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new yr(25, vd0Var, tLObject));
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

    public /* synthetic */ qd0(vd0 vd0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.b = vd0Var;
        this.c = tL_error;
        this.f = tLObject;
        this.d = str;
        this.e = str2;
    }
}
