package xh;

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
import org.telegram.messenger.l9;
import org.telegram.ui.Components.gf0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.ou0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.za;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class h3 extends FrameLayout {
    public static final ou0 b0 = new ou0(new xg.a(20), new xg.a(21));
    public Runnable D;
    public Runnable E;
    public g3 F;
    public o1.j G;
    public int H;
    public l9 I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public float Q;
    public float R;
    public boolean S;
    public final float T;
    public final boolean U;
    public long V;
    public float W;
    public Object a;
    public float a0;
    public final m2.t b;
    public boolean c;
    public boolean d;
    public float e;
    public float f;
    public float h;
    public float n;
    public float r;
    public boolean s;
    public o1.j w;
    public boolean x;
    public org.telegram.ui.web.v0 y;

    public h3(Context context) {
        super(context);
        this.e = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        this.f = 0.0f;
        this.h = -1.0f;
        this.n = -2.14748365E9f;
        this.I = new xg.a(22);
        this.M = true;
        this.R = 0.0f;
        this.S = false;
        this.T = org.telegram.messenger.i0.L(60.0f);
        this.U = true;
        this.b = new m2.t(context, new jr(this, ViewConfiguration.get(context).getScaledTouchSlop(), 2));
        Point point = org.telegram.messenger.i0.q;
        this.H = org.telegram.messenger.i0.L(point.x > point.y ? 8.0f : 64.0f);
    }

    public final void a(boolean z10, boolean z11) {
        this.O = z10;
        this.P = z11;
    }

    public final boolean b(boolean z10) {
        org.telegram.ui.web.v0 v0Var = this.y;
        if (v0Var == null || !v0Var.N) {
            return true;
        }
        return z10 ? this.O : this.P;
    }

    public final void c() {
        setTranslationY(Math.max(this.e, this.f + this.r));
        org.telegram.messenger.i0.r(new d0(this, 7));
        org.telegram.messenger.i0.g3(new d0(this, 7));
        Runnable runnable = this.D;
        if (runnable != null) {
            runnable.run();
        }
        wb wbVar = wb.w;
        if (wbVar != null) {
            wbVar.l();
        }
    }

    public final boolean d() {
        return this.c;
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
            RenderNode b10 = m4.v0.b(obj);
            b10.setPosition(0, 0, getWidth(), getHeight());
            canvas2 = b10.beginRecording();
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
        Object obj2 = this.a;
        if (obj2 != null) {
            RenderNode b11 = m4.v0.b(obj2);
            b11.endRecording();
            canvas.drawRenderNode(b11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.c || motionEvent.getActionIndex() == 0) {
            if (motionEvent.getAction() == 0) {
                this.V = motionEvent.getEventTime();
                this.W = motionEvent.getX();
                this.a0 = motionEvent.getY();
                this.S = false;
                this.R = 0.0f;
                if (this.N) {
                    this.O = false;
                    this.P = false;
                }
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            int actionIndex = motionEvent.getActionIndex();
            if (Build.VERSION.SDK_INT >= 29) {
                obtain.setLocation(motionEvent.getRawX(actionIndex), motionEvent.getRawY(actionIndex));
            } else {
                obtain.setLocation(motionEvent.getX(actionIndex) + (motionEvent.getRawX() - motionEvent.getX()), motionEvent.getY(actionIndex) + (motionEvent.getRawY() - motionEvent.getY()));
            }
            boolean onTouchEvent = ((GestureDetector) this.b.b).onTouchEvent(obtain);
            obtain.recycle();
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                boolean z10 = this.c;
                this.d = false;
                this.c = false;
                if (!this.J || this.L) {
                    if (this.x) {
                        this.x = false;
                    } else if (this.M && (!this.N || (this.r != (-this.f) + this.e && b(false)))) {
                        float f7 = this.r;
                        int i10 = this.H;
                        float f10 = -i10;
                        boolean z11 = this.U;
                        if (f7 <= f10) {
                            if (z11) {
                                e((-this.f) + this.e);
                            }
                        } else if (f7 <= f10 || f7 > i10) {
                            float x10 = motionEvent.getX();
                            float y3 = motionEvent.getY();
                            float f11 = this.W;
                            float f12 = this.a0;
                            Typeface typeface = org.telegram.messenger.i0.a;
                            float f13 = f11 - x10;
                            float f14 = f12 - y3;
                            float sqrt = (float) Math.sqrt((f14 * f14) + (f13 * f13));
                            long eventTime = motionEvent.getEventTime() - this.V;
                            if (this.F != null && (eventTime > 250 || sqrt > org.telegram.messenger.i0.L(200.0f))) {
                                this.F.a(!z10);
                            } else if (z11) {
                                e((-this.f) + this.e);
                            }
                        } else if (z11) {
                            e(0.0f);
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

    public final void e(float f7) {
        f(f7, false, null);
    }

    public final void f(float f7, boolean z10, Runnable runnable) {
        o1.j jVar;
        if (this.J && !z10) {
            f7 = (-getOffsetY()) + getTopActionBarOffsetY();
        }
        if (this.r == f7 || ((jVar = this.G) != null && ((float) jVar.m.i) == f7)) {
            if (runnable != null) {
                runnable.run();
            }
            Runnable runnable2 = this.E;
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        }
        this.n = f7;
        o1.j jVar2 = this.w;
        if (jVar2 != null) {
            jVar2.d();
        }
        o1.j jVar3 = this.G;
        if (jVar3 != null) {
            jVar3.d();
        }
        o1.j jVar4 = new o1.j(this, b0, f7);
        jVar4.m = org.telegram.ui.Cells.f1.p(f7, 1200.0f, 1.0f);
        jVar4.a(new za(4, this, runnable));
        this.G = jVar4;
        jVar4.h();
    }

    public float getOffsetY() {
        return this.f;
    }

    public Object getRenderNode() {
        if (this.a == null && Build.VERSION.SDK_INT >= 31) {
            this.a = android.support.v4.media.session.w.o();
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
        Point point = org.telegram.messenger.i0.q;
        this.H = org.telegram.messenger.i0.L(point.x > point.y ? 8.0f : 64.0f);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            this.d = true;
            this.c = false;
        }
    }

    public void setAllowFullSizeSwipe(boolean z10) {
        this.L = z10;
    }

    public void setAllowSwipes(boolean z10) {
        if (this.M != z10) {
            this.M = z10;
        }
    }

    public void setDelegate(g3 g3Var) {
        this.F = g3Var;
    }

    public void setForceOffsetY(float f7) {
        this.f = f7;
        c();
    }

    public void setFullSize(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            if (!z10) {
                e(0.0f);
            } else if (this.K) {
                e(getTopActionBarOffsetY() + (-getOffsetY()));
            }
        }
    }

    public void setIsKeyboardVisible(l9 l9Var) {
        this.I = l9Var;
    }

    public void setOffsetY(final float f7) {
        if (this.n != -2.14748365E9f) {
            this.h = f7;
            return;
        }
        o1.j jVar = this.w;
        if (jVar != null) {
            jVar.d();
        }
        final float f10 = this.f;
        final float f11 = f7 - f10;
        final boolean z10 = Math.abs((this.r + f10) - this.e) <= ((float) org.telegram.messenger.i0.L(1.0f));
        if (this.s) {
            this.f = f7;
            if (z10) {
                this.r = w7.u.a(this.r - Math.max(0.0f, f11), (-this.f) + this.e, (getHeight() - this.f) + this.e);
            }
            c();
            return;
        }
        o1.j jVar2 = this.w;
        if (jVar2 != null) {
            jVar2.d();
        }
        o1.j jVar3 = new o1.j(new o1.i(f10));
        jVar3.m = org.telegram.ui.Cells.f1.p(f7, 1400.0f, 1.0f);
        jVar3.b(new o1.g() { // from class: xh.f3
            @Override // o1.g
            public final void a(o1.j jVar4, float f12, float f13) {
                h3 h3Var = h3.this;
                h3Var.f = f12;
                float f14 = f11;
                float f15 = f10;
                float f16 = f14 == 0.0f ? 1.0f : (f12 - f15) / f14;
                if (z10) {
                    h3Var.r = w7.u.a(h3Var.r - (Math.max(0.0f, f14) * f16), (-h3Var.f) + h3Var.e, (h3Var.getHeight() - h3Var.f) + h3Var.e);
                }
                o1.j jVar5 = h3Var.G;
                if (jVar5 != null) {
                    o1.k kVar = jVar5.m;
                    if (((float) kVar.i) == (-f15) + h3Var.e) {
                        kVar.i = (-f7) + r1;
                    }
                }
                h3Var.c();
            }
        });
        jVar3.a(new gf0(this, f7, 2));
        this.w = jVar3;
        jVar3.h();
    }

    public void setScrollEndListener(Runnable runnable) {
        this.E = runnable;
    }

    public void setScrollListener(Runnable runnable) {
        this.D = runnable;
    }

    public void setShouldWaitWebViewScroll(boolean z10) {
        this.N = z10;
    }

    public void setSwipeOffsetAnimationDisallowed(boolean z10) {
        this.s = z10;
    }

    public void setSwipeOffsetY(float f7) {
        this.r = f7;
        c();
    }

    public void setTopActionBarOffsetY(float f7) {
        this.e = f7;
        c();
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
    }

    public void setWebView(org.telegram.ui.web.v0 v0Var) {
        this.y = v0Var;
    }
}
