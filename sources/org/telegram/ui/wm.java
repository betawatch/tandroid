package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ in b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ wm(in inVar, TLRPC.Chat chat, int i10) {
        this.a = i10;
        this.b = inVar;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.Chat chat = this.c;
        in inVar = this.b;
        switch (i10) {
            case 0:
                inVar.x(chat);
                break;
            case 1:
                inVar.b(chat);
                break;
            case 2:
                inVar.a.ka(chat);
                break;
            default:
                org.telegram.ui.Components.xc.a0(inVar.a).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, chat == null ? "" : chat.title)).k(true);
                break;
        }
    }
}
