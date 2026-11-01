package org.telegram.ui;

import com.google.android.gms.cast.MediaError;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class w9 extends e6.g {
    @Override // e6.g
    public final void b(MediaError mediaError) {
        org.telegram.messenger.f8.d("Chromecast Media Error: " + mediaError);
    }

    @Override // e6.g
    public final void g() {
        org.telegram.messenger.f8.b("onStatusUpdated");
        b5.d.C();
    }
}
