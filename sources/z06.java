// default package

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class z06 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TLRPC.Chat d;

    public /* synthetic */ z06(yv1 yv1Var, long j, TLRPC.Chat chat, byte b) {
        this.a = b;
        this.b = yv1Var;
        this.c = j;
        this.d = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.Chat chat = this.d;
        long j = this.c;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                c41.b0(yv1Var).I(R.raw.stars_send, jb6.M0(2131744683, null), gm.S2(jb6.G((int) j, "StarsSubscriptionCompletedText", chat.title))).k(true);
                break;
            default:
                c41.b0(yv1Var).I(R.raw.stars_send, jb6.M0(2131744683, null), gm.S2(jb6.G((int) j, "StarsSubscriptionCompletedText", chat.title))).k(true);
                break;
        }
    }
}
