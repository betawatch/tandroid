package tg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import bi.t5;
import com.google.android.gms.internal.vision.e2;
import h2.i;
import java.util.ArrayList;
import java.util.Collections;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmuDetector;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.voip.w;
import sg.z1;
import zh.w7;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public class e extends TextureView implements TextureView.SurfaceTextureListener {
    public boolean E;
    public boolean F;
    public i G;
    public final int H;
    public final long I;
    public final int J;
    public int K;
    public final ArrayList L;
    public boolean M;
    public z1 N;
    public final int O;
    public volatile boolean P;
    public volatile w7 Q;
    public final GestureDetector R;
    public ValueAnimator S;
    public AnimatorSet T;
    public final c U;
    public final b V;
    public final b W;
    public boolean a;
    public final b a0;
    public a b;
    public SurfaceTexture c;
    public EGLDisplay d;
    public EGLSurface e;
    public EGLContext f;
    public EGL10 h;
    public EGLConfig n;
    public GL10 r;
    public int s;
    public int v;
    public int w;
    public boolean x;
    public boolean y;

    /* JADX WARN: Type inference failed for: r2v3, types: [tg.b] */
    /* JADX WARN: Type inference failed for: r2v4, types: [tg.b] */
    /* JADX WARN: Type inference failed for: r2v5, types: [tg.b] */
    public e(Context context, int i10, int i11) {
        super(context);
        int i12 = 0;
        this.x = false;
        this.y = true;
        this.E = false;
        this.F = false;
        this.L = new ArrayList();
        this.T = new AnimatorSet();
        final int i13 = 0;
        this.U = new c(this, 0);
        this.V = new ValueAnimator.AnimatorUpdateListener(this) { // from class: tg.b
            public final /* synthetic */ e b;

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
                        this.b.b.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                }
            }
        };
        final int i14 = 1;
        this.W = new ValueAnimator.AnimatorUpdateListener(this) { // from class: tg.b
            public final /* synthetic */ e b;

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
                        this.b.b.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                }
            }
        };
        final int i15 = 2;
        this.a0 = new ValueAnimator.AnimatorUpdateListener(this) { // from class: tg.b
            public final /* synthetic */ e b;

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
                        this.b.b.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                }
            }
        };
        this.O = i11;
        this.J = (i11 == 1 || i11 == 4 || i11 == 3) ? 1 : 5;
        this.I = i11 == 4 ? 0L : 2000L;
        setOpaque(false);
        setRenderer(new a(context, i10, i11));
        this.H = (int) AndroidUtilities.screenRefreshRate;
        setSurfaceTextureListener(this);
        GestureDetector gestureDetector = new GestureDetector(context, new t5(1, this));
        this.R = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
        while (i12 < this.J) {
            i12 = e2.e(i12, i12, 1, this.L);
        }
        Collections.shuffle(this.L);
    }

    public static void a(e eVar) {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        eVar.h = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        eVar.d = eglGetDisplay;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            throw new RuntimeException("eglGetDisplay failed " + GLUtils.getEGLErrorString(eVar.h.eglGetError()));
        }
        if (!eVar.h.eglInitialize(eglGetDisplay, new int[2])) {
            throw new RuntimeException("eglInitialize failed " + GLUtils.getEGLErrorString(eVar.h.eglGetError()));
        }
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = EmuDetector.with(eVar.getContext()).detect() ? new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12338, 1, 12344};
        eVar.n = null;
        if (!eVar.h.eglChooseConfig(eVar.d, iArr2, eGLConfigArr, 1, iArr)) {
            throw new IllegalArgumentException("eglChooseConfig failed " + GLUtils.getEGLErrorString(eVar.h.eglGetError()));
        }
        if (iArr[0] > 0) {
            eVar.n = eGLConfigArr[0];
        }
        EGLConfig eGLConfig = eVar.n;
        if (eGLConfig == null) {
            throw new RuntimeException("eglConfig not initialized");
        }
        eVar.f = eVar.h.eglCreateContext(eVar.d, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        eVar.f();
        eVar.e = eVar.h.eglCreateWindowSurface(eVar.d, eVar.n, eVar.c, null);
        eVar.f();
        EGLSurface eGLSurface = eVar.e;
        if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
            int eglGetError = eVar.h.eglGetError();
            if (eglGetError == 12299) {
                FileLog.e("eglCreateWindowSurface returned EGL10.EGL_BAD_NATIVE_WINDOW");
                return;
            } else {
                throw new RuntimeException("eglCreateWindowSurface failed " + GLUtils.getEGLErrorString(eglGetError));
            }
        }
        if (!eVar.h.eglMakeCurrent(eVar.d, eGLSurface, eGLSurface, eVar.f)) {
            throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(eVar.h.eglGetError()));
        }
        eVar.f();
        eVar.r = (GL10) eVar.f.getGL();
        eVar.f();
    }

    public static boolean b(e eVar) {
        boolean z10;
        synchronized (eVar) {
            z10 = eVar.y;
        }
        return z10 || eVar.b == null;
    }

    public static void c(e eVar, float f7) {
        synchronized (eVar) {
            try {
                eVar.e();
                a aVar = eVar.b;
                if (aVar != null) {
                    aVar.D = f7;
                    aVar.onDrawFrame(eVar.r);
                }
                int glGetError = eVar.r.glGetError();
                if (glGetError != 0) {
                    FileLog.e("GL error = 0x" + Integer.toHexString(glGetError));
                }
                eVar.h.eglSwapBuffers(eVar.d, eVar.e);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.S.cancel();
            this.S = null;
        }
        AnimatorSet animatorSet = this.T;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.T.cancel();
            this.T = null;
        }
    }

    public final void e() {
        if (this.f.equals(this.h.eglGetCurrentContext()) && this.e.equals(this.h.eglGetCurrentSurface(12377))) {
            return;
        }
        f();
        EGL10 egl10 = this.h;
        EGLDisplay eGLDisplay = this.d;
        EGLSurface eGLSurface = this.e;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f)) {
            f();
        } else {
            throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.h.eglGetError()));
        }
    }

    public final void f() {
        if (this.h.eglGetError() != 12288) {
            FileLog.e("cannot swap buffers!");
        }
    }

    public final void h(long j3) {
        c cVar = this.U;
        AndroidUtilities.cancelRunOnUIThread(cVar);
        if (this.F) {
            return;
        }
        AndroidUtilities.runOnUIThread(cVar, j3);
    }

    public final void i() {
        d();
        a aVar = this.b;
        float f7 = aVar.d;
        float f10 = aVar.g;
        float f11 = aVar.e;
        float f12 = f7 + f10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.S = ofFloat;
        ofFloat.addUpdateListener(new w(this, f7, f11, f10, 2));
        this.S.setDuration(600L);
        this.S.setInterpolator(new OvershootInterpolator());
        this.S.start();
        z1 z1Var = this.N;
        if (z1Var != null) {
            float abs = Math.abs(f12);
            float f13 = abs < 60.0f ? 5.0f : abs < 180.0f ? 9.0f : 15.0f;
            AnimatorSet animatorSet = new AnimatorSet();
            ki.a aVar2 = new ki.a(z1Var, 18);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, f13);
            ofFloat2.addUpdateListener(aVar2);
            ofFloat2.setDuration(600L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f13, 1.0f);
            ofFloat3.addUpdateListener(aVar2);
            ofFloat3.setDuration(2000L);
            animatorSet.playTogether(ofFloat2, ofFloat3);
            animatorSet.start();
        }
        h(this.I);
    }

    public final void j(long j3) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.d = -180.0f;
            AndroidUtilities.runOnUIThread(new c(this, 1), j3);
        }
    }

    public void k() {
        if (this.M) {
            int i10 = this.K;
            ArrayList arrayList = this.L;
            int intValue = ((Integer) arrayList.get(i10)).intValue();
            int i11 = this.K + 1;
            this.K = i11;
            if (i11 >= arrayList.size()) {
                Collections.shuffle(arrayList);
                this.K = 0;
            }
            b bVar = this.a0;
            b bVar2 = this.W;
            if (intValue == 0) {
                int abs = Math.abs(Utilities.random.nextInt() % 4);
                this.T = new AnimatorSet();
                int i12 = this.O;
                if (i12 == 4) {
                    float f7 = this.b.d;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 360.0f + f7);
                    ofFloat.addUpdateListener(bVar2);
                    ofFloat.setDuration(12000L);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    this.T.playTogether(ofFloat);
                } else if (abs != 0 || i12 == 1 || i12 == 3) {
                    int i13 = (i12 == 1 || i12 == 3) ? 360 : 485;
                    if (abs == 2) {
                        i13 = -i13;
                    }
                    float f10 = i13;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.b.g, f10);
                    ofFloat2.addUpdateListener(bVar2);
                    ofFloat2.setDuration(3000L);
                    ofFloat2.setInterpolator(pr.h);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f10, 0.0f);
                    ofFloat3.addUpdateListener(bVar2);
                    ofFloat3.setDuration(1000L);
                    ofFloat3.setStartDelay(3000L);
                    ofFloat3.setInterpolator(AndroidUtilities.overshootInterpolator);
                    this.T.playTogether(ofFloat2, ofFloat3);
                } else {
                    float f11 = 48;
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(this.b.g, f11);
                    ofFloat4.addUpdateListener(bVar);
                    ofFloat4.setDuration(2300L);
                    ofFloat4.setInterpolator(pr.h);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f11, 0.0f);
                    ofFloat5.addUpdateListener(bVar);
                    ofFloat5.setDuration(500L);
                    ofFloat5.setStartDelay(2300L);
                    ofFloat5.setInterpolator(AndroidUtilities.overshootInterpolator);
                    this.T.playTogether(ofFloat4, ofFloat5);
                }
                this.T.addListener(new d(this, 1));
                this.T.start();
                return;
            }
            if (intValue == 1) {
                this.T = new AnimatorSet();
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(this.b.d, 360.0f);
                ofFloat6.addUpdateListener(bVar2);
                ofFloat6.setDuration(8000L);
                ofFloat6.setInterpolator(pr.f);
                this.T.playTogether(ofFloat6);
                this.T.addListener(new d(this, 0));
                this.T.start();
                return;
            }
            if (intValue != 2) {
                this.T = new AnimatorSet();
                ValueAnimator ofFloat7 = ValueAnimator.ofFloat(this.b.d, 180.0f);
                ofFloat7.addUpdateListener(bVar2);
                ofFloat7.setDuration(600L);
                pr prVar = pr.f;
                ofFloat7.setInterpolator(prVar);
                ValueAnimator ofFloat8 = ValueAnimator.ofFloat(180.0f, 360.0f);
                ofFloat8.addUpdateListener(bVar2);
                ofFloat8.setDuration(600L);
                ofFloat8.setStartDelay(2000L);
                ofFloat8.setInterpolator(prVar);
                this.T.playTogether(ofFloat7, ofFloat8);
                this.T.addListener(new d(this, 2));
                this.T.start();
                return;
            }
            this.T = new AnimatorSet();
            ValueAnimator ofFloat9 = ValueAnimator.ofFloat(this.b.d, 184.0f);
            ofFloat9.addUpdateListener(bVar2);
            ofFloat9.setDuration(600L);
            pr prVar2 = pr.g;
            ofFloat9.setInterpolator(prVar2);
            ValueAnimator ofFloat10 = ValueAnimator.ofFloat(this.b.g, 50.0f);
            ofFloat10.addUpdateListener(bVar);
            ofFloat10.setDuration(600L);
            ofFloat10.setInterpolator(prVar2);
            ValueAnimator ofFloat11 = ValueAnimator.ofFloat(180.0f, 0.0f);
            ofFloat11.addUpdateListener(bVar2);
            ofFloat11.setDuration(800L);
            ofFloat11.setStartDelay(10000L);
            ofFloat11.setInterpolator(AndroidUtilities.overshootInterpolator);
            ValueAnimator ofFloat12 = ValueAnimator.ofFloat(60.0f, 0.0f);
            ofFloat12.addUpdateListener(bVar);
            ofFloat12.setDuration(800L);
            ofFloat12.setStartDelay(10000L);
            ofFloat12.setInterpolator(AndroidUtilities.overshootInterpolator);
            ValueAnimator ofFloat13 = ValueAnimator.ofFloat(0.0f, 2.0f, -3.0f, 2.0f, -1.0f, 2.0f, -3.0f, 2.0f, -1.0f, 0.0f);
            ofFloat13.addUpdateListener(this.V);
            ofFloat13.setDuration(10000L);
            ofFloat13.setInterpolator(new LinearInterpolator());
            this.T.playTogether(ofFloat9, ofFloat10, ofFloat11, ofFloat12, ofFloat13);
            this.T.addListener(new d(this, 3));
            this.T.start();
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.M = true;
        this.E = true;
        h(this.I);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        a aVar = this.b;
        if (aVar != null) {
            aVar.d = 0.0f;
            aVar.g = 0.0f;
            aVar.e = 0.0f;
        }
        this.M = false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.G = new i(this);
        this.c = surfaceTexture;
        this.w = i10;
        this.v = i11;
        this.s = Math.max(0, ((int) ((1.0f / this.H) * 1000.0f)) - 1);
        this.G.start();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.P = false;
        if (this.G != null) {
            this.x = false;
            this.G = null;
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.w = i10;
        this.v = i11;
        a aVar = this.b;
        if (aVar != null) {
            aVar.onSurfaceChanged(this.r, i10, i11);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.a = false;
            i();
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return this.R.onTouchEvent(motionEvent);
    }

    public void setBackgroundBitmap(Bitmap bitmap) {
        a aVar = this.b;
        f fVar = aVar.c;
        if (fVar != null) {
            fVar.V = bitmap;
        }
        aVar.o = bitmap;
    }

    public void setDialogVisible(boolean z10) {
        this.F = z10;
        if (!z10) {
            h(this.I);
        } else {
            AndroidUtilities.cancelRunOnUIThread(this.U);
            i();
        }
    }

    public synchronized void setPaused(boolean z10) {
        this.y = z10;
    }

    public synchronized void setRenderer(a aVar) {
        this.b = aVar;
        this.E = true;
    }

    public void setStarParticlesView(z1 z1Var) {
        this.N = z1Var;
    }

    public void g() {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
