package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class ug1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ bh1 b;

    public /* synthetic */ ug1(bh1 bh1Var, int i10) {
        this.a = i10;
        this.b = bh1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final bh1 bh1Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wg1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                bh1.b0(bh1Var, tL_error, tLObject);
                                break;
                            default:
                                bh1.h0(bh1Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new xg1(this.b, tL_error, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new xg1(this.b, tL_error, 1));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new xg1(this.b, tL_error, 2));
                break;
            default:
                final int i11 = 1;
                final bh1 bh1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wg1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                bh1.b0(bh1Var2, tL_error, tLObject);
                                break;
                            default:
                                bh1.h0(bh1Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
