package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class zm implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ ti a;
    public final /* synthetic */ sn b;
    public final /* synthetic */ en c;

    public zm(en enVar, ti tiVar, sn snVar) {
        this.c = enVar;
        this.a = tiVar;
        this.b = snVar;
    }

    @Override // org.telegram.messenger.MessagesController.MessagesLoadedCallback
    public final void onError() {
        this.a.c(false);
        this.c.a.presentFragment(this.b);
    }

    @Override // org.telegram.messenger.MessagesController.MessagesLoadedCallback
    public final void onMessagesLoaded(boolean z10) {
        this.a.c(false);
        this.c.a.presentFragment(this.b);
    }
}
