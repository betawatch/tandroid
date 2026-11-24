// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class uc4 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pd4 b;

    public /* synthetic */ uc4(pd4 pd4Var, byte b) {
        this.a = b;
        this.b = pd4Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        pd4 pd4Var = this.b;
        switch (b) {
            case 0:
                gl.d3(new vc4(pd4Var, tLObject, (byte) 1));
                break;
            default:
                pd4Var.getClass();
                gl.d3(new mg3(pd4Var, tL_error, tLObject, (byte) 26));
                break;
        }
    }
}
