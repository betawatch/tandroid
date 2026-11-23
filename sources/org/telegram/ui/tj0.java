package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class tj0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ vj0 b;

    public /* synthetic */ tj0(vj0 vj0Var, int i7) {
        this.a = i7;
        this.b = vj0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new uj0(this.b, tLObject, tL_error));
                break;
            case 1:
                final int i7 = 1;
                final vj0 vj0Var = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.sj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10;
                        int i11;
                        switch (i7) {
                            case 0:
                                vj0 vj0Var2 = vj0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                hk0 hk0Var = vj0Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.g2) hk0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new tj0(vj0Var2, 4), 8);
                                    break;
                                } else {
                                    if (hk0Var.E == null) {
                                        hk0Var.E = new TL_account.authorizationForm();
                                    }
                                    vj0Var2.a();
                                    break;
                                }
                                break;
                            default:
                                vj0 vj0Var3 = vj0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.g2) vj0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new tj0(vj0Var3, 3), 8);
                                    break;
                                } else {
                                    Utilities.e.c(new mc0(vj0Var3, vj0Var3.b, vj0Var3.d, 14));
                                    break;
                                }
                        }
                    }
                });
                break;
            case 2:
                final int i10 = 0;
                final vj0 vj0Var2 = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.sj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102;
                        int i11;
                        switch (i10) {
                            case 0:
                                vj0 vj0Var22 = vj0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                hk0 hk0Var = vj0Var22.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i102 = ((org.telegram.ui.ActionBar.g2) hk0Var).currentAccount;
                                    ConnectionsManager.getInstance(i102).sendRequest(getpassword, new tj0(vj0Var22, 4), 8);
                                    break;
                                } else {
                                    if (hk0Var.E == null) {
                                        hk0Var.E = new TL_account.authorizationForm();
                                    }
                                    vj0Var22.a();
                                    break;
                                }
                                break;
                            default:
                                vj0 vj0Var3 = vj0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.g2) vj0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new tj0(vj0Var3, 3), 8);
                                    break;
                                } else {
                                    Utilities.e.c(new mc0(vj0Var3, vj0Var3.b, vj0Var3.d, 14));
                                    break;
                                }
                        }
                    }
                });
                break;
            case 3:
                org.telegram.messenger.g0.g3(new uj0(this.b, tL_error, tLObject, 1));
                break;
            default:
                org.telegram.messenger.g0.g3(new uj0(this.b, tL_error, tLObject, 2));
                break;
        }
    }
}
