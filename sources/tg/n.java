package tg;

import a8.x9;
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
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lc;
import org.telegram.ui.ao0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class n extends FrameLayout {
    public static final List r0 = Arrays.asList(-90, 0, 90, Integer.valueOf(ks.K2));
    public boolean E;
    public boolean F;
    public boolean G;
    public l H;
    public PointF I;
    public m J;
    public final i K;
    public final UUID L;
    public boolean M;
    public int N;
    public int O;
    public ao0 P;
    public float Q;
    public ValueAnimator R;
    public ValueAnimator S;
    public int T;
    public int U;
    public final i V;
    public final i W;
    public final lc a;
    public int a0;
    public float b;
    public int b0;
    public float c;
    public ValueAnimator c0;
    public float d;
    public ValueAnimator d0;
    public float e;
    public boolean e0;
    public float f;
    public boolean f0;
    public final float[] g0;
    public float h;
    public final float[] h0;
    public final float[] i0;
    public float j0;
    public float k0;
    public float l0;
    public ValueAnimator m0;
    public boolean n;
    public boolean n0;
    public ViewGroup o0;
    public float p0;
    public ValueAnimator q0;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: Type inference failed for: r0v0, types: [tg.i] */
    /* JADX WARN: Type inference failed for: r0v3, types: [tg.i] */
    /* JADX WARN: Type inference failed for: r0v4, types: [tg.i] */
    public n(Context context, PointF pointF) {
        super(context);
        this.a = new lc(this);
        this.n = false;
        this.r = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.E = false;
        this.F = false;
        this.G = false;
        final int i7 = 0;
        this.K = new Runnable(this) { // from class: tg.i
            public final /* synthetic */ n b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        n nVar = this.b;
                        nVar.G = true;
                        if (nVar.H != null) {
                            try {
                                nVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            nVar.H.f(nVar);
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
        this.M = true;
        this.N = 0;
        this.O = -1;
        this.T = 0;
        this.U = 0;
        final int i10 = 1;
        this.V = new Runnable(this) { // from class: tg.i
            public final /* synthetic */ n b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        n nVar = this.b;
                        nVar.G = true;
                        if (nVar.H != null) {
                            try {
                                nVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            nVar.H.f(nVar);
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
        this.W = new Runnable(this) { // from class: tg.i
            public final /* synthetic */ n b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        n nVar = this.b;
                        nVar.G = true;
                        if (nVar.H != null) {
                            try {
                                nVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            nVar.H.f(nVar);
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
        this.g0 = new float[2];
        this.h0 = new float[2];
        this.i0 = new float[2];
        this.j0 = 1.0f;
        this.n0 = false;
        this.p0 = 1.0f;
        this.L = UUID.randomUUID();
        this.I = pointF;
    }

    public abstract m a();

    public final float b() {
        return (float) ((Math.abs(Math.sin((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredWidth()) + (Math.abs(Math.cos((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredHeight()));
    }

    public final boolean c(float f10, float f11, float f12, float f13, boolean z10) {
        l lVar;
        l lVar2;
        l lVar3;
        l lVar4;
        if (getParent() != null) {
            float scaleX = ((View) getParent()).getScaleX();
            float f14 = z10 ? (f10 + f12) / 2.0f : f10;
            float f15 = z10 ? (f11 + f13) / 2.0f : f11;
            float f16 = (f14 - this.f) / scaleX;
            float f17 = (f15 - this.h) / scaleX;
            if (((float) Math.hypot(f16, f17)) > (this.n ? 6.0f : 16.0f) || z10) {
                org.telegram.messenger.g0.r(this.K);
                e(f16, f17);
                if (z10) {
                    float a10 = x9.a(f10, f11, f12, f13);
                    float a11 = x9.a(this.b, this.c, this.d, this.e);
                    if (a11 > 0.0f) {
                        j(a10 / a11);
                    }
                    f(this.k0 + ((float) Math.toDegrees(Math.atan2(f11 - f13, f10 - f12) - Math.atan2(this.c - this.e, this.b - this.d))));
                }
                this.b = f10;
                this.c = f11;
                this.f = f14;
                this.h = f15;
                if (z10) {
                    this.d = f12;
                    this.e = f13;
                }
                int i7 = 1;
                this.n = true;
                if ((getParent() instanceof h) && (this.T != 0 || this.U != 0)) {
                    ((h) getParent()).invalidate();
                }
                if (!this.x && (lVar4 = this.H) != null) {
                    this.x = true;
                    lVar4.C();
                }
                if (!this.y && z10 && (lVar3 = this.H) != null) {
                    this.y = true;
                    lVar3.h();
                }
                if (this.y && !z10 && (lVar2 = this.H) != null) {
                    this.y = false;
                    lVar2.g();
                }
                if (!this.n0 && !this.E && (lVar = this.H) != null) {
                    lVar.u(this);
                    this.E = true;
                }
                l lVar5 = this.H;
                if (lVar5 != null) {
                    lVar5.B(m10.w((float) getHeight(), 2.0f, scaleX, this.I.y) < ((float) org.telegram.messenger.g0.L(66.0f)));
                    this.H.d(com.google.android.gms.internal.vision.e2.c((float) getHeight(), 2.0f, scaleX, this.I.y) > ((float) (((View) getParent()).getHeight() - org.telegram.messenger.g0.L(114.0f))));
                }
                l lVar6 = this.H;
                boolean z11 = (lVar6 == null || lVar6.p()) && !z10 && x9.a(f14, f15, ((float) ((View) getParent()).getWidth()) / 2.0f, (float) (((View) getParent()).getHeight() - org.telegram.messenger.g0.L(76.0f))) < ((float) org.telegram.messenger.g0.L(32.0f));
                if (this.F != z11) {
                    ValueAnimator valueAnimator = this.q0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.q0 = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.p0, z11 ? 0.5f : 1.0f);
                    this.q0 = ofFloat;
                    ofFloat.addUpdateListener(new j(this, i7));
                    this.q0.setInterpolator(kr.h);
                    this.q0.setDuration(280L);
                    this.q0.start();
                    this.F = z11;
                    l lVar7 = this.H;
                    if (lVar7 != null) {
                        lVar7.j(z11);
                    }
                }
                this.a.c(false);
                return true;
            }
        }
        return false;
    }

    public final void d(boolean z10) {
        l lVar;
        l lVar2;
        if (this.x) {
            this.H.e(this.F);
            this.x = false;
        }
        this.y = false;
        if (!z10 && !this.G && !this.n && !this.w && !this.E && (lVar2 = this.H) != null) {
            lVar2.u(this);
        }
        if (this.n && (lVar = this.H) != null) {
            lVar.B(false);
            this.H.d(false);
        }
        org.telegram.messenger.g0.r(this.K);
        this.G = false;
        this.n = false;
        this.w = false;
        this.r = true;
        this.s = false;
        this.E = false;
        this.O = this.N;
        ao0 ao0Var = this.P;
        if (ao0Var != null) {
            org.telegram.messenger.g0.r(ao0Var);
            this.P = null;
        }
        this.a0 = this.T;
        org.telegram.messenger.g0.r(this.V);
        this.b0 = this.U;
        org.telegram.messenger.g0.r(this.W);
        if (getParent() instanceof h) {
            ((h) getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float a10 = this.a.a(getBounceScale());
        canvas.save();
        canvas.scale(a10, a10, getWidth() / 2.0f, getHeight() / 2.0f);
        if (getParent() instanceof View) {
            View view = (View) getParent();
            if (this instanceof w1) {
                float f10 = this.p0;
                canvas.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
            } else {
                float width = (view.getWidth() / 2.0f) - getX();
                float height = (view.getHeight() - org.telegram.messenger.g0.L(76.0f)) - getY();
                float f11 = this.p0;
                canvas.scale(f11, f11, width, height);
            }
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x012e, code lost:
    
        if (java.lang.Math.abs(((getScaleY() * ((b() / 2.0f) - getStickyPaddingBottom())) + r9.I.y) - (r10.getMeasuredHeight() - org.telegram.messenger.g0.L(64.0f))) <= org.telegram.messenger.g0.L(12.0f)) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f10, float f11) {
        int i7;
        PointF pointF = this.I;
        pointF.x += f10;
        pointF.y += f11;
        if (((View) getParent()) != null) {
            int i10 = 3;
            if (!this.e0) {
                if (Math.abs(this.I.x - (r10.getMeasuredWidth() / 2.0f)) > org.telegram.messenger.g0.L(12.0f) || this.I.y >= r10.getMeasuredHeight() - org.telegram.messenger.g0.L(112.0f)) {
                    if (Math.abs((this.I.x - (getScaleX() * (getStickyPaddingLeft() + (p() / 2.0f)))) - org.telegram.messenger.g0.L(8.0f)) <= org.telegram.messenger.g0.L(12.0f)) {
                        i7 = 1;
                    } else {
                        if (Math.abs(((getScaleX() * ((p() / 2.0f) - getStickyPaddingRight())) + this.I.x) - (r10.getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f))) <= org.telegram.messenger.g0.L(12.0f)) {
                            i7 = 3;
                        }
                    }
                } else {
                    i7 = 2;
                }
                if (this.a0 != i7) {
                    this.a0 = i7;
                    if (i7 == 0) {
                        n();
                    } else {
                        org.telegram.messenger.g0.h3(this.V, 250L);
                    }
                }
                if (!this.e0) {
                    if (Math.abs(this.I.y - (r10.getMeasuredHeight() / 2.0f)) <= org.telegram.messenger.g0.L(12.0f)) {
                        i10 = 2;
                    } else {
                        if (Math.abs((this.I.y - (getScaleY() * (getStickyPaddingTop() + (b() / 2.0f)))) - org.telegram.messenger.g0.L(64.0f)) <= org.telegram.messenger.g0.L(12.0f)) {
                            i10 = 1;
                        }
                    }
                    if (this.b0 != i10) {
                        this.b0 = i10;
                        if (i10 == 0) {
                            o();
                        } else {
                            org.telegram.messenger.g0.h3(this.W, 250L);
                        }
                    }
                }
                i10 = 0;
                if (this.b0 != i10) {
                }
            }
            i7 = 0;
            if (this.a0 != i7) {
            }
            if (!this.e0) {
            }
            i10 = 0;
            if (this.b0 != i10) {
            }
        }
        k();
    }

    public final void f(float f10) {
        int i7 = 0;
        if (this.T != 0) {
            this.a0 = 0;
            n();
        }
        if (this.U != 0) {
            this.b0 = 0;
            o();
        }
        this.k0 = f10;
        boolean z10 = this.M;
        if (!z10 && !this.e0) {
            Iterator it = r0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int intValue = ((Integer) it.next()).intValue();
                if (Math.abs(intValue - f10) < 4.0f) {
                    if (this.O != intValue) {
                        this.O = intValue;
                        ao0 ao0Var = this.P;
                        if (ao0Var != null) {
                            org.telegram.messenger.g0.r(ao0Var);
                        }
                        ao0 ao0Var2 = new ao0(this, intValue, 14);
                        this.P = ao0Var2;
                        org.telegram.messenger.g0.h3(ao0Var2, 250L);
                    }
                }
            }
        } else if (z10) {
            if (Math.abs(this.N - f10) >= 12.0f || this.e0) {
                this.O = -1;
                ao0 ao0Var3 = this.P;
                if (ao0Var3 != null) {
                    org.telegram.messenger.g0.r(ao0Var3);
                    this.P = null;
                }
                ValueAnimator valueAnimator = this.R;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = this.S;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                this.S = duration;
                duration.setInterpolator(kr.f);
                this.S.addUpdateListener(new j(this, i7));
                this.S.addListener(new k(this, 3));
                this.S.start();
                this.M = false;
            } else {
                f10 = this.R != null ? this.Q : this.N;
            }
        }
        ValueAnimator valueAnimator3 = this.S;
        if (valueAnimator3 != null) {
            f10 = org.telegram.messenger.g0.b2(0.0f, f10, valueAnimator3.getAnimatedFraction());
        }
        g(f10);
    }

    public final void g(float f10) {
        setRotation(f10);
        if (this.T != 0 || this.U != 0) {
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
        return this.I;
    }

    public float getPositionX() {
        float f10;
        float f11 = this.I.x;
        if (getParent() != null) {
            View view = (View) getParent();
            int i7 = this.T;
            if (i7 == 1) {
                f10 = (getScaleX() * ((p() / 2.0f) - getStickyPaddingLeft())) + org.telegram.messenger.g0.L(8.0f);
            } else if (i7 == 2) {
                f10 = view.getMeasuredWidth() / 2.0f;
            } else if (i7 == 3) {
                f10 = (view.getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f)) - (getScaleX() * (getStickyPaddingRight() + (p() / 2.0f)));
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

    public float getPositionY() {
        float f10;
        float f11 = this.I.y;
        if (getParent() != null) {
            View view = (View) getParent();
            int i7 = this.U;
            if (i7 == 1) {
                f10 = (getScaleY() * ((b() / 2.0f) - getStickyPaddingTop())) + org.telegram.messenger.g0.L(64.0f);
            } else if (i7 == 2) {
                f10 = view.getMeasuredHeight() / 2.0f;
            } else if (i7 == 3) {
                f10 = (view.getMeasuredHeight() - org.telegram.messenger.g0.L(64.0f)) - (getScaleY() * (getStickyPaddingBottom() + (b() / 2.0f)));
            } else {
                f10 = f11;
            }
            ValueAnimator valueAnimator = this.d0;
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

    public aj0 getSelectionBounds() {
        return new aj0(0.0f, 0.0f, 0.0f, 0.0f);
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
        return this.T;
    }

    public final int getStickyY() {
        return this.U;
    }

    public UUID getUUID() {
        return this.L;
    }

    public final void h(float... fArr) {
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.c0 = duration;
        duration.setInterpolator(kr.f);
        this.c0.addUpdateListener(new j(this, 3));
        this.c0.addListener(new k(this, 0));
        this.c0.start();
    }

    public final void i(float... fArr) {
        ValueAnimator valueAnimator = this.d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.d0 = duration;
        duration.setInterpolator(kr.f);
        this.d0.addUpdateListener(new j(this, 4));
        this.d0.addListener(new k(this, 1));
        this.d0.start();
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return this.n0;
    }

    public final void j(float f10) {
        float f11 = this.j0;
        float f12 = f10 * f11;
        this.j0 = f12;
        float i7 = Utilities.i(Math.max(f12, 0.1f), getMaxScale(), getMinScale());
        if (!(this instanceof v1)) {
            if ((i7 >= getMaxScale() || i7 <= getMinScale()) != (f11 >= getMaxScale() || f11 <= getMinScale())) {
                try {
                    performHapticFeedback(3, 1);
                } catch (Exception unused) {
                }
            }
        }
        setScaleX(i7);
        setScaleY(i7);
    }

    public void k() {
        setX(getPositionX() - (getMeasuredWidth() / 2.0f));
        setY(getPositionY() - (getMeasuredHeight() / 2.0f));
        m();
    }

    public final void l(ViewGroup viewGroup, boolean z10) {
        if (this.n0 != z10) {
            this.n0 = z10;
            ValueAnimator valueAnimator = this.m0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.m0 = null;
            }
            if (this.J == null) {
                if (!z10 && viewGroup == null) {
                    return;
                }
                m a10 = a();
                this.J = a10;
                a10.f = !this.e0;
                a10.invalidate();
                viewGroup.addView(this.J);
                this.l0 = 0.0f;
            }
            this.J.b();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.l0, z10 ? 1.0f : 0.0f);
            this.m0 = ofFloat;
            ofFloat.addUpdateListener(new j(this, 2));
            this.m0.addListener(new k(this, 4));
            this.m0.setDuration(280L);
            this.m0.setInterpolator(kr.h);
            this.m0.start();
        }
    }

    public final void m() {
        m mVar = this.J;
        if (mVar != null) {
            mVar.b();
        }
    }

    public final void n() {
        org.telegram.messenger.g0.r(this.V);
        int i7 = this.T;
        int i10 = this.a0;
        if (i7 == i10) {
            return;
        }
        this.T = i10;
        if (getParent() instanceof h) {
            ((h) getParent()).invalidate();
        }
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.a0 == 0) {
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
        org.telegram.messenger.g0.r(this.W);
        int i7 = this.U;
        int i10 = this.b0;
        if (i7 == i10) {
            return;
        }
        this.U = i10;
        if (getParent() instanceof h) {
            ((h) getParent()).invalidate();
        }
        ValueAnimator valueAnimator = this.d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.b0 == 0) {
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
        return this.H.q();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0057  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked;
        n nVar;
        boolean z11;
        if (this.H.q()) {
            l lVar = this.H;
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float[] fArr = this.g0;
            lVar.v(rawX, rawY, fArr);
            boolean z12 = motionEvent.getPointerCount() > 1;
            float[] fArr2 = this.h0;
            if (z12) {
                if (Build.VERSION.SDK_INT < 29) {
                    z10 = false;
                    float[] fArr3 = this.i0;
                    if (z10) {
                        fArr3[0] = fArr[0];
                        fArr3[1] = fArr[1];
                    } else {
                        fArr3[0] = (fArr[0] + fArr2[0]) / 2.0f;
                        fArr3[1] = (fArr[1] + fArr2[1]) / 2.0f;
                    }
                    if (this.e0 != z10) {
                        this.b = fArr[0];
                        this.c = fArr[1];
                        this.d = fArr2[0];
                        this.e = fArr2[1];
                        this.f = fArr3[0];
                        this.h = fArr3[1];
                        m mVar = this.J;
                        if (mVar != null) {
                            mVar.f = !z10;
                            mVar.invalidate();
                        }
                    }
                    this.e0 = z10;
                    float f10 = fArr3[0];
                    float f11 = fArr3[1];
                    actionMasked = motionEvent.getActionMasked();
                    lc lcVar = this.a;
                    if (actionMasked == 0) {
                        if (actionMasked != 1) {
                            if (actionMasked == 2) {
                                nVar = this;
                                z11 = nVar.c(fArr[0], fArr[1], fArr2[0], fArr2[1], z10);
                            } else if (actionMasked != 3) {
                                nVar = this;
                                z11 = false;
                            }
                            nVar.f0 = z10;
                            if (!super.onTouchEvent(motionEvent) || z11) {
                                return true;
                            }
                        }
                        nVar = this;
                        d(actionMasked == 3);
                        lcVar.c(false);
                        m mVar2 = nVar.J;
                        if (mVar2 != null) {
                            mVar2.f = true;
                            mVar2.invalidate();
                        }
                    } else {
                        nVar = this;
                        nVar.f0 = false;
                        nVar.b = fArr[0];
                        nVar.c = fArr[1];
                        nVar.f = f10;
                        nVar.h = f11;
                        nVar.r = false;
                        nVar.s = true;
                        if ((getParent() instanceof h) && (nVar.T != 0 || nVar.U != 0)) {
                            ((h) getParent()).invalidate();
                        }
                        lcVar.c(true);
                        i iVar = nVar.K;
                        org.telegram.messenger.g0.r(iVar);
                        if (!z10) {
                            org.telegram.messenger.g0.h3(iVar, ViewConfiguration.getLongPressTimeout());
                        }
                    }
                    z11 = true;
                    nVar.f0 = z10;
                    if (!super.onTouchEvent(motionEvent)) {
                    }
                    return true;
                }
                this.H.v(motionEvent.getRawX(1), motionEvent.getRawY(1), fArr2);
            }
            z10 = z12;
            float[] fArr32 = this.i0;
            if (z10) {
            }
            if (this.e0 != z10) {
            }
            this.e0 = z10;
            float f102 = fArr32[0];
            float f112 = fArr32[1];
            actionMasked = motionEvent.getActionMasked();
            lc lcVar2 = this.a;
            if (actionMasked == 0) {
            }
            z11 = true;
            nVar.f0 = z10;
            if (!super.onTouchEvent(motionEvent)) {
            }
            return true;
        }
        return false;
    }

    public final float p() {
        return (float) ((Math.abs(Math.sin((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredHeight()) + (Math.abs(Math.cos((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredWidth()));
    }

    public void setDelegate(l lVar) {
        this.H = lVar;
    }

    public void setPosition(PointF pointF) {
        this.I = pointF;
        k();
    }

    public void setScale(float f10) {
        this.j0 = f10;
        setScaleX(f10);
        setScaleY(f10);
    }

    public void setSelectionVisibility(boolean z10) {
        m mVar = this.J;
        if (mVar == null) {
            return;
        }
        mVar.setVisibility(z10 ? 0 : 8);
    }

    public void setStickyX(int i7) {
        this.a0 = i7;
        this.T = i7;
    }

    public void setStickyY(int i7) {
        this.b0 = i7;
        this.U = i7;
    }

    public void setIsVideo(boolean z10) {
    }
}
