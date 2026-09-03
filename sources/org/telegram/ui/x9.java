package org.telegram.ui;

import com.google.android.gms.cast.MediaError;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class x9 extends s5.g {
    @Override // s5.g
    public final void b(MediaError mediaError) {
        FileLog.e("Chromecast Media Error: " + mediaError);
    }

    @Override // s5.g
    public final void g() {
        FileLog.d("onStatusUpdated");
        d1.f.C();
    }
}
