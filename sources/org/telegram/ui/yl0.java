package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yl0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ kn0 b;

    public /* synthetic */ yl0(kn0 kn0Var, int i10) {
        this.a = i10;
        this.b = kn0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                kn0 kn0Var = this.b;
                AndroidUtilities.runOnUIThread(new ne0(kn0Var, tL_error, tLObject, false, 14));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new am0(2, this.b, tL_error));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ul0(this.b, 5));
                break;
            default:
                AndroidUtilities.runOnUIThread(new am0(1, this.b, tLObject));
                break;
        }
    }
}
