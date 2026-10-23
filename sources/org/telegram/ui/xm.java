package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class xm implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ ri a;
    public final /* synthetic */ qn b;
    public final /* synthetic */ cn c;

    public xm(cn cnVar, ri riVar, qn qnVar) {
        this.c = cnVar;
        this.a = riVar;
        this.b = qnVar;
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
