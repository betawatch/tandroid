package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sg1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ zg1 b;

    public /* synthetic */ sg1(zg1 zg1Var, int i10) {
        this.a = i10;
        this.b = zg1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final zg1 zg1Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ug1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                zg1.b0(zg1Var, tL_error, tLObject);
                                break;
                            default:
                                zg1.h0(zg1Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new vg1(this.b, tL_error, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new vg1(this.b, tL_error, 1));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new vg1(this.b, tL_error, 2));
                break;
            default:
                final int i11 = 1;
                final zg1 zg1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ug1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                zg1.b0(zg1Var2, tL_error, tLObject);
                                break;
                            default:
                                zg1.h0(zg1Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
