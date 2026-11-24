// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
                gl.d3(new pc7((Object) vx7Var, (Object) tL_error, (Object) tLObject, (byte) 9));
                break;
            case 1:
                vx7Var.getClass();
                gl.d3(new bj7(vx7Var, tL_error, (byte) 23));
                break;
            case 2:
                vx7Var.getClass();
                gl.d3(new kw7(vx7Var, (byte) 5));
                break;
            default:
                gl.d3(new bj7(vx7Var, tLObject, (byte) 22));
                break;
        }
    }
}
