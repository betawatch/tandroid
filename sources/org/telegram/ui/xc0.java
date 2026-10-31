package org.telegram.ui;

import android.app.Dialog;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class xc0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ bd0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ xc0(bd0 bd0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.b = bd0Var;
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
        bd0 bd0Var = this.b;
        switch (i11) {
            case 0:
                bd0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    bd0Var.s = password;
                    TwoStepVerificationActivity.q0(password);
                    bd0Var.n(str2, str);
                    break;
                }
                break;
            default:
                hf0 hf0Var = bd0Var.G;
                int i12 = 1;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ad0(bd0Var, str2, str, i12), 8);
                    break;
                } else {
                    hf0Var.s1(false, true);
                    if (!(tLObject instanceof TLRPC.auth_Authorization)) {
                        if (tL_error != null) {
                            bd0Var.x = false;
                            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                                hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), tL_error.text);
                                break;
                            } else {
                                int intValue = Utilities.z(tL_error.text).intValue();
                                hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.cd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.cd.G(intValue / 60, "Minutes", new Object[0])));
                                break;
                            }
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hf0Var.getParentActivity());
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751771, null), new rv(20, bd0Var, tLObject));
                        boolean isEmpty = TextUtils.isEmpty(str2);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        if (isEmpty) {
                            x1Var.T = org.telegram.messenger.cd.L0(2131742824, null);
                        } else {
                            x1Var.T = org.telegram.messenger.cd.L0(2131742829, null);
                        }
                        x1Var.R = org.telegram.messenger.cd.L0(2131743956, null);
                        Dialog showDialog = hf0Var.showDialog(x1Var);
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

    public /* synthetic */ xc0(bd0 bd0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.b = bd0Var;
        this.c = tL_error;
        this.f = tLObject;
        this.d = str;
        this.e = str2;
    }
}
