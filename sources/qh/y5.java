package qh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class y5 extends z5 {
    public final /* synthetic */ TLRPC.Chat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(String str, TLRPC.Chat chat) {
        super(str);
        this.b = chat;
    }

    @Override // qh.z5
    public final String a() {
        return LocaleController.getString(R.string.AccDescrOpenChat);
    }

    @Override // qh.z5
    public final String b() {
        return this.b.title;
    }

    @Override // qh.z5
    public final void c(org.telegram.ui.ActionBar.p2 p2Var) {
        p2Var.presentFragment(xn.R9(-this.b.id));
    }

    @Override // qh.z5
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        TLRPC.Chat chat = this.b;
        z8Var.q(chat);
        imageReceiver.setForUserOrChat(chat, z8Var);
    }
}
