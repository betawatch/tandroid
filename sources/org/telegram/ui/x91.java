package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class x91 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ bb1 b;

    public /* synthetic */ x91(bb1 bb1Var, int i10) {
        this.a = i10;
        this.b = bb1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                bb1.U(this.b, tLObject);
                break;
            default:
                bb1.V(this.b, tLObject);
                break;
        }
    }
}
