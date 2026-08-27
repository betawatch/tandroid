package yf;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.z9;
import rh.o2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class x0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ z9 a;
    public final /* synthetic */ b1 b;

    public x0(b1 b1Var, z9 z9Var) {
        this.b = b1Var;
        this.a = z9Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            b1 b1Var = this.b;
            if (b1Var.d != null) {
                return;
            }
            z0 z0Var = new z0(b1Var, surfaceTexture, this.a);
            b1Var.d = z0Var;
            z0Var.n = i10;
            z0Var.r = i11;
            b1Var.i();
            b1Var.post(new w0(this, 1));
            p0 p0Var = b1Var.c;
            if (p0Var.v) {
                p0Var.f.f(new n0(p0Var, p0Var.w, 0));
                p0Var.w = null;
                p0Var.v = false;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        b1 b1Var = this.b;
        if (b1Var.d != null && !b1Var.y) {
            p0 p0Var = b1Var.c;
            p0Var.f.f(new o2(6, p0Var, new w0(this, 2)));
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        b1 b1Var = this.b;
        z0 z0Var = b1Var.d;
        if (z0Var == null) {
            return;
        }
        z0Var.n = i10;
        z0Var.r = i11;
        b1Var.i();
        z0 z0Var2 = b1Var.d;
        z0Var2.postRunnable(z0Var2.w);
        b1Var.d.postRunnable(new w0(this, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
