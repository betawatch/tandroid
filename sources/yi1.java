// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class yi1 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fj1 b;

    public /* synthetic */ yi1(fj1 fj1Var, byte b) {
        this.a = b;
        this.b = fj1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        fj1 fj1Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new y31(fj1Var, tLObject, (byte) 28));
                break;
            case 1:
                gm.c3(new y31(fj1Var, tL_error, (byte) 26));
                break;
            case 2:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    gm.c3(new wi1(fj1Var, (byte) 3));
                    break;
                }
                break;
            default:
                gm.c3(new tv0(fj1Var, tL_error, tLObject, (byte) 20));
                break;
        }
    }
}
