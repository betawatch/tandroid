package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uf1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ bg1 b;

    public /* synthetic */ uf1(bg1 bg1Var, int i10) {
        this.a = i10;
        this.b = bg1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final bg1 bg1Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wf1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                bg1.b0(bg1Var, tL_error, tLObject);
                                break;
                            default:
                                bg1.h0(bg1Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new xf1(this.b, tL_error, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new xf1(this.b, tL_error, 1));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new xf1(this.b, tL_error, 2));
                break;
            default:
                final int i11 = 1;
                final bg1 bg1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wf1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                bg1.b0(bg1Var2, tL_error, tLObject);
                                break;
                            default:
                                bg1.h0(bg1Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
