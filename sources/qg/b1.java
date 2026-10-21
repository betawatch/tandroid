package qg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.ja;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class b1 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ ja a;
    public final /* synthetic */ f1 b;

    public b1(f1 f1Var, ja jaVar) {
        this.b = f1Var;
        this.a = jaVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            f1 f1Var = this.b;
            if (f1Var.d != null) {
                return;
            }
            d1 d1Var = new d1(f1Var, surfaceTexture, this.a);
            f1Var.d = d1Var;
            d1Var.n = i10;
            d1Var.r = i11;
            f1Var.i();
            f1Var.post(new a1(this, 1));
            t0 t0Var = f1Var.c;
            if (t0Var.v) {
                t0Var.f.f(new r0(t0Var, t0Var.w, 0));
                t0Var.w = null;
                t0Var.v = false;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        f1 f1Var = this.b;
        if (f1Var.d != null && !f1Var.y) {
            t0 t0Var = f1Var.c;
            t0Var.f.f(new p2.b(1, t0Var, new a1(this, 2)));
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        f1 f1Var = this.b;
        d1 d1Var = f1Var.d;
        if (d1Var == null) {
            return;
        }
        d1Var.n = i10;
        d1Var.r = i11;
        f1Var.i();
        d1 d1Var2 = f1Var.d;
        d1Var2.postRunnable(d1Var2.w);
        f1Var.d.postRunnable(new a1(this, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
