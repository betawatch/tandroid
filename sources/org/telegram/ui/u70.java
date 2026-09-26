package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class u70 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ u70(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.a) {
            case 0:
                y70 y70Var = (y70) this.b;
                if (y70Var.I == null && surfaceTexture != null) {
                    y70Var.I = new w70(y70Var, surfaceTexture);
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                    y70Var.I.postRunnable(new c10(this, 11));
                    w70 w70Var = y70Var.I;
                    w70Var.postRunnable(w70Var.w);
                    break;
                }
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                y70 y70Var = (y70) this.b;
                w70 w70Var = y70Var.I;
                if (w70Var == null) {
                    return true;
                }
                w70Var.postRunnable(new c10(w70Var, 13));
                y70Var.I = null;
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                if (photoViewer.B2 != null) {
                    org.telegram.ui.Components.og0 og0Var = org.telegram.ui.Components.og0.p0;
                    if (og0Var.P && org.telegram.ui.Components.og0.p() != null && org.telegram.ui.Components.og0.p().b.a != 0) {
                        (og0Var != null ? og0Var.l0 : null).setSurfaceTexture(surfaceTexture);
                        (og0Var != null ? og0Var.l0 : null).setVisibility(0);
                        return false;
                    }
                    if (photoViewer.F3) {
                        if (photoViewer.L3) {
                            photoViewer.G3 = 2;
                        }
                        photoViewer.B2.setSurfaceTexture(surfaceTexture);
                        photoViewer.B2.setVisibility(0);
                        photoViewer.F3 = false;
                        photoViewer.e0.invalidate();
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.a) {
            case 0:
                if (((y70) this.b).I != null) {
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
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
                    photoViewer.x0(true);
                    break;
                }
                break;
        }
    }

    private final void c(SurfaceTexture surfaceTexture) {
    }

    private final void a(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    private final void b(SurfaceTexture surfaceTexture, int i10, int i11) {
    }
}
