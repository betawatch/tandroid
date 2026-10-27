package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class zs0 extends VideoPlayerRewinder {
    public final /* synthetic */ PhotoViewer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zs0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.a = photoViewer;
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.z1.f(false);
        org.telegram.ui.Components.dh0.p0.Q.f(false);
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.a;
        photoViewer.z1.e(false);
        photoViewer.z1.d(!z10);
        photoViewer.z1.f(true);
        photoViewer.e0.invalidate();
        org.telegram.ui.Components.dh0.v(z10);
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void updateRewindProgressUi(long j10, float f7, boolean z10) {
        PhotoViewer photoViewer = this.a;
        photoViewer.z1.g(Math.abs(j10));
        if (z10) {
            photoViewer.q3.h(f7, false);
            photoViewer.r3.invalidate();
        }
        org.telegram.ui.Components.dh0 dh0Var = org.telegram.ui.Components.dh0.p0;
        dh0Var.Q.g(0L);
        if (z10) {
            dh0Var.Z = f7;
            di.h3 h3Var = dh0Var.b0;
            if (h3Var != null) {
                h3Var.invalidate();
            }
            org.telegram.ui.Components.ch0 ch0Var = dh0Var.h;
            if (ch0Var != null) {
                ch0Var.invalidate();
            }
        }
    }
}
