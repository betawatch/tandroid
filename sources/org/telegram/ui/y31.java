package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class y31 implements org.telegram.ui.Components.x71, org.telegram.ui.Components.t71 {
    public final /* synthetic */ z31 a;

    public /* synthetic */ y31(z31 z31Var) {
        this.a = z31Var;
    }

    @Override // org.telegram.ui.Components.t71
    public boolean needUpdate() {
        return this.a.V.i != null;
    }

    @Override // org.telegram.ui.Components.x71
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.x71
    public void onStateChanged(boolean z10, int i10) {
        z31 z31Var = this.a;
        if (i10 == 4) {
            z31Var.dismiss();
        } else {
            AndroidUtilities.cancelRunOnUIThread(z31Var.Z);
            AndroidUtilities.runOnUIThread(z31Var.Z, 16L);
        }
    }

    @Override // org.telegram.ui.Components.x71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.t71
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.a.V.e(z10, true, fArr);
    }

    @Override // org.telegram.ui.Components.x71
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new sy0(this, 13));
    }

    @Override // org.telegram.ui.Components.x71
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.x71
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.x71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.x71
    public void onError(org.telegram.ui.Components.a81 a81Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.x71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
