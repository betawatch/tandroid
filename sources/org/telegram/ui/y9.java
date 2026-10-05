package org.telegram.ui;

import com.google.android.gms.cast.MediaError;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class y9 extends e6.g {
    @Override // e6.g
    public final void b(MediaError mediaError) {
        FileLog.e("Chromecast Media Error: " + mediaError);
    }

    @Override // e6.g
    public final void g() {
        FileLog.d("onStatusUpdated");
        b5.d.C();
    }
}
