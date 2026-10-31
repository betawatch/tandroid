package org.telegram.ui;

import com.google.android.gms.cast.MediaError;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
