package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xi0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ dj0 b;

    public /* synthetic */ xi0(dj0 dj0Var, int i10) {
        this.a = i10;
        this.b = dj0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final dj0 dj0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                dj0.U(dj0Var, tL_error, tLObject);
                                break;
                            case 1:
                                dj0.W(dj0Var, tL_error, tLObject);
                                break;
                            default:
                                dj0.V(dj0Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final dj0 dj0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                dj0.U(dj0Var2, tL_error, tLObject);
                                break;
                            case 1:
                                dj0.W(dj0Var2, tL_error, tLObject);
                                break;
                            default:
                                dj0.V(dj0Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i12 = 2;
                final dj0 dj0Var3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                dj0.U(dj0Var3, tL_error, tLObject);
                                break;
                            case 1:
                                dj0.W(dj0Var3, tL_error, tLObject);
                                break;
                            default:
                                dj0.V(dj0Var3, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
