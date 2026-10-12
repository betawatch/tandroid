package ug;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hb1;
import org.telegram.ui.z5;
import zh.r3;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
