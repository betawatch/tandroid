package org.telegram.ui;

import com.google.android.gms.cast.MediaError;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class u9 extends h6.g {
    @Override // h6.g
    public final void b(MediaError mediaError) {
        org.telegram.messenger.a8.d("Chromecast Media Error: " + mediaError);
    }

    @Override // h6.g
    public final void g() {
        org.telegram.messenger.a8.b("onStatusUpdated");
        d1.f.C();
    }
}
