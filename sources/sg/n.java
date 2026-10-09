package sg;

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
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Collections;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.voip.x;
import rg.w1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class n extends TextureView implements TextureView.SurfaceTextureListener {
    public int E;
    public int F;
    public volatile boolean G;
    public volatile boolean H;
    public boolean I;
    public volatile m J;
    public final int K;
    public final long L;
    public boolean M;
    public final int N;
    public int O;
    public final ArrayList P;
    public boolean Q;
    public w1 R;
    public final int S;
    public volatile boolean T;
    public volatile Runnable U;
    public final GestureDetector V;
    public ValueAnimator W;
    public boolean a;
    public AnimatorSet a0;
    public g b;
    public final j b0;
    public SurfaceTexture c;
    public final h c0;
    public final Object d;
    public final h d0;
    public g e;
    public final h e0;
    public EGLDisplay f;
    public EGLSurface h;
    public EGLContext n;
    public EGL10 r;
    public EGLConfig s;
    public GL10 v;
    public long w;
    public volatile int x;
    public volatile int y;

    /* JADX WARN: Type inference failed for: r2v3, types: [sg.h] */
    /* JADX WARN: Type inference failed for: r2v4, types: [sg.h] */
    /* JADX WARN: Type inference failed for: r2v5, types: [sg.h] */
    public n(Context context, int i10, int i11) {
        super(context);
        this.d = new Object();
        this.G = true;
        int i12 = 0;
        this.H = false;
        this.I = false;
        this.M = true;
        this.P = new ArrayList();
        this.a0 = new AnimatorSet();
        final int i13 = 0;
        this.b0 = new j(this, 0);
        this.c0 = new ValueAnimator.AnimatorUpdateListener(this) { // from class: sg.h
            public final /* synthetic */ n b;

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
        final int i14 = 1;
        this.d0 = new ValueAnimator.AnimatorUpdateListener(this) { // from class: sg.h
            public final /* synthetic */ n b;

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
        final int i15 = 2;
        this.e0 = new ValueAnimator.AnimatorUpdateListener(this) { // from class: sg.h
            public final /* synthetic */ n b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i15) {
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
        this.S = i11;
        this.N = (i11 == 1 || i11 == 4 || i11 == 3) ? 1 : 5;
        this.L = i11 == 4 ? 0L : 2000L;
        setOpaque(false);
        setRenderer(new g(context, i10, i11));
        this.K = (int) AndroidUtilities.screenRefreshRate;
        setSurfaceTextureListener(this);
        GestureDetector gestureDetector = new GestureDetector(context, new i(this, i11));
        this.V = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
        while (i12 < this.N) {
            i12 = e2.e(i12, i12, 1, this.P);
        }
        Collections.shuffle(this.P);
    }

    public static void a(n nVar, float f7) {
        synchronized (nVar) {
            try {
                nVar.e();
                if (nVar.b != null) {
                    int i10 = nVar.y;
                    int i11 = nVar.x;
                    if (i10 == nVar.E) {
                        if (i11 != nVar.F) {
                        }
                        g gVar = nVar.b;
                        gVar.G = f7;
                        gVar.onDrawFrame(nVar.v);
                    }
                    nVar.E = i10;
                    nVar.F = i11;
                    nVar.b.onSurfaceChanged(nVar.v, i10, i11);
                    g gVar2 = nVar.b;
                    gVar2.G = f7;
                    gVar2.onDrawFrame(nVar.v);
                }
                nVar.g();
                if (!nVar.r.eglSwapBuffers(nVar.f, nVar.h) && nVar.S == 4) {
                    throw new IllegalStateException("Diamond buffer swap failed: " + nVar.r.eglGetError());
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        r1 = r5.r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r1 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        r2 = r5.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
    
        if (r2 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        if (r2 == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
    
        r3 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
        r4 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
        r1.eglMakeCurrent(r2, r3, r3, r4);
        r1 = r5.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r1 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        if (r1 == r3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
    
        r5.r.eglDestroySurface(r5.f, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        r1 = r5.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
    
        if (r1 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r1 == r4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r5.r.eglDestroyContext(r5.f, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
    
        r5.h = null;
        r5.n = null;
        r5.f = null;
        r5.v = null;
        r5.c = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0051, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006b, code lost:
    
        org.telegram.messenger.FileLog.e(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004f, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0070, code lost:
    
        r5.h = null;
        r5.n = null;
        r5.f = null;
        r5.v = null;
        r5.c = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x002b, code lost:
    
        if (r1 == null) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(n nVar) {
        o oVar;
        try {
            try {
                g gVar = nVar.e;
                if (gVar != null && (oVar = gVar.c) != null) {
                    a aVar = oVar.a;
                    if (aVar != null) {
                        aVar.b();
                        oVar.a = null;
                    } else {
                        GLES20.glDeleteProgram(oVar.f);
                    }
                }
            } catch (Exception e7) {
                FileLog.e(e7);
                g gVar2 = nVar.e;
            }
        } finally {
            g gVar3 = nVar.e;
            if (gVar3 != null) {
                gVar3.c = null;
            }
            nVar.e = null;
        }
    }

    public static void c(n nVar, g gVar) {
        synchronized (nVar) {
            if (gVar != null) {
                nVar.e = gVar;
                gVar.onSurfaceCreated(nVar.v, nVar.s);
                nVar.E = nVar.y;
                int i10 = nVar.x;
                nVar.F = i10;
                gVar.onSurfaceChanged(nVar.v, nVar.E, i10);
            }
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.W;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.W.cancel();
            this.W = null;
        }
        AnimatorSet animatorSet = this.a0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.a0.cancel();
            this.a0 = null;
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
            FileLog.e("cannot swap buffers!");
        }
    }

    public final void g() {
        int glGetError = this.v.glGetError();
        if (glGetError == 0 || this.S != 4) {
            return;
        }
        throw new IllegalStateException("Diamond GL error: 0x" + Integer.toHexString(glGetError));
    }

    public int getMaxFrameRate() {
        return this.S == 4 ? SharedConfig.getDevicePerformanceClass() == 2 ? 60 : 30 : this.K;
    }

    public boolean j() {
        return this.S == 4;
    }

    public final void k(long j3) {
        j jVar = this.b0;
        AndroidUtilities.cancelRunOnUIThread(jVar);
        if (this.I || !this.M) {
            return;
        }
        AndroidUtilities.runOnUIThread(jVar, j3);
    }

    public final void l() {
        d();
        g gVar = this.b;
        float f7 = gVar.d;
        float f10 = gVar.i;
        float f11 = gVar.e;
        float f12 = f7 + f10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.W = ofFloat;
        ofFloat.addUpdateListener(new x(this, f7, f11, f10, 2));
        this.W.setDuration(600L);
        this.W.setInterpolator(new OvershootInterpolator());
        this.W.start();
        w1 w1Var = this.R;
        if (w1Var != null) {
            w1Var.b(Math.abs(f12));
        }
        k(this.L);
    }

    public final void m(long j3) {
        g gVar = this.b;
        if (gVar != null) {
            gVar.d = -180.0f;
            AndroidUtilities.runOnUIThread(new j(this, 1), j3);
        }
    }

    public void n() {
        if (this.Q && this.M) {
            int i10 = this.O;
            ArrayList arrayList = this.P;
            int intValue = ((Integer) arrayList.get(i10)).intValue();
            int i11 = this.O + 1;
            this.O = i11;
            if (i11 >= arrayList.size()) {
                Collections.shuffle(arrayList);
                this.O = 0;
            }
            h hVar = this.e0;
            h hVar2 = this.d0;
            if (intValue == 0) {
                int abs = Math.abs(Utilities.random.nextInt() % 4);
                this.a0 = new AnimatorSet();
                int i12 = this.S;
                if (i12 == 4) {
                    float f7 = this.b.d;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 360.0f + f7);
                    ofFloat.addUpdateListener(hVar2);
                    ofFloat.setDuration(12000L);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    this.a0.playTogether(ofFloat);
                } else if (abs != 0 || i12 == 1 || i12 == 3) {
                    int i13 = (i12 == 1 || i12 == 3) ? 360 : 485;
                    if (abs == 2) {
                        i13 = -i13;
                    }
                    float f10 = i13;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.b.i, f10);
                    ofFloat2.addUpdateListener(hVar2);
                    ofFloat2.setDuration(3000L);
                    ofFloat2.setInterpolator(hs.h);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f10, 0.0f);
                    ofFloat3.addUpdateListener(hVar2);
                    ofFloat3.setDuration(1000L);
                    ofFloat3.setStartDelay(3000L);
                    ofFloat3.setInterpolator(AndroidUtilities.overshootInterpolator);
                    this.a0.playTogether(ofFloat2, ofFloat3);
                } else {
                    float f11 = 48;
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(this.b.i, f11);
                    ofFloat4.addUpdateListener(hVar);
                    ofFloat4.setDuration(2300L);
                    ofFloat4.setInterpolator(hs.h);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f11, 0.0f);
                    ofFloat5.addUpdateListener(hVar);
                    ofFloat5.setDuration(500L);
                    ofFloat5.setStartDelay(2300L);
                    ofFloat5.setInterpolator(AndroidUtilities.overshootInterpolator);
                    this.a0.playTogether(ofFloat4, ofFloat5);
                }
                this.a0.addListener(new k(this, 1));
                this.a0.start();
                return;
            }
            if (intValue == 1) {
                this.a0 = new AnimatorSet();
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(this.b.d, 360.0f);
                ofFloat6.addUpdateListener(hVar2);
                ofFloat6.setDuration(8000L);
                ofFloat6.setInterpolator(hs.f);
                this.a0.playTogether(ofFloat6);
                this.a0.addListener(new k(this, 0));
                this.a0.start();
                return;
            }
            if (intValue != 2) {
                this.a0 = new AnimatorSet();
                ValueAnimator ofFloat7 = ValueAnimator.ofFloat(this.b.d, 180.0f);
                ofFloat7.addUpdateListener(hVar2);
                ofFloat7.setDuration(600L);
                hs hsVar = hs.f;
                ofFloat7.setInterpolator(hsVar);
                ValueAnimator ofFloat8 = ValueAnimator.ofFloat(180.0f, 360.0f);
                ofFloat8.addUpdateListener(hVar2);
                ofFloat8.setDuration(600L);
                ofFloat8.setStartDelay(2000L);
                ofFloat8.setInterpolator(hsVar);
                this.a0.playTogether(ofFloat7, ofFloat8);
                this.a0.addListener(new k(this, 2));
                this.a0.start();
                return;
            }
            this.a0 = new AnimatorSet();
            ValueAnimator ofFloat9 = ValueAnimator.ofFloat(this.b.d, 184.0f);
            ofFloat9.addUpdateListener(hVar2);
            ofFloat9.setDuration(600L);
            hs hsVar2 = hs.g;
            ofFloat9.setInterpolator(hsVar2);
            ValueAnimator ofFloat10 = ValueAnimator.ofFloat(this.b.i, 50.0f);
            ofFloat10.addUpdateListener(hVar);
            ofFloat10.setDuration(600L);
            ofFloat10.setInterpolator(hsVar2);
            ValueAnimator ofFloat11 = ValueAnimator.ofFloat(180.0f, 0.0f);
            ofFloat11.addUpdateListener(hVar2);
            ofFloat11.setDuration(800L);
            ofFloat11.setStartDelay(10000L);
            ofFloat11.setInterpolator(AndroidUtilities.overshootInterpolator);
            ValueAnimator ofFloat12 = ValueAnimator.ofFloat(60.0f, 0.0f);
            ofFloat12.addUpdateListener(hVar);
            ofFloat12.setDuration(800L);
            ofFloat12.setStartDelay(10000L);
            ofFloat12.setInterpolator(AndroidUtilities.overshootInterpolator);
            ValueAnimator ofFloat13 = ValueAnimator.ofFloat(0.0f, 2.0f, -3.0f, 2.0f, -1.0f, 2.0f, -3.0f, 2.0f, -1.0f, 0.0f);
            ofFloat13.addUpdateListener(this.c0);
            ofFloat13.setDuration(10000L);
            ofFloat13.setInterpolator(new LinearInterpolator());
            this.a0.playTogether(ofFloat9, ofFloat10, ofFloat11, ofFloat12, ofFloat13);
            this.a0.addListener(new k(this, 3));
            this.a0.start();
        }
    }

    public final void o() {
        m mVar = this.J;
        this.J = null;
        this.T = false;
        if (mVar != null) {
            mVar.b = true;
            mVar.interrupt();
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q = true;
        this.H = true;
        k(this.L);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        g gVar = this.b;
        if (gVar != null) {
            gVar.d = 0.0f;
            gVar.i = 0.0f;
            gVar.e = 0.0f;
        }
        this.Q = false;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        o();
        this.T = false;
        this.J = new m(this, surfaceTexture);
        this.y = i10;
        this.x = i11;
        this.w = 1000000000 / Math.max(1, Math.min(this.K, getMaxFrameRate()));
        this.J.start();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.T = false;
        o();
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.y = i10;
        this.x = i11;
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
        return this.V.onTouchEvent(motionEvent);
    }

    public void setBackgroundBitmap(Bitmap bitmap) {
        g gVar = this.b;
        o oVar = gVar.c;
        if (oVar != null && oVar.a == null) {
            oVar.Z = bitmap;
        }
        gVar.r = bitmap;
    }

    public void setDialogVisible(boolean z10) {
        this.I = z10;
        if (!z10) {
            k(this.L);
        } else {
            AndroidUtilities.cancelRunOnUIThread(this.b0);
            l();
        }
    }

    public void setIdleAnimationEnabled(boolean z10) {
        this.M = z10;
        if (z10) {
            k(this.L);
        } else {
            AndroidUtilities.cancelRunOnUIThread(this.b0);
            d();
        }
    }

    public void setPaused(boolean z10) {
        boolean z11 = this.G;
        this.G = z10;
        if (!z11 || z10 || this.J == null) {
            return;
        }
        this.J.interrupt();
    }

    public synchronized void setRenderer(g gVar) {
        this.b = gVar;
        this.H = true;
    }

    public void setStarParticlesView(w1 w1Var) {
        this.R = w1Var;
    }

    public void h() {
    }

    public void i() {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
