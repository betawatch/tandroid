package pg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.ia;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class a1 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ ia a;
    public final /* synthetic */ f1 b;

    public a1(f1 f1Var, ia iaVar) {
        this.b = f1Var;
        this.a = iaVar;
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
            s0Var.f.f(new org.telegram.ui.web.g1(7, s0Var, new z0(this, 2)));
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
