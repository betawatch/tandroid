package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class v91 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ za1 b;

    public /* synthetic */ v91(za1 za1Var, int i10) {
        this.a = i10;
        this.b = za1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                za1.U(this.b, tLObject);
                break;
            default:
                za1.V(this.b, tLObject);
                break;
        }
    }
}
