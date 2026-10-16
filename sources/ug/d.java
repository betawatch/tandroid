package ug;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hb1;
import org.telegram.ui.z5;
import zh.r3;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ TLRPC.Chat b;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TLRPC.Chat chat = this.b;
                if (chat != null) {
                    k2 k2Var = new k2();
                    k2Var.a = true;
                    LaunchActivity.R().showAsSheet(new z5(-chat.id), k2Var);
                    break;
                }
                break;
            default:
                r3.e2(hb1.d0(this.b, true));
                break;
        }
    }

    public /* synthetic */ d(r3 r3Var, TLRPC.Chat chat) {
        this.b = chat;
    }
}
