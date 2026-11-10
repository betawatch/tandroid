package org.telegram.ui;

import android.app.Dialog;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sb0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ xb0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ sb0(xb0 xb0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.b = xb0Var;
        this.c = tL_error;
        this.d = str;
        this.e = str2;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        int i10 = this.a;
        TLObject tLObject = this.f;
        String str = this.e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.c;
        xb0 xb0Var = this.b;
        switch (i10) {
            case 0:
                xb0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    xb0Var.s = password;
                    TwoStepVerificationActivity.r0(password);
                    xb0Var.n(str2, str);
                    break;
                }
                break;
            default:
                fe0 fe0Var = xb0Var.G;
                int i11 = 1;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i7 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new vb0(xb0Var, str2, str, i11), 8);
                    break;
                } else {
                    fe0Var.C1(false, true);
                    if (!(tLObject instanceof TLRPC.auth_Authorization)) {
                        if (tL_error != null) {
                            xb0Var.x = false;
                            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                                fe0Var.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error.text);
                                break;
                            } else {
                                int intValue = Utilities.z(tL_error.text).intValue();
                                fe0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750686, intValue < 60 ? org.telegram.messenger.id.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.id.G(intValue / 60, "Minutes", new Object[0])));
                                break;
                            }
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fe0Var.getParentActivity());
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751771, null), new su(19, xb0Var, tLObject));
                        boolean isEmpty = TextUtils.isEmpty(str2);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        if (isEmpty) {
                            u1Var.T = org.telegram.messenger.id.M0(2131742799, null);
                        } else {
                            u1Var.T = org.telegram.messenger.id.M0(2131742804, null);
                        }
                        u1Var.R = org.telegram.messenger.id.M0(2131743931, null);
                        Dialog showDialog = fe0Var.showDialog(u1Var);
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

    public /* synthetic */ sb0(xb0 xb0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.b = xb0Var;
        this.c = tL_error;
        this.f = tLObject;
        this.d = str;
        this.e = str2;
    }
}
