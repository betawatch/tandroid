package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class y20 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ d60 b;

    public /* synthetic */ y20(d60 d60Var, int i10) {
        this.a = i10;
        this.b = d60Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                d60.u(this.b, tLObject);
                break;
            default:
                d60.s(this.b, tLObject);
                break;
        }
    }
}
