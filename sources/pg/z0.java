package pg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.ja;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class z0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ ja a;
    public final /* synthetic */ d1 b;

    public z0(d1 d1Var, ja jaVar) {
        this.b = d1Var;
        this.a = jaVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            d1 d1Var = this.b;
            if (d1Var.d != null) {
                return;
            }
            b1 b1Var = new b1(d1Var, surfaceTexture, this.a);
            d1Var.d = b1Var;
            b1Var.n = i10;
            b1Var.r = i11;
            d1Var.i();
            d1Var.post(new y0(this, 1));
            r0 r0Var = d1Var.c;
            if (r0Var.v) {
                r0Var.f.f(new p0(r0Var, r0Var.w, 0));
                r0Var.w = null;
                r0Var.v = false;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        d1 d1Var = this.b;
        if (d1Var.d != null && !d1Var.y) {
            r0 r0Var = d1Var.c;
            r0Var.f.f(new p2.b(1, r0Var, new y0(this, 2)));
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        d1 d1Var = this.b;
        b1 b1Var = d1Var.d;
        if (b1Var == null) {
            return;
        }
        b1Var.n = i10;
        b1Var.r = i11;
        d1Var.i();
        b1 b1Var2 = d1Var.d;
        b1Var2.postRunnable(b1Var2.w);
        d1Var.d.postRunnable(new y0(this, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
