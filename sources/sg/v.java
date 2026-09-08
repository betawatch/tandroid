package sg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;

    public /* synthetic */ v(k0 k0Var, int i10) {
        this.a = i10;
        this.b = k0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.g1(18, this.b, tLObject));
                break;
            case 1:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                k0 k0Var = this.b;
                if (!z10) {
                    k0Var.getClass();
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(k0Var.H0);
                    break;
                }
            default:
                k0.U(this.b, tLObject, tL_error);
                break;
        }
    }
}
