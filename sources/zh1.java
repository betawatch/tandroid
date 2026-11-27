// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zh1 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gi1 b;

    public /* synthetic */ zh1(gi1 gi1Var, byte b) {
        this.a = b;
        this.b = gi1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        gi1 gi1Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new z21(gi1Var, tLObject, (byte) 26));
                break;
            case 1:
                hl.c3(new z21(gi1Var, tL_error, (byte) 25));
                break;
            case 2:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    hl.c3(new xh1(gi1Var, (byte) 3));
                    break;
                }
                break;
            default:
                hl.c3(new tu0(gi1Var, tL_error, tLObject, (byte) 20));
                break;
        }
    }
}
