package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
