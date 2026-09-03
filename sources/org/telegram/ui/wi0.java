package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wi0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ cj0 b;

    public /* synthetic */ wi0(cj0 cj0Var, int i10) {
        this.a = i10;
        this.b = cj0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final cj0 cj0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.vi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                cj0.U(cj0Var, tL_error, tLObject);
                                break;
                            case 1:
                                cj0.W(cj0Var, tL_error, tLObject);
                                break;
                            default:
                                cj0.V(cj0Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final cj0 cj0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.vi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                cj0.U(cj0Var2, tL_error, tLObject);
                                break;
                            case 1:
                                cj0.W(cj0Var2, tL_error, tLObject);
                                break;
                            default:
                                cj0.V(cj0Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i12 = 2;
                final cj0 cj0Var3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.vi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                cj0.U(cj0Var3, tL_error, tLObject);
                                break;
                            case 1:
                                cj0.W(cj0Var3, tL_error, tLObject);
                                break;
                            default:
                                cj0.V(cj0Var3, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
