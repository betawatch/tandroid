package org.telegram.ui;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class qz0 implements org.telegram.ui.Components.l51, org.telegram.ui.Components.h51 {
    public final /* synthetic */ rz0 a;

    public /* synthetic */ qz0(rz0 rz0Var) {
        this.a = rz0Var;
    }

    @Override // org.telegram.ui.Components.h51
    public void F(boolean z9, float[] fArr) {
        this.a.V.e(z9, fArr);
    }

    @Override // org.telegram.ui.Components.l51
    public /* synthetic */ void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.l51
    public void onStateChanged(boolean z9, int i7) {
        rz0 rz0Var = this.a;
        if (i7 == 4) {
            rz0Var.dismiss();
        } else {
            org.telegram.messenger.g0.r(rz0Var.Z);
            org.telegram.messenger.g0.i3(rz0Var.Z, 16L);
        }
    }

    @Override // org.telegram.ui.Components.l51
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.h51
    public boolean s() {
        return this.a.V.i != null;
    }

    @Override // org.telegram.ui.Components.l51
    public void onRenderedFirstFrame() {
        org.telegram.messenger.g0.h3(new qu0(this, 14));
    }

    @Override // org.telegram.ui.Components.l51
    public /* synthetic */ void onSeekFinished(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.l51
    public /* synthetic */ void onSeekStarted(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.l51
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.l51
    public void onError(org.telegram.ui.Components.n51 n51Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.l51
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
    }
}
