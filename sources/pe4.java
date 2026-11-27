// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class pe4 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nf4 b;

    public /* synthetic */ pe4(nf4 nf4Var, byte b) {
        this.a = b;
        this.b = nf4Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        nf4 nf4Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new vx3(nf4Var, tLObject, (byte) 28));
                break;
            default:
                nf4Var.getClass();
                hl.c3(new re4((Object) nf4Var, (Object) tL_error, (Object) tLObject, (byte) 0));
                break;
        }
    }
}
