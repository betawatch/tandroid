package sg;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import org.telegram.ui.web.w1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class s extends TextureView implements TextureView.SurfaceTextureListener, Choreographer.FrameCallback {
    public static p w;
    public final Rect a;
    public final Runnable b;
    public final int c;
    public r d;
    public boolean e;
    public boolean f;
    public boolean h;
    public float n;
    public float r;
    public boolean s;
    public boolean v;

    public s(Context context, Runnable runnable) {
        super(context);
        this.a = new Rect();
        this.f = true;
        this.b = runnable;
        if (w == null) {
            w = new p(context.getApplicationContext());
        }
        this.c = w.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        if (!this.e || this.f) {
            return;
        }
        this.b.run();
        if (this.d != null) {
            boolean z10 = isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.a);
            this.d.e = z10 ? new q(this.n, this.r, this.s, this.v) : null;
            w.c();
        }
        Choreographer.getInstance().postFrameCallback(this);
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        setPaused(this.f);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.h = false;
        this.e = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.h = false;
        int i12 = this.c;
        surfaceTexture.setDefaultBufferSize(i12, i12);
        r rVar = new r(this, new Surface(surfaceTexture), this.c);
        this.d = rVar;
        p pVar = w;
        pVar.e.add(rVar);
        pVar.f = (r[]) pVar.e.toArray(new r[0]);
        pVar.c();
        setPaused(this.f);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.h = false;
        r rVar = this.d;
        this.d = null;
        if (rVar == null) {
            return true;
        }
        p pVar = w;
        pVar.getClass();
        rVar.c = false;
        pVar.e.remove(rVar);
        pVar.f = (r[]) pVar.e.toArray(new r[0]);
        pVar.b.post(new w1(20, pVar, rVar));
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12 = this.c;
        surfaceTexture.setDefaultBufferSize(i12, i12);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        r rVar;
        int i10 = this.c;
        surfaceTexture.setDefaultBufferSize(i10, i10);
        if (this.h || (rVar = this.d) == null || !rVar.d) {
            return;
        }
        this.h = true;
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void setPaused(boolean z10) {
        this.f = z10;
        Choreographer.getInstance().removeFrameCallback(this);
        if (this.e && !z10) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        r rVar = this.d;
        if (rVar != null) {
            rVar.e = null;
            w.c();
        }
    }
}
