package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uk0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ wk0 b;

    public /* synthetic */ uk0(wk0 wk0Var, int i10) {
        this.a = i10;
        this.b = wk0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new vk0(this.b, tLObject, tL_error));
                break;
            case 1:
                final int i10 = 1;
                final wk0 wk0Var = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.tk0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        int i12;
                        switch (i10) {
                            case 0:
                                wk0 wk0Var2 = wk0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                jl0 jl0Var = wk0Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.k2) jl0Var).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword, new uk0(wk0Var2, 4), 8);
                                    break;
                                } else {
                                    if (jl0Var.D == null) {
                                        jl0Var.D = new TL_account.authorizationForm();
                                    }
                                    wk0Var2.a();
                                    break;
                                }
                                break;
                            default:
                                wk0 wk0Var3 = wk0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i12 = ((org.telegram.ui.ActionBar.k2) wk0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i12).sendRequest(getpassword2, new uk0(wk0Var3, 3), 8);
                                    break;
                                } else {
                                    Utilities.e.c(new pd0(wk0Var3, wk0Var3.b, wk0Var3.d, 15));
                                    break;
                                }
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 0;
                final wk0 wk0Var2 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.tk0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        int i12;
                        switch (i11) {
                            case 0:
                                wk0 wk0Var22 = wk0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                jl0 jl0Var = wk0Var22.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i112 = ((org.telegram.ui.ActionBar.k2) jl0Var).currentAccount;
                                    ConnectionsManager.getInstance(i112).sendRequest(getpassword, new uk0(wk0Var22, 4), 8);
                                    break;
                                } else {
                                    if (jl0Var.D == null) {
                                        jl0Var.D = new TL_account.authorizationForm();
                                    }
                                    wk0Var22.a();
                                    break;
                                }
                                break;
                            default:
                                wk0 wk0Var3 = wk0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i12 = ((org.telegram.ui.ActionBar.k2) wk0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i12).sendRequest(getpassword2, new uk0(wk0Var3, 3), 8);
                                    break;
                                } else {
                                    Utilities.e.c(new pd0(wk0Var3, wk0Var3.b, wk0Var3.d, 15));
                                    break;
                                }
                        }
                    }
                });
                break;
            case 3:
                org.telegram.messenger.i0.g3(new vk0(this.b, tL_error, tLObject, 1));
                break;
            default:
                org.telegram.messenger.i0.g3(new vk0(this.b, tL_error, tLObject, 2));
                break;
        }
    }
}
