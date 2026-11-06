package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lm b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ wl(lm lmVar, TLRPC.Chat chat, int i7) {
        this.a = i7;
        this.b = lmVar;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.Chat chat = this.c;
        lm lmVar = this.b;
        switch (i7) {
            case 0:
                lmVar.m(chat);
                break;
            case 1:
                lmVar.a(chat);
                break;
            case 2:
                lmVar.a.Ka(chat);
                break;
            default:
                org.telegram.ui.Components.hc.a0(lmVar.a).Q(R.raw.contact_check, 36, org.telegram.messenger.hd.a0(null, null, 2131742837, chat == null ? "" : chat.title)).k(true);
                break;
        }
    }
}
