package org.telegram.ui;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class sz0 implements org.telegram.ui.Components.d61, org.telegram.ui.Components.z51 {
    public final /* synthetic */ tz0 a;

    public /* synthetic */ sz0(tz0 tz0Var) {
        this.a = tz0Var;
    }

    @Override // org.telegram.ui.Components.d61
    public /* synthetic */ void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.d61
    public void onStateChanged(boolean z10, int i7) {
        tz0 tz0Var = this.a;
        if (i7 == 4) {
            tz0Var.dismiss();
        } else {
            org.telegram.messenger.g0.r(tz0Var.a0);
            org.telegram.messenger.g0.h3(tz0Var.a0, 16L);
        }
    }

    @Override // org.telegram.ui.Components.d61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.z51
    public boolean t() {
        return this.a.W.i != null;
    }

    @Override // org.telegram.ui.Components.z51
    public void x(boolean z10, float[] fArr) {
        this.a.W.e(z10, fArr);
    }

    @Override // org.telegram.ui.Components.d61
    public void onRenderedFirstFrame() {
        org.telegram.messenger.g0.g3(new ru0(this, 14));
    }

    @Override // org.telegram.ui.Components.d61
    public /* synthetic */ void onSeekFinished(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.d61
    public /* synthetic */ void onSeekStarted(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.d61
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.d61
    public void onError(org.telegram.ui.Components.f61 f61Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.d61
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
    }
}
