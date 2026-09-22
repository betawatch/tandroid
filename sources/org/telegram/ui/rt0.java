package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class rt0 implements a3.y {
    public final /* synthetic */ PhotoViewer a;

    public rt0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // a3.y
    public final void b(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.g71 g71Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J4 && (g71Var = photoViewer.F2) != null) {
            AndroidUtilities.runOnUIThread(new ml0(16, this, g71Var));
        }
    }
}
