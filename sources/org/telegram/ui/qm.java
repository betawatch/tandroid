package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ qm(cn cnVar, TLRPC.Chat chat, int i9) {
        this.a = i9;
        this.b = cnVar;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        TLRPC.Chat chat = this.c;
        cn cnVar = this.b;
        switch (i9) {
            case 0:
                cnVar.o(chat);
                break;
            case 1:
                cnVar.b(chat);
                break;
            case 2:
                cnVar.a.ka(chat);
                break;
            default:
                org.telegram.ui.Components.oc.a0(cnVar.a).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, chat == null ? "" : chat.title)).k(true);
                break;
        }
    }
}
