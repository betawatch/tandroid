package vg;

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
import di.d2;
import fi.k9;
import java.util.ArrayList;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.t81;
import ug.q1;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract class e extends GLSurfaceView implements Choreographer.FrameCallback {
    public static final /* synthetic */ int K = 0;
    public volatile boolean D;
    public volatile int E;
    public long F;
    public volatile int G;
    public final ArrayList H;
    public float I;
    public float J;
    public final f a;
    public final GestureDetector b;
    public q1 c;
    public ValueAnimator d;
    public boolean e;
    public boolean f;
    public boolean h;
    public boolean n;
    public volatile boolean r;
    public boolean s;
    public Runnable w;
    public volatile float x;
    public volatile boolean y;

    public e(Context context) {
        super(context);
        this.f = true;
        this.x = 1.0f;
        this.H = new ArrayList();
        this.I = 1.0f;
        this.J = 1.0f;
        setEGLContextClientVersion(3);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        getHolder().setFormat(-3);
        setZOrderOnTop(true);
        this.a = new f(context, 1, 4);
        setRenderer(new d(this));
        setRenderMode(0);
        this.b = new GestureDetector(context, new x9(1, this));
    }

    public static void a(e eVar, int i7) {
        if (eVar.e && i7 == eVar.E) {
            b bVar = new b(eVar, i7, 0);
            if (Build.VERSION.SDK_INT < 29 || !eVar.isHardwareAccelerated()) {
                eVar.postOnAnimation(bVar);
            } else {
                eVar.getViewTreeObserver().registerFrameCommitCallback(bVar);
                eVar.getRootView().invalidate();
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
        int i7;
        ArrayList arrayList2 = new ArrayList();
        synchronized (this.H) {
            try {
                int size = arrayList.size();
                i7 = 0;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
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
        while (i7 < size2) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            ((Runnable) obj2).run();
        }
    }

    public final void d() {
        b();
        f fVar = this.a;
        float f10 = fVar.d;
        float f11 = fVar.i;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.d = ofFloat;
        ofFloat.setDuration(600L);
        this.d.setInterpolator(new OvershootInterpolator());
        this.d.addUpdateListener(new k9(this, f10, f11, 7));
        this.d.addListener(new t81(this, 21));
        this.d.start();
        q1 q1Var = this.c;
        if (q1Var != null) {
            q1Var.b(Math.abs(f10 + f11));
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
        this.x = alpha;
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
            float f10 = this.a.d;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 360.0f + f10);
            this.d = ofFloat;
            ofFloat.setDuration(Math.round(10540.18445322793d));
            this.d.setRepeatCount(-1);
            this.d.setInterpolator(new LinearInterpolator());
            this.d.addUpdateListener(new ti.d(this, 4));
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
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
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

    public void setIdleAnimationEnabled(boolean z9) {
        this.h = z9;
        if (z9) {
            e();
        } else {
            b();
        }
    }

    public void setPaused(boolean z9) {
        this.f = z9;
        Choreographer.getInstance().removeFrameCallback(this);
        this.F = 0L;
        if (z9) {
            b();
        } else {
            if (!this.e || this.r) {
                return;
            }
            e();
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void setRenderScale(float f10) {
        float max = Math.max(1.0f, Math.min(this.J, f10));
        if (this.I == max) {
            return;
        }
        this.I = max;
        this.a.h = max / this.J;
    }

    public void setStarParticlesView(q1 q1Var) {
        this.c = q1Var;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.E++;
        this.D = false;
        this.y = false;
        this.s = false;
        super.surfaceCreated(surfaceHolder);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ArrayList arrayList;
        this.E++;
        this.D = false;
        this.y = false;
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
            this.H.add(new d2(4, runnable));
            arrayList = new ArrayList(this.H);
        }
        super.surfaceRedrawNeededAsync(surfaceHolder, new u9.f(12, this, arrayList));
    }
}
