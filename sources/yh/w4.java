package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class w4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ u5 b;

    public /* synthetic */ w4(u5 u5Var, int i10) {
        this.a = i10;
        this.b = u5Var;
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
