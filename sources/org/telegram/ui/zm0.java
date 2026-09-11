package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class zm0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn0 b;

    public /* synthetic */ zm0(bn0 bn0Var, int i10) {
        this.a = i10;
        this.b = bn0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new an0(this.b, tLObject, tL_error));
                break;
            case 1:
                final int i10 = 1;
                final bn0 bn0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ym0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        int i12;
                        switch (i10) {
                            case 0:
                                bn0 bn0Var2 = bn0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                pn0 pn0Var = bn0Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.n2) pn0Var).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword, new zm0(bn0Var2, 4), 8);
                                    break;
                                } else {
                                    if (pn0Var.y == null) {
                                        pn0Var.y = new TL_account.authorizationForm();
                                    }
                                    bn0Var2.a();
                                    break;
                                }
                                break;
                            default:
                                bn0 bn0Var3 = bn0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i12 = ((org.telegram.ui.ActionBar.n2) bn0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i12).sendRequest(getpassword2, new zm0(bn0Var3, 3), 8);
                                    break;
                                } else {
                                    Utilities.globalQueue.postRunnable(new pf0(bn0Var3, bn0Var3.b, bn0Var3.d, 12));
                                    break;
                                }
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 0;
                final bn0 bn0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ym0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        int i12;
                        switch (i11) {
                            case 0:
                                bn0 bn0Var22 = bn0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                pn0 pn0Var = bn0Var22.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i112 = ((org.telegram.ui.ActionBar.n2) pn0Var).currentAccount;
                                    ConnectionsManager.getInstance(i112).sendRequest(getpassword, new zm0(bn0Var22, 4), 8);
                                    break;
                                } else {
                                    if (pn0Var.y == null) {
                                        pn0Var.y = new TL_account.authorizationForm();
                                    }
                                    bn0Var22.a();
                                    break;
                                }
                                break;
                            default:
                                bn0 bn0Var3 = bn0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i12 = ((org.telegram.ui.ActionBar.n2) bn0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i12).sendRequest(getpassword2, new zm0(bn0Var3, 3), 8);
                                    break;
                                } else {
                                    Utilities.globalQueue.postRunnable(new pf0(bn0Var3, bn0Var3.b, bn0Var3.d, 12));
                                    break;
                                }
                        }
                    }
                });
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new an0(this.b, tL_error, tLObject, 1));
                break;
            default:
                AndroidUtilities.runOnUIThread(new an0(this.b, tL_error, tLObject, 2));
                break;
        }
    }
}
