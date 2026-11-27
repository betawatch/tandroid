// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ts5 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vs5 b;

    public /* synthetic */ ts5(vs5 vs5Var, byte b) {
        this.a = b;
        this.b = vs5Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        vs5 vs5Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new ls5(vs5Var, tL_error, tLObject, (byte) 1));
                break;
            default:
                hl.c3(new tg5(vs5Var, tL_error, (byte) 11));
                break;
        }
    }
}
