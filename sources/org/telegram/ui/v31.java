package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v31 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c51 b;

    public /* synthetic */ v31(c51 c51Var, int i7) {
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
