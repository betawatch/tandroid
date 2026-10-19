package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class w31 implements org.telegram.ui.Components.y71, org.telegram.ui.Components.u71 {
    public final /* synthetic */ x31 a;

    public /* synthetic */ w31(x31 x31Var) {
        this.a = x31Var;
    }

    @Override // org.telegram.ui.Components.u71
    public boolean needUpdate() {
        return this.a.V.i != null;
    }

    @Override // org.telegram.ui.Components.y71
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.y71
    public void onStateChanged(boolean z10, int i10) {
        x31 x31Var = this.a;
        if (i10 == 4) {
            x31Var.dismiss();
        } else {
            AndroidUtilities.cancelRunOnUIThread(x31Var.Z);
            AndroidUtilities.runOnUIThread(x31Var.Z, 16L);
        }
    }

    @Override // org.telegram.ui.Components.y71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.u71
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.a.V.e(z10, true, fArr);
    }

    @Override // org.telegram.ui.Components.y71
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new qy0(this, 13));
    }

    @Override // org.telegram.ui.Components.y71
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.y71
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.y71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.y71
    public void onError(org.telegram.ui.Components.b81 b81Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.y71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
