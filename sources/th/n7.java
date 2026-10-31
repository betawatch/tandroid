package th;

import android.view.SurfaceView;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n7 extends VideoPlayerHolderBase {
    public boolean a;
    public final /* synthetic */ o7 b;

    public n7(o7 o7Var, SurfaceView surfaceView, g7 g7Var) {
        this.b = o7Var;
        if (o7Var.a) {
            with(surfaceView);
        } else {
            with(g7Var);
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final boolean needRepeat() {
        return this.b.m1;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        o7 o7Var = this.b;
        k2.t0 t0Var = o7Var.G0;
        if (t0Var == null) {
            return;
        }
        t0Var.b = true;
        this.firstFrameRendered = true;
        t0Var.b();
        if (!this.paused || o7Var.C0 == null) {
            return;
        }
        prepareStub();
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onStateChanged(boolean z10, int i10) {
        if (i10 == 3 || i10 == 2) {
            if (this.firstFrameRendered && i10 == 2) {
                this.a = true;
                final int i11 = 0;
                org.telegram.messenger.i0.g3(new Runnable(this) { // from class: th.m7
                    public final /* synthetic */ n7 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                z2 H = this.b.b.H();
                                if (H != null) {
                                    y2 y2Var = H.x1;
                                    if (y2Var.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(H.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        i0.a.p(y2Var.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                z2 H2 = this.b.b.H();
                                if (H2 != null) {
                                    y2 y2Var2 = H2.x1;
                                    if (y2Var2.a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(H2.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        i0.a.p(y2Var2.a.id, sb3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
            }
            if (this.a && i10 == 3) {
                this.a = false;
                final int i12 = 1;
                org.telegram.messenger.i0.g3(new Runnable(this) { // from class: th.m7
                    public final /* synthetic */ n7 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                z2 H = this.b.b.H();
                                if (H != null) {
                                    y2 y2Var = H.x1;
                                    if (y2Var.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(H.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        i0.a.p(y2Var.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                z2 H2 = this.b.b.H();
                                if (H2 != null) {
                                    y2 y2Var2 = H2.x1;
                                    if (y2Var2.a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(H2.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        i0.a.p(y2Var2.a.id, sb3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
            }
        }
    }
}
