// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qh1 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yh1 b;

    public /* synthetic */ qh1(yh1 yh1Var, byte b) {
        this.a = b;
        this.b = yh1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        yh1 yh1Var = this.b;
        switch (b) {
            case 0:
                gl.d3(new q21(yh1Var, tLObject, (byte) 27));
                break;
            case 1:
                gl.d3(new q21(yh1Var, tL_error, (byte) 25));
                break;
            case 2:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    gl.d3(new oh1(yh1Var, (byte) 3));
                    break;
                }
                break;
            default:
                gl.d3(new fv0(yh1Var, tL_error, tLObject, (byte) 19));
                break;
        }
    }
}
