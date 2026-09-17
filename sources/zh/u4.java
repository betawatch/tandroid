package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ s5 b;

    public /* synthetic */ u4(s5 s5Var, int i10) {
        this.a = i10;
        this.b = s5Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new y4(this.b, tLObject, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new y4(this.b, tLObject, 1));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new y4(this.b, tLObject, 2));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new y4(this.b, tLObject, 3));
                break;
            default:
                AndroidUtilities.runOnUIThread(new y4(this.b, tLObject, 4));
                break;
        }
    }
}
