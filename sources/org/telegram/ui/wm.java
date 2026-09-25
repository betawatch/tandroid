package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ in b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ wm(in inVar, TLRPC.Chat chat, int i10) {
        this.a = i10;
        this.b = inVar;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.Chat chat = this.c;
        in inVar = this.b;
        switch (i10) {
            case 0:
                inVar.x(chat);
                break;
            case 1:
                inVar.b(chat);
                break;
            case 2:
                inVar.a.ka(chat);
                break;
            default:
                org.telegram.ui.Components.xc.a0(inVar.a).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, chat == null ? "" : chat.title)).k(true);
                break;
        }
    }
}
