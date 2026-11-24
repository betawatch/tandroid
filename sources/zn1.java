// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class zn1 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mu1 b;
    public final /* synthetic */ TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ TLRPC.User d;

    public /* synthetic */ zn1(mu1 mu1Var, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = tL_attachMenuBot;
        this.d = user;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        TLRPC.User user = this.d;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.c;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                gl.c3(new co1(mu1Var, tL_attachMenuBot, tL_error, user));
                break;
            default:
                gl.c3(new co1(mu1Var, tL_error, tL_attachMenuBot, user));
                break;
        }
    }
}
