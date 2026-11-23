package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class u31 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ b51 b;

    public /* synthetic */ u31(b51 b51Var, int i7) {
        this.a = i7;
        this.b = b51Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                b51.a0(this.b, tLObject);
                break;
            default:
                b51.Z(this.b, tLObject);
                break;
        }
    }
}
