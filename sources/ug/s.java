package ug;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public abstract class s extends TextureView implements TextureView.SurfaceTextureListener, Choreographer.FrameCallback {
    public static final p[] x = new p[3];
    public final p a;
    public final Rect b;
    public final Runnable c;
    public final int d;
    public r e;
    public boolean f;
    public boolean h;
    public boolean n;
    public float r;
    public float s;
    public boolean v;
    public boolean w;

    public s(Context context, Runnable runnable, int i10) {
        super(context);
        this.b = new Rect();
        this.h = true;
        this.c = runnable;
        p[] pVarArr = x;
        if (pVarArr[i10] == null) {
            pVarArr[i10] = new p(context.getApplicationContext(), i10);
        }
        p pVar = pVarArr[i10];
        this.a = pVar;
        this.d = pVar.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        if (!this.f || this.h) {
            return;
        }
        this.c.run();
        if (this.e != null) {
            boolean z10 = isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.b);
            this.e.e = z10 ? new q(this.r, this.s, this.v, this.w) : null;
            this.a.c();
        }
        Choreographer.getInstance().postFrameCallback(this);
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f = true;
        setPaused(this.h);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.n = false;
        this.f = false;
        Choreographer.getInstance().removeFrameCallback(this);
        super.onDetachedFromWindow();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.n = false;
        int i12 = this.d;
        surfaceTexture.setDefaultBufferSize(i12, i12);
        r rVar = new r(this, new Surface(surfaceTexture), this.d);
        this.e = rVar;
        p pVar = this.a;
        pVar.f.add(rVar);
        pVar.g = (r[]) pVar.f.toArray(new r[0]);
        pVar.c();
        setPaused(this.h);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.n = false;
        r rVar = this.e;
        this.e = null;
        if (rVar == null) {
            return true;
        }
        p pVar = this.a;
        pVar.getClass();
        rVar.c = false;
        pVar.f.remove(rVar);
        pVar.g = (r[]) pVar.f.toArray(new r[0]);
        pVar.b.post(new s9.g(16, pVar, rVar));
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12 = this.d;
        surfaceTexture.setDefaultBufferSize(i12, i12);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        r rVar;
        int i10 = this.d;
        surfaceTexture.setDefaultBufferSize(i10, i10);
        if (this.n || (rVar = this.e) == null || !rVar.d) {
            return;
        }
        this.n = true;
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void setPaused(boolean z10) {
        this.h = z10;
        Choreographer.getInstance().removeFrameCallback(this);
        if (this.f && !z10) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        r rVar = this.e;
        if (rVar != null) {
            rVar.e = null;
            this.a.c();
        }
    }
}
