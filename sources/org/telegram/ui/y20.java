package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y20 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ e60 b;

    public /* synthetic */ y20(e60 e60Var, int i10) {
        this.a = i10;
        this.b = e60Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                e60.u(this.b, tLObject);
                break;
            default:
                e60.s(this.b, tLObject);
                break;
        }
    }
}
