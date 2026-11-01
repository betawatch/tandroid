package vh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.dd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.un;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class y4 extends z4 {
    public final /* synthetic */ TLRPC.Chat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(String str, TLRPC.Chat chat) {
        super(str);
        this.b = chat;
    }

    @Override // vh.z4
    public final String a() {
        return dd.L0(2131754819, null);
    }

    @Override // vh.z4
    public final String b() {
        return this.b.title;
    }

    @Override // vh.z4
    public final void c(org.telegram.ui.ActionBar.k2 k2Var) {
        k2Var.presentFragment(un.ma(-this.b.id));
    }

    @Override // vh.z4
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        TLRPC.Chat chat = this.b;
        r8Var.q(chat);
        imageReceiver.i0(chat, r8Var, null);
    }
}
