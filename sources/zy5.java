// default package

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zy5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mu1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TLRPC.Chat d;

    public /* synthetic */ zy5(mu1 mu1Var, long j, TLRPC.Chat chat, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = j;
        this.d = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.Chat chat = this.d;
        long j = this.c;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                u21.b0(mu1Var).I(R.raw.stars_send, k96.M0(2131744757, null), gl.T2(k96.G((int) j, "StarsSubscriptionCompletedText", chat.title))).k(true);
                break;
            default:
                u21.b0(mu1Var).I(R.raw.stars_send, k96.M0(2131744757, null), gl.T2(k96.G((int) j, "StarsSubscriptionCompletedText", chat.title))).k(true);
                break;
        }
    }
}
