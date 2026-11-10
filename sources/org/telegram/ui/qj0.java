package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qj0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ sj0 b;

    public /* synthetic */ qj0(sj0 sj0Var, int i7) {
        this.a = i7;
        this.b = sj0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new rj0(this.b, tLObject, tL_error));
                break;
            case 1:
                final int i7 = 1;
                final sj0 sj0Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.pj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10;
                        int i11;
                        switch (i7) {
                            case 0:
                                sj0 sj0Var2 = sj0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                ek0 ek0Var = sj0Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.f2) ek0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new qj0(sj0Var2, 4), 8);
                                    break;
                                } else {
                                    if (ek0Var.D == null) {
                                        ek0Var.D = new TL_account.authorizationForm();
                                    }
                                    sj0Var2.a();
                                    break;
                                }
                                break;
                            default:
                                sj0 sj0Var3 = sj0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.f2) sj0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new qj0(sj0Var3, 3), 8);
                                    break;
                                } else {
                                    Utilities.e.c(new pc0(sj0Var3, sj0Var3.b, sj0Var3.d, 14));
                                    break;
                                }
                        }
                    }
                });
                break;
            case 2:
                final int i10 = 0;
                final sj0 sj0Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.pj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102;
                        int i11;
                        switch (i10) {
                            case 0:
                                sj0 sj0Var22 = sj0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                ek0 ek0Var = sj0Var22.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i102 = ((org.telegram.ui.ActionBar.f2) ek0Var).currentAccount;
                                    ConnectionsManager.getInstance(i102).sendRequest(getpassword, new qj0(sj0Var22, 4), 8);
                                    break;
                                } else {
                                    if (ek0Var.D == null) {
                                        ek0Var.D = new TL_account.authorizationForm();
                                    }
                                    sj0Var22.a();
                                    break;
                                }
                                break;
                            default:
                                sj0 sj0Var3 = sj0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.f2) sj0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new qj0(sj0Var3, 3), 8);
                                    break;
                                } else {
                                    Utilities.e.c(new pc0(sj0Var3, sj0Var3.b, sj0Var3.d, 14));
                                    break;
                                }
                        }
                    }
                });
                break;
            case 3:
                org.telegram.messenger.g0.h3(new rj0(this.b, tL_error, tLObject, 1));
                break;
            default:
                org.telegram.messenger.g0.h3(new rj0(this.b, tL_error, tLObject, 2));
                break;
        }
    }
}
