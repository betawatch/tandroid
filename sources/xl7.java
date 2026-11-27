// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xl7 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lm7 b;

    public /* synthetic */ xl7(lm7 lm7Var, byte b) {
        this.a = b;
        this.b = lm7Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        lm7 lm7Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new ql7(lm7Var, tLObject, (byte) 2));
                break;
            default:
                if (tLObject instanceof TLRPC.Updates) {
                    lm7Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
        }
    }
}
