package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class r70 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ r70(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.a) {
            case 0:
                u70 u70Var = (u70) this.b;
                if (u70Var.F == null && surfaceTexture != null) {
                    u70Var.F = new t70(u70Var, surfaceTexture);
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                    u70Var.F.postRunnable(new c10(this, 11));
                    t70 t70Var = u70Var.F;
                    t70Var.postRunnable(t70Var.w);
                    break;
                }
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                u70 u70Var = (u70) this.b;
                t70 t70Var = u70Var.F;
                if (t70Var == null) {
                    return true;
                }
                t70Var.postRunnable(new c10(t70Var, 13));
                u70Var.F = null;
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                if (photoViewer.y2 != null) {
                    org.telegram.ui.Components.lg0 lg0Var = org.telegram.ui.Components.lg0.m0;
                    if (lg0Var.M && org.telegram.ui.Components.lg0.p() != null && org.telegram.ui.Components.lg0.p().b.a != 0) {
                        (lg0Var != null ? lg0Var.i0 : null).setSurfaceTexture(surfaceTexture);
                        (lg0Var != null ? lg0Var.i0 : null).setVisibility(0);
                        return false;
                    }
                    if (photoViewer.C3) {
                        if (photoViewer.I3) {
                            photoViewer.D3 = 2;
                        }
                        photoViewer.y2.setSurfaceTexture(surfaceTexture);
                        photoViewer.y2.setVisibility(0);
                        photoViewer.C3 = false;
                        photoViewer.b0.invalidate();
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
                if (((u70) this.b).F != null) {
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
                if (photoViewer.D3 == 1) {
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
