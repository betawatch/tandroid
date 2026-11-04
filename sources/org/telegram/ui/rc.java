package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rc implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ad b;

    public /* synthetic */ rc(ad adVar, int i3) {
        this.a = i3;
        this.b = adVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new sc(1, this.b, tLObject));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new org.telegram.messenger.voip.l0(29, this.b, tL_error));
                break;
            case 2:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.g0.h3(new qc(this.b, 3));
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.h3(new p1(this.b, tL_error, tLObject, 11));
                break;
        }
    }
}
