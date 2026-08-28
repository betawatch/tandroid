package xf;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.ba;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ ba a;
    public final /* synthetic */ c1 b;

    public y0(c1 c1Var, ba baVar) {
        this.b = c1Var;
        this.a = baVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i9, int i10) {
        if (surfaceTexture != null) {
            c1 c1Var = this.b;
            if (c1Var.d != null) {
                return;
            }
            a1 a1Var = new a1(c1Var, surfaceTexture, this.a);
            c1Var.d = a1Var;
            a1Var.n = i9;
            a1Var.r = i10;
            c1Var.i();
            c1Var.post(new x0(this, 1));
            q0 q0Var = c1Var.c;
            if (q0Var.v) {
                q0Var.f.f(new n0(q0Var, q0Var.w, 0));
                q0Var.w = null;
                q0Var.v = false;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        c1 c1Var = this.b;
        if (c1Var.d != null && !c1Var.y) {
            q0 q0Var = c1Var.c;
            q0Var.f.f(new o0(0, q0Var, new x0(this, 2)));
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i9, int i10) {
        c1 c1Var = this.b;
        a1 a1Var = c1Var.d;
        if (a1Var == null) {
            return;
        }
        a1Var.n = i9;
        a1Var.r = i10;
        c1Var.i();
        a1 a1Var2 = c1Var.d;
        a1Var2.postRunnable(a1Var2.w);
        c1Var.d.postRunnable(new x0(this, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
