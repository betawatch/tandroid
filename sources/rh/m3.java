package rh;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.RenderNode;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.jg0;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.zz;
import org.telegram.ui.ai;
import ph.ga;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public abstract class m3 extends FrameLayout {
    public static final iv0 V = new iv0(new rg.a(15), new rg.a(16));
    public Runnable B;
    public l3 C;
    public o1.j D;
    public int E;
    public GenericProvider F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public float N;
    public float O;
    public boolean P;
    public final float Q;
    public final boolean R;
    public long S;
    public float T;
    public float U;
    public Object a;
    public final zz b;
    public boolean c;
    public boolean d;
    public float e;
    public float f;
    public float h;
    public float n;
    public float r;
    public boolean s;
    public o1.j v;
    public boolean w;
    public org.telegram.ui.web.y0 x;
    public Runnable y;

    public m3(Context context) {
        super(context);
        this.e = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.f = 0.0f;
        this.h = -1.0f;
        this.n = -2.14748365E9f;
        this.F = new rg.a(17);
        this.J = true;
        this.O = 0.0f;
        this.P = false;
        this.Q = AndroidUtilities.dp(60.0f);
        this.R = true;
        this.b = new zz(context, new pr(this, ViewConfiguration.get(context).getScaledTouchSlop(), 2));
        Point point = AndroidUtilities.displaySize;
        this.E = AndroidUtilities.dp(point.x > point.y ? 8.0f : 64.0f);
    }

    public final void a(boolean z4, boolean z10) {
        this.L = z4;
        this.M = z10;
    }

    public final boolean b(boolean z4) {
        org.telegram.ui.web.y0 y0Var = this.x;
        if (y0Var == null || !y0Var.K) {
            return true;
        }
        return z4 ? this.L : this.M;
    }

    public final void c() {
        setTranslationY(Math.max(this.e, this.f + this.r));
        int i10 = 14;
        AndroidUtilities.cancelRunOnUIThread(new ga(this, i10));
        AndroidUtilities.runOnUIThread(new ga(this, i10));
        Runnable runnable = this.y;
        if (runnable != null) {
            runnable.run();
        }
        ic icVar = ic.w;
        if (icVar != null) {
            icVar.l();
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
            RenderNode c3 = org.telegram.messenger.b.c(obj);
            c3.setPosition(0, 0, getWidth(), getHeight());
            canvas2 = c3.beginRecording();
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
        Object obj2 = this.a;
        if (obj2 != null) {
            RenderNode c10 = org.telegram.messenger.b.c(obj2);
            c10.endRecording();
            canvas.drawRenderNode(c10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.c || motionEvent.getActionIndex() == 0) {
            if (motionEvent.getAction() == 0) {
                this.S = motionEvent.getEventTime();
                this.T = motionEvent.getX();
                this.U = motionEvent.getY();
                this.P = false;
                this.O = 0.0f;
                if (this.K) {
                    this.L = false;
                    this.M = false;
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
                boolean z4 = this.c;
                this.d = false;
                this.c = false;
                if (!this.G || this.I) {
                    if (this.w) {
                        this.w = false;
                    } else if (this.J && (!this.K || (this.r != (-this.f) + this.e && b(false)))) {
                        float f10 = this.r;
                        int i10 = this.E;
                        float f11 = -i10;
                        boolean z10 = this.R;
                        if (f10 <= f11) {
                            if (z10) {
                                e((-this.f) + this.e);
                            }
                        } else if (f10 <= f11 || f10 > i10) {
                            float distance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), this.T, this.U);
                            long eventTime = motionEvent.getEventTime() - this.S;
                            if (this.C != null && (eventTime > 250 || distance > AndroidUtilities.dp(200.0f))) {
                                this.C.i(!z4);
                            } else if (z10) {
                                e((-this.f) + this.e);
                            }
                        } else if (z10) {
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

    public final void e(float f10) {
        f(f10, false, null);
    }

    public final void f(float f10, boolean z4, Runnable runnable) {
        o1.j jVar;
        if (this.G && !z4) {
            f10 = (-getOffsetY()) + getTopActionBarOffsetY();
        }
        if (this.r == f10 || ((jVar = this.D) != null && ((float) jVar.u.i) == f10)) {
            if (runnable != null) {
                runnable.run();
            }
            Runnable runnable2 = this.B;
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        }
        this.n = f10;
        o1.j jVar2 = this.v;
        if (jVar2 != null) {
            jVar2.c();
        }
        o1.j jVar3 = this.D;
        if (jVar3 != null) {
            jVar3.c();
        }
        o1.j jVar4 = new o1.j(this, V, f10);
        jVar4.u = ai.m(f10, 1200.0f, 1.0f);
        jVar4.a(new lb(4, this, runnable));
        this.D = jVar4;
        jVar4.f();
    }

    public float getOffsetY() {
        return this.f;
    }

    public Object getRenderNode() {
        if (this.a == null && Build.VERSION.SDK_INT >= 31) {
            this.a = android.support.v4.media.session.y.j();
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
        Point point = AndroidUtilities.displaySize;
        this.E = AndroidUtilities.dp(point.x > point.y ? 8.0f : 64.0f);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        super.requestDisallowInterceptTouchEvent(z4);
        if (z4) {
            this.d = true;
            this.c = false;
        }
    }

    public void setAllowFullSizeSwipe(boolean z4) {
        this.I = z4;
    }

    public void setAllowSwipes(boolean z4) {
        if (this.J != z4) {
            this.J = z4;
        }
    }

    public void setDelegate(l3 l3Var) {
        this.C = l3Var;
    }

    public void setForceOffsetY(float f10) {
        this.f = f10;
        c();
    }

    public void setFullSize(boolean z4) {
        if (this.G != z4) {
            this.G = z4;
            if (!z4) {
                e(0.0f);
            } else if (this.H) {
                e(getTopActionBarOffsetY() + (-getOffsetY()));
            }
        }
    }

    public void setIsKeyboardVisible(GenericProvider<Void, Boolean> genericProvider) {
        this.F = genericProvider;
    }

    public void setOffsetY(final float f10) {
        if (this.n != -2.14748365E9f) {
            this.h = f10;
            return;
        }
        o1.j jVar = this.v;
        if (jVar != null) {
            jVar.c();
        }
        final float f11 = this.f;
        final float f12 = f10 - f11;
        final boolean z4 = Math.abs((this.r + f11) - this.e) <= ((float) AndroidUtilities.dp(1.0f));
        if (this.s) {
            this.f = f10;
            if (z4) {
                this.r = k7.n.a(this.r - Math.max(0.0f, f12), (-this.f) + this.e, (getHeight() - this.f) + this.e);
            }
            c();
            return;
        }
        o1.j jVar2 = this.v;
        if (jVar2 != null) {
            jVar2.c();
        }
        o1.j jVar3 = new o1.j(new kb.a(f11));
        jVar3.u = ai.m(f10, 1400.0f, 1.0f);
        jVar3.b(new o1.g() { // from class: rh.k3
            @Override // o1.g
            public final void a(o1.h hVar, float f13, float f14) {
                m3 m3Var = m3.this;
                m3Var.f = f13;
                float f15 = f12;
                float f16 = f11;
                float f17 = f15 == 0.0f ? 1.0f : (f13 - f16) / f15;
                if (z4) {
                    m3Var.r = k7.n.a(m3Var.r - (Math.max(0.0f, f15) * f17), (-m3Var.f) + m3Var.e, (m3Var.getHeight() - m3Var.f) + m3Var.e);
                }
                o1.j jVar4 = m3Var.D;
                if (jVar4 != null) {
                    o1.k kVar = jVar4.u;
                    if (((float) kVar.i) == (-f16) + m3Var.e) {
                        kVar.i = (-f10) + r1;
                    }
                }
                m3Var.c();
            }
        });
        jVar3.a(new jg0(this, f10, 2));
        this.v = jVar3;
        jVar3.f();
    }

    public void setScrollEndListener(Runnable runnable) {
        this.B = runnable;
    }

    public void setScrollListener(Runnable runnable) {
        this.y = runnable;
    }

    public void setShouldWaitWebViewScroll(boolean z4) {
        this.K = z4;
    }

    public void setSwipeOffsetAnimationDisallowed(boolean z4) {
        this.s = z4;
    }

    public void setSwipeOffsetY(float f10) {
        this.r = f10;
        c();
    }

    public void setTopActionBarOffsetY(float f10) {
        this.e = f10;
        c();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
    }

    public void setWebView(org.telegram.ui.web.y0 y0Var) {
        this.x = y0Var;
    }
}
