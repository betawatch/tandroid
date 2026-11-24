// default package

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.RenderNode;
import android.graphics.Typeface;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class r12 extends FrameLayout {
    public static final gia c0 = new gia(new qm0(27), new qm0(28));
    public Runnable E;
    public Runnable F;
    public q12 G;
    public yla H;
    public int I;
    public js4 J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public float R;
    public float S;
    public boolean T;
    public final float U;
    public final boolean V;
    public long W;
    public Object a;
    public float a0;
    public final gi3 b;
    public float b0;
    public boolean c;
    public boolean d;
    public float e;
    public float f;
    public float h;
    public float n;
    public float r;
    public boolean s;
    public yla w;
    public boolean x;
    public cv0 y;

    public r12(Context context) {
        super(context);
        this.e = a.getCurrentActionBarHeight();
        this.f = 0.0f;
        this.h = -1.0f;
        this.n = -2.1474836E9f;
        this.J = new qm0((byte) 29);
        this.N = true;
        this.S = 0.0f;
        this.T = false;
        this.U = gl.L(60.0f);
        this.V = true;
        this.b = new gi3(context, new p12(this, ViewConfiguration.get(context).getScaledTouchSlop(), (byte) 0));
        Point point = gl.q;
        this.I = gl.L(point.x > point.y ? 8.0f : 64.0f);
    }

    public final void a(boolean z, boolean z2) {
        this.P = z;
        this.Q = z2;
    }

    public final boolean b(boolean z) {
        cv0 cv0Var = this.y;
        if (cv0Var == null || !cv0Var.O) {
            return true;
        }
        return z ? this.P : this.Q;
    }

    public final void c() {
        setTranslationY(Math.max(this.e, this.f + this.r));
        byte b = 14;
        gl.r(new hq1(this, b));
        gl.d3(new hq1(this, b));
        Runnable runnable = this.E;
        if (runnable != null) {
            runnable.run();
        }
        m21 m21Var = m21.w;
        if (m21Var != null) {
            m21Var.l();
        }
    }

    public final void d(float f) {
        e(f, false, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (!canvas.isHardwareAccelerated()) {
            super.dispatchDraw(canvas);
            return;
        }
        Object obj = this.a;
        if (obj != null) {
            RenderNode e = qm0.e(obj);
            e.setPosition(0, 0, getWidth(), getHeight());
            canvas2 = e.beginRecording();
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
        Object obj2 = this.a;
        if (obj2 != null) {
            RenderNode e2 = qm0.e(obj2);
            e2.endRecording();
            canvas.drawRenderNode(e2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.c || motionEvent.getActionIndex() == 0) {
            if (motionEvent.getAction() == 0) {
                this.W = motionEvent.getEventTime();
                this.a0 = motionEvent.getX();
                this.b0 = motionEvent.getY();
                this.T = false;
                this.S = 0.0f;
                if (this.O) {
                    this.P = false;
                    this.Q = false;
                }
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            int actionIndex = motionEvent.getActionIndex();
            if (Build.VERSION.SDK_INT >= 29) {
                obtain.setLocation(motionEvent.getRawX(actionIndex), motionEvent.getRawY(actionIndex));
            } else {
                obtain.setLocation(motionEvent.getX(actionIndex) + (motionEvent.getRawX() - motionEvent.getX()), motionEvent.getY(actionIndex) + (motionEvent.getRawY() - motionEvent.getY()));
            }
            boolean onTouchEvent = ((GestureDetector) this.b.a).onTouchEvent(obtain);
            obtain.recycle();
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                boolean z = this.c;
                this.d = false;
                this.c = false;
                if (!this.K || this.M) {
                    if (this.x) {
                        this.x = false;
                    } else if (this.N && (!this.O || (this.r != (-this.f) + this.e && b(false)))) {
                        float f = this.r;
                        int i = this.I;
                        float f2 = -i;
                        boolean z2 = this.V;
                        if (f <= f2) {
                            if (z2) {
                                d((-this.f) + this.e);
                            }
                        } else if (f <= f2 || f > i) {
                            float x = motionEvent.getX();
                            float y = motionEvent.getY();
                            float f3 = this.a0;
                            float f4 = this.b0;
                            Typeface typeface = gl.a;
                            float f5 = f3 - x;
                            float f6 = f4 - y;
                            float sqrt = (float) Math.sqrt((f6 * f6) + (f5 * f5));
                            long eventTime = motionEvent.getEventTime() - this.W;
                            if (this.G != null && (eventTime > 250 || sqrt > gl.L(200.0f))) {
                                this.G.d(!z);
                            } else if (z2) {
                                d((-this.f) + this.e);
                            }
                        } else if (z2) {
                            d(0.0f);
                        }
                    }
                }
            }
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if ((!dispatchTouchEvent && !onTouchEvent && motionEvent.getAction() == 0) || dispatchTouchEvent || onTouchEvent) {
                return true;
            }
        }
        return false;
    }

    public final void e(float f, boolean z, Runnable runnable) {
        yla ylaVar;
        if (this.K && !z) {
            f = (-getOffsetY()) + getTopActionBarOffsetY();
        }
        if (this.r == f || ((ylaVar = this.H) != null && ((float) ylaVar.m.i) == f)) {
            if (runnable != null) {
                runnable.run();
            }
            Runnable runnable2 = this.F;
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        }
        this.n = f;
        yla ylaVar2 = this.w;
        if (ylaVar2 != null) {
            ylaVar2.d();
        }
        yla ylaVar3 = this.H;
        if (ylaVar3 != null) {
            ylaVar3.d();
        }
        yla ylaVar4 = new yla(this, c0, f);
        ylaVar4.m = oo1.j(f, 1200.0f, 1.0f);
        ylaVar4.a(new o11(this, runnable, (byte) 3));
        this.H = ylaVar4;
        ylaVar4.h();
    }

    public float getOffsetY() {
        return this.f;
    }

    public Object getRenderNode() {
        if (this.a == null && Build.VERSION.SDK_INT >= 31) {
            this.a = mk1.c();
        }
        return this.a;
    }

    public float getSwipeOffsetY() {
        return this.r;
    }

    public float getTopActionBarOffsetY() {
        return this.e;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Point point = gl.q;
        this.I = gl.L(point.x > point.y ? 8.0f : 64.0f);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            this.d = true;
            this.c = false;
        }
    }

    public void setAllowFullSizeSwipe(boolean z) {
        this.M = z;
    }

    public void setAllowSwipes(boolean z) {
        if (this.N != z) {
            this.N = z;
        }
    }

    public void setDelegate(q12 q12Var) {
        this.G = q12Var;
    }

    public void setForceOffsetY(float f) {
        this.f = f;
        c();
    }

    public void setFullSize(boolean z) {
        if (this.K != z) {
            this.K = z;
            if (!z) {
                d(0.0f);
            } else if (this.L) {
                d(getTopActionBarOffsetY() + (-getOffsetY()));
            }
        }
    }

    public void setIsKeyboardVisible(js4 js4Var) {
        this.J = js4Var;
    }

    public void setOffsetY(final float f) {
        if (this.n != -2.1474836E9f) {
            this.h = f;
            return;
        }
        yla ylaVar = this.w;
        if (ylaVar != null) {
            ylaVar.d();
        }
        final float f2 = this.f;
        final float f3 = f - f2;
        byte b = 0;
        final boolean z = Math.abs((this.r + f2) - this.e) <= ((float) gl.L(1.0f));
        if (this.s) {
            this.f = f;
            if (z) {
                this.r = moe.a(this.r - Math.max(0.0f, f3), (-this.f) + this.e, (getHeight() - this.f) + this.e);
            }
            c();
            return;
        }
        yla ylaVar2 = this.w;
        if (ylaVar2 != null) {
            ylaVar2.d();
        }
        yla ylaVar3 = new yla(new ti4(f2));
        ylaVar3.m = oo1.j(f, 1400.0f, 1.0f);
        ylaVar3.b(new yr3() { // from class: n12
            @Override // yr3
            public final void a(yla ylaVar4, float f4, float f5) {
                r12 r12Var = r12.this;
                r12Var.f = f4;
                float f6 = f3;
                float f7 = f2;
                float f8 = f6 == 0.0f ? 1.0f : (f4 - f7) / f6;
                if (z) {
                    r12Var.r = moe.a(r12Var.r - (Math.max(0.0f, f6) * f8), (-r12Var.f) + r12Var.e, (r12Var.getHeight() - r12Var.f) + r12Var.e);
                }
                yla ylaVar5 = r12Var.H;
                if (ylaVar5 != null) {
                    zla zlaVar = ylaVar5.m;
                    if (((float) zlaVar.i) == (-f7) + r12Var.e) {
                        zlaVar.i = (-f) + r1;
                    }
                }
                r12Var.c();
            }
        });
        ylaVar3.a(new o12(this, f, b));
        this.w = ylaVar3;
        ylaVar3.h();
    }

    public void setScrollEndListener(Runnable runnable) {
        this.F = runnable;
    }

    public void setScrollListener(Runnable runnable) {
        this.E = runnable;
    }

    public void setShouldWaitWebViewScroll(boolean z) {
        this.O = z;
    }

    public void setSwipeOffsetAnimationDisallowed(boolean z) {
        this.s = z;
    }

    public void setSwipeOffsetY(float f) {
        this.r = f;
        c();
    }

    public void setTopActionBarOffsetY(float f) {
        this.e = f;
        c();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
    }

    public void setWebView(cv0 cv0Var) {
        this.y = cv0Var;
    }
}
