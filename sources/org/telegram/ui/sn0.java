package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sn0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ro0 b;

    public /* synthetic */ sn0(ro0 ro0Var, int i10) {
        this.a = i10;
        this.b = ro0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new am0(5, this.b, tL_error));
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
