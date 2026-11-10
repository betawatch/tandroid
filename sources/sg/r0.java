package sg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.x9;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class r0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ x9 a;
    public final /* synthetic */ v0 b;

    public r0(v0 v0Var, x9 x9Var) {
        this.b = v0Var;
        this.a = x9Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        if (surfaceTexture != null) {
            v0 v0Var = this.b;
            if (v0Var.d != null) {
                return;
            }
            t0 t0Var = new t0(v0Var, surfaceTexture, this.a);
            v0Var.d = t0Var;
            t0Var.n = i7;
            t0Var.r = i10;
            v0Var.i();
            v0Var.post(new q0(this, 1));
            j0 j0Var = v0Var.c;
            if (j0Var.v) {
                j0Var.f.f(new g0(j0Var, j0Var.w, 0));
                j0Var.w = null;
                j0Var.v = false;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        v0 v0Var = this.b;
        if (v0Var.d != null && !v0Var.D) {
            j0 j0Var = v0Var.c;
            j0Var.f.f(new org.telegram.ui.web.s(19, j0Var, new q0(this, 2)));
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        v0 v0Var = this.b;
        t0 t0Var = v0Var.d;
        if (t0Var == null) {
            return;
        }
        t0Var.n = i7;
        t0Var.r = i10;
        v0Var.i();
        t0 t0Var2 = v0Var.d;
        t0Var2.postRunnable(t0Var2.x);
        v0Var.d.postRunnable(new q0(this, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
