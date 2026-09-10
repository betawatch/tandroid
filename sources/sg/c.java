package sg;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fb1;
import org.telegram.ui.w5;
import xh.x3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                    n2 n2Var = new n2();
                    n2Var.a = true;
                    LaunchActivity.R().showAsSheet(new w5(-chat.id), n2Var);
                    break;
                }
                break;
            default:
                x3.d2(fb1.d0(this.b, true));
                break;
        }
    }

    public /* synthetic */ c(x3 x3Var, TLRPC.Chat chat) {
        this.b = chat;
    }
}
