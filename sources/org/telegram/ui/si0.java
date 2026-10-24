package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class si0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ yi0 b;

    public /* synthetic */ si0(yi0 yi0Var, int i10) {
        this.a = i10;
        this.b = yi0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final yi0 yi0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ri0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                yi0.U(yi0Var, tL_error, tLObject);
                                break;
                            case 1:
                                yi0.W(yi0Var, tL_error, tLObject);
                                break;
                            default:
                                yi0.V(yi0Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final yi0 yi0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ri0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                yi0.U(yi0Var2, tL_error, tLObject);
                                break;
                            case 1:
                                yi0.W(yi0Var2, tL_error, tLObject);
                                break;
                            default:
                                yi0.V(yi0Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i12 = 2;
                final yi0 yi0Var3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ri0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                yi0.U(yi0Var3, tL_error, tLObject);
                                break;
                            case 1:
                                yi0.W(yi0Var3, tL_error, tLObject);
                                break;
                            default:
                                yi0.V(yi0Var3, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
