// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ow7 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vx7 b;

    public /* synthetic */ ow7(vx7 vx7Var, byte b) {
        this.a = b;
        this.b = vx7Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        vx7 vx7Var = this.b;
        switch (b) {
            case 0:
                vx7Var.getClass();
                gl.c3(new pc7((Object) vx7Var, (Object) tL_error, (Object) tLObject, (byte) 9));
                break;
            case 1:
                vx7Var.getClass();
                gl.c3(new bj7(vx7Var, tL_error, (byte) 23));
                break;
            case 2:
                vx7Var.getClass();
                gl.c3(new kw7(vx7Var, (byte) 5));
                break;
            default:
                gl.c3(new bj7(vx7Var, tLObject, (byte) 22));
                break;
        }
    }
}
