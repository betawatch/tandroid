package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class yo0 extends VideoPlayerRewinder {
    public final /* synthetic */ PhotoViewer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.a = photoViewer;
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.a;
        PhotoViewer.d(photoViewer, obtain);
        photoViewer.A1.f(false);
        org.telegram.ui.Components.ie0.q0.R.f(false);
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.a;
        photoViewer.A1.e(false);
        photoViewer.A1.d(!z10);
        photoViewer.A1.f(true);
        photoViewer.f0.invalidate();
        org.telegram.ui.Components.ie0.v(z10);
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void updateRewindProgressUi(long j10, float f10, boolean z10) {
        PhotoViewer photoViewer = this.a;
        photoViewer.A1.g(Math.abs(j10));
        if (z10) {
            photoViewer.r3.h(false, f10);
            photoViewer.s3.invalidate();
        }
        org.telegram.ui.Components.ie0 ie0Var = org.telegram.ui.Components.ie0.q0;
        ie0Var.R.g(0L);
        if (z10) {
            ie0Var.a0 = f10;
            ei.e3 e3Var = ie0Var.c0;
            if (e3Var != null) {
                e3Var.invalidate();
            }
            org.telegram.ui.Components.ge0 ge0Var = ie0Var.h;
            if (ge0Var != null) {
                ge0Var.invalidate();
            }
        }
    }
}
