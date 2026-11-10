package org.telegram.ui;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class uz0 implements org.telegram.ui.Components.q51, org.telegram.ui.Components.m51 {
    public final /* synthetic */ vz0 a;

    public /* synthetic */ uz0(vz0 vz0Var) {
        this.a = vz0Var;
    }

    @Override // org.telegram.ui.Components.m51
    public void F(boolean z9, float[] fArr) {
        this.a.V.e(z9, fArr);
    }

    @Override // org.telegram.ui.Components.q51
    public /* synthetic */ void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q51
    public void onStateChanged(boolean z9, int i7) {
        vz0 vz0Var = this.a;
        if (i7 == 4) {
            vz0Var.dismiss();
        } else {
            org.telegram.messenger.g0.r(vz0Var.Z);
            org.telegram.messenger.g0.i3(vz0Var.Z, 16L);
        }
    }

    @Override // org.telegram.ui.Components.q51
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.m51
    public boolean s() {
        return this.a.V.i != null;
    }

    @Override // org.telegram.ui.Components.q51
    public void onRenderedFirstFrame() {
        org.telegram.messenger.g0.h3(new uu0(this, 14));
    }

    @Override // org.telegram.ui.Components.q51
    public /* synthetic */ void onSeekFinished(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q51
    public /* synthetic */ void onSeekStarted(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q51
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.q51
    public void onError(org.telegram.ui.Components.t51 t51Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.q51
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
    }
}
