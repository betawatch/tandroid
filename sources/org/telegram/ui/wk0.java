package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class wk0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ yk0 b;

    public /* synthetic */ wk0(yk0 yk0Var, int i10) {
        this.a = i10;
        this.b = yk0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new xk0(this.b, tLObject, tL_error));
                break;
            case 1:
                final int i10 = 1;
                final yk0 yk0Var = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.vk0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        int i12;
                        switch (i10) {
                            case 0:
                                yk0 yk0Var2 = yk0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                ll0 ll0Var = yk0Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.k2) ll0Var).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword, new wk0(yk0Var2, 4), 8);
                                    break;
                                } else {
                                    if (ll0Var.D == null) {
                                        ll0Var.D = new TL_account.authorizationForm();
                                    }
                                    yk0Var2.a();
                                    break;
                                }
                                break;
                            default:
                                yk0 yk0Var3 = yk0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i12 = ((org.telegram.ui.ActionBar.k2) yk0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i12).sendRequest(getpassword2, new wk0(yk0Var3, 3), 8);
                                    break;
                                } else {
                                    Utilities.e.c(new qd0(yk0Var3, yk0Var3.b, yk0Var3.d, 15));
                                    break;
                                }
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 0;
                final yk0 yk0Var2 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.vk0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        int i12;
                        switch (i11) {
                            case 0:
                                yk0 yk0Var22 = yk0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                ll0 ll0Var = yk0Var22.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i112 = ((org.telegram.ui.ActionBar.k2) ll0Var).currentAccount;
                                    ConnectionsManager.getInstance(i112).sendRequest(getpassword, new wk0(yk0Var22, 4), 8);
                                    break;
                                } else {
                                    if (ll0Var.D == null) {
                                        ll0Var.D = new TL_account.authorizationForm();
                                    }
                                    yk0Var22.a();
                                    break;
                                }
                                break;
                            default:
                                yk0 yk0Var3 = yk0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i12 = ((org.telegram.ui.ActionBar.k2) yk0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i12).sendRequest(getpassword2, new wk0(yk0Var3, 3), 8);
                                    break;
                                } else {
                                    Utilities.e.c(new qd0(yk0Var3, yk0Var3.b, yk0Var3.d, 15));
                                    break;
                                }
                        }
                    }
                });
                break;
            case 3:
                org.telegram.messenger.i0.g3(new xk0(this.b, tL_error, tLObject, 1));
                break;
            default:
                org.telegram.messenger.i0.g3(new xk0(this.b, tL_error, tLObject, 2));
                break;
        }
    }
}
