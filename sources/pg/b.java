package pg;

import android.os.Bundle;
import org.telegram.messenger.i0;
import org.telegram.messenger.jj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ jj c;
    public final /* synthetic */ TLRPC.TL_messageMediaGiveawayResults d;

    public /* synthetic */ b(c cVar, jj jjVar, TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults, int i10) {
        this.a = i10;
        this.b = cVar;
        this.c = jjVar;
        this.d = tL_messageMediaGiveawayResults;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i0.g3(new b(this.b, this.c, this.d, 1));
                break;
            default:
                q1 q1Var = this.b.c;
                long B0 = jj.B0(this.c.k);
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = this.d;
                if (B0 != (-tL_messageMediaGiveawayResults.channel_id)) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", tL_messageMediaGiveawayResults.channel_id);
                    bundle.putInt("message_id", tL_messageMediaGiveawayResults.launch_msg_id);
                    LaunchActivity.Q().presentFragment(new un(bundle));
                    break;
                } else {
                    q1Var.getDelegate().L1(q1Var, tL_messageMediaGiveawayResults.launch_msg_id, 0.0f, 0.0f, false);
                    break;
                }
        }
    }
}
