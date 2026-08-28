package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xm implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ oi a;
    public final /* synthetic */ qn b;
    public final /* synthetic */ cn c;

    public xm(cn cnVar, oi oiVar, qn qnVar) {
        this.c = cnVar;
        this.a = oiVar;
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
