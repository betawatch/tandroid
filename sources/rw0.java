// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rw0 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sw0 b;

    public /* synthetic */ rw0(sw0 sw0Var, byte b) {
        this.a = b;
        this.b = sw0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        sw0 sw0Var = this.b;
        switch (b) {
            case 0:
                xw0 xw0Var = sw0Var.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    uc7.s1(xw0Var.I).Y3((TLRPC.TL_updates) tLObject, false);
                }
                hl.c3(new wv0(xw0Var, (byte) 16));
                break;
            default:
                hl.c3(new tu0(sw0Var, tLObject, tL_error, (byte) 2));
                break;
        }
    }
}
