// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class rc6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ad6 b;
    public final /* synthetic */ String c;

    public /* synthetic */ rc6(ad6 ad6Var, String str, byte b) {
        this.a = b;
        this.b = ad6Var;
        this.c = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        String str = this.c;
        ad6 ad6Var = this.b;
        switch (b) {
            case 0:
                gl.c3(new tc6(ad6Var, tL_error, str, tLObject));
                break;
            default:
                gl.c3(new tc6(ad6Var, tL_error, tLObject, str));
                break;
        }
    }
}
