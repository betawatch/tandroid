package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
