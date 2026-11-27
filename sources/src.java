// default package

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class src extends TextureView implements TextureView.SurfaceTextureListener, Choreographer.FrameCallback {
    public static final prc[] y = new prc[3];
    public final prc a;
    public final Rect b;
    public final Runnable c;
    public final short d;
    public rrc e;
    public boolean f;
    public boolean h;
    public boolean n;
    public float r;
    public float s;
    public boolean w;
    public boolean x;

    public src(Context context, Runnable runnable, int i) {
        super(context);
        this.b = new Rect();
        this.h = true;
        this.c = runnable;
        prc[] prcVarArr = y;
        if (prcVarArr[i] == null) {
            prcVarArr[i] = new prc(context.getApplicationContext(), i);
        }
        prc prcVar = prcVarArr[i];
        this.a = prcVar;
        prcVar.getClass();
        this.d = (short) 378;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public abstract void a();

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (!this.f || this.h) {
            return;
        }
        this.c.run();
        if (this.e != null) {
            boolean z = isShown() && getWindowVisibility() == 0 && getGlobalVisibleRect(this.b);
            this.e.e = z ? new qrc(this.r, this.s, this.w, this.x) : null;
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
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.n = false;
        short s = this.d;
        surfaceTexture.setDefaultBufferSize(s, s);
        rrc rrcVar = new rrc(this, new Surface(surfaceTexture), this.d);
        this.e = rrcVar;
        prc prcVar = this.a;
        prcVar.e.add(rrcVar);
        prcVar.f = (rrc[]) prcVar.e.toArray(new rrc[0]);
        prcVar.c();
        setPaused(this.h);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.n = false;
        rrc rrcVar = this.e;
        this.e = null;
        if (rrcVar == null) {
            return true;
        }
        prc prcVar = this.a;
        prcVar.getClass();
        rrcVar.c = false;
        prcVar.e.remove(rrcVar);
        prcVar.f = (rrc[]) prcVar.e.toArray(new rrc[0]);
        prcVar.b.post(new slc(prcVar, rrcVar, (byte) 18));
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        short s = this.d;
        surfaceTexture.setDefaultBufferSize(s, s);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        rrc rrcVar;
        short s = this.d;
        surfaceTexture.setDefaultBufferSize(s, s);
        if (this.n || (rrcVar = this.e) == null || !rrcVar.d) {
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

    public void setPaused(boolean z) {
        this.h = z;
        Choreographer.getInstance().removeFrameCallback(this);
        if (this.f && !z) {
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        rrc rrcVar = this.e;
        if (rrcVar != null) {
            rrcVar.e = null;
            this.a.c();
        }
    }
}
