package wg;

import org.telegram.messenger.w10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ w10 b;
    public final /* synthetic */ w10 c;

    public /* synthetic */ n(w10 w10Var, w10 w10Var2, int i7) {
        this.a = i7;
        this.b = w10Var;
        this.c = w10Var2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new p(tL_error, this.b, this.c, 1));
                break;
            default:
                org.telegram.messenger.g0.g3(new p4.l0(tL_error, this.b, tLObject, this.c, 7));
                break;
        }
    }
}
