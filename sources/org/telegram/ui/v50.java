package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class v50 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.ls b;

    public /* synthetic */ v50(org.telegram.messenger.ls lsVar, int i7) {
        this.a = i7;
        this.b = lsVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        switch (this.a) {
            case 0:
                x50 x50Var = (x50) this.b;
                if (x50Var.I == null && surfaceTexture != null) {
                    x50Var.I = new w50(x50Var, surfaceTexture);
                    Intro.onSurfaceChanged(i7, i10, Math.min(i7 / 150.0f, i10 / 150.0f), 0);
                    x50Var.I.postRunnable(new kz(this, 12));
                    w50 w50Var = x50Var.I;
                    w50Var.postRunnable(w50Var.x);
                    break;
                }
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                x50 x50Var = (x50) this.b;
                w50 w50Var = x50Var.I;
                if (w50Var == null) {
                    return true;
                }
                w50Var.postRunnable(new kz(w50Var, 14));
                x50Var.I = null;
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
                if (((x50) this.b).I != null) {
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
