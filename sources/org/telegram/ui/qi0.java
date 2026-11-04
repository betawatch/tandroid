package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qi0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ yj0 b;

    public /* synthetic */ qi0(yj0 yj0Var, int i3) {
        this.a = i3;
        this.b = yj0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                yj0 yj0Var = this.b;
                org.telegram.messenger.g0.h3(new hc0(yj0Var, tL_error, tLObject, false, 13));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new tb0(25, this.b, tL_error));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new mi0(this.b, 5));
                break;
            default:
                org.telegram.messenger.g0.h3(new tb0(24, this.b, tLObject));
                break;
        }
    }
}
