// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class rq5 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tq5 b;

    public /* synthetic */ rq5(tq5 tq5Var, byte b) {
        this.a = b;
        this.b = tq5Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        tq5 tq5Var = this.b;
        switch (b) {
            case 0:
                gl.c3(new jf4(tq5Var, tL_error, tLObject, (byte) 26));
                break;
            default:
                gl.c3(new hb5(tq5Var, tL_error, (byte) 14));
                break;
        }
    }
}
