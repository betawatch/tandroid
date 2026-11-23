package sg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.ba;
import org.telegram.ui.web.t1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class p0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ ba a;
    public final /* synthetic */ t0 b;

    public p0(t0 t0Var, ba baVar) {
        this.b = t0Var;
        this.a = baVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        if (surfaceTexture != null) {
            t0 t0Var = this.b;
            if (t0Var.d != null) {
                return;
            }
            r0 r0Var = new r0(t0Var, surfaceTexture, this.a);
            t0Var.d = r0Var;
            r0Var.n = i7;
            r0Var.r = i10;
            t0Var.i();
            t0Var.post(new o0(this, 1));
            h0 h0Var = t0Var.c;
            if (h0Var.v) {
                h0Var.f.f(new f0(h0Var, h0Var.w, 0));
                h0Var.w = null;
                h0Var.v = false;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        t0 t0Var = this.b;
        if (t0Var.d != null && !t0Var.E) {
            h0 h0Var = t0Var.c;
            h0Var.f.f(new t1(14, h0Var, new o0(this, 2)));
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        t0 t0Var = this.b;
        r0 r0Var = t0Var.d;
        if (r0Var == null) {
            return;
        }
        r0Var.n = i7;
        r0Var.r = i10;
        t0Var.i();
        r0 r0Var2 = t0Var.d;
        r0Var2.postRunnable(r0Var2.x);
        t0Var.d.postRunnable(new o0(this, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
