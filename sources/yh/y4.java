package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ v5 b;

    public /* synthetic */ y4(v5 v5Var, int i10) {
        this.a = i10;
        this.b = v5Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c5(this.b, tLObject, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new c5(this.b, tLObject, 1));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new c5(this.b, tLObject, 2));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new c5(this.b, tLObject, 3));
                break;
            default:
                AndroidUtilities.runOnUIThread(new c5(this.b, tLObject, 4));
                break;
        }
    }
}
