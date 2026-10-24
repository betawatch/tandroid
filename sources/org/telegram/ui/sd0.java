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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sd0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ xd0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ sd0(xd0 xd0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.b = xd0Var;
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
        xd0 xd0Var = this.b;
        switch (i11) {
            case 0:
                xd0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    xd0Var.s = password;
                    TwoStepVerificationActivity.m0(password);
                    xd0Var.n(str2, str);
                    break;
                }
                break;
            default:
                ig0 ig0Var = xd0Var.G;
                int i12 = 1;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.o2) ig0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new vd0(xd0Var, str2, str, i12), 8);
                    break;
                } else {
                    ig0Var.o1(false, true);
                    if (!(tLObject instanceof TLRPC.auth_Authorization)) {
                        if (tL_error != null) {
                            xd0Var.w = false;
                            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                                ig0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                                break;
                            } else {
                                int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                                ig0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                                break;
                            }
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ig0Var.getParentActivity());
                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new ks(23, xd0Var, tLObject));
                        boolean isEmpty = TextUtils.isEmpty(str2);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        if (isEmpty) {
                            c2Var.T = LocaleController.getString(R.string.YourPasswordReset);
                        } else {
                            c2Var.T = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
                        }
                        c2Var.R = LocaleController.getString(R.string.TwoStepVerificationTitle);
                        Dialog showDialog = ig0Var.showDialog(c2Var);
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

    public /* synthetic */ sd0(xd0 xd0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.b = xd0Var;
        this.c = tL_error;
        this.f = tLObject;
        this.d = str;
        this.e = str2;
    }
}
