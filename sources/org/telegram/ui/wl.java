package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
                lmVar.n(chat);
                break;
            case 1:
                lmVar.a(chat);
                break;
            case 2:
                lmVar.a.Na(chat);
                break;
            default:
                org.telegram.ui.Components.cc.a0(lmVar.a).Q(R.raw.contact_check, 36, org.telegram.messenger.hd.a0(null, null, 2131742836, chat == null ? "" : chat.title)).k(true);
                break;
        }
    }
}
