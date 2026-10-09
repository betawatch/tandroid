package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                lnVar.v(chat);
                break;
            case 1:
                lnVar.a(chat);
                break;
            case 2:
                lnVar.a.pa(chat);
                break;
            default:
                org.telegram.ui.Components.ad.a0(lnVar.a).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, chat == null ? "" : chat.title)).k(true);
                break;
        }
    }
}
