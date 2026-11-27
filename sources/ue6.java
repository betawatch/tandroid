// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ue6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ df6 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ue6(df6 df6Var, String str, byte b) {
        this.a = b;
        this.b = df6Var;
        this.c = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        String str = this.c;
        df6 df6Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new we6(df6Var, tL_error, str, tLObject));
                break;
            default:
                hl.c3(new we6(df6Var, tL_error, tLObject, str));
                break;
        }
    }
}
