package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class r50 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.is b;

    public /* synthetic */ r50(org.telegram.messenger.is isVar, int i7) {
        this.a = i7;
        this.b = isVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        switch (this.a) {
            case 0:
                t50 t50Var = (t50) this.b;
                if (t50Var.J == null && surfaceTexture != null) {
                    t50Var.J = new s50(t50Var, surfaceTexture);
                    Intro.onSurfaceChanged(i7, i10, Math.min(i7 / 150.0f, i10 / 150.0f), 0);
                    t50Var.J.postRunnable(new iz(this, 12));
                    s50 s50Var = t50Var.J;
                    s50Var.postRunnable(s50Var.x);
                    break;
                }
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                t50 t50Var = (t50) this.b;
                s50 s50Var = t50Var.J;
                if (s50Var == null) {
                    return true;
                }
                s50Var.postRunnable(new iz(s50Var, 14));
                t50Var.J = null;
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
                if (((t50) this.b).J != null) {
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
