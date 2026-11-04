package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zj0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ dl0 b;

    public /* synthetic */ zj0(dl0 dl0Var, int i3) {
        this.a = i3;
        this.b = dl0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new ck0(this.b, tLObject, 0));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new tb0(28, this.b, tL_error));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new ck0(this.b, tLObject, 2));
                break;
            default:
                org.telegram.messenger.g0.h3(new gk0(this.b, tL_error, tLObject, 0));
                break;
        }
    }
}
