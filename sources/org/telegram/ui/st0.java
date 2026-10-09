package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class st0 implements a3.y {
    public final /* synthetic */ PhotoViewer a;

    public st0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // a3.y
    public final void a(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.k81 k81Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J4 && (k81Var = photoViewer.F2) != null) {
            AndroidUtilities.runOnUIThread(new rt0(0, this, k81Var));
        }
    }
}
