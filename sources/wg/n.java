package wg;

import org.telegram.messenger.y10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ y10 b;
    public final /* synthetic */ y10 c;

    public /* synthetic */ n(y10 y10Var, y10 y10Var2, int i7) {
        this.a = i7;
        this.b = y10Var;
        this.c = y10Var2;
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
