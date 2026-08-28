package org.telegram.ui;

import com.google.android.gms.cast.MediaError;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u9 extends o5.g {
    @Override // o5.g
    public final void b(MediaError mediaError) {
        FileLog.e("Chromecast Media Error: " + mediaError);
    }

    @Override // o5.g
    public final void g() {
        FileLog.d("onStatusUpdated");
        d1.f.B();
    }
}
