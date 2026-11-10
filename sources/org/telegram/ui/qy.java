package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qy implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ jz b;

    public /* synthetic */ qy(jz jzVar, int i7) {
        this.a = i7;
        this.b = jzVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.h41(24, this.b, tLObject));
                break;
            default:
                org.telegram.messenger.g0.h3(new tp(this.b, tL_error, tLObject, 6));
                break;
        }
    }
}
