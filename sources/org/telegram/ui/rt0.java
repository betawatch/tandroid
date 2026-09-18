package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
