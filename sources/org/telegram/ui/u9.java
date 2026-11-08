package org.telegram.ui;

import com.google.android.gms.cast.MediaError;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
