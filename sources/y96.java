// default package

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class y96 implements aq9, TextureView.SurfaceTextureListener {
    public final bd8 a;
    public volatile Surface b;
    public boolean c;

    public y96(bd8 bd8Var) {
        this.a = bd8Var;
        bd8Var.setSurfaceTextureListener(this);
        SurfaceTexture surfaceTexture = bd8Var.getSurfaceTexture();
        if (surfaceTexture != null) {
            this.b = new Surface(surfaceTexture);
        }
    }

    @Override // aq9
    public final boolean b() {
        return true;
    }

    public final void c(SurfaceTexture surfaceTexture) {
        if (this.c) {
            if (surfaceTexture != null) {
                vo9.I(this, new kg5(surfaceTexture, (byte) 23));
            }
        } else {
            this.c = true;
            Surface surface = this.b;
            this.b = null;
            vo9.I(this, new x96(surface, surfaceTexture, (byte) 1));
        }
    }

    @Override // aq9
    public final Surface getSurface() {
        return this.b;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.c) {
            return;
        }
        this.b = new Surface(surfaceTexture);
        vo9.I(this, null);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (this.c) {
            return false;
        }
        Surface surface = this.b;
        this.b = null;
        vo9.I(this, new x96(surface, surfaceTexture, (byte) 0));
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // aq9
    public final void a(int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
