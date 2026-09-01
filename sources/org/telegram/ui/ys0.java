package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ys0 implements i5.n {
    public final /* synthetic */ PhotoViewer a;

    public ys0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // i5.n
    public final void a(long j10, long j11, j3.n0 n0Var, MediaFormat mediaFormat) {
        org.telegram.ui.Components.k71 k71Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.G4 && (k71Var = photoViewer.C2) != null) {
            AndroidUtilities.runOnUIThread(new br0(3, this, k71Var));
        }
    }
}
