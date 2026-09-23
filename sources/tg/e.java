package tg;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.l2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ra1;
import org.telegram.ui.w5;
import yh.y3;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                    l2 l2Var = new l2();
                    l2Var.a = true;
                    LaunchActivity.R().showAsSheet(new w5(-chat.id), l2Var);
                    break;
                }
                break;
            default:
                y3.d2(ra1.d0(this.b, true));
                break;
        }
    }

    public /* synthetic */ e(y3 y3Var, TLRPC.Chat chat) {
        this.b = chat;
    }
}
