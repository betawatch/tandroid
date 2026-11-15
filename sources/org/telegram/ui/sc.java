package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class sc implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ad b;

    public /* synthetic */ sc(ad adVar, int i7) {
        this.a = i7;
        this.b = adVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new u5(15, this.b, tLObject));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new u5(13, this.b, tL_error));
                break;
            case 2:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.g0.h3(new rc(this.b, 3));
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.h3(new o1(this.b, tL_error, tLObject, 11));
                break;
        }
    }
}
