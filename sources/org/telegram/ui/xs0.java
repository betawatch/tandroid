package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class xs0 implements a3.y {
    public final /* synthetic */ PhotoViewer a;

    public xs0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // a3.y
    public final void b(long j10, long j11, b2.w wVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.c81 c81Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J4 && (c81Var = photoViewer.F2) != null) {
            AndroidUtilities.runOnUIThread(new xg0(24, this, c81Var));
        }
    }
}
