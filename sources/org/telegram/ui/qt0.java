package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
