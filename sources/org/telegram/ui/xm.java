package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jn b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ xm(jn jnVar, TLRPC.Chat chat, int i10) {
        this.a = i10;
        this.b = jnVar;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.Chat chat = this.c;
        jn jnVar = this.b;
        switch (i10) {
            case 0:
                jnVar.w(chat);
                break;
            case 1:
                jnVar.b(chat);
                break;
            case 2:
                jnVar.a.ka(chat);
                break;
            default:
                org.telegram.ui.Components.qc.a0(jnVar.a).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, chat == null ? "" : chat.title)).k(true);
                break;
        }
    }
}
