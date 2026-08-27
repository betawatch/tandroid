package org.telegram.ui;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ym implements MessagesController.MessagesLoadedCallback {
    public final /* synthetic */ qi a;
    public final /* synthetic */ rn b;
    public final /* synthetic */ dn c;

    public ym(dn dnVar, qi qiVar, rn rnVar) {
        this.c = dnVar;
        this.a = qiVar;
        this.b = rnVar;
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
