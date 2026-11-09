package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                org.telegram.ui.Components.hc.a0(nmVar.a).Q(R.raw.contact_check, 36, org.telegram.messenger.id.a0(null, null, 2131742836, chat == null ? "" : chat.title)).k(true);
                break;
        }
    }
}
