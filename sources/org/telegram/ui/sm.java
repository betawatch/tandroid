package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fn b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ sm(fn fnVar, TLRPC.Chat chat, int i10) {
        this.a = i10;
        this.b = fnVar;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.Chat chat = this.c;
        fn fnVar = this.b;
        switch (i10) {
            case 0:
                fnVar.r(chat);
                break;
            case 1:
                fnVar.b(chat);
                break;
            case 2:
                fnVar.a.ka(chat);
                break;
            default:
                org.telegram.ui.Components.tc.a0(fnVar.a).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, chat == null ? "" : chat.title)).k(true);
                break;
        }
    }
}
