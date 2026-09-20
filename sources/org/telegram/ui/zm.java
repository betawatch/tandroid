package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class zm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ln b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ zm(ln lnVar, TLRPC.Chat chat, int i10) {
        this.a = i10;
        this.b = lnVar;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.Chat chat = this.c;
        ln lnVar = this.b;
        switch (i10) {
            case 0:
                lnVar.x(chat);
                break;
            case 1:
                lnVar.b(chat);
                break;
            case 2:
                lnVar.a.ka(chat);
                break;
            default:
                org.telegram.ui.Components.xc.a0(lnVar.a).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, chat == null ? "" : chat.title)).k(true);
                break;
        }
    }
}
