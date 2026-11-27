// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
