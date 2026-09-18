package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yn0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ yo0 b;

    public /* synthetic */ yn0(yo0 yo0Var, int i10) {
        this.a = i10;
        this.b = yo0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new pl0(7, this.b, tL_error));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new xn0(this.b, tL_error, tLObject, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new rn0(this.b, tLObject, 2));
                break;
            default:
                AndroidUtilities.runOnUIThread(new rn0(this.b, tLObject, 0));
                break;
        }
    }
}
