// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class wl7 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lm7 b;

    public /* synthetic */ wl7(lm7 lm7Var, byte b) {
        this.a = b;
        this.b = lm7Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        lm7 lm7Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new pl7(lm7Var, tLObject, (byte) 1));
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
