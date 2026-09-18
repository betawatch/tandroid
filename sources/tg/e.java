package tg;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ab1;
import org.telegram.ui.v5;
import yh.a4;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ TLRPC.Chat b;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TLRPC.Chat chat = this.b;
                if (chat != null) {
                    m2 m2Var = new m2();
                    m2Var.a = true;
                    LaunchActivity.R().showAsSheet(new v5(-chat.id), m2Var);
                    break;
                }
                break;
            default:
                a4.d2(ab1.d0(this.b, true));
                break;
        }
    }

    public /* synthetic */ e(a4 a4Var, TLRPC.Chat chat) {
        this.b = chat;
    }
}
