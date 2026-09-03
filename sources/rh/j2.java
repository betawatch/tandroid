package rh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m71;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                AndroidUtilities.runOnUIThread(new m71(this.b, tLObject, tL_error, 22));
                break;
        }
    }
}
