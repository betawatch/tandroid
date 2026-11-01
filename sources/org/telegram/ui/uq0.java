package org.telegram.ui;

import android.media.MediaFormat;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class uq0 implements a3.y {
    public final /* synthetic */ PhotoViewer a;

    public uq0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // a3.y
    public final void a(long j10, long j11, b2.x xVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.v61 v61Var;
        PhotoViewer photoViewer = this.a;
        if (photoViewer.J4 && (v61Var = photoViewer.F2) != null) {
            org.telegram.messenger.i0.g3(new if0(26, this, v61Var));
        }
    }
}
