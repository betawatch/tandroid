// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class pj6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ak6 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ pj6(ak6 ak6Var, TLRPC.TL_error tL_error, TLObject tLObject, byte b) {
        this.a = b;
        this.b = ak6Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.c;
        ak6 ak6Var = this.b;
        switch (b) {
            case 0:
                ak6Var.getNotificationCenter().d(new pj6(ak6Var, tL_error, tLObject, (byte) 1));
                break;
            default:
                ak6Var.g0(tLObject, tL_error);
                break;
        }
    }
}
