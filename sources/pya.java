// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class pya implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xza b;

    public /* synthetic */ pya(xza xzaVar, byte b) {
        this.a = b;
        this.b = xzaVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        xza xzaVar = this.b;
        switch (b) {
            case 0:
                xzaVar.i0(tLObject);
                break;
            default:
                xzaVar.j0(tLObject);
                break;
        }
    }
}
