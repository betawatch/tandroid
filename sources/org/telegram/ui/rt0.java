package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class rt0 implements a3.y {
    public final /* synthetic */ PhotoViewer a;

    public rt0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // a3.y
    public final void a(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.t71 t71Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J4 && (t71Var = photoViewer.F2) != null) {
            AndroidUtilities.runOnUIThread(new fj0(22, this, t71Var));
        }
    }
}
