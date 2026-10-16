package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class xt0 implements a3.y {
    public final /* synthetic */ PhotoViewer a;

    public xt0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // a3.y
    public final void a(long j10, long j11, b2.x xVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.i81 i81Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J4 && (i81Var = photoViewer.F2) != null) {
            AndroidUtilities.runOnUIThread(new rr0(6, this, i81Var));
        }
    }
}
