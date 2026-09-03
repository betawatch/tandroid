package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.messenger.Intro;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class t70 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ t70(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        switch (this.a) {
            case 0:
                w70 w70Var = (w70) this.b;
                if (w70Var.F == null && surfaceTexture != null) {
                    w70Var.F = new v70(w70Var, surfaceTexture);
                    Intro.onSurfaceChanged(i10, i11, Math.min(i10 / 150.0f, i11 / 150.0f), 0);
                    w70Var.F.postRunnable(new d10(this, 11));
                    v70 v70Var = w70Var.F;
                    v70Var.postRunnable(v70Var.w);
                    break;
                }
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                w70 w70Var = (w70) this.b;
                v70 v70Var = w70Var.F;
                if (v70Var == null) {
                    return true;
                }
                v70Var.postRunnable(new d10(v70Var, 13));
                w70Var.F = null;
                return true;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                if (photoViewer.y2 != null) {
                    org.telegram.ui.Components.mg0 mg0Var = org.telegram.ui.Components.mg0.m0;
                    if (mg0Var.M && org.telegram.ui.Components.mg0.p() != null && org.telegram.ui.Components.mg0.p().b.a != 0) {
                        (mg0Var != null ? mg0Var.i0 : null).setSurfaceTexture(surfaceTexture);
                        (mg0Var != null ? mg0Var.i0 : null).setVisibility(0);
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
                if (((w70) this.b).F != null) {
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
