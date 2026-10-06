package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class sn0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ so0 b;

    public /* synthetic */ sn0(so0 so0Var, int i10) {
        this.a = i10;
        this.b = so0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new wj0(10, this.b, tL_error));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new rn0(this.b, tL_error, tLObject, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ln0(this.b, tLObject, 2));
                break;
            default:
                AndroidUtilities.runOnUIThread(new ln0(this.b, tLObject, 0));
                break;
        }
    }
}
