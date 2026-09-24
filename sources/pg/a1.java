package pg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.ja;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class a1 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ ja a;
    public final /* synthetic */ f1 b;

    public a1(f1 f1Var, ja jaVar) {
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
            f1Var.post(new z0(this, 1));
            s0 s0Var = f1Var.c;
            if (s0Var.v) {
                s0Var.f.f(new q0(s0Var, s0Var.w, 0));
                s0Var.w = null;
                s0Var.v = false;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        f1 f1Var = this.b;
        if (f1Var.d != null && !f1Var.y) {
            s0 s0Var = f1Var.c;
            s0Var.f.f(new org.telegram.ui.web.f1(7, s0Var, new z0(this, 2)));
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
        f1Var.d.postRunnable(new z0(this, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
