package ti;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.web.w;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class p extends TextureView implements TextureView.SurfaceTextureListener {
    public SurfaceTexture a;
    public TextureView.SurfaceTextureListener b;
    public Runnable c;
    public long d;

    public p(Activity activity) {
        super(activity);
        setOpaque(false);
        super.setSurfaceTextureListener(this);
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        if (this.a != null) {
            SurfaceTexture surfaceTexture = getSurfaceTexture();
            SurfaceTexture surfaceTexture2 = this.a;
            if (surfaceTexture != surfaceTexture2) {
                setSurfaceTexture(surfaceTexture2);
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        this.a = surfaceTexture;
        TextureView.SurfaceTextureListener surfaceTextureListener = this.b;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i7, i10);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (surfaceTexture == this.a) {
            post(new w(25, this, surfaceTexture));
            return false;
        }
        TextureView.SurfaceTextureListener surfaceTextureListener = this.b;
        return surfaceTextureListener == null || surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.b;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i7, i10);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.b;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
        if (this.c != null) {
            if (this.d == 0 || surfaceTexture.getTimestamp() != this.d) {
                Runnable runnable = this.c;
                this.c = null;
                runnable.run();
            }
        }
    }

    public void setFirstFrameCallback(Runnable runnable) {
        this.c = runnable;
        SurfaceTexture surfaceTexture = this.a;
        this.d = surfaceTexture != null ? surfaceTexture.getTimestamp() : 0L;
    }

    @Override // android.view.TextureView
    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.b = surfaceTextureListener;
    }
}
