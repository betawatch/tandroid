// default package

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zv4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ aw4 b;
    public final /* synthetic */ k27 c;
    public final /* synthetic */ TLRPC.TL_messageMediaGiveawayResults d;

    public /* synthetic */ zv4(aw4 aw4Var, k27 k27Var, TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults, byte b) {
        this.a = b;
        this.b = aw4Var;
        this.c = k27Var;
        this.d = tL_messageMediaGiveawayResults;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = this.d;
        k27 k27Var = this.c;
        aw4 aw4Var = this.b;
        switch (b) {
            case 0:
                gl.d3(new zv4(aw4Var, k27Var, tL_messageMediaGiveawayResults, (byte) 1));
                break;
            default:
                gb2 gb2Var = aw4Var.c;
                if (k27.B0(k27Var.k) != (-tL_messageMediaGiveawayResults.channel_id)) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", tL_messageMediaGiveawayResults.channel_id);
                    bundle.putInt("message_id", tL_messageMediaGiveawayResults.launch_msg_id);
                    LaunchActivity.Q().presentFragment(new mu1(bundle));
                    break;
                } else {
                    gb2Var.getDelegate().M(gb2Var, tL_messageMediaGiveawayResults.launch_msg_id, 0.0f, 0.0f, false);
                    break;
                }
        }
    }
}
