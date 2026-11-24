// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class yt2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jac b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ TLRPC.TL_error d;

    public /* synthetic */ yt2(jac jacVar, TLObject tLObject, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = jacVar;
        this.c = tLObject;
        this.d = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_error tL_error = this.d;
        TLObject tLObject = this.c;
        jac jacVar = this.b;
        switch (b) {
            case 0:
                jacVar.a(tLObject, tL_error);
                break;
            default:
                jacVar.a(tLObject instanceof TLRPC.TL_payments_starsRevenueStats ? ((TLRPC.TL_payments_starsRevenueStats) tLObject).status : null, tL_error);
                break;
        }
    }
}
