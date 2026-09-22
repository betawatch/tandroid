package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ u5 b;

    public /* synthetic */ x4(u5 u5Var, int i10) {
        this.a = i10;
        this.b = u5Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b5(this.b, tLObject, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new b5(this.b, tLObject, 1));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new b5(this.b, tLObject, 2));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new b5(this.b, tLObject, 3));
                break;
            default:
                AndroidUtilities.runOnUIThread(new b5(this.b, tLObject, 4));
                break;
        }
    }
}
