package sg;

import ai.o3;
import android.animation.ValueAnimator;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.view.Choreographer;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import ci.ya;
import java.util.ArrayList;
import org.telegram.ui.Components.voip.r0;
import org.telegram.ui.Wallet.x4;
import rg.w1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class f extends GLSurfaceView implements Choreographer.FrameCallback {
    public static final /* synthetic */ int K = 0;
    public volatile int E;
    public long F;
    public volatile int G;
    public final ArrayList H;
    public float I;
    public float J;
    public final g a;
    public final GestureDetector b;
    public w1 c;
    public ValueAnimator d;
    public boolean e;
    public boolean f;
    public boolean h;
    public boolean n;
    public volatile boolean r;
    public boolean s;
    public Runnable v;
    public volatile float w;
    public volatile boolean x;
    public volatile boolean y;

    public f(Context context) {
        super(context);
        this.f = true;
        this.w = 1.0f;
        this.H = new ArrayList();
        this.I = 1.0f;
        this.J = 1.0f;
        setEGLContextClientVersion(3);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        getHolder().setFormat(-3);
        setZOrderOnTop(true);
        this.a = new g(context, 1, 4);
        setRenderer(new d(this));
        setRenderMode(0);
        this.b = new GestureDetector(context, new e(0, this));
    }

    public static void a(f fVar, int i10) {
        if (fVar.e && i10 == fVar.E) {
            b bVar = new b(fVar, i10, 0);
            if (Build.VERSION.SDK_INT < 29 || !fVar.isHardwareAccelerated()) {
                fVar.postOnAnimation(bVar);
            } else {
                fVar.getViewTreeObserver().registerFrameCommitCallback(bVar);
                fVar.getRootView().invalidate();
            }
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.removeAllListeners();
        this.d.cancel();
        this.d = null;
    }

    public final void c(ArrayList arrayList) {
        int i10;
        ArrayList arrayList2 = new ArrayList();
        synchronized (this.H) {
            try {
                int size = arrayList.size();
                i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    Runnable runnable = (Runnable) obj;
                    if (this.H.remove(runnable)) {
                        arrayList2.add(runnable);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((Runnable) obj2).run();
        }
    }

    public final void d() {
        b();
        g gVar = this.a;
        float f7 = gVar.d;
        float f10 = gVar.i;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.d = ofFloat;
        ofFloat.setDuration(600L);
        this.d.setInterpolator(new OvershootInterpolator());
        this.d.addUpdateListener(new ya(this, f7, f10, 8));
        this.d.addListener(new x4(this, 13));
        this.d.start();
        w1 w1Var = this.c;
        if (w1Var != null) {
            w1Var.b(Math.abs(f7 + f10));
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        if (!this.e || this.f || this.r) {
            return;
        }
        float alpha = Build.VERSION.SDK_INT < 34 ? getAlpha() : 1.0f;
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            alpha *= ((View) parent).getAlpha();
        }
        this.w = alpha;
        long j10 = this.F;
        if (j10 == 0 || j3 >= j10) {
            if (j10 == 0 || j3 - j10 > 16666666) {
                this.F = j3;
            }
            this.F += 16666666;
            requestRender();
        }
        Choreographer.getInstance().postFrameCallback(this);
    }

    public final void e() {
        if (this.e && !this.f && this.h && !this.n && this.d == null) {
            float f7 = this.a.d;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 360.0f + f7);
            this.d = ofFloat;
            ofFloat.setDuration(Math.round(10540.18445322793d));
            this.d.setRepeatCount(-1);
            this.d.setInterpolator(new LinearInterpolator());
            this.d.addUpdateListener(new r0(this, 17));
            this.d.start();
        }
    }

    public final void f() {
        if (this.J == 1.0f) {
            getHolder().setSizeFromLayout();
        } else {
            if (getWidth() <= 0 || getHeight() <= 0) {
                return;
            }
            getHolder().setFixedSize(Math.round(getWidth() * this.J), Math.round(getHeight() * this.J));
        }
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        setPaused(this.f);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        this.e = false;
        this.s = false;
        this.G++;
        Choreographer.getInstance().removeFrameCallback(this);
        this.F = 0L;
        b();
        super.onDetachedFromWindow();
        synchronized (this.H) {
            arrayList = new ArrayList(this.H);
        }
        c(arrayList);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.J > 1.0f) {
            f();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            this.n = false;
            d();
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return this.b.onTouchEvent(motionEvent);
    }

    public void setIdleAnimationEnabled(boolean z10) {
        this.h = z10;
        if (z10) {
            e();
        } else {
            b();
        }
    }

    public void setPaused(boolean z10) {
        this.f = z10;
        Choreographer.getInstance().removeFrameCallback(this);
        this.F = 0L;
        if (z10) {
            b();
        } else {
            if (!this.e || this.r) {
                return;
            }
            e();
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void setRenderScale(float f7) {
        float max = Math.max(1.0f, Math.min(this.J, f7));
        if (this.I == max) {
            return;
        }
        this.I = max;
        this.a.h = max / this.J;
    }

    public void setStarParticlesView(w1 w1Var) {
        this.c = w1Var;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.E++;
        this.y = false;
        this.x = false;
        this.s = false;
        super.surfaceCreated(surfaceHolder);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ArrayList arrayList;
        this.E++;
        this.y = false;
        this.x = false;
        this.s = false;
        super.surfaceDestroyed(surfaceHolder);
        synchronized (this.H) {
            arrayList = new ArrayList(this.H);
        }
        c(arrayList);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        ArrayList arrayList;
        synchronized (this.H) {
            this.H.add(new o3(4, runnable));
            arrayList = new ArrayList(this.H);
        }
        super.surfaceRedrawNeededAsync(surfaceHolder, new org.telegram.ui.web.w1(19, this, arrayList));
    }
}
