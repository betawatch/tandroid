package rg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ v(j0 j0Var, int i10) {
        this.a = i10;
        this.b = j0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.o1(17, this.b, tLObject));
                break;
            case 1:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                j0 j0Var = this.b;
                if (!z10) {
                    j0Var.getClass();
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(j0Var.H0);
                    break;
                }
            default:
                j0.U(this.b, tLObject, tL_error);
                break;
        }
    }
}
