package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ en b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ sm(en enVar, TLRPC.Chat chat, int i10) {
        this.a = i10;
        this.b = enVar;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.Chat chat = this.c;
        en enVar = this.b;
        switch (i10) {
            case 0:
                enVar.u(chat);
                break;
            case 1:
                enVar.a(chat);
                break;
            case 2:
                enVar.a.pa(chat);
                break;
            default:
                org.telegram.ui.Components.xc.a0(enVar.a).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, chat == null ? "" : chat.title)).k(true);
                break;
        }
    }
}
