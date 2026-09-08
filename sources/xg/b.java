package xg;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.co;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ MessageObject c;
    public final /* synthetic */ TLRPC.TL_messageMediaGiveawayResults d;

    public /* synthetic */ b(c cVar, MessageObject messageObject, TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults, int i10) {
        this.a = i10;
        this.b = cVar;
        this.c = messageObject;
        this.d = tL_messageMediaGiveawayResults;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b(this.b, this.c, this.d, 1));
                break;
            default:
                t1 t1Var = this.b.c;
                long dialogId = this.c.getDialogId();
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = this.d;
                if (dialogId != (-tL_messageMediaGiveawayResults.channel_id)) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", tL_messageMediaGiveawayResults.channel_id);
                    bundle.putInt("message_id", tL_messageMediaGiveawayResults.launch_msg_id);
                    LaunchActivity.R().presentFragment(new co(bundle));
                    break;
                } else {
                    t1Var.getDelegate().T1(t1Var, tL_messageMediaGiveawayResults.launch_msg_id, 0.0f, 0.0f, false);
                    break;
                }
        }
    }
}
