package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class v41 implements org.telegram.ui.Components.g71, org.telegram.ui.Components.c71 {
    public final /* synthetic */ w41 a;

    public /* synthetic */ v41(w41 w41Var) {
        this.a = w41Var;
    }

    @Override // org.telegram.ui.Components.c71
    public boolean needUpdate() {
        return this.a.S.i != null;
    }

    @Override // org.telegram.ui.Components.g71
    public /* synthetic */ void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.g71
    public void onStateChanged(boolean z4, int i10) {
        w41 w41Var = this.a;
        if (i10 == 4) {
            w41Var.dismiss();
        } else {
            AndroidUtilities.cancelRunOnUIThread(w41Var.W);
            AndroidUtilities.runOnUIThread(w41Var.W, 16L);
        }
    }

    @Override // org.telegram.ui.Components.g71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.c71
    public void onVisualizerUpdate(boolean z4, boolean z10, float[] fArr) {
        this.a.S.e(z4, true, fArr);
    }

    @Override // org.telegram.ui.Components.g71
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new sz0(this, 12));
    }

    @Override // org.telegram.ui.Components.g71
    public /* synthetic */ void onSeekFinished(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.g71
    public /* synthetic */ void onSeekStarted(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.g71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.g71
    public void onError(org.telegram.ui.Components.j71 j71Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.g71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
    }
}
