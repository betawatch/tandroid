package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ m5 b;

    public /* synthetic */ p4(m5 m5Var, int i10) {
        this.a = i10;
        this.b = m5Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t4(this.b, tLObject, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new t4(this.b, tLObject, 1));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new t4(this.b, tLObject, 2));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new t4(this.b, tLObject, 3));
                break;
            default:
                AndroidUtilities.runOnUIThread(new t4(this.b, tLObject, 4));
                break;
        }
    }
}
