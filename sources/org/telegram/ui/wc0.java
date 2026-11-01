package org.telegram.ui;

import android.app.Dialog;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wc0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ad0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ wc0(ad0 ad0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.b = ad0Var;
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
        ad0 ad0Var = this.b;
        switch (i11) {
            case 0:
                ad0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    ad0Var.s = password;
                    TwoStepVerificationActivity.r0(password);
                    ad0Var.n(str2, str);
                    break;
                }
                break;
            default:
                gf0 gf0Var = ad0Var.G;
                int i12 = 1;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.k2) gf0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new zc0(ad0Var, str2, str, i12), 8);
                    break;
                } else {
                    gf0Var.t1(false, true);
                    if (!(tLObject instanceof TLRPC.auth_Authorization)) {
                        if (tL_error != null) {
                            ad0Var.x = false;
                            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                                gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), tL_error.text);
                                break;
                            } else {
                                int intValue = Utilities.z(tL_error.text).intValue();
                                gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.dd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.dd.G(intValue / 60, "Minutes", new Object[0])));
                                break;
                            }
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gf0Var.getParentActivity());
                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751771, null), new qv(20, ad0Var, tLObject));
                        boolean isEmpty = TextUtils.isEmpty(str2);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        if (isEmpty) {
                            x1Var.T = org.telegram.messenger.dd.L0(2131742824, null);
                        } else {
                            x1Var.T = org.telegram.messenger.dd.L0(2131742829, null);
                        }
                        x1Var.R = org.telegram.messenger.dd.L0(2131743956, null);
                        Dialog showDialog = gf0Var.showDialog(x1Var);
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

    public /* synthetic */ wc0(ad0 ad0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.b = ad0Var;
        this.c = tL_error;
        this.f = tLObject;
        this.d = str;
        this.e = str2;
    }
}
