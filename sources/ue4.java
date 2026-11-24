// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ue4 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qf4 b;

    public /* synthetic */ ue4(qf4 qf4Var, byte b) {
        this.a = b;
        this.b = qf4Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        qf4 qf4Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new ve4(qf4Var, tLObject, (byte) 2));
                break;
            default:
                qf4Var.getClass();
                gm.c3(new pz2(qf4Var, tL_error, tLObject, (byte) 28));
                break;
        }
    }
}
