package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nm b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ yl(nm nmVar, TLRPC.Chat chat, int i7) {
        this.a = i7;
        this.b = nmVar;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.Chat chat = this.c;
        nm nmVar = this.b;
        switch (i7) {
            case 0:
                nmVar.m(chat);
                break;
            case 1:
                nmVar.a(chat);
                break;
            case 2:
                nmVar.a.Ma(chat);
                break;
            default:
                org.telegram.ui.Components.gc.a0(nmVar.a).Q(R.raw.contact_check, 36, org.telegram.messenger.id.a0(null, null, 2131742836, chat == null ? "" : chat.title)).k(true);
                break;
        }
    }
}
