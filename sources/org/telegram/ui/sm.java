package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                fnVar.p(chat);
                break;
            case 1:
                fnVar.a(chat);
                break;
            case 2:
                fnVar.a.Aa(chat);
                break;
            default:
                org.telegram.ui.Components.cc.a0(fnVar.a).Q(R.raw.contact_check, 36, org.telegram.messenger.cd.a0(null, null, 2131742861, chat == null ? "" : chat.title)).k(true);
                break;
        }
    }
}
