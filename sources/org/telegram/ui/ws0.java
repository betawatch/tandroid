package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ws0 extends VideoPlayerRewinder {
    public final /* synthetic */ PhotoViewer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.a = photoViewer;
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.w1.f(false);
        org.telegram.ui.Components.ng0.m0.N.f(false);
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void onRewindStart(boolean z4) {
        PhotoViewer photoViewer = this.a;
        photoViewer.w1.e(false);
        photoViewer.w1.d(!z4);
        photoViewer.w1.f(true);
        photoViewer.b0.invalidate();
        org.telegram.ui.Components.ng0.v(z4);
    }

    @Override // org.telegram.messenger.video.VideoPlayerRewinder
    public final void updateRewindProgressUi(long j10, float f10, boolean z4) {
        PhotoViewer photoViewer = this.a;
        photoViewer.w1.g(Math.abs(j10));
        if (z4) {
            photoViewer.n3.h(f10, false);
            photoViewer.o3.invalidate();
        }
        org.telegram.ui.Components.ng0 ng0Var = org.telegram.ui.Components.ng0.m0;
        ng0Var.N.g(0L);
        if (z4) {
            ng0Var.W = f10;
            oh.b3 b3Var = ng0Var.Y;
            if (b3Var != null) {
                b3Var.invalidate();
            }
            org.telegram.ui.Components.mg0 mg0Var = ng0Var.h;
            if (mg0Var != null) {
                mg0Var.invalidate();
            }
        }
    }
}
