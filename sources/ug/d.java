package ug;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.l2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bb1;
import org.telegram.ui.v5;
import zh.w3;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
                    l2 l2Var = new l2();
                    l2Var.a = true;
                    LaunchActivity.R().showAsSheet(new v5(-chat.id), l2Var);
                    break;
                }
                break;
            default:
                w3.d2(bb1.d0(this.b, true));
                break;
        }
    }

    public /* synthetic */ d(w3 w3Var, TLRPC.Chat chat) {
        this.b = chat;
    }
}
