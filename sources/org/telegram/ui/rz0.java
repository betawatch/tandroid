package org.telegram.ui;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class rz0 implements org.telegram.ui.Components.f61, org.telegram.ui.Components.b61 {
    public final /* synthetic */ sz0 a;

    public /* synthetic */ rz0(sz0 sz0Var) {
        this.a = sz0Var;
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.f61
    public void onStateChanged(boolean z10, int i7) {
        sz0 sz0Var = this.a;
        if (i7 == 4) {
            sz0Var.dismiss();
        } else {
            org.telegram.messenger.g0.r(sz0Var.a0);
            org.telegram.messenger.g0.h3(sz0Var.a0, 16L);
        }
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.b61
    public boolean r() {
        return this.a.W.i != null;
    }

    @Override // org.telegram.ui.Components.b61
    public void w(boolean z10, float[] fArr) {
        this.a.W.e(z10, fArr);
    }

    @Override // org.telegram.ui.Components.f61
    public void onRenderedFirstFrame() {
        org.telegram.messenger.g0.g3(new qu0(this, 14));
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ void onSeekFinished(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ void onSeekStarted(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.f61
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.f61
    public void onError(org.telegram.ui.Components.h61 h61Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.f61
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
    }
}
