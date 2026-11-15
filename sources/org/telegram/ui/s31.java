package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class s31 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ z41 b;

    public /* synthetic */ s31(z41 z41Var, int i7) {
        this.a = i7;
        this.b = z41Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                z41.a0(this.b, tLObject);
                break;
            default:
                z41.Z(this.b, tLObject);
                break;
        }
    }
}
