package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hn b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ vm(hn hnVar, TLRPC.Chat chat, int i10) {
        this.a = i10;
        this.b = hnVar;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.Chat chat = this.c;
        hn hnVar = this.b;
        switch (i10) {
            case 0:
                hnVar.w(chat);
                break;
            case 1:
                hnVar.a(chat);
                break;
            case 2:
                hnVar.a.xa(chat);
                break;
            default:
                org.telegram.ui.Components.wc.b0(hnVar.a).R(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, chat == null ? "" : chat.title)).k(true);
                break;
        }
    }
}
