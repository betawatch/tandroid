package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ym implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ ri a;
    public final /* synthetic */ sn b;
    public final /* synthetic */ dn c;

    public ym(dn dnVar, ri riVar, sn snVar) {
        this.c = dnVar;
        this.a = riVar;
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
