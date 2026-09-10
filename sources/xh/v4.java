package xh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class v4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ v5 b;

    public /* synthetic */ v4(v5 v5Var, int i10) {
        this.a = i10;
        this.b = v5Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a5(this.b, tLObject, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new a5(this.b, tLObject, 1));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new a5(this.b, tLObject, 2));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new a5(this.b, tLObject, 3));
                break;
            default:
                AndroidUtilities.runOnUIThread(new a5(this.b, tLObject, 4));
                break;
        }
    }
}
