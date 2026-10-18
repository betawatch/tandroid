package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qi0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ wi0 b;

    public /* synthetic */ qi0(wi0 wi0Var, int i10) {
        this.a = i10;
        this.b = wi0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final wi0 wi0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                wi0.U(wi0Var, tL_error, tLObject);
                                break;
                            case 1:
                                wi0.W(wi0Var, tL_error, tLObject);
                                break;
                            default:
                                wi0.V(wi0Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final wi0 wi0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                wi0.U(wi0Var2, tL_error, tLObject);
                                break;
                            case 1:
                                wi0.W(wi0Var2, tL_error, tLObject);
                                break;
                            default:
                                wi0.V(wi0Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i12 = 2;
                final wi0 wi0Var3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.pi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                wi0.U(wi0Var3, tL_error, tLObject);
                                break;
                            case 1:
                                wi0.W(wi0Var3, tL_error, tLObject);
                                break;
                            default:
                                wi0.V(wi0Var3, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
