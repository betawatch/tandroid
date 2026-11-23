package org.telegram.ui;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class tz0 implements org.telegram.ui.Components.g61, org.telegram.ui.Components.c61 {
    public final /* synthetic */ uz0 a;

    public /* synthetic */ tz0(uz0 uz0Var) {
        this.a = uz0Var;
    }

    @Override // org.telegram.ui.Components.g61
    public /* synthetic */ void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.g61
    public void onStateChanged(boolean z10, int i7) {
        uz0 uz0Var = this.a;
        if (i7 == 4) {
            uz0Var.dismiss();
        } else {
            org.telegram.messenger.g0.r(uz0Var.a0);
            org.telegram.messenger.g0.h3(uz0Var.a0, 16L);
        }
    }

    @Override // org.telegram.ui.Components.g61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.c61
    public boolean t() {
        return this.a.W.i != null;
    }

    @Override // org.telegram.ui.Components.c61
    public void x(boolean z10, float[] fArr) {
        this.a.W.e(z10, fArr);
    }

    @Override // org.telegram.ui.Components.g61
    public void onRenderedFirstFrame() {
        org.telegram.messenger.g0.g3(new ru0(this, 14));
    }

    @Override // org.telegram.ui.Components.g61
    public /* synthetic */ void onSeekFinished(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.g61
    public /* synthetic */ void onSeekStarted(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.g61
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.g61
    public void onError(org.telegram.ui.Components.i61 i61Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.g61
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
    }
}
