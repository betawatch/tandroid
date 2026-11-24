// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class t92 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ba2 b;

    public /* synthetic */ t92(ba2 ba2Var, byte b) {
        this.a = b;
        this.b = ba2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        ba2 ba2Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new co1(ba2Var, tL_error, tLObject, (byte) 15));
                break;
            case 1:
                gm.c3(new v92(ba2Var, (byte) 1));
                break;
            default:
                ba2Var.getClass();
                gm.c3(new v92(ba2Var, (byte) 4));
                break;
        }
    }
}
