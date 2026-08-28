package org.telegram.ui;

import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class z2 extends VideoPlayerHolderBase {
    public final /* synthetic */ a3 a;

    public z2(a3 a3Var) {
        this.a = a3Var;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final boolean needRepeat() {
        return true;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        super.onRenderedFirstFrame();
        if (this.firstFrameRendered) {
            return;
        }
        this.firstFrameRendered = true;
        a3 a3Var = this.a;
        a3Var.n.setAlpha(1.0f);
        TL_iv.pageBlockVideo pageblockvideo = a3Var.H;
        if (pageblockvideo != null) {
            a70 a70Var = a3Var.a;
            a0.h hVar = a70Var.y;
            long j10 = pageblockvideo.video_id;
            b3 a2 = b3.a(a70Var.w, a3Var);
            a3Var.c(a2);
            hVar.k(a2, j10);
        }
    }
}
