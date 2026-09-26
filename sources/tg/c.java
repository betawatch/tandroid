package tg;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sa1;
import org.telegram.ui.v5;
import yh.x3;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
                    k2 k2Var = new k2();
                    k2Var.a = true;
                    LaunchActivity.R().showAsSheet(new v5(-chat.id), k2Var);
                    break;
                }
                break;
            default:
                x3.d2(sa1.d0(this.b, true));
                break;
        }
    }

    public /* synthetic */ c(x3 x3Var, TLRPC.Chat chat) {
        this.b = chat;
    }
}
