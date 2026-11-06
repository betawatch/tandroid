package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u31 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c51 b;

    public /* synthetic */ u31(c51 c51Var, int i7) {
        this.a = i7;
        this.b = c51Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                c51.a0(this.b, tLObject);
                break;
            default:
                c51.Z(this.b, tLObject);
                break;
        }
    }
}
