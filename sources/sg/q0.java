package sg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.ca;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class q0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ ca a;
    public final /* synthetic */ u0 b;

    public q0(u0 u0Var, ca caVar) {
        this.b = u0Var;
        this.a = caVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        if (surfaceTexture != null) {
            u0 u0Var = this.b;
            if (u0Var.d != null) {
                return;
            }
            s0 s0Var = new s0(u0Var, surfaceTexture, this.a);
            u0Var.d = s0Var;
            s0Var.n = i7;
            s0Var.r = i10;
            u0Var.i();
            u0Var.post(new p0(this, 1));
            i0 i0Var = u0Var.c;
            if (i0Var.v) {
                i0Var.f.f(new f0(i0Var, i0Var.w, 0));
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
            i0Var.f.f(new p4.z(10, i0Var, new p0(this, 2)));
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        u0 u0Var = this.b;
        s0 s0Var = u0Var.d;
        if (s0Var == null) {
            return;
        }
        s0Var.n = i7;
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
