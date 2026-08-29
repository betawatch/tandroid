package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vf1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ cg1 b;

    public /* synthetic */ vf1(cg1 cg1Var, int i10) {
        this.a = i10;
        this.b = cg1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final cg1 cg1Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xf1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                cg1.b0(cg1Var, tL_error, tLObject);
                                break;
                            default:
                                cg1.h0(cg1Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new yf1(this.b, tL_error, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new yf1(this.b, tL_error, 1));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new yf1(this.b, tL_error, 2));
                break;
            default:
                final int i11 = 1;
                final cg1 cg1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xf1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                cg1.b0(cg1Var2, tL_error, tLObject);
                                break;
                            default:
                                cg1.h0(cg1Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
