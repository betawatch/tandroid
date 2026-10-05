package tg;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.l2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ta1;
import org.telegram.ui.w5;
import yh.y3;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
