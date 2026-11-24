// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class sm0 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ TLRPC.Chat b;

    public /* synthetic */ sm0(vqa vqaVar, TLRPC.Chat chat) {
        this.b = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.Chat chat = this.b;
        switch (b) {
            case 0:
                if (chat != null) {
                    ag0 ag0Var = new ag0();
                    ag0Var.a = true;
                    LaunchActivity.Q().showAsSheet(new lo0(-chat.id), ag0Var);
                    break;
                }
                break;
            default:
                vqa.g2(uxa.d0(chat, true));
                break;
        }
    }

    public /* synthetic */ sm0(TLRPC.Chat chat) {
        this.b = chat;
    }
}
