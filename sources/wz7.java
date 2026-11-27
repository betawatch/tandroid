// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
                hl.c3(new fd7((Object) b18Var, (Object) tL_error, (Object) tLObject, (byte) 17));
                break;
            case 1:
                b18Var.getClass();
                hl.c3(new pl7(b18Var, tL_error, (byte) 21));
                break;
            case 2:
                b18Var.getClass();
                hl.c3(new sz7(b18Var, (byte) 5));
                break;
            default:
                hl.c3(new pl7(b18Var, tLObject, (byte) 20));
                break;
        }
    }
}
