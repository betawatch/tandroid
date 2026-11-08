package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class s50 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.ls b;

    public /* synthetic */ s50(org.telegram.messenger.ls lsVar, int i7) {
        this.a = i7;
        this.b = lsVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        switch (this.a) {
            case 0:
                u50 u50Var = (u50) this.b;
                if (u50Var.I == null && surfaceTexture != null) {
                    u50Var.I = new t50(u50Var, surfaceTexture);
                    Intro.onSurfaceChanged(i7, i10, Math.min(i7 / 150.0f, i10 / 150.0f), 0);
                    u50Var.I.postRunnable(new hz(this, 12));
                    t50 t50Var = u50Var.I;
                    t50Var.postRunnable(t50Var.x);
                    break;
                }
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                u50 u50Var = (u50) this.b;
                t50 t50Var = u50Var.I;
                if (t50Var == null) {
                    return true;
                }
                t50Var.postRunnable(new hz(t50Var, 14));
                u50Var.I = null;
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                TextureView textureView = photoViewer.B2;
                if (textureView == null || !photoViewer.E3) {
                    return true;
                }
                if (photoViewer.K3) {
                    photoViewer.F3 = 2;
                }
                textureView.setSurfaceTexture(surfaceTexture);
                photoViewer.B2.setVisibility(0);
                photoViewer.E3 = false;
                photoViewer.e0.invalidate();
                return false;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        switch (this.a) {
            case 0:
                if (((u50) this.b).I != null) {
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
                if (photoViewer.F3 == 1) {
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
