package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sf1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ zf1 b;

    public /* synthetic */ sf1(zf1 zf1Var, int i10) {
        this.a = i10;
        this.b = zf1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final zf1 zf1Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.uf1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                zf1.b0(zf1Var, tL_error, tLObject);
                                break;
                            default:
                                zf1.h0(zf1Var, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new vf1(this.b, tL_error, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new vf1(this.b, tL_error, 1));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new vf1(this.b, tL_error, 2));
                break;
            default:
                final int i11 = 1;
                final zf1 zf1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.uf1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                zf1.b0(zf1Var2, tL_error, tLObject);
                                break;
                            default:
                                zf1.h0(zf1Var2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
