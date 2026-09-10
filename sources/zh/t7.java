package zh;

import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class t7 extends VideoPlayerHolderBase {
    public boolean a;
    public final /* synthetic */ u7 b;

    public t7(u7 u7Var, SurfaceView surfaceView, m7 m7Var) {
        this.b = u7Var;
        if (u7Var.a) {
            with(surfaceView);
        } else {
            with(m7Var);
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final boolean needRepeat() {
        return this.b.m1;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        u7 u7Var = this.b;
        k2.v vVar = u7Var.G0;
        if (vVar == null) {
            return;
        }
        vVar.a = true;
        this.firstFrameRendered = true;
        vVar.b();
        if (!this.paused || u7Var.C0 == null) {
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
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: zh.s7
                    public final /* synthetic */ t7 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                a3 t10 = this.b.b.t();
                                if (t10 != null) {
                                    z2 z2Var = t10.O1;
                                    if (z2Var.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        hc.b.q(z2Var.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                a3 t11 = this.b.b.t();
                                if (t11 != null) {
                                    z2 z2Var2 = t11.O1;
                                    if (z2Var2.a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        hc.b.q(z2Var2.a.id, sb3);
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
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: zh.s7
                    public final /* synthetic */ t7 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                a3 t10 = this.b.b.t();
                                if (t10 != null) {
                                    z2 z2Var = t10.O1;
                                    if (z2Var.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        hc.b.q(z2Var.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                a3 t11 = this.b.b.t();
                                if (t11 != null) {
                                    z2 z2Var2 = t11.O1;
                                    if (z2Var2.a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        hc.b.q(z2Var2.a.id, sb3);
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
