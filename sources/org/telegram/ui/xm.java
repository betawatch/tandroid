package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
