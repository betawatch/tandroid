package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class rt0 implements a3.y {
    public final /* synthetic */ PhotoViewer a;

    public rt0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // a3.y
    public final void b(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.v71 v71Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J4 && (v71Var = photoViewer.F2) != null) {
            AndroidUtilities.runOnUIThread(new fj0(22, this, v71Var));
        }
    }
}
