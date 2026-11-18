package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class t50 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.fs b;

    public /* synthetic */ t50(org.telegram.messenger.fs fsVar, int i7) {
        this.a = i7;
        this.b = fsVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        switch (this.a) {
            case 0:
                v50 v50Var = (v50) this.b;
                if (v50Var.J == null && surfaceTexture != null) {
                    v50Var.J = new u50(v50Var, surfaceTexture);
                    Intro.onSurfaceChanged(i7, i10, Math.min(i7 / 150.0f, i10 / 150.0f), 0);
                    v50Var.J.postRunnable(new lz(this, 12));
                    u50 u50Var = v50Var.J;
                    u50Var.postRunnable(u50Var.x);
                    break;
                }
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                v50 v50Var = (v50) this.b;
                u50 u50Var = v50Var.J;
                if (u50Var == null) {
                    return true;
                }
                u50Var.postRunnable(new lz(u50Var, 14));
                v50Var.J = null;
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                TextureView textureView = photoViewer.C2;
                if (textureView == null || !photoViewer.F3) {
                    return true;
                }
                if (photoViewer.L3) {
                    photoViewer.G3 = 2;
                }
                textureView.setSurfaceTexture(surfaceTexture);
                photoViewer.C2.setVisibility(0);
                photoViewer.F3 = false;
                photoViewer.f0.invalidate();
                return false;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        switch (this.a) {
            case 0:
                if (((v50) this.b).J != null) {
                    Intro.onSurfaceChanged(i7, i10, Math.min(i7 / 150.0f, i10 / 150.0f), 0);
                    break;
                }
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                if (photoViewer.G3 == 1) {
                    photoViewer.q0(true);
                    break;
                }
                break;
        }
    }

    private final void c(SurfaceTexture surfaceTexture) {
    }

    private final void a(SurfaceTexture surfaceTexture, int i7, int i10) {
    }

    private final void b(SurfaceTexture surfaceTexture, int i7, int i10) {
    }
}
