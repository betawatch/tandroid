package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
                org.telegram.ui.Components.hc.a0(lmVar.a).Q(R.raw.contact_check, 36, org.telegram.messenger.id.a0(null, null, 2131742839, chat == null ? "" : chat.title)).k(true);
                break;
        }
    }
}
