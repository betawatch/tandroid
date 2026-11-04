package ug;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ni0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class j extends FrameLayout {
    public static final List q0 = Arrays.asList(-90, 0, 90, Integer.valueOf(hs.K2));
    public boolean E;
    public boolean F;
    public h G;
    public PointF H;
    public i I;
    public final e J;
    public final UUID K;
    public boolean L;
    public int M;
    public int N;
    public org.telegram.ui.Wallet.f2 O;
    public float P;
    public ValueAnimator Q;
    public ValueAnimator R;
    public int S;
    public int T;
    public final e U;
    public final e V;
    public int W;
    public final gc a;
    public int a0;
    public float b;
    public ValueAnimator b0;
    public float c;
    public ValueAnimator c0;
    public float d;
    public boolean d0;
    public float e;
    public boolean e0;
    public float f;
    public final float[] f0;
    public final float[] g0;
    public float h;
    public final float[] h0;
    public float i0;
    public float j0;
    public float k0;
    public ValueAnimator l0;
    public boolean m0;
    public boolean n;
    public ViewGroup n0;
    public float o0;
    public ValueAnimator p0;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: Type inference failed for: r0v0, types: [ug.e] */
    /* JADX WARN: Type inference failed for: r0v3, types: [ug.e] */
    /* JADX WARN: Type inference failed for: r0v4, types: [ug.e] */
    public j(Context context, PointF pointF) {
        super(context);
        this.a = new gc(this);
        this.n = false;
        this.r = false;
        this.s = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.E = false;
        this.F = false;
        final int i3 = 0;
        this.J = new Runnable(this) { // from class: ug.e
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        j jVar = this.b;
                        jVar.F = true;
                        if (jVar.G != null) {
                            try {
                                jVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            jVar.G.k(jVar);
                            break;
                        }
                        break;
                    case 1:
                        this.b.n();
                        break;
                    default:
                        this.b.o();
                        break;
                }
            }
        };
        this.L = true;
        this.M = 0;
        this.N = -1;
        this.S = 0;
        this.T = 0;
        final int i10 = 1;
        this.U = new Runnable(this) { // from class: ug.e
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        j jVar = this.b;
                        jVar.F = true;
                        if (jVar.G != null) {
                            try {
                                jVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            jVar.G.k(jVar);
                            break;
                        }
                        break;
                    case 1:
                        this.b.n();
                        break;
                    default:
                        this.b.o();
                        break;
                }
            }
        };
        final int i11 = 2;
        this.V = new Runnable(this) { // from class: ug.e
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        j jVar = this.b;
                        jVar.F = true;
                        if (jVar.G != null) {
                            try {
                                jVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            jVar.G.k(jVar);
                            break;
                        }
                        break;
                    case 1:
                        this.b.n();
                        break;
                    default:
                        this.b.o();
                        break;
                }
            }
        };
        this.f0 = new float[2];
        this.g0 = new float[2];
        this.h0 = new float[2];
        this.i0 = 1.0f;
        this.m0 = false;
        this.o0 = 1.0f;
        this.K = UUID.randomUUID();
        this.H = pointF;
    }

    public abstract i a();

    public final float b() {
        return (float) ((Math.abs(Math.sin((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredWidth()) + (Math.abs(Math.cos((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredHeight()));
    }

    public final boolean c(float f10, float f11, float f12, float f13, boolean z10) {
        h hVar;
        h hVar2;
        h hVar3;
        h hVar4;
        if (getParent() != null) {
            float scaleX = ((View) getParent()).getScaleX();
            float f14 = z10 ? (f10 + f12) / 2.0f : f10;
            float f15 = z10 ? (f11 + f13) / 2.0f : f11;
            float f16 = (f14 - this.f) / scaleX;
            float f17 = (f15 - this.h) / scaleX;
            if (((float) Math.hypot(f16, f17)) > (this.n ? 6.0f : 16.0f) || z10) {
                org.telegram.messenger.g0.r(this.J);
                e(f16, f17);
                if (z10) {
                    float a10 = a7.h.a(f10, f11, f12, f13);
                    float a11 = a7.h.a(this.b, this.c, this.d, this.e);
                    if (a11 > 0.0f) {
                        j(a10 / a11);
                    }
                    f(this.j0 + ((float) Math.toDegrees(Math.atan2(f11 - f13, f10 - f12) - Math.atan2(this.c - this.e, this.b - this.d))));
                }
                this.b = f10;
                this.c = f11;
                this.f = f14;
                this.h = f15;
                if (z10) {
                    this.d = f12;
                    this.e = f13;
                }
                int i3 = 1;
                this.n = true;
                if ((getParent() instanceof d) && (this.S != 0 || this.T != 0)) {
                    ((d) getParent()).invalidate();
                }
                if (!this.w && (hVar4 = this.G) != null) {
                    this.w = true;
                    hVar4.B();
                }
                if (!this.x && z10 && (hVar3 = this.G) != null) {
                    this.x = true;
                    hVar3.h();
                }
                if (this.x && !z10 && (hVar2 = this.G) != null) {
                    this.x = false;
                    hVar2.g();
                }
                if (!this.m0 && !this.y && (hVar = this.G) != null) {
                    hVar.f(this);
                    this.y = true;
                }
                h hVar5 = this.G;
                if (hVar5 != null) {
                    hVar5.A(org.telegram.messenger.camera.q.v((float) getHeight(), 2.0f, scaleX, this.H.y) < ((float) org.telegram.messenger.g0.L(66.0f)));
                    this.G.d(a1.g.A((float) getHeight(), 2.0f, scaleX, this.H.y) > ((float) (((View) getParent()).getHeight() - org.telegram.messenger.g0.L(114.0f))));
                }
                h hVar6 = this.G;
                boolean z11 = (hVar6 == null || hVar6.q()) && !z10 && a7.h.a(f14, f15, ((float) ((View) getParent()).getWidth()) / 2.0f, (float) (((View) getParent()).getHeight() - org.telegram.messenger.g0.L(76.0f))) < ((float) org.telegram.messenger.g0.L(32.0f));
                if (this.E != z11) {
                    ValueAnimator valueAnimator = this.p0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.p0 = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.o0, z11 ? 0.5f : 1.0f);
                    this.p0 = ofFloat;
                    ofFloat.addUpdateListener(new f(this, i3));
                    this.p0.setInterpolator(xq.h);
                    this.p0.setDuration(280L);
                    this.p0.start();
                    this.E = z11;
                    h hVar7 = this.G;
                    if (hVar7 != null) {
                        hVar7.l(z11);
                    }
                }
                this.a.c(false);
                return true;
            }
        }
        return false;
    }

    public final void d(boolean z10) {
        h hVar;
        h hVar2;
        if (this.w) {
            this.G.e(this.E);
            this.w = false;
        }
        this.x = false;
        if (!z10 && !this.F && !this.n && !this.s && !this.y && (hVar2 = this.G) != null) {
            hVar2.f(this);
        }
        if (this.n && (hVar = this.G) != null) {
            hVar.A(false);
            this.G.d(false);
        }
        org.telegram.messenger.g0.r(this.J);
        this.F = false;
        this.n = false;
        this.s = false;
        this.r = true;
        this.y = false;
        this.N = this.M;
        org.telegram.ui.Wallet.f2 f2Var = this.O;
        if (f2Var != null) {
            org.telegram.messenger.g0.r(f2Var);
            this.O = null;
        }
        this.W = this.S;
        org.telegram.messenger.g0.r(this.U);
        this.a0 = this.T;
        org.telegram.messenger.g0.r(this.V);
        if (getParent() instanceof d) {
            ((d) getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float a10 = this.a.a(getBounceScale());
        canvas.save();
        canvas.scale(a10, a10, getWidth() / 2.0f, getHeight() / 2.0f);
        if (getParent() instanceof View) {
            View view = (View) getParent();
            if (this instanceof r1) {
                float f10 = this.o0;
                canvas.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
            } else {
                float width = (view.getWidth() / 2.0f) - getX();
                float height = (view.getHeight() - org.telegram.messenger.g0.L(76.0f)) - getY();
                float f11 = this.o0;
                canvas.scale(f11, f11, width, height);
            }
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x012e, code lost:
    
        if (java.lang.Math.abs(((getScaleY() * ((b() / 2.0f) - getStickyPaddingBottom())) + r9.H.y) - (r10.getMeasuredHeight() - org.telegram.messenger.g0.L(64.0f))) <= org.telegram.messenger.g0.L(12.0f)) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f10, float f11) {
        int i3;
        PointF pointF = this.H;
        pointF.x += f10;
        pointF.y += f11;
        if (((View) getParent()) != null) {
            int i10 = 3;
            if (!this.d0) {
                if (Math.abs(this.H.x - (r10.getMeasuredWidth() / 2.0f)) > org.telegram.messenger.g0.L(12.0f) || this.H.y >= r10.getMeasuredHeight() - org.telegram.messenger.g0.L(112.0f)) {
                    if (Math.abs((this.H.x - (getScaleX() * (getStickyPaddingLeft() + (p() / 2.0f)))) - org.telegram.messenger.g0.L(8.0f)) <= org.telegram.messenger.g0.L(12.0f)) {
                        i3 = 1;
                    } else {
                        if (Math.abs(((getScaleX() * ((p() / 2.0f) - getStickyPaddingRight())) + this.H.x) - (r10.getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f))) <= org.telegram.messenger.g0.L(12.0f)) {
                            i3 = 3;
                        }
                    }
                } else {
                    i3 = 2;
                }
                if (this.W != i3) {
                    this.W = i3;
                    if (i3 == 0) {
                        n();
                    } else {
                        org.telegram.messenger.g0.i3(this.U, 250L);
                    }
                }
                if (!this.d0) {
                    if (Math.abs(this.H.y - (r10.getMeasuredHeight() / 2.0f)) <= org.telegram.messenger.g0.L(12.0f)) {
                        i10 = 2;
                    } else {
                        if (Math.abs((this.H.y - (getScaleY() * (getStickyPaddingTop() + (b() / 2.0f)))) - org.telegram.messenger.g0.L(64.0f)) <= org.telegram.messenger.g0.L(12.0f)) {
                            i10 = 1;
                        }
                    }
                    if (this.a0 != i10) {
                        this.a0 = i10;
                        if (i10 == 0) {
                            o();
                        } else {
                            org.telegram.messenger.g0.i3(this.V, 250L);
                        }
                    }
                }
                i10 = 0;
                if (this.a0 != i10) {
                }
            }
            i3 = 0;
            if (this.W != i3) {
            }
            if (!this.d0) {
            }
            i10 = 0;
            if (this.a0 != i10) {
            }
        }
        k();
    }

    public final void f(float f10) {
        int i3 = 0;
        if (this.S != 0) {
            this.W = 0;
            n();
        }
        if (this.T != 0) {
            this.a0 = 0;
            o();
        }
        this.j0 = f10;
        boolean z10 = this.L;
        if (!z10 && !this.d0) {
            Iterator it = q0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int intValue = ((Integer) it.next()).intValue();
                if (Math.abs(intValue - f10) < 4.0f) {
                    if (this.N != intValue) {
                        this.N = intValue;
                        org.telegram.ui.Wallet.f2 f2Var = this.O;
                        if (f2Var != null) {
                            org.telegram.messenger.g0.r(f2Var);
                        }
                        org.telegram.ui.Wallet.f2 f2Var2 = new org.telegram.ui.Wallet.f2(this, intValue, 8);
                        this.O = f2Var2;
                        org.telegram.messenger.g0.i3(f2Var2, 250L);
                    }
                }
            }
        } else if (z10) {
            if (Math.abs(this.M - f10) >= 12.0f || this.d0) {
                this.N = -1;
                org.telegram.ui.Wallet.f2 f2Var3 = this.O;
                if (f2Var3 != null) {
                    org.telegram.messenger.g0.r(f2Var3);
                    this.O = null;
                }
                ValueAnimator valueAnimator = this.Q;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = this.R;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                this.R = duration;
                duration.setInterpolator(xq.f);
                this.R.addUpdateListener(new f(this, i3));
                this.R.addListener(new g(this, 3));
                this.R.start();
                this.L = false;
            } else {
                f10 = this.Q != null ? this.P : this.M;
            }
        }
        ValueAnimator valueAnimator3 = this.R;
        if (valueAnimator3 != null) {
            f10 = org.telegram.messenger.g0.b2(0.0f, f10, valueAnimator3.getAnimatedFraction());
        }
        g(f10);
    }

    public final void g(float f10) {
        setRotation(f10);
        if (this.S != 0 || this.T != 0) {
            k();
        }
        m();
    }

    public float getBounceScale() {
        return 0.04f;
    }

    public float getMaxScale() {
        return 100.0f;
    }

    public float getMinScale() {
        return 0.0f;
    }

    public PointF getPosition() {
        return this.H;
    }

    public float getPositionX() {
        float f10;
        float f11 = this.H.x;
        if (getParent() != null) {
            View view = (View) getParent();
            int i3 = this.S;
            if (i3 == 1) {
                f10 = (getScaleX() * ((p() / 2.0f) - getStickyPaddingLeft())) + org.telegram.messenger.g0.L(8.0f);
            } else if (i3 == 2) {
                f10 = view.getMeasuredWidth() / 2.0f;
            } else if (i3 == 3) {
                f10 = (view.getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f)) - (getScaleX() * (getStickyPaddingRight() + (p() / 2.0f)));
            } else {
                f10 = f11;
            }
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                return org.telegram.messenger.g0.T1(f11, f10, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
            if (f10 != 0.0f) {
                return f10;
            }
        }
        return f11;
    }

    public float getPositionY() {
        float f10;
        float f11 = this.H.y;
        if (getParent() != null) {
            View view = (View) getParent();
            int i3 = this.T;
            if (i3 == 1) {
                f10 = (getScaleY() * ((b() / 2.0f) - getStickyPaddingTop())) + org.telegram.messenger.g0.L(64.0f);
            } else if (i3 == 2) {
                f10 = view.getMeasuredHeight() / 2.0f;
            } else if (i3 == 3) {
                f10 = (view.getMeasuredHeight() - org.telegram.messenger.g0.L(64.0f)) - (getScaleY() * (getStickyPaddingBottom() + (b() / 2.0f)));
            } else {
                f10 = f11;
            }
            ValueAnimator valueAnimator = this.c0;
            if (valueAnimator != null) {
                return org.telegram.messenger.g0.T1(f11, f10, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
            if (f10 != 0.0f) {
                return f10;
            }
        }
        return f11;
    }

    public float getScale() {
        return getScaleX();
    }

    public ni0 getSelectionBounds() {
        return new ni0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public float getStickyPaddingBottom() {
        return 0.0f;
    }

    public float getStickyPaddingLeft() {
        return 0.0f;
    }

    public float getStickyPaddingRight() {
        return 0.0f;
    }

    public float getStickyPaddingTop() {
        return 0.0f;
    }

    public final int getStickyX() {
        return this.S;
    }

    public final int getStickyY() {
        return this.T;
    }

    public UUID getUUID() {
        return this.K;
    }

    public final void h(float... fArr) {
        ValueAnimator valueAnimator = this.b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.b0 = duration;
        duration.setInterpolator(xq.f);
        this.b0.addUpdateListener(new f(this, 3));
        this.b0.addListener(new g(this, 0));
        this.b0.start();
    }

    public final void i(float... fArr) {
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.c0 = duration;
        duration.setInterpolator(xq.f);
        this.c0.addUpdateListener(new f(this, 4));
        this.c0.addListener(new g(this, 1));
        this.c0.start();
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return this.m0;
    }

    public final void j(float f10) {
        float f11 = this.i0;
        float f12 = f10 * f11;
        this.i0 = f12;
        float i3 = Utilities.i(Math.max(f12, 0.1f), getMaxScale(), getMinScale());
        if (!(this instanceof q1)) {
            if ((i3 >= getMaxScale() || i3 <= getMinScale()) != (f11 >= getMaxScale() || f11 <= getMinScale())) {
                try {
                    performHapticFeedback(3, 1);
                } catch (Exception unused) {
                }
            }
        }
        setScaleX(i3);
        setScaleY(i3);
    }

    public void k() {
        setX(getPositionX() - (getMeasuredWidth() / 2.0f));
        setY(getPositionY() - (getMeasuredHeight() / 2.0f));
        m();
    }

    public final void l(ViewGroup viewGroup, boolean z10) {
        if (this.m0 != z10) {
            this.m0 = z10;
            ValueAnimator valueAnimator = this.l0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.l0 = null;
            }
            if (this.I == null) {
                if (!z10 && viewGroup == null) {
                    return;
                }
                i a10 = a();
                this.I = a10;
                a10.f = !this.d0;
                a10.invalidate();
                viewGroup.addView(this.I);
                this.k0 = 0.0f;
            }
            this.I.b();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.k0, z10 ? 1.0f : 0.0f);
            this.l0 = ofFloat;
            ofFloat.addUpdateListener(new f(this, 2));
            this.l0.addListener(new g(this, 4));
            this.l0.setDuration(280L);
            this.l0.setInterpolator(xq.h);
            this.l0.start();
        }
    }

    public final void m() {
        i iVar = this.I;
        if (iVar != null) {
            iVar.b();
        }
    }

    public final void n() {
        org.telegram.messenger.g0.r(this.U);
        int i3 = this.S;
        int i10 = this.W;
        if (i3 == i10) {
            return;
        }
        this.S = i10;
        if (getParent() instanceof d) {
            ((d) getParent()).invalidate();
        }
        ValueAnimator valueAnimator = this.b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.W == 0) {
            h(1.0f, 0.0f);
        } else {
            try {
                performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            h(0.0f, 1.0f);
        }
    }

    public final void o() {
        org.telegram.messenger.g0.r(this.V);
        int i3 = this.T;
        int i10 = this.a0;
        if (i3 == i10) {
            return;
        }
        this.T = i10;
        if (getParent() instanceof d) {
            ((d) getParent()).invalidate();
        }
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.a0 == 0) {
            i(1.0f, 0.0f);
        } else {
            try {
                performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            i(0.0f, 1.0f);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.G.r();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0057  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked;
        j jVar;
        boolean z11;
        if (this.G.r()) {
            h hVar = this.G;
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float[] fArr = this.f0;
            hVar.v(rawX, rawY, fArr);
            boolean z12 = motionEvent.getPointerCount() > 1;
            float[] fArr2 = this.g0;
            if (z12) {
                if (Build.VERSION.SDK_INT < 29) {
                    z10 = false;
                    float[] fArr3 = this.h0;
                    if (z10) {
                        fArr3[0] = fArr[0];
                        fArr3[1] = fArr[1];
                    } else {
                        fArr3[0] = (fArr[0] + fArr2[0]) / 2.0f;
                        fArr3[1] = (fArr[1] + fArr2[1]) / 2.0f;
                    }
                    if (this.d0 != z10) {
                        this.b = fArr[0];
                        this.c = fArr[1];
                        this.d = fArr2[0];
                        this.e = fArr2[1];
                        this.f = fArr3[0];
                        this.h = fArr3[1];
                        i iVar = this.I;
                        if (iVar != null) {
                            iVar.f = !z10;
                            iVar.invalidate();
                        }
                    }
                    this.d0 = z10;
                    float f10 = fArr3[0];
                    float f11 = fArr3[1];
                    actionMasked = motionEvent.getActionMasked();
                    gc gcVar = this.a;
                    if (actionMasked == 0) {
                        if (actionMasked != 1) {
                            if (actionMasked == 2) {
                                jVar = this;
                                z11 = jVar.c(fArr[0], fArr[1], fArr2[0], fArr2[1], z10);
                            } else if (actionMasked != 3) {
                                jVar = this;
                                z11 = false;
                            }
                            jVar.e0 = z10;
                            if (!super.onTouchEvent(motionEvent) || z11) {
                                return true;
                            }
                        }
                        jVar = this;
                        d(actionMasked == 3);
                        gcVar.c(false);
                        i iVar2 = jVar.I;
                        if (iVar2 != null) {
                            iVar2.f = true;
                            iVar2.invalidate();
                        }
                    } else {
                        jVar = this;
                        jVar.e0 = false;
                        jVar.b = fArr[0];
                        jVar.c = fArr[1];
                        jVar.f = f10;
                        jVar.h = f11;
                        jVar.r = false;
                        if ((getParent() instanceof d) && (jVar.S != 0 || jVar.T != 0)) {
                            ((d) getParent()).invalidate();
                        }
                        gcVar.c(true);
                        e eVar = jVar.J;
                        org.telegram.messenger.g0.r(eVar);
                        if (!z10) {
                            org.telegram.messenger.g0.i3(eVar, ViewConfiguration.getLongPressTimeout());
                        }
                    }
                    z11 = true;
                    jVar.e0 = z10;
                    if (!super.onTouchEvent(motionEvent)) {
                    }
                    return true;
                }
                this.G.v(motionEvent.getRawX(1), motionEvent.getRawY(1), fArr2);
            }
            z10 = z12;
            float[] fArr32 = this.h0;
            if (z10) {
            }
            if (this.d0 != z10) {
            }
            this.d0 = z10;
            float f102 = fArr32[0];
            float f112 = fArr32[1];
            actionMasked = motionEvent.getActionMasked();
            gc gcVar2 = this.a;
            if (actionMasked == 0) {
            }
            z11 = true;
            jVar.e0 = z10;
            if (!super.onTouchEvent(motionEvent)) {
            }
            return true;
        }
        return false;
    }

    public final float p() {
        return (float) ((Math.abs(Math.sin((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredHeight()) + (Math.abs(Math.cos((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredWidth()));
    }

    public void setDelegate(h hVar) {
        this.G = hVar;
    }

    public void setPosition(PointF pointF) {
        this.H = pointF;
        k();
    }

    public void setScale(float f10) {
        this.i0 = f10;
        setScaleX(f10);
        setScaleY(f10);
    }

    public void setSelectionVisibility(boolean z10) {
        i iVar = this.I;
        if (iVar == null) {
            return;
        }
        iVar.setVisibility(z10 ? 0 : 8);
    }

    public void setStickyX(int i3) {
        this.W = i3;
        this.S = i3;
    }

    public void setStickyY(int i3) {
        this.a0 = i3;
        this.T = i3;
    }

    public void setIsVideo(boolean z10) {
    }
}
