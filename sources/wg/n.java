package wg;

import org.telegram.messenger.x10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ x10 b;
    public final /* synthetic */ x10 c;

    public /* synthetic */ n(x10 x10Var, x10 x10Var2, int i7) {
        this.a = i7;
        this.b = x10Var;
        this.c = x10Var2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new p(tL_error, this.b, this.c, 0));
                break;
            default:
                org.telegram.messenger.g0.g3(new p4.s0(tL_error, this.b, tLObject, this.c, 6));
                break;
        }
    }
}
