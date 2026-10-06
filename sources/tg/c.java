package tg;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.l2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ta1;
import org.telegram.ui.w5;
import yh.y3;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ TLRPC.Chat b;

    public /* synthetic */ c(TLRPC.Chat chat) {
        this.b = chat;
    }

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
                y3.d2(ta1.b0(this.b, true));
                break;
        }
    }

    public /* synthetic */ c(y3 y3Var, TLRPC.Chat chat) {
        this.b = chat;
    }
}
