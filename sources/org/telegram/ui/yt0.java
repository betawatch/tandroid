package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class yt0 implements a3.y {
    public final /* synthetic */ PhotoViewer a;

    public yt0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // a3.y
    public final void a(long j10, long j11, b2.x xVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.h81 h81Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J4 && (h81Var = photoViewer.F2) != null) {
            AndroidUtilities.runOnUIThread(new on0(11, this, h81Var));
        }
    }
}
