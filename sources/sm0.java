// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class sm0 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ TLRPC.Chat b;

    public /* synthetic */ sm0(wua wuaVar, TLRPC.Chat chat) {
        this.b = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.Chat chat = this.b;
        switch (b) {
            case 0:
                if (chat != null) {
                    bg0 bg0Var = new bg0();
                    bg0Var.a = true;
                    LaunchActivity.Q().showAsSheet(new lo0(-chat.id), bg0Var);
                    break;
                }
                break;
            default:
                wua.h2(w1b.d0(chat, true));
                break;
        }
    }

    public /* synthetic */ sm0(TLRPC.Chat chat) {
        this.b = chat;
    }
}
