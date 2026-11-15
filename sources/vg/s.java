package vg;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import ug.t1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class s extends TextureView implements TextureView.SurfaceTextureListener, Choreographer.FrameCallback {
    public static final p[] y = new p[3];
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
    public boolean w;
    public boolean x;

    public s(Context context, Runnable runnable, int i7) {
        super(context);
        this.b = new Rect();
        this.h = true;
        this.c = runnable;
        p[] pVarArr = y;
        if (pVarArr[i7] == null) {
            pVarArr[i7] = new p(context.getApplicationContext(), i7);
        }
        p pVar = pVarArr[i7];
        this.a = pVar;
        this.d = pVar.d;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        if (!this.f || this.h) {
            return;
        }
        this.c.run();
        if (this.e != null) {
            boolean z10 = isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.b);
            this.e.e = z10 ? new q(this.r, this.s, this.w, this.x) : null;
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
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        this.n = false;
        int i11 = this.d;
        surfaceTexture.setDefaultBufferSize(i11, i11);
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
        pVar.b.post(new t1(4, pVar, rVar));
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        int i11 = this.d;
        surfaceTexture.setDefaultBufferSize(i11, i11);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        r rVar;
        int i7 = this.d;
        surfaceTexture.setDefaultBufferSize(i7, i7);
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
