package tg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.x9;
import org.telegram.ui.hc1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ x9 a;
    public final /* synthetic */ u0 b;

    public q0(u0 u0Var, x9 x9Var) {
        this.b = u0Var;
        this.a = x9Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i10) {
        if (surfaceTexture != null) {
            u0 u0Var = this.b;
            if (u0Var.d != null) {
                return;
            }
            s0 s0Var = new s0(u0Var, surfaceTexture, this.a);
            u0Var.d = s0Var;
            s0Var.n = i3;
            s0Var.r = i10;
            u0Var.i();
            u0Var.post(new p0(this, 1));
            i0 i0Var = u0Var.c;
            if (i0Var.v) {
                i0Var.f.f(new g0(i0Var, i0Var.w, 0));
                i0Var.w = null;
                i0Var.v = false;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        u0 u0Var = this.b;
        if (u0Var.d != null && !u0Var.E) {
            i0 i0Var = u0Var.c;
            i0Var.f.f(new hc1(28, i0Var, new p0(this, 2)));
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i10) {
        u0 u0Var = this.b;
        s0 s0Var = u0Var.d;
        if (s0Var == null) {
            return;
        }
        s0Var.n = i3;
        s0Var.r = i10;
        u0Var.i();
        s0 s0Var2 = u0Var.d;
        s0Var2.postRunnable(s0Var2.x);
        u0Var.d.postRunnable(new p0(this, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
