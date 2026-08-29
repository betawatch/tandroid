package ph;

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
import nh.r9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.pb;
import org.telegram.ui.th;
import org.telegram.ui.xx0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public abstract class m3 extends FrameLayout {
    public static final av0 U = new av0(new xx0(26), new xx0(27));
    public Runnable A;
    public l3 B;
    public o1.k C;
    public int D;
    public GenericProvider E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public float M;
    public float N;
    public boolean O;
    public final float P;
    public final boolean Q;
    public long R;
    public float S;
    public float T;
    public Object a;
    public final o4.g b;
    public boolean c;
    public boolean d;
    public float e;
    public float f;
    public float h;
    public float n;
    public float r;
    public boolean s;
    public o1.k v;
    public boolean w;
    public org.telegram.ui.web.w0 x;
    public Runnable y;

    public m3(Context context) {
        super(context);
        this.e = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        this.f = 0.0f;
        this.h = -1.0f;
        this.n = -2.14748365E9f;
        this.E = new xx0(28);
        this.I = true;
        this.N = 0.0f;
        this.O = false;
        this.P = AndroidUtilities.dp(60.0f);
        this.Q = true;
        this.b = new o4.g(context, new mr(this, ViewConfiguration.get(context).getScaledTouchSlop(), 2));
        Point point = AndroidUtilities.displaySize;
        this.D = AndroidUtilities.dp(point.x > point.y ? 8.0f : 64.0f);
    }

    public final void a(boolean z10, boolean z11) {
        this.K = z10;
        this.L = z11;
    }

    public final boolean b(boolean z10) {
        org.telegram.ui.web.w0 w0Var = this.x;
        if (w0Var == null || !w0Var.J) {
            return true;
        }
        return z10 ? this.K : this.L;
    }

    public final void c() {
        setTranslationY(Math.max(this.e, this.f + this.r));
        AndroidUtilities.cancelRunOnUIThread(new org.telegram.ui.web.t1(this, 11));
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.t1(this, 11));
        Runnable runnable = this.y;
        if (runnable != null) {
            runnable.run();
        }
        mc mcVar = mc.w;
        if (mcVar != null) {
            mcVar.l();
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
            RenderNode c6 = org.telegram.messenger.b.c(obj2);
            c6.endRecording();
            canvas.drawRenderNode(c6);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.c || motionEvent.getActionIndex() == 0) {
            if (motionEvent.getAction() == 0) {
                this.R = motionEvent.getEventTime();
                this.S = motionEvent.getX();
                this.T = motionEvent.getY();
                this.O = false;
                this.N = 0.0f;
                if (this.J) {
                    this.K = false;
                    this.L = false;
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
                if (!this.F || this.H) {
                    if (this.w) {
                        this.w = false;
                    } else if (this.I && (!this.J || (this.r != (-this.f) + this.e && b(false)))) {
                        float f9 = this.r;
                        int i10 = this.D;
                        float f10 = -i10;
                        boolean z11 = this.Q;
                        if (f9 <= f10) {
                            if (z11) {
                                e((-this.f) + this.e);
                            }
                        } else if (f9 <= f10 || f9 > i10) {
                            float distance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), this.S, this.T);
                            long eventTime = motionEvent.getEventTime() - this.R;
                            if (this.B != null && (eventTime > 250 || distance > AndroidUtilities.dp(200.0f))) {
                                this.B.f(!z10);
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

    public final void e(float f9) {
        f(f9, false, null);
    }

    public final void f(float f9, boolean z10, Runnable runnable) {
        o1.k kVar;
        if (this.F && !z10) {
            f9 = (-getOffsetY()) + getTopActionBarOffsetY();
        }
        if (this.r == f9 || ((kVar = this.C) != null && ((float) kVar.u.i) == f9)) {
            if (runnable != null) {
                runnable.run();
            }
            Runnable runnable2 = this.A;
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        }
        this.n = f9;
        o1.k kVar2 = this.v;
        if (kVar2 != null) {
            kVar2.c();
        }
        o1.k kVar3 = this.C;
        if (kVar3 != null) {
            kVar3.c();
        }
        o1.k kVar4 = new o1.k(this, U, f9);
        kVar4.u = th.l(f9, 1200.0f, 1.0f);
        kVar4.a(new pb(4, this, runnable));
        this.C = kVar4;
        kVar4.f();
    }

    public float getOffsetY() {
        return this.f;
    }

    public Object getRenderNode() {
        if (this.a == null && Build.VERSION.SDK_INT >= 31) {
            this.a = android.support.v4.media.session.z.j();
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
        this.D = AndroidUtilities.dp(point.x > point.y ? 8.0f : 64.0f);
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
        this.H = z10;
    }

    public void setAllowSwipes(boolean z10) {
        if (this.I != z10) {
            this.I = z10;
        }
    }

    public void setDelegate(l3 l3Var) {
        this.B = l3Var;
    }

    public void setForceOffsetY(float f9) {
        this.f = f9;
        c();
    }

    public void setFullSize(boolean z10) {
        if (this.F != z10) {
            this.F = z10;
            if (!z10) {
                e(0.0f);
            } else if (this.G) {
                e(getTopActionBarOffsetY() + (-getOffsetY()));
            }
        }
    }

    public void setIsKeyboardVisible(GenericProvider<Void, Boolean> genericProvider) {
        this.E = genericProvider;
    }

    public void setOffsetY(final float f9) {
        if (this.n != -2.14748365E9f) {
            this.h = f9;
            return;
        }
        o1.k kVar = this.v;
        if (kVar != null) {
            kVar.c();
        }
        final float f10 = this.f;
        final float f11 = f9 - f10;
        final boolean z10 = Math.abs((this.r + f10) - this.e) <= ((float) AndroidUtilities.dp(1.0f));
        if (this.s) {
            this.f = f9;
            if (z10) {
                this.r = i7.w.a(this.r - Math.max(0.0f, f11), (-this.f) + this.e, (getHeight() - this.f) + this.e);
            }
            c();
            return;
        }
        o1.k kVar2 = this.v;
        if (kVar2 != null) {
            kVar2.c();
        }
        o1.k kVar3 = new o1.k(new ib.a(f10));
        kVar3.u = th.l(f9, 1400.0f, 1.0f);
        kVar3.b(new o1.h() { // from class: ph.k3
            @Override // o1.h
            public final void a(o1.i iVar, float f12, float f13) {
                m3 m3Var = m3.this;
                m3Var.f = f12;
                float f14 = f11;
                float f15 = f10;
                float f16 = f14 == 0.0f ? 1.0f : (f12 - f15) / f14;
                if (z10) {
                    m3Var.r = i7.w.a(m3Var.r - (Math.max(0.0f, f14) * f16), (-m3Var.f) + m3Var.e, (m3Var.getHeight() - m3Var.f) + m3Var.e);
                }
                o1.k kVar4 = m3Var.C;
                if (kVar4 != null) {
                    o1.l lVar = kVar4.u;
                    if (((float) lVar.i) == (-f15) + m3Var.e) {
                        lVar.i = (-f9) + r1;
                    }
                }
                m3Var.c();
            }
        });
        kVar3.a(new r9(this, f9, 2));
        this.v = kVar3;
        kVar3.f();
    }

    public void setScrollEndListener(Runnable runnable) {
        this.A = runnable;
    }

    public void setScrollListener(Runnable runnable) {
        this.y = runnable;
    }

    public void setShouldWaitWebViewScroll(boolean z10) {
        this.J = z10;
    }

    public void setSwipeOffsetAnimationDisallowed(boolean z10) {
        this.s = z10;
    }

    public void setSwipeOffsetY(float f9) {
        this.r = f9;
        c();
    }

    public void setTopActionBarOffsetY(float f9) {
        this.e = f9;
        c();
    }

    @Override // android.view.View
    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
    }

    public void setWebView(org.telegram.ui.web.w0 w0Var) {
        this.x = w0Var;
    }
}
