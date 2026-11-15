package org.telegram.ui;

import com.google.android.gms.cast.MediaError;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class v9 extends h6.g {
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
