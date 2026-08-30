package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ws0 implements i5.n {
    public final /* synthetic */ PhotoViewer a;

    public ws0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // i5.n
    public final void a(long j10, long j11, j3.n0 n0Var, MediaFormat mediaFormat) {
        org.telegram.ui.Components.i71 i71Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.G4 && (i71Var = photoViewer.C2) != null) {
            AndroidUtilities.runOnUIThread(new zq0(4, this, i71Var));
        }
    }
}
