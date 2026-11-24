// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class qx0 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rx0 b;

    public /* synthetic */ qx0(rx0 rx0Var, byte b) {
        this.a = b;
        this.b = rx0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        rx0 rx0Var = this.b;
        switch (b) {
            case 0:
                wx0 wx0Var = rx0Var.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    oc7.r1(wx0Var.I).T3((TLRPC.TL_updates) tLObject, false);
                }
                gm.c3(new vw0(wx0Var, (byte) 16));
                break;
            default:
                gm.c3(new tv0(rx0Var, tLObject, tL_error, (byte) 2));
                break;
        }
    }
}
