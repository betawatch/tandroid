package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class qt0 implements a3.x {
    public final /* synthetic */ PhotoViewer a;

    public qt0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // a3.x
    public final void c(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.g71 g71Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J4 && (g71Var = photoViewer.F2) != null) {
            AndroidUtilities.runOnUIThread(new ej0(22, this, g71Var));
        }
    }
}
