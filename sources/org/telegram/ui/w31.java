package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w31 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ e51 b;

    public /* synthetic */ w31(e51 e51Var, int i7) {
        this.a = i7;
        this.b = e51Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                e51.a0(this.b, tLObject);
                break;
            default:
                e51.Z(this.b, tLObject);
                break;
        }
    }
}
