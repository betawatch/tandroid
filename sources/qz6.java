// default package

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class qz6 implements SurfaceHolder {
    public final Surface a;
    public final Rect b;
    public SurfaceHolder.Callback c;

    public qz6(Surface surface, int i, int i2) {
        Rect rect = new Rect();
        this.b = rect;
        this.a = surface;
        rect.set(0, 0, i, i2);
    }

    @Override // android.view.SurfaceHolder
    public final void addCallback(SurfaceHolder.Callback callback) {
        this.c = callback;
    }

    @Override // android.view.SurfaceHolder
    public final Surface getSurface() {
        return this.a;
    }

    @Override // android.view.SurfaceHolder
    public final Rect getSurfaceFrame() {
        return this.b;
    }

    @Override // android.view.SurfaceHolder
    public final boolean isCreating() {
        return false;
    }

    @Override // android.view.SurfaceHolder
    public final Canvas lockCanvas() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.SurfaceHolder
    public final void removeCallback(SurfaceHolder.Callback callback) {
        if (this.c == callback) {
            this.c = null;
        }
    }

    @Override // android.view.SurfaceHolder
    public final void setFixedSize(int i, int i2) {
        this.b.set(0, 0, i, i2);
        SurfaceHolder.Callback callback = this.c;
        if (callback != null) {
            callback.surfaceChanged(this, 1, i, i2);
        }
    }

    @Override // android.view.SurfaceHolder
    public final Canvas lockCanvas(Rect rect) {
        throw new UnsupportedOperationException();
    }

    public qz6(Surface surface) {
        this.b = new Rect();
        this.a = surface;
    }

    @Override // android.view.SurfaceHolder
    public final void setSizeFromLayout() {
    }

    @Override // android.view.SurfaceHolder
    public final void setFormat(int i) {
    }

    @Override // android.view.SurfaceHolder
    public final void setKeepScreenOn(boolean z) {
    }

    @Override // android.view.SurfaceHolder
    public final void setType(int i) {
    }

    @Override // android.view.SurfaceHolder
    public final void unlockCanvasAndPost(Canvas canvas) {
    }
}
