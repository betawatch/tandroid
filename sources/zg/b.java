package zg;

import android.os.Bundle;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ gj c;
    public final /* synthetic */ TLRPC.TL_messageMediaGiveawayResults d;

    public /* synthetic */ b(c cVar, gj gjVar, TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults, int i7) {
        this.a = i7;
        this.b = cVar;
        this.c = gjVar;
        this.d = tL_messageMediaGiveawayResults;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g0.h3(new b(this.b, this.c, this.d, 1));
                break;
            default:
                q1 q1Var = this.b.c;
                long B0 = gj.B0(this.c.k);
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = this.d;
                if (B0 != (-tL_messageMediaGiveawayResults.channel_id)) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", tL_messageMediaGiveawayResults.channel_id);
                    bundle.putInt("message_id", tL_messageMediaGiveawayResults.launch_msg_id);
                    LaunchActivity.Q().presentFragment(new an(bundle));
                    break;
                } else {
                    q1Var.getDelegate().g2(q1Var, tL_messageMediaGiveawayResults.launch_msg_id, 0.0f, 0.0f, false);
                    break;
                }
        }
    }
}
