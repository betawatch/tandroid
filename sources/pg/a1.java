package pg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.ja;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class a1 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ ja a;
    public final /* synthetic */ e1 b;

    public a1(e1 e1Var, ja jaVar) {
        this.b = e1Var;
        this.a = jaVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            e1 e1Var = this.b;
            if (e1Var.d != null) {
                return;
            }
            c1 c1Var = new c1(e1Var, surfaceTexture, this.a);
            e1Var.d = c1Var;
            c1Var.n = i10;
            c1Var.r = i11;
            e1Var.i();
            e1Var.post(new z0(this, 1));
            s0 s0Var = e1Var.c;
            if (s0Var.v) {
                s0Var.f.f(new q0(s0Var, s0Var.w, 0));
                s0Var.w = null;
                s0Var.v = false;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        e1 e1Var = this.b;
        if (e1Var.d != null && !e1Var.y) {
            s0 s0Var = e1Var.c;
            s0Var.f.f(new org.telegram.ui.web.p1(5, s0Var, new z0(this, 2)));
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        e1 e1Var = this.b;
        c1 c1Var = e1Var.d;
        if (c1Var == null) {
            return;
        }
        c1Var.n = i10;
        c1Var.r = i11;
        e1Var.i();
        c1 c1Var2 = e1Var.d;
        c1Var2.postRunnable(c1Var2.w);
        e1Var.d.postRunnable(new z0(this, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
