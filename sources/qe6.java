// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class qe6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ze6 b;
    public final /* synthetic */ String c;

    public /* synthetic */ qe6(ze6 ze6Var, String str, byte b) {
        this.a = b;
        this.b = ze6Var;
        this.c = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        String str = this.c;
        ze6 ze6Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new se6(ze6Var, tL_error, str, tLObject));
                break;
            default:
                gm.c3(new se6(ze6Var, tL_error, tLObject, str));
                break;
        }
    }
}
