package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ui0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ aj0 b;

    public /* synthetic */ ui0(aj0 aj0Var, int i10) {
        this.a = i10;
        this.b = aj0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final aj0 aj0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ti0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                aj0.U(aj0Var, tL_error, tLObject);
                                break;
                            case 1:
                                aj0.W(aj0Var, tL_error, tLObject);
                                break;
                            default:
                                aj0.V(aj0Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final aj0 aj0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ti0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                aj0.U(aj0Var2, tL_error, tLObject);
                                break;
                            case 1:
                                aj0.W(aj0Var2, tL_error, tLObject);
                                break;
                            default:
                                aj0.V(aj0Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i12 = 2;
                final aj0 aj0Var3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ti0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                aj0.U(aj0Var3, tL_error, tLObject);
                                break;
                            case 1:
                                aj0.W(aj0Var3, tL_error, tLObject);
                                break;
                            default:
                                aj0.V(aj0Var3, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
