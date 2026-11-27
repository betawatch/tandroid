// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class z82 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g92 b;

    public /* synthetic */ z82(g92 g92Var, byte b) {
        this.a = b;
        this.b = g92Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        g92 g92Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new on1(g92Var, tL_error, tLObject));
                break;
            case 1:
                hl.c3(new b92(g92Var, (byte) 1));
                break;
            default:
                g92Var.getClass();
                hl.c3(new b92(g92Var, (byte) 4));
                break;
        }
    }
}
