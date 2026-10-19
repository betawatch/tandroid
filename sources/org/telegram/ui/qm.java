package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class qm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ qm(cn cnVar, TLRPC.Chat chat, int i10) {
        this.a = i10;
        this.b = cnVar;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.Chat chat = this.c;
        cn cnVar = this.b;
        switch (i10) {
            case 0:
                cnVar.u(chat);
                break;
            case 1:
                cnVar.a(chat);
                break;
            case 2:
                cnVar.a.pa(chat);
                break;
            default:
                org.telegram.ui.Components.xc.a0(cnVar.a).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, chat == null ? "" : chat.title)).k(true);
                break;
        }
    }
}
