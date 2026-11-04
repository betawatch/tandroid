package wg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.voip.u;
import org.telegram.ui.Components.xq;
import vg.t1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class m extends TextureView implements TextureView.SurfaceTextureListener, z5 {
    public volatile int E;
    public int F;
    public int G;
    public volatile boolean H;
    public volatile boolean I;
    public boolean J;
    public volatile l K;
    public final int L;
    public final long M;
    public boolean N;
    public final int O;
    public int P;
    public final ArrayList Q;
    public boolean R;
    public t1 S;
    public final int T;
    public volatile boolean U;
    public final int[] V;
    public final int[] W;
    public boolean a;
    public volatile boolean a0;
    public f b;
    public volatile Runnable b0;
    public SurfaceTexture c;
    public final GestureDetector c0;
    public final Object d;
    public ValueAnimator d0;
    public f e;
    public AnimatorSet e0;
    public EGLDisplay f;
    public final i f0;
    public final g g0;
    public EGLSurface h;
    public final g h0;
    public final g i0;
    public EGLContext n;
    public EGL10 r;
    public EGLConfig s;
    public GL10 w;
    public long x;
    public volatile int y;

    /* JADX WARN: Type inference failed for: r2v5, types: [wg.g] */
    /* JADX WARN: Type inference failed for: r2v6, types: [wg.g] */
    /* JADX WARN: Type inference failed for: r2v7, types: [wg.g] */
    public m(Context context, int i3, int i10) {
        super(context);
        this.d = new Object();
        this.H = true;
        int i11 = 0;
        this.I = false;
        this.J = false;
        this.N = true;
        this.Q = new ArrayList();
        this.V = new int[1];
        this.W = new int[1];
        this.e0 = new AnimatorSet();
        final int i12 = 0;
        this.f0 = new i(this, 0);
        this.g0 = new ValueAnimator.AnimatorUpdateListener(this) { // from class: wg.g
            public final /* synthetic */ m b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i12) {
                    case 0:
                        this.b.b.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 1:
                        this.b.b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    default:
                        this.b.b.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                }
            }
        };
        final int i13 = 1;
        this.h0 = new ValueAnimator.AnimatorUpdateListener(this) { // from class: wg.g
            public final /* synthetic */ m b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i13) {
                    case 0:
                        this.b.b.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 1:
                        this.b.b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    default:
                        this.b.b.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                }
            }
        };
        final int i14 = 2;
        this.i0 = new ValueAnimator.AnimatorUpdateListener(this) { // from class: wg.g
            public final /* synthetic */ m b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i14) {
                    case 0:
                        this.b.b.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 1:
                        this.b.b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    default:
                        this.b.b.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                }
            }
        };
        this.T = i10;
        this.O = (i10 == 1 || i10 == 4 || i10 == 3) ? 1 : 5;
        this.M = i10 == 4 ? 0L : 2000L;
        setOpaque(false);
        setRenderer(new f(context, i3, i10));
        this.L = (int) g0.r;
        setSurfaceTextureListener(this);
        GestureDetector gestureDetector = new GestureDetector(context, new h(this, i10));
        this.c0 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
        while (i11 < this.O) {
            i11 = com.google.android.recaptcha.internal.a.f(i11, i11, 1, this.Q);
        }
        Collections.shuffle(this.Q);
    }

    public static void a(m mVar, float f10) {
        int i3;
        synchronized (mVar) {
            try {
                mVar.e();
                if (mVar.b != null) {
                    int i10 = mVar.E;
                    int i11 = mVar.y;
                    if (mVar.U) {
                        mVar.r.eglQuerySurface(mVar.f, mVar.h, 12375, mVar.V);
                        mVar.r.eglQuerySurface(mVar.f, mVar.h, 12374, mVar.W);
                        int i12 = mVar.V[0];
                        if (i12 > 0 && (i3 = mVar.W[0]) > 0 && (i12 != i10 || i3 != i11)) {
                            mVar.c.setDefaultBufferSize(i10, i11);
                            i10 = mVar.V[0];
                            i11 = mVar.W[0];
                        }
                    }
                    if (i10 != mVar.F || i11 != mVar.G) {
                        mVar.F = i10;
                        mVar.G = i11;
                        mVar.b.onSurfaceChanged(mVar.w, i10, i11);
                    }
                    f fVar = mVar.b;
                    fVar.G = f10;
                    fVar.onDrawFrame(mVar.w);
                }
                mVar.g();
                if (!mVar.r.eglSwapBuffers(mVar.f, mVar.h) && mVar.T == 4) {
                    throw new IllegalStateException("Diamond buffer swap failed: " + mVar.r.eglGetError());
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        r2 = r6.r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (r2 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        r3 = r6.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        if (r3 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r3 == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
    
        r4 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
        r5 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
        r2.eglMakeCurrent(r3, r4, r4, r5);
        r2 = r6.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if (r2 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        if (r2 == r4) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        r6.r.eglDestroySurface(r6.f, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        r2 = r6.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r2 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
    
        if (r2 == r5) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r6.r.eglDestroyContext(r6.f, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0050, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
    
        r6.h = null;
        r6.n = null;
        r6.f = null;
        r6.w = null;
        r6.c = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0052, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006c, code lost:
    
        org.telegram.messenger.a8.g(r2, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x002c, code lost:
    
        if (r2 == null) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(m mVar) {
        n nVar;
        try {
            try {
                f fVar = mVar.e;
                if (fVar != null && (nVar = fVar.c) != null) {
                    a aVar = nVar.a;
                    if (aVar != null) {
                        aVar.b();
                        nVar.a = null;
                    } else {
                        GLES20.glDeleteProgram(nVar.f);
                    }
                }
            } catch (Exception e10) {
                a8.g(e10, true);
                f fVar2 = mVar.e;
            }
            mVar.h = null;
            mVar.n = null;
            mVar.f = null;
            mVar.w = null;
            mVar.c = null;
        } finally {
            f fVar3 = mVar.e;
            if (fVar3 != null) {
                fVar3.c = null;
            }
            mVar.e = null;
        }
    }

    public static void c(m mVar, f fVar) {
        synchronized (mVar) {
            if (fVar != null) {
                mVar.e = fVar;
                fVar.onSurfaceCreated(mVar.w, mVar.s);
                mVar.F = mVar.E;
                int i3 = mVar.y;
                mVar.G = i3;
                fVar.onSurfaceChanged(mVar.w, mVar.F, i3);
            }
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.d0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.d0.cancel();
            this.d0 = null;
        }
        AnimatorSet animatorSet = this.e0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.e0.cancel();
            this.e0 = null;
        }
    }

    public final void e() {
        if (this.n.equals(this.r.eglGetCurrentContext()) && this.h.equals(this.r.eglGetCurrentSurface(12377))) {
            return;
        }
        f();
        EGL10 egl10 = this.r;
        EGLDisplay eGLDisplay = this.f;
        EGLSurface eGLSurface = this.h;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.n)) {
            f();
        } else {
            throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.r.eglGetError()));
        }
    }

    public final void f() {
        if (this.r.eglGetError() != 12288) {
            a8.d("cannot swap buffers!");
        }
    }

    public final void g() {
        int glGetError = this.w.glGetError();
        if (glGetError == 0 || this.T != 4) {
            return;
        }
        throw new IllegalStateException("Diamond GL error: 0x" + Integer.toHexString(glGetError));
    }

    public int getMaxFrameRate() {
        return this.T == 4 ? az.o() == 2 ? 60 : 30 : this.L;
    }

    public int getMsaaSamples() {
        return 4;
    }

    public float getRenderScale() {
        return 1.0f;
    }

    public final void j(long j10) {
        i iVar = this.f0;
        g0.r(iVar);
        if (this.J || !this.N) {
            return;
        }
        g0.i3(iVar, j10);
    }

    public final void k(SurfaceTexture surfaceTexture, int i3, int i10) {
        float renderScale = getRenderScale();
        this.U = renderScale < 1.0f;
        if (renderScale < 1.0f && i3 > 0 && i10 > 0) {
            i3 = Math.max(1, Math.round(i3 * renderScale));
            i10 = Math.max(1, Math.round(i10 * renderScale));
            surfaceTexture.setDefaultBufferSize(i3, i10);
        }
        this.E = i3;
        this.y = i10;
    }

    public final void l() {
        d();
        f fVar = this.b;
        float f10 = fVar.d;
        float f11 = fVar.i;
        float f12 = fVar.e;
        float f13 = f10 + f11;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.d0 = ofFloat;
        ofFloat.addUpdateListener(new u(this, f10, f12, f11, 2));
        this.d0.setDuration(600L);
        this.d0.setInterpolator(new OvershootInterpolator());
        this.d0.start();
        t1 t1Var = this.S;
        if (t1Var != null) {
            t1Var.b(Math.abs(f13));
        }
        j(this.M);
    }

    public final void m(long j10) {
        f fVar = this.b;
        if (fVar != null) {
            fVar.d = -180.0f;
            g0.i3(new i(this, 1), j10);
        }
    }

    public void n() {
        if (this.R && this.N) {
            int i3 = this.P;
            ArrayList arrayList = this.Q;
            int intValue = ((Integer) arrayList.get(i3)).intValue();
            int i10 = this.P + 1;
            this.P = i10;
            if (i10 >= arrayList.size()) {
                Collections.shuffle(arrayList);
                this.P = 0;
            }
            g gVar = this.i0;
            g gVar2 = this.h0;
            if (intValue == 0) {
                int abs = Math.abs(Utilities.b.nextInt() % 4);
                this.e0 = new AnimatorSet();
                int i11 = this.T;
                if (i11 == 4) {
                    float f10 = this.b.d;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 360.0f + f10);
                    ofFloat.addUpdateListener(gVar2);
                    ofFloat.setDuration(12000L);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    this.e0.playTogether(ofFloat);
                } else if (abs != 0 || i11 == 1 || i11 == 3) {
                    int i12 = (i11 == 1 || i11 == 3) ? 360 : 485;
                    if (abs == 2) {
                        i12 = -i12;
                    }
                    float f11 = i12;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.b.i, f11);
                    ofFloat2.addUpdateListener(gVar2);
                    ofFloat2.setDuration(3000L);
                    ofFloat2.setInterpolator(xq.h);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f11, 0.0f);
                    ofFloat3.addUpdateListener(gVar2);
                    ofFloat3.setDuration(1000L);
                    ofFloat3.setStartDelay(3000L);
                    ofFloat3.setInterpolator(g0.H);
                    this.e0.playTogether(ofFloat2, ofFloat3);
                } else {
                    float f12 = 48;
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(this.b.i, f12);
                    ofFloat4.addUpdateListener(gVar);
                    ofFloat4.setDuration(2300L);
                    ofFloat4.setInterpolator(xq.h);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f12, 0.0f);
                    ofFloat5.addUpdateListener(gVar);
                    ofFloat5.setDuration(500L);
                    ofFloat5.setStartDelay(2300L);
                    ofFloat5.setInterpolator(g0.H);
                    this.e0.playTogether(ofFloat4, ofFloat5);
                }
                this.e0.addListener(new j(this, 1));
                this.e0.start();
                return;
            }
            if (intValue == 1) {
                this.e0 = new AnimatorSet();
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(this.b.d, 360.0f);
                ofFloat6.addUpdateListener(gVar2);
                ofFloat6.setDuration(8000L);
                ofFloat6.setInterpolator(xq.f);
                this.e0.playTogether(ofFloat6);
                this.e0.addListener(new j(this, 0));
                this.e0.start();
                return;
            }
            if (intValue != 2) {
                this.e0 = new AnimatorSet();
                ValueAnimator ofFloat7 = ValueAnimator.ofFloat(this.b.d, 180.0f);
                ofFloat7.addUpdateListener(gVar2);
                ofFloat7.setDuration(600L);
                xq xqVar = xq.f;
                ofFloat7.setInterpolator(xqVar);
                ValueAnimator ofFloat8 = ValueAnimator.ofFloat(180.0f, 360.0f);
                ofFloat8.addUpdateListener(gVar2);
                ofFloat8.setDuration(600L);
                ofFloat8.setStartDelay(2000L);
                ofFloat8.setInterpolator(xqVar);
                this.e0.playTogether(ofFloat7, ofFloat8);
                this.e0.addListener(new j(this, 2));
                this.e0.start();
                return;
            }
            this.e0 = new AnimatorSet();
            ValueAnimator ofFloat9 = ValueAnimator.ofFloat(this.b.d, 184.0f);
            ofFloat9.addUpdateListener(gVar2);
            ofFloat9.setDuration(600L);
            xq xqVar2 = xq.g;
            ofFloat9.setInterpolator(xqVar2);
            ValueAnimator ofFloat10 = ValueAnimator.ofFloat(this.b.i, 50.0f);
            ofFloat10.addUpdateListener(gVar);
            ofFloat10.setDuration(600L);
            ofFloat10.setInterpolator(xqVar2);
            ValueAnimator ofFloat11 = ValueAnimator.ofFloat(180.0f, 0.0f);
            ofFloat11.addUpdateListener(gVar2);
            ofFloat11.setDuration(800L);
            ofFloat11.setStartDelay(10000L);
            OvershootInterpolator overshootInterpolator = g0.H;
            ofFloat11.setInterpolator(overshootInterpolator);
            ValueAnimator ofFloat12 = ValueAnimator.ofFloat(60.0f, 0.0f);
            ofFloat12.addUpdateListener(gVar);
            ofFloat12.setDuration(800L);
            ofFloat12.setStartDelay(10000L);
            ofFloat12.setInterpolator(overshootInterpolator);
            ValueAnimator ofFloat13 = ValueAnimator.ofFloat(0.0f, 2.0f, -3.0f, 2.0f, -1.0f, 2.0f, -3.0f, 2.0f, -1.0f, 0.0f);
            ofFloat13.addUpdateListener(this.g0);
            ofFloat13.setDuration(10000L);
            ofFloat13.setInterpolator(new LinearInterpolator());
            this.e0.playTogether(ofFloat9, ofFloat10, ofFloat11, ofFloat12, ofFloat13);
            this.e0.addListener(new j(this, 3));
            this.e0.start();
        }
    }

    public final void o() {
        l lVar = this.K;
        this.K = null;
        this.a0 = false;
        if (lVar != null) {
            lVar.b = true;
            lVar.interrupt();
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.R = true;
        this.I = true;
        j(this.M);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        f fVar = this.b;
        if (fVar != null) {
            fVar.d = 0.0f;
            fVar.i = 0.0f;
            fVar.e = 0.0f;
        }
        this.R = false;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i10) {
        o();
        this.a0 = false;
        this.K = new l(this, surfaceTexture);
        k(surfaceTexture, i3, i10);
        this.x = 1000000000 / Math.max(1, Math.min(this.L, getMaxFrameRate()));
        this.K.start();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.a0 = false;
        o();
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i10) {
        k(surfaceTexture, i3, i10);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.a = false;
            l();
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return this.c0.onTouchEvent(motionEvent);
    }

    public void setBackgroundBitmap(Bitmap bitmap) {
        f fVar = this.b;
        n nVar = fVar.c;
        if (nVar != null && nVar.a == null) {
            nVar.Z = bitmap;
        }
        fVar.r = bitmap;
    }

    public void setDialogVisible(boolean z10) {
        this.J = z10;
        if (!z10) {
            j(this.M);
        } else {
            g0.r(this.f0);
            l();
        }
    }

    public void setIdleAnimationEnabled(boolean z10) {
        this.N = z10;
        if (z10) {
            j(this.M);
        } else {
            g0.r(this.f0);
            d();
        }
    }

    public void setPaused(boolean z10) {
        boolean z11 = this.H;
        this.H = z10;
        if (!z11 || z10 || this.K == null) {
            return;
        }
        this.K.interrupt();
    }

    public synchronized void setRenderer(f fVar) {
        this.b = fVar;
        this.I = true;
    }

    public void setStarParticlesView(t1 t1Var) {
        this.S = t1Var;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            f fVar = this.b;
            if (fVar != null) {
                fVar.b();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void h() {
    }

    public void i() {
    }
}
