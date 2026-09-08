package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class qt0 implements a3.y {
    public final /* synthetic */ PhotoViewer a;

    public qt0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // a3.y
    public final void c(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.g71 g71Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J4 && (g71Var = photoViewer.F2) != null) {
            AndroidUtilities.runOnUIThread(new ej0(22, this, g71Var));
        }
    }
}
