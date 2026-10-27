package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ri0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ xi0 b;

    public /* synthetic */ ri0(xi0 xi0Var, int i10) {
        this.a = i10;
        this.b = xi0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final xi0 xi0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.qi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                xi0.V(xi0Var, tL_error, tLObject);
                                break;
                            case 1:
                                xi0.X(xi0Var, tL_error, tLObject);
                                break;
                            default:
                                xi0.W(xi0Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final xi0 xi0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.qi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                xi0.V(xi0Var2, tL_error, tLObject);
                                break;
                            case 1:
                                xi0.X(xi0Var2, tL_error, tLObject);
                                break;
                            default:
                                xi0.W(xi0Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i12 = 2;
                final xi0 xi0Var3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.qi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                xi0.V(xi0Var3, tL_error, tLObject);
                                break;
                            case 1:
                                xi0.X(xi0Var3, tL_error, tLObject);
                                break;
                            default:
                                xi0.W(xi0Var3, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
