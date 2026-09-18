package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class rt0 implements a3.y {
    public final /* synthetic */ PhotoViewer a;

    public rt0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // a3.y
    public final void a(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.u71 u71Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J4 && (u71Var = photoViewer.F2) != null) {
            AndroidUtilities.runOnUIThread(new ak0(20, this, u71Var));
        }
    }
}
