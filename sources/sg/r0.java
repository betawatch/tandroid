package sg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.y9;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class r0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ y9 a;
    public final /* synthetic */ w0 b;

    public r0(w0 w0Var, y9 y9Var) {
        this.b = w0Var;
        this.a = y9Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        if (surfaceTexture != null) {
            w0 w0Var = this.b;
            if (w0Var.d != null) {
                return;
            }
            u0 u0Var = new u0(w0Var, surfaceTexture, this.a);
            w0Var.d = u0Var;
            u0Var.n = i7;
            u0Var.r = i10;
            w0Var.i();
            w0Var.post(new q0(this, 1));
            j0 j0Var = w0Var.c;
            if (j0Var.v) {
                j0Var.f.f(new g0(j0Var, j0Var.w, 0));
                j0Var.w = null;
                j0Var.v = false;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        w0 w0Var = this.b;
        if (w0Var.d != null && !w0Var.D) {
            j0 j0Var = w0Var.c;
            j0Var.f.f(new org.telegram.ui.web.w(23, j0Var, new q0(this, 2)));
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        w0 w0Var = this.b;
        u0 u0Var = w0Var.d;
        if (u0Var == null) {
            return;
        }
        u0Var.n = i7;
        u0Var.r = i10;
        w0Var.i();
        u0 u0Var2 = w0Var.d;
        u0Var2.postRunnable(u0Var2.x);
        w0Var.d.postRunnable(new q0(this, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
