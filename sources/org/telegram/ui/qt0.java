package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class qt0 implements a3.y {
    public final /* synthetic */ PhotoViewer a;

    public qt0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // a3.y
    public final void a(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.t71 t71Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J4 && (t71Var = photoViewer.F2) != null) {
            AndroidUtilities.runOnUIThread(new ak0(19, this, t71Var));
        }
    }
}
