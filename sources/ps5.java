// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ps5 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rs5 b;

    public /* synthetic */ ps5(rs5 rs5Var, byte b) {
        this.a = b;
        this.b = rs5Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        rs5 rs5Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new if4(rs5Var, tL_error, tLObject, (byte) 28));
                break;
            default:
                gm.c3(new fd5(rs5Var, tL_error, (byte) 15));
                break;
        }
    }
}
