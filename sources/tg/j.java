package tg;

import a8.r9;
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
import org.telegram.messenger.qs;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class j extends FrameLayout {
    public static final List p0 = Arrays.asList(-90, 0, 90, Integer.valueOf(qs.K2));
    public boolean D;
    public boolean E;
    public h F;
    public PointF G;
    public i H;
    public final e I;
    public final UUID J;
    public boolean K;
    public int L;
    public int M;
    public org.telegram.ui.Wallet.f2 N;
    public float O;
    public ValueAnimator P;
    public ValueAnimator Q;
    public int R;
    public int S;
    public final e T;
    public final e U;
    public int V;
    public int W;
    public final hc a;
    public ValueAnimator a0;
    public float b;
    public ValueAnimator b0;
    public float c;
    public boolean c0;
    public float d;
    public boolean d0;
    public float e;
    public final float[] e0;
    public float f;
    public final float[] f0;
    public final float[] g0;
    public float h;
    public float h0;
    public float i0;
    public float j0;
    public ValueAnimator k0;
    public boolean l0;
    public ViewGroup m0;
    public boolean n;
    public float n0;
    public ValueAnimator o0;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: Type inference failed for: r0v0, types: [tg.e] */
    /* JADX WARN: Type inference failed for: r0v3, types: [tg.e] */
    /* JADX WARN: Type inference failed for: r0v4, types: [tg.e] */
    public j(Context context, PointF pointF) {
        super(context);
        this.a = new hc(this);
        this.n = false;
        this.r = false;
        this.s = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.D = false;
        this.E = false;
        final int i7 = 0;
        this.I = new Runnable(this) { // from class: tg.e
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        j jVar = this.b;
                        jVar.E = true;
                        if (jVar.F != null) {
                            try {
                                jVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            jVar.F.f(jVar);
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
        this.K = true;
        this.L = 0;
        this.M = -1;
        this.R = 0;
        this.S = 0;
        final int i10 = 1;
        this.T = new Runnable(this) { // from class: tg.e
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        j jVar = this.b;
                        jVar.E = true;
                        if (jVar.F != null) {
                            try {
                                jVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            jVar.F.f(jVar);
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
        this.U = new Runnable(this) { // from class: tg.e
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        j jVar = this.b;
                        jVar.E = true;
                        if (jVar.F != null) {
                            try {
                                jVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            jVar.F.f(jVar);
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
        this.e0 = new float[2];
        this.f0 = new float[2];
        this.g0 = new float[2];
        this.h0 = 1.0f;
        this.l0 = false;
        this.n0 = 1.0f;
        this.J = UUID.randomUUID();
        this.G = pointF;
    }

    public abstract i a();

    public final float b() {
        return (float) ((Math.abs(Math.sin((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredWidth()) + (Math.abs(Math.cos((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredHeight()));
    }

    public final boolean c(float f10, float f11, float f12, float f13, boolean z9) {
        h hVar;
        h hVar2;
        h hVar3;
        h hVar4;
        if (getParent() != null) {
            float scaleX = ((View) getParent()).getScaleX();
            float f14 = z9 ? (f10 + f12) / 2.0f : f10;
            float f15 = z9 ? (f11 + f13) / 2.0f : f11;
            float f16 = (f14 - this.f) / scaleX;
            float f17 = (f15 - this.h) / scaleX;
            if (((float) Math.hypot(f16, f17)) > (this.n ? 6.0f : 16.0f) || z9) {
                org.telegram.messenger.g0.r(this.I);
                e(f16, f17);
                if (z9) {
                    float a10 = r9.a(f10, f11, f12, f13);
                    float a11 = r9.a(this.b, this.c, this.d, this.e);
                    if (a11 > 0.0f) {
                        j(a10 / a11);
                    }
                    f(this.i0 + ((float) Math.toDegrees(Math.atan2(f11 - f13, f10 - f12) - Math.atan2(this.c - this.e, this.b - this.d))));
                }
                this.b = f10;
                this.c = f11;
                this.f = f14;
                this.h = f15;
                if (z9) {
                    this.d = f12;
                    this.e = f13;
                }
                int i7 = 1;
                this.n = true;
                if ((getParent() instanceof d) && (this.R != 0 || this.S != 0)) {
                    ((d) getParent()).invalidate();
                }
                if (!this.w && (hVar4 = this.F) != null) {
                    this.w = true;
                    hVar4.C();
                }
                if (!this.x && z9 && (hVar3 = this.F) != null) {
                    this.x = true;
                    hVar3.h();
                }
                if (this.x && !z9 && (hVar2 = this.F) != null) {
                    this.x = false;
                    hVar2.g();
                }
                if (!this.l0 && !this.y && (hVar = this.F) != null) {
                    hVar.u(this);
                    this.y = true;
                }
                h hVar5 = this.F;
                if (hVar5 != null) {
                    hVar5.B(org.telegram.messenger.camera.q.v((float) getHeight(), 2.0f, scaleX, this.G.y) < ((float) org.telegram.messenger.g0.L(66.0f)));
                    this.F.d(com.google.android.recaptcha.internal.a.c((float) getHeight(), 2.0f, scaleX, this.G.y) > ((float) (((View) getParent()).getHeight() - org.telegram.messenger.g0.L(114.0f))));
                }
                h hVar6 = this.F;
                boolean z10 = (hVar6 == null || hVar6.p()) && !z9 && r9.a(f14, f15, ((float) ((View) getParent()).getWidth()) / 2.0f, (float) (((View) getParent()).getHeight() - org.telegram.messenger.g0.L(76.0f))) < ((float) org.telegram.messenger.g0.L(32.0f));
                if (this.D != z10) {
                    ValueAnimator valueAnimator = this.o0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.o0 = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n0, z10 ? 0.5f : 1.0f);
                    this.o0 = ofFloat;
                    ofFloat.addUpdateListener(new f(this, i7));
                    this.o0.setInterpolator(wq.h);
                    this.o0.setDuration(280L);
                    this.o0.start();
                    this.D = z10;
                    h hVar7 = this.F;
                    if (hVar7 != null) {
                        hVar7.j(z10);
                    }
                }
                this.a.c(false);
                return true;
            }
        }
        return false;
    }

    public final void d(boolean z9) {
        h hVar;
        h hVar2;
        if (this.w) {
            this.F.e(this.D);
            this.w = false;
        }
        this.x = false;
        if (!z9 && !this.E && !this.n && !this.s && !this.y && (hVar2 = this.F) != null) {
            hVar2.u(this);
        }
        if (this.n && (hVar = this.F) != null) {
            hVar.B(false);
            this.F.d(false);
        }
        org.telegram.messenger.g0.r(this.I);
        this.E = false;
        this.n = false;
        this.s = false;
        this.r = true;
        this.y = false;
        this.M = this.L;
        org.telegram.ui.Wallet.f2 f2Var = this.N;
        if (f2Var != null) {
            org.telegram.messenger.g0.r(f2Var);
            this.N = null;
        }
        this.V = this.R;
        org.telegram.messenger.g0.r(this.T);
        this.W = this.S;
        org.telegram.messenger.g0.r(this.U);
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
                float f10 = this.n0;
                canvas.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
            } else {
                float width = (view.getWidth() / 2.0f) - getX();
                float height = (view.getHeight() - org.telegram.messenger.g0.L(76.0f)) - getY();
                float f11 = this.n0;
                canvas.scale(f11, f11, width, height);
            }
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x012e, code lost:
    
        if (java.lang.Math.abs(((getScaleY() * ((b() / 2.0f) - getStickyPaddingBottom())) + r9.G.y) - (r10.getMeasuredHeight() - org.telegram.messenger.g0.L(64.0f))) <= org.telegram.messenger.g0.L(12.0f)) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f10, float f11) {
        int i7;
        PointF pointF = this.G;
        pointF.x += f10;
        pointF.y += f11;
        if (((View) getParent()) != null) {
            int i10 = 3;
            if (!this.c0) {
                if (Math.abs(this.G.x - (r10.getMeasuredWidth() / 2.0f)) > org.telegram.messenger.g0.L(12.0f) || this.G.y >= r10.getMeasuredHeight() - org.telegram.messenger.g0.L(112.0f)) {
                    if (Math.abs((this.G.x - (getScaleX() * (getStickyPaddingLeft() + (p() / 2.0f)))) - org.telegram.messenger.g0.L(8.0f)) <= org.telegram.messenger.g0.L(12.0f)) {
                        i7 = 1;
                    } else {
                        if (Math.abs(((getScaleX() * ((p() / 2.0f) - getStickyPaddingRight())) + this.G.x) - (r10.getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f))) <= org.telegram.messenger.g0.L(12.0f)) {
                            i7 = 3;
                        }
                    }
                } else {
                    i7 = 2;
                }
                if (this.V != i7) {
                    this.V = i7;
                    if (i7 == 0) {
                        n();
                    } else {
                        org.telegram.messenger.g0.i3(this.T, 250L);
                    }
                }
                if (!this.c0) {
                    if (Math.abs(this.G.y - (r10.getMeasuredHeight() / 2.0f)) <= org.telegram.messenger.g0.L(12.0f)) {
                        i10 = 2;
                    } else {
                        if (Math.abs((this.G.y - (getScaleY() * (getStickyPaddingTop() + (b() / 2.0f)))) - org.telegram.messenger.g0.L(64.0f)) <= org.telegram.messenger.g0.L(12.0f)) {
                            i10 = 1;
                        }
                    }
                    if (this.W != i10) {
                        this.W = i10;
                        if (i10 == 0) {
                            o();
                        } else {
                            org.telegram.messenger.g0.i3(this.U, 250L);
                        }
                    }
                }
                i10 = 0;
                if (this.W != i10) {
                }
            }
            i7 = 0;
            if (this.V != i7) {
            }
            if (!this.c0) {
            }
            i10 = 0;
            if (this.W != i10) {
            }
        }
        k();
    }

    public final void f(float f10) {
        int i7 = 0;
        if (this.R != 0) {
            this.V = 0;
            n();
        }
        if (this.S != 0) {
            this.W = 0;
            o();
        }
        this.i0 = f10;
        boolean z9 = this.K;
        if (!z9 && !this.c0) {
            Iterator it = p0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int intValue = ((Integer) it.next()).intValue();
                if (Math.abs(intValue - f10) < 4.0f) {
                    if (this.M != intValue) {
                        this.M = intValue;
                        org.telegram.ui.Wallet.f2 f2Var = this.N;
                        if (f2Var != null) {
                            org.telegram.messenger.g0.r(f2Var);
                        }
                        org.telegram.ui.Wallet.f2 f2Var2 = new org.telegram.ui.Wallet.f2(this, intValue, 6);
                        this.N = f2Var2;
                        org.telegram.messenger.g0.i3(f2Var2, 250L);
                    }
                }
            }
        } else if (z9) {
            if (Math.abs(this.L - f10) >= 12.0f || this.c0) {
                this.M = -1;
                org.telegram.ui.Wallet.f2 f2Var3 = this.N;
                if (f2Var3 != null) {
                    org.telegram.messenger.g0.r(f2Var3);
                    this.N = null;
                }
                ValueAnimator valueAnimator = this.P;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = this.Q;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                this.Q = duration;
                duration.setInterpolator(wq.f);
                this.Q.addUpdateListener(new f(this, i7));
                this.Q.addListener(new g(this, 3));
                this.Q.start();
                this.K = false;
            } else {
                f10 = this.P != null ? this.O : this.L;
            }
        }
        ValueAnimator valueAnimator3 = this.Q;
        if (valueAnimator3 != null) {
            f10 = org.telegram.messenger.g0.b2(0.0f, f10, valueAnimator3.getAnimatedFraction());
        }
        g(f10);
    }

    public final void g(float f10) {
        setRotation(f10);
        if (this.R != 0 || this.S != 0) {
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
        return this.G;
    }

    public float getPositionX() {
        float f10;
        float f11 = this.G.x;
        if (getParent() != null) {
            View view = (View) getParent();
            int i7 = this.R;
            if (i7 == 1) {
                f10 = (getScaleX() * ((p() / 2.0f) - getStickyPaddingLeft())) + org.telegram.messenger.g0.L(8.0f);
            } else if (i7 == 2) {
                f10 = view.getMeasuredWidth() / 2.0f;
            } else if (i7 == 3) {
                f10 = (view.getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f)) - (getScaleX() * (getStickyPaddingRight() + (p() / 2.0f)));
            } else {
                f10 = f11;
            }
            ValueAnimator valueAnimator = this.a0;
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
        float f11 = this.G.y;
        if (getParent() != null) {
            View view = (View) getParent();
            int i7 = this.S;
            if (i7 == 1) {
                f10 = (getScaleY() * ((b() / 2.0f) - getStickyPaddingTop())) + org.telegram.messenger.g0.L(64.0f);
            } else if (i7 == 2) {
                f10 = view.getMeasuredHeight() / 2.0f;
            } else if (i7 == 3) {
                f10 = (view.getMeasuredHeight() - org.telegram.messenger.g0.L(64.0f)) - (getScaleY() * (getStickyPaddingBottom() + (b() / 2.0f)));
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

    public float getScale() {
        return getScaleX();
    }

    public ki0 getSelectionBounds() {
        return new ki0(0.0f, 0.0f, 0.0f, 0.0f);
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
        return this.R;
    }

    public final int getStickyY() {
        return this.S;
    }

    public UUID getUUID() {
        return this.J;
    }

    public final void h(float... fArr) {
        ValueAnimator valueAnimator = this.a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.a0 = duration;
        duration.setInterpolator(wq.f);
        this.a0.addUpdateListener(new f(this, 3));
        this.a0.addListener(new g(this, 0));
        this.a0.start();
    }

    public final void i(float... fArr) {
        ValueAnimator valueAnimator = this.b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.b0 = duration;
        duration.setInterpolator(wq.f);
        this.b0.addUpdateListener(new f(this, 4));
        this.b0.addListener(new g(this, 1));
        this.b0.start();
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return this.l0;
    }

    public final void j(float f10) {
        float f11 = this.h0;
        float f12 = f10 * f11;
        this.h0 = f12;
        float i7 = Utilities.i(Math.max(f12, 0.1f), getMaxScale(), getMinScale());
        if (!(this instanceof q1)) {
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

    public final void l(ViewGroup viewGroup, boolean z9) {
        if (this.l0 != z9) {
            this.l0 = z9;
            ValueAnimator valueAnimator = this.k0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.k0 = null;
            }
            if (this.H == null) {
                if (!z9 && viewGroup == null) {
                    return;
                }
                i a10 = a();
                this.H = a10;
                a10.f = !this.c0;
                a10.invalidate();
                viewGroup.addView(this.H);
                this.j0 = 0.0f;
            }
            this.H.b();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.j0, z9 ? 1.0f : 0.0f);
            this.k0 = ofFloat;
            ofFloat.addUpdateListener(new f(this, 2));
            this.k0.addListener(new g(this, 4));
            this.k0.setDuration(280L);
            this.k0.setInterpolator(wq.h);
            this.k0.start();
        }
    }

    public final void m() {
        i iVar = this.H;
        if (iVar != null) {
            iVar.b();
        }
    }

    public final void n() {
        org.telegram.messenger.g0.r(this.T);
        int i7 = this.R;
        int i10 = this.V;
        if (i7 == i10) {
            return;
        }
        this.R = i10;
        if (getParent() instanceof d) {
            ((d) getParent()).invalidate();
        }
        ValueAnimator valueAnimator = this.a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.V == 0) {
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
        org.telegram.messenger.g0.r(this.U);
        int i7 = this.S;
        int i10 = this.W;
        if (i7 == i10) {
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
        return this.F.q();
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
        boolean z9;
        int actionMasked;
        j jVar;
        boolean z10;
        if (this.F.q()) {
            h hVar = this.F;
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float[] fArr = this.e0;
            hVar.v(rawX, rawY, fArr);
            boolean z11 = motionEvent.getPointerCount() > 1;
            float[] fArr2 = this.f0;
            if (z11) {
                if (Build.VERSION.SDK_INT < 29) {
                    z9 = false;
                    float[] fArr3 = this.g0;
                    if (z9) {
                        fArr3[0] = fArr[0];
                        fArr3[1] = fArr[1];
                    } else {
                        fArr3[0] = (fArr[0] + fArr2[0]) / 2.0f;
                        fArr3[1] = (fArr[1] + fArr2[1]) / 2.0f;
                    }
                    if (this.c0 != z9) {
                        this.b = fArr[0];
                        this.c = fArr[1];
                        this.d = fArr2[0];
                        this.e = fArr2[1];
                        this.f = fArr3[0];
                        this.h = fArr3[1];
                        i iVar = this.H;
                        if (iVar != null) {
                            iVar.f = !z9;
                            iVar.invalidate();
                        }
                    }
                    this.c0 = z9;
                    float f10 = fArr3[0];
                    float f11 = fArr3[1];
                    actionMasked = motionEvent.getActionMasked();
                    hc hcVar = this.a;
                    if (actionMasked == 0) {
                        if (actionMasked != 1) {
                            if (actionMasked == 2) {
                                jVar = this;
                                z10 = jVar.c(fArr[0], fArr[1], fArr2[0], fArr2[1], z9);
                            } else if (actionMasked != 3) {
                                jVar = this;
                                z10 = false;
                            }
                            jVar.d0 = z9;
                            if (!super.onTouchEvent(motionEvent) || z10) {
                                return true;
                            }
                        }
                        jVar = this;
                        d(actionMasked == 3);
                        hcVar.c(false);
                        i iVar2 = jVar.H;
                        if (iVar2 != null) {
                            iVar2.f = true;
                            iVar2.invalidate();
                        }
                    } else {
                        jVar = this;
                        jVar.d0 = false;
                        jVar.b = fArr[0];
                        jVar.c = fArr[1];
                        jVar.f = f10;
                        jVar.h = f11;
                        jVar.r = false;
                        if ((getParent() instanceof d) && (jVar.R != 0 || jVar.S != 0)) {
                            ((d) getParent()).invalidate();
                        }
                        hcVar.c(true);
                        e eVar = jVar.I;
                        org.telegram.messenger.g0.r(eVar);
                        if (!z9) {
                            org.telegram.messenger.g0.i3(eVar, ViewConfiguration.getLongPressTimeout());
                        }
                    }
                    z10 = true;
                    jVar.d0 = z9;
                    if (!super.onTouchEvent(motionEvent)) {
                    }
                    return true;
                }
                this.F.v(motionEvent.getRawX(1), motionEvent.getRawY(1), fArr2);
            }
            z9 = z11;
            float[] fArr32 = this.g0;
            if (z9) {
            }
            if (this.c0 != z9) {
            }
            this.c0 = z9;
            float f102 = fArr32[0];
            float f112 = fArr32[1];
            actionMasked = motionEvent.getActionMasked();
            hc hcVar2 = this.a;
            if (actionMasked == 0) {
            }
            z10 = true;
            jVar.d0 = z9;
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
        this.F = hVar;
    }

    public void setPosition(PointF pointF) {
        this.G = pointF;
        k();
    }

    public void setScale(float f10) {
        this.h0 = f10;
        setScaleX(f10);
        setScaleY(f10);
    }

    public void setSelectionVisibility(boolean z9) {
        i iVar = this.H;
        if (iVar == null) {
            return;
        }
        iVar.setVisibility(z9 ? 0 : 8);
    }

    public void setStickyX(int i7) {
        this.V = i7;
        this.R = i7;
    }

    public void setStickyY(int i7) {
        this.W = i7;
        this.S = i7;
    }

    public void setIsVideo(boolean z9) {
    }
}
