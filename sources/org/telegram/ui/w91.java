package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w91 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ab1 b;

    public /* synthetic */ w91(ab1 ab1Var, int i10) {
        this.a = i10;
        this.b = ab1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ab1.U(this.b, tLObject);
                break;
            default:
                ab1.V(this.b, tLObject);
                break;
        }
    }
}
