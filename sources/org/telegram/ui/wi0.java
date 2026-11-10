package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wi0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ek0 b;

    public /* synthetic */ wi0(ek0 ek0Var, int i7) {
        this.a = i7;
        this.b = ek0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new pc0(this.b, tL_error, tLObject, 12));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new tc0(22, this.b, tL_error));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new si0(this.b, 5));
                break;
            default:
                org.telegram.messenger.g0.h3(new tc0(21, this.b, tLObject));
                break;
        }
    }
}
