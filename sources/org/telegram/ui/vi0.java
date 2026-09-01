package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vi0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ bj0 b;

    public /* synthetic */ vi0(bj0 bj0Var, int i10) {
        this.a = i10;
        this.b = bj0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final bj0 bj0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ui0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                bj0.U(bj0Var, tL_error, tLObject);
                                break;
                            case 1:
                                bj0.W(bj0Var, tL_error, tLObject);
                                break;
                            default:
                                bj0.V(bj0Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final bj0 bj0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ui0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                bj0.U(bj0Var2, tL_error, tLObject);
                                break;
                            case 1:
                                bj0.W(bj0Var2, tL_error, tLObject);
                                break;
                            default:
                                bj0.V(bj0Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i12 = 2;
                final bj0 bj0Var3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ui0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                bj0.U(bj0Var3, tL_error, tLObject);
                                break;
                            case 1:
                                bj0.W(bj0Var3, tL_error, tLObject);
                                break;
                            default:
                                bj0.V(bj0Var3, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
