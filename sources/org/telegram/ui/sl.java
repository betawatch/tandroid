package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hm b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ sl(hm hmVar, TLRPC.Chat chat, int i3) {
        this.a = i3;
        this.b = hmVar;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        TLRPC.Chat chat = this.c;
        hm hmVar = this.b;
        switch (i3) {
            case 0:
                hmVar.m(chat);
                break;
            case 1:
                hmVar.a(chat);
                break;
            case 2:
                hmVar.a.Ka(chat);
                break;
            default:
                org.telegram.ui.Components.fc.a0(hmVar.a).Q(R.raw.contact_check, 36, org.telegram.messenger.bd.a0(null, null, 2131742846, chat == null ? "" : chat.title)).k(true);
                break;
        }
    }
}
