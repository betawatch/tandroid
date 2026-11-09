package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class v31 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ d51 b;

    public /* synthetic */ v31(d51 d51Var, int i7) {
        this.a = i7;
        this.b = d51Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                d51.a0(this.b, tLObject);
                break;
            default:
                d51.Z(this.b, tLObject);
                break;
        }
    }
}
