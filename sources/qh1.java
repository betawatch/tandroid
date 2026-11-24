// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
                gl.c3(new q21(yh1Var, tLObject, (byte) 27));
                break;
            case 1:
                gl.c3(new q21(yh1Var, tL_error, (byte) 25));
                break;
            case 2:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    gl.c3(new oh1(yh1Var, (byte) 3));
                    break;
                }
                break;
            default:
                gl.c3(new fv0(yh1Var, tL_error, tLObject, (byte) 19));
                break;
        }
    }
}
