package org.telegram.ui;

import com.google.android.gms.cast.MediaError;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class w9 extends e6.g {
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
