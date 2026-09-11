package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
