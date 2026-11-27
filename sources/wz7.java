// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wz7 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b18 b;

    public /* synthetic */ wz7(b18 b18Var, byte b) {
        this.a = b;
        this.b = b18Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        b18 b18Var = this.b;
        switch (b) {
            case 0:
                b18Var.getClass();
                hl.c3(new gd7((Object) b18Var, (Object) tL_error, (Object) tLObject, (byte) 17));
                break;
            case 1:
                b18Var.getClass();
                hl.c3(new ql7(b18Var, tL_error, (byte) 22));
                break;
            case 2:
                b18Var.getClass();
                hl.c3(new sz7(b18Var, (byte) 5));
                break;
            default:
                hl.c3(new ql7(b18Var, tLObject, (byte) 21));
                break;
        }
    }
}
