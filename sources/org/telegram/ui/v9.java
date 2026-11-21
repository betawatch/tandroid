package org.telegram.ui;

import com.google.android.gms.cast.MediaError;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
