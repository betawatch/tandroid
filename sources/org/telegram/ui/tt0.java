package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class tt0 implements a3.y {
    public final /* synthetic */ PhotoViewer a;

    public tt0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // a3.y
    public final void b(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.h71 h71Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J4 && (h71Var = photoViewer.F2) != null) {
            AndroidUtilities.runOnUIThread(new pl0(16, this, h71Var));
        }
    }
}
