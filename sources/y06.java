// default package

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class y06 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TLRPC.Chat d;

    public /* synthetic */ y06(zu1 zu1Var, long j, TLRPC.Chat chat, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = j;
        this.d = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.Chat chat = this.d;
        long j = this.c;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                d31.b0(zu1Var).I(R.raw.stars_send, ob6.M0(2131744651, null), hl.S2(ob6.G((int) j, "StarsSubscriptionCompletedText", chat.title))).k(true);
                break;
            default:
                d31.b0(zu1Var).I(R.raw.stars_send, ob6.M0(2131744651, null), hl.S2(ob6.G((int) j, "StarsSubscriptionCompletedText", chat.title))).k(true);
                break;
        }
    }
}
