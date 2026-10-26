package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fn b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ tm(fn fnVar, TLRPC.Chat chat, int i10) {
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
                fnVar.w(chat);
                break;
            case 1:
                fnVar.a(chat);
                break;
            case 2:
                fnVar.a.ua(chat);
                break;
            default:
                org.telegram.ui.Components.wc.b0(fnVar.a).R(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, chat == null ? "" : chat.title)).k(true);
                break;
        }
    }
}
