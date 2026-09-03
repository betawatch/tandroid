package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class s70 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ s70(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.a) {
            case 0:
                v70 v70Var = (v70) this.b;
                if (v70Var.F == null && surfaceTexture != null) {
                    v70Var.F = new u70(v70Var, surfaceTexture);
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                    v70Var.F.postRunnable(new c10(this, 11));
                    u70 u70Var = v70Var.F;
                    u70Var.postRunnable(u70Var.w);
                    break;
                }
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                v70 v70Var = (v70) this.b;
                u70 u70Var = v70Var.F;
                if (u70Var == null) {
                    return true;
                }
                u70Var.postRunnable(new c10(u70Var, 13));
                v70Var.F = null;
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                if (photoViewer.y2 != null) {
                    org.telegram.ui.Components.ng0 ng0Var = org.telegram.ui.Components.ng0.m0;
                    if (ng0Var.M && org.telegram.ui.Components.ng0.p() != null && org.telegram.ui.Components.ng0.p().b.a != 0) {
                        (ng0Var != null ? ng0Var.i0 : null).setSurfaceTexture(surfaceTexture);
                        (ng0Var != null ? ng0Var.i0 : null).setVisibility(0);
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
                if (((v70) this.b).F != null) {
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
