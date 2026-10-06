package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class xm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kn b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ xm(kn knVar, TLRPC.Chat chat, int i10) {
        this.a = i10;
        this.b = knVar;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.Chat chat = this.c;
        kn knVar = this.b;
        switch (i10) {
            case 0:
                knVar.x(chat);
                break;
            case 1:
                knVar.b(chat);
                break;
            case 2:
                knVar.a.ja(chat);
                break;
            default:
                org.telegram.ui.Components.yc.a0(knVar.a).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, chat == null ? "" : chat.title)).k(true);
                break;
        }
    }
}
