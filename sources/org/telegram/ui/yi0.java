package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class yi0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ej0 b;

    public /* synthetic */ yi0(ej0 ej0Var, int i10) {
        this.a = i10;
        this.b = ej0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final ej0 ej0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                ej0.U(ej0Var, tL_error, tLObject);
                                break;
                            case 1:
                                ej0.W(ej0Var, tL_error, tLObject);
                                break;
                            default:
                                ej0.V(ej0Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final ej0 ej0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                ej0.U(ej0Var2, tL_error, tLObject);
                                break;
                            case 1:
                                ej0.W(ej0Var2, tL_error, tLObject);
                                break;
                            default:
                                ej0.V(ej0Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i12 = 2;
                final ej0 ej0Var3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                ej0.U(ej0Var3, tL_error, tLObject);
                                break;
                            case 1:
                                ej0.W(ej0Var3, tL_error, tLObject);
                                break;
                            default:
                                ej0.V(ej0Var3, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
