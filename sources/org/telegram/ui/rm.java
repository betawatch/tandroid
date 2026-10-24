package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class rm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dn b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ rm(dn dnVar, TLRPC.Chat chat, int i10) {
        this.a = i10;
        this.b = dnVar;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.Chat chat = this.c;
        dn dnVar = this.b;
        switch (i10) {
            case 0:
                dnVar.u(chat);
                break;
            case 1:
                dnVar.a(chat);
                break;
            case 2:
                dnVar.a.pa(chat);
                break;
            default:
                org.telegram.ui.Components.xc.a0(dnVar.a).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, chat == null ? "" : chat.title)).k(true);
                break;
        }
    }
}
