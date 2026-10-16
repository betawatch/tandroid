package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ n5 b;

    public /* synthetic */ p4(n5 n5Var, int i10) {
        this.a = i10;
        this.b = n5Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u4(this.b, tLObject, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new u4(this.b, tLObject, 1));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new u4(this.b, tLObject, 2));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new u4(this.b, tLObject, 3));
                break;
            default:
                AndroidUtilities.runOnUIThread(new u4(this.b, tLObject, 4));
                break;
        }
    }
}
