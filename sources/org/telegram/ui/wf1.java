package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wf1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ dg1 b;

    public /* synthetic */ wf1(dg1 dg1Var, int i10) {
        this.a = i10;
        this.b = dg1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final dg1 dg1Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.yf1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                dg1.c0(dg1Var, tL_error, tLObject);
                                break;
                            default:
                                dg1.i0(dg1Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new zf1(this.b, tL_error, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new zf1(this.b, tL_error, 1));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new zf1(this.b, tL_error, 2));
                break;
            default:
                final int i11 = 1;
                final dg1 dg1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.yf1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                dg1.c0(dg1Var2, tL_error, tLObject);
                                break;
                            default:
                                dg1.i0(dg1Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
