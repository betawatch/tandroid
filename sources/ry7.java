// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ry7 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xz7 b;

    public /* synthetic */ ry7(xz7 xz7Var, byte b) {
        this.a = b;
        this.b = xz7Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        xz7 xz7Var = this.b;
        switch (b) {
            case 0:
                xz7Var.getClass();
                gm.c3(new ud7((Object) xz7Var, (Object) tL_error, (Object) tLObject, (byte) 12));
                break;
            case 1:
                xz7Var.getClass();
                gm.c3(new bl7(xz7Var, tL_error, (byte) 24));
                break;
            case 2:
                xz7Var.getClass();
                gm.c3(new ny7(xz7Var, (byte) 5));
                break;
            default:
                gm.c3(new bl7(xz7Var, tLObject, (byte) 23));
                break;
        }
    }
}
