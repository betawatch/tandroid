package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                mmVar.n(chat);
                break;
            case 1:
                mmVar.a(chat);
                break;
            case 2:
                mmVar.a.Na(chat);
                break;
            default:
                org.telegram.ui.Components.lc.b0(mmVar.a).Q(R.raw.contact_check, 36, org.telegram.messenger.gd.a0(null, null, 2131742578, chat == null ? "" : chat.title)).k(true);
                break;
        }
    }
}
