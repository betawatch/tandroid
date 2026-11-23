package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.voip.o(20, this.b, tLObject));
                break;
            default:
                org.telegram.messenger.g0.g3(new up(this.b, tL_error, tLObject, 6));
                break;
        }
    }
}
