package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class z41 implements org.telegram.ui.Components.c71, org.telegram.ui.Components.y61 {
    public final /* synthetic */ a51 a;

    public /* synthetic */ z41(a51 a51Var) {
        this.a = a51Var;
    }

    @Override // org.telegram.ui.Components.y61
    public boolean needUpdate() {
        return this.a.V.i != null;
    }

    @Override // org.telegram.ui.Components.c71
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.c71
    public void onStateChanged(boolean z10, int i10) {
        a51 a51Var = this.a;
        if (i10 == 4) {
            a51Var.dismiss();
        } else {
            AndroidUtilities.cancelRunOnUIThread(a51Var.Z);
            AndroidUtilities.runOnUIThread(a51Var.Z, 16L);
        }
    }

    @Override // org.telegram.ui.Components.c71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.y61
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.a.V.e(z10, true, fArr);
    }

    @Override // org.telegram.ui.Components.c71
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new xz0(this, 12));
    }

    @Override // org.telegram.ui.Components.c71
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.c71
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.c71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.c71
    public void onError(org.telegram.ui.Components.f71 f71Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.c71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
