package org.telegram.ui;

import android.media.MediaFormat;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wq0 implements a3.y {
    public final /* synthetic */ PhotoViewer a;

    public wq0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // a3.y
    public final void a(long j10, long j11, b2.x xVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.u61 u61Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J4 && (u61Var = photoViewer.F2) != null) {
            org.telegram.messenger.i0.g3(new uf0(25, this, u61Var));
        }
    }
}
