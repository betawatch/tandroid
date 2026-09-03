package sh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n71;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ k2 b;

    public /* synthetic */ j2(k2 k2Var, int i10) {
        this.a = i10;
        this.b = k2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                p2 p2Var = this.b.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(p2Var.D).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new q1(p2Var, 17));
                break;
            default:
                AndroidUtilities.runOnUIThread(new n71(this.b, tLObject, tL_error, 23));
                break;
        }
    }
}
