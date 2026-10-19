package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class xs0 implements a3.y {
    public final /* synthetic */ PhotoViewer a;

    public xs0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // a3.y
    public final void b(long j10, long j11, b2.w wVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.b81 b81Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J4 && (b81Var = photoViewer.F2) != null) {
            AndroidUtilities.runOnUIThread(new xg0(24, this, b81Var));
        }
    }
}
