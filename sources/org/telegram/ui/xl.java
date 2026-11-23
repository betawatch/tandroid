package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class xl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mm b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ xl(mm mmVar, TLRPC.Chat chat, int i7) {
        this.a = i7;
        this.b = mmVar;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.Chat chat = this.c;
        mm mmVar = this.b;
        switch (i7) {
            case 0:
                mmVar.l(chat);
                break;
            case 1:
                mmVar.a(chat);
                break;
            case 2:
                mmVar.a.Na(chat);
                break;
            default:
                org.telegram.ui.Components.kc.b0(mmVar.a).Q(R.raw.contact_check, 36, org.telegram.messenger.gd.a0(null, null, 2131742565, chat == null ? "" : chat.title)).k(true);
                break;
        }
    }
}
