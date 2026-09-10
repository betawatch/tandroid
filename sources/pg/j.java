package pg;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.em;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.zd;
import v7.a7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class j extends FrameLayout {
    public static final List p0 = Arrays.asList(-90, 0, 90, 180);
    public boolean E;
    public h F;
    public PointF G;
    public i H;
    public final e I;
    public final UUID J;
    public boolean K;
    public int L;
    public int M;
    public zd N;
    public float O;
    public ValueAnimator P;
    public ValueAnimator Q;
    public int R;
    public int S;
    public final e T;
    public final e U;
    public int V;
    public int W;
    public final xc a;
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
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: Type inference failed for: r0v0, types: [pg.e] */
    /* JADX WARN: Type inference failed for: r0v3, types: [pg.e] */
    /* JADX WARN: Type inference failed for: r0v4, types: [pg.e] */
    public j(Context context, PointF pointF) {
        super(context);
        this.a = new xc(this);
        this.n = false;
        this.r = false;
        this.s = false;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.E = false;
        final int i10 = 0;
        this.I = new Runnable(this) { // from class: pg.e
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
                            jVar.F.D(jVar);
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
        final int i11 = 1;
        this.T = new Runnable(this) { // from class: pg.e
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
                            jVar.F.D(jVar);
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
        final int i12 = 2;
        this.U = new Runnable(this) { // from class: pg.e
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        j jVar = this.b;
                        jVar.E = true;
                        if (jVar.F != null) {
                            try {
                                jVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            jVar.F.D(jVar);
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

    public final boolean c(float f7, float f10, boolean z10, float f11, float f12) {
        h hVar;
        h hVar2;
        h hVar3;
        h hVar4;
        if (getParent() != null) {
            float scaleX = ((View) getParent()).getScaleX();
            float f13 = z10 ? (f7 + f11) / 2.0f : f7;
            float f14 = z10 ? (f10 + f12) / 2.0f : f10;
            float f15 = (f13 - this.f) / scaleX;
            float f16 = (f14 - this.h) / scaleX;
            if (((float) Math.hypot(f15, f16)) > (this.n ? 6.0f : 16.0f) || z10) {
                AndroidUtilities.cancelRunOnUIThread(this.I);
                e(f15, f16);
                if (z10) {
                    float a2 = a7.a(f7, f10, f11, f12);
                    float a10 = a7.a(this.b, this.c, this.d, this.e);
                    if (a10 > 0.0f) {
                        j(a2 / a10);
                    }
                    f(this.i0 + ((float) Math.toDegrees(Math.atan2(f10 - f12, f7 - f11) - Math.atan2(this.c - this.e, this.b - this.d))));
                }
                this.b = f7;
                this.c = f10;
                this.f = f13;
                this.h = f14;
                if (z10) {
                    this.d = f11;
                    this.e = f12;
                }
                int i10 = 1;
                this.n = true;
                if ((getParent() instanceof d) && (this.R != 0 || this.S != 0)) {
                    ((d) getParent()).invalidate();
                }
                if (!this.v && (hVar4 = this.F) != null) {
                    this.v = true;
                    hVar4.A();
                }
                if (!this.w && z10 && (hVar3 = this.F) != null) {
                    this.w = true;
                    hVar3.j();
                }
                if (this.w && !z10 && (hVar2 = this.F) != null) {
                    this.w = false;
                    hVar2.i();
                }
                if (!this.l0 && !this.x && (hVar = this.F) != null) {
                    hVar.l(this);
                    this.x = true;
                }
                h hVar5 = this.F;
                if (hVar5 != null) {
                    hVar5.y(em.c((float) getHeight(), 2.0f, scaleX, this.G.y) < ((float) AndroidUtilities.dp(66.0f)));
                    this.F.f(a4.a.e((float) getHeight(), 2.0f, scaleX, this.G.y) > ((float) (((View) getParent()).getHeight() - AndroidUtilities.dp(114.0f))));
                }
                h hVar6 = this.F;
                boolean z11 = (hVar6 == null || hVar6.p()) && !z10 && a7.a(f13, f14, ((float) ((View) getParent()).getWidth()) / 2.0f, (float) (((View) getParent()).getHeight() - AndroidUtilities.dp(76.0f))) < ((float) AndroidUtilities.dp(32.0f));
                if (this.y != z11) {
                    ValueAnimator valueAnimator = this.o0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.o0 = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n0, z11 ? 0.5f : 1.0f);
                    this.o0 = ofFloat;
                    ofFloat.addUpdateListener(new f(this, i10));
                    this.o0.setInterpolator(wr.h);
                    this.o0.setDuration(280L);
                    this.o0.start();
                    this.y = z11;
                    h hVar7 = this.F;
                    if (hVar7 != null) {
                        hVar7.m(z11);
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
        if (this.v) {
            this.F.g(this.y);
            this.v = false;
        }
        this.w = false;
        if (!z10 && !this.E && !this.n && !this.s && !this.x && (hVar2 = this.F) != null) {
            hVar2.l(this);
        }
        if (this.n && (hVar = this.F) != null) {
            hVar.y(false);
            this.F.f(false);
        }
        AndroidUtilities.cancelRunOnUIThread(this.I);
        this.E = false;
        this.n = false;
        this.s = false;
        this.r = true;
        this.x = false;
        this.M = this.L;
        zd zdVar = this.N;
        if (zdVar != null) {
            AndroidUtilities.cancelRunOnUIThread(zdVar);
            this.N = null;
        }
        this.V = this.R;
        AndroidUtilities.cancelRunOnUIThread(this.T);
        this.W = this.S;
        AndroidUtilities.cancelRunOnUIThread(this.U);
        if (getParent() instanceof d) {
            ((d) getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float a2 = this.a.a(getBounceScale());
        canvas.save();
        canvas.scale(a2, a2, getWidth() / 2.0f, getHeight() / 2.0f);
        if (getParent() instanceof View) {
            View view = (View) getParent();
            if (this instanceof b2) {
                float f7 = this.n0;
                canvas.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
            } else {
                float width = (view.getWidth() / 2.0f) - getX();
                float height = (view.getHeight() - AndroidUtilities.dp(76.0f)) - getY();
                float f10 = this.n0;
                canvas.scale(f10, f10, width, height);
            }
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0132, code lost:
    
        if (java.lang.Math.abs(((getScaleY() * ((b() / 2.0f) - getStickyPaddingBottom())) + r9.G.y) - (r10.getMeasuredHeight() - org.telegram.messenger.AndroidUtilities.dp(64.0f))) <= org.telegram.messenger.AndroidUtilities.dp(12.0f)) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f7, float f10) {
        int i10;
        PointF pointF = this.G;
        pointF.x += f7;
        pointF.y += f10;
        if (((View) getParent()) != null) {
            int i11 = 3;
            if (!this.c0) {
                if (Math.abs(this.G.x - (r10.getMeasuredWidth() / 2.0f)) > AndroidUtilities.dp(12.0f) || this.G.y >= r10.getMeasuredHeight() - AndroidUtilities.dp(112.0f)) {
                    if (Math.abs((this.G.x - (getScaleX() * (getStickyPaddingLeft() + (p() / 2.0f)))) - AndroidUtilities.dp(8.0f)) <= AndroidUtilities.dp(12.0f)) {
                        i10 = 1;
                    } else {
                        if (Math.abs(((getScaleX() * ((p() / 2.0f) - getStickyPaddingRight())) + this.G.x) - (r10.getMeasuredWidth() - AndroidUtilities.dp(8.0f))) <= AndroidUtilities.dp(12.0f)) {
                            i10 = 3;
                        }
                    }
                } else {
                    i10 = 2;
                }
                if (this.V != i10) {
                    this.V = i10;
                    if (i10 == 0) {
                        n();
                    } else {
                        AndroidUtilities.runOnUIThread(this.T, 250L);
                    }
                }
                if (!this.c0) {
                    if (Math.abs(this.G.y - (r10.getMeasuredHeight() / 2.0f)) <= AndroidUtilities.dp(12.0f)) {
                        i11 = 2;
                    } else {
                        if (Math.abs((this.G.y - (getScaleY() * (getStickyPaddingTop() + (b() / 2.0f)))) - AndroidUtilities.dp(64.0f)) <= AndroidUtilities.dp(12.0f)) {
                            i11 = 1;
                        }
                    }
                    if (this.W != i11) {
                        this.W = i11;
                        if (i11 == 0) {
                            o();
                        } else {
                            AndroidUtilities.runOnUIThread(this.U, 250L);
                        }
                    }
                }
                i11 = 0;
                if (this.W != i11) {
                }
            }
            i10 = 0;
            if (this.V != i10) {
            }
            if (!this.c0) {
            }
            i11 = 0;
            if (this.W != i11) {
            }
        }
        k();
    }

    public final void f(float f7) {
        int i10 = 0;
        if (this.R != 0) {
            this.V = 0;
            n();
        }
        if (this.S != 0) {
            this.W = 0;
            o();
        }
        this.i0 = f7;
        boolean z10 = this.K;
        if (!z10 && !this.c0) {
            Iterator it = p0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int intValue = ((Integer) it.next()).intValue();
                if (Math.abs(intValue - f7) < 4.0f) {
                    if (this.M != intValue) {
                        this.M = intValue;
                        zd zdVar = this.N;
                        if (zdVar != null) {
                            AndroidUtilities.cancelRunOnUIThread(zdVar);
                        }
                        zd zdVar2 = new zd(this, intValue, 28);
                        this.N = zdVar2;
                        AndroidUtilities.runOnUIThread(zdVar2, 250L);
                    }
                }
            }
        } else if (z10) {
            if (Math.abs(this.L - f7) >= 12.0f || this.c0) {
                this.M = -1;
                zd zdVar3 = this.N;
                if (zdVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(zdVar3);
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
                duration.setInterpolator(wr.f);
                this.Q.addUpdateListener(new f(this, i10));
                this.Q.addListener(new g(this, 3));
                this.Q.start();
                this.K = false;
            } else {
                f7 = this.P != null ? this.O : this.L;
            }
        }
        ValueAnimator valueAnimator3 = this.Q;
        if (valueAnimator3 != null) {
            f7 = AndroidUtilities.lerpAngle(0.0f, f7, valueAnimator3.getAnimatedFraction());
        }
        g(f7);
    }

    public final void g(float f7) {
        setRotation(f7);
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
        float f7;
        float f10 = this.G.x;
        if (getParent() != null) {
            View view = (View) getParent();
            int i10 = this.R;
            if (i10 == 1) {
                f7 = (getScaleX() * ((p() / 2.0f) - getStickyPaddingLeft())) + AndroidUtilities.dp(8.0f);
            } else if (i10 == 2) {
                f7 = view.getMeasuredWidth() / 2.0f;
            } else if (i10 == 3) {
                f7 = (view.getMeasuredWidth() - AndroidUtilities.dp(8.0f)) - (getScaleX() * (getStickyPaddingRight() + (p() / 2.0f)));
            } else {
                f7 = f10;
            }
            ValueAnimator valueAnimator = this.a0;
            if (valueAnimator != null) {
                return AndroidUtilities.lerp(f10, f7, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
            if (f7 != 0.0f) {
                return f7;
            }
        }
        return f10;
    }

    public float getPositionY() {
        float f7;
        float f10 = this.G.y;
        if (getParent() != null) {
            View view = (View) getParent();
            int i10 = this.S;
            if (i10 == 1) {
                f7 = (getScaleY() * ((b() / 2.0f) - getStickyPaddingTop())) + AndroidUtilities.dp(64.0f);
            } else if (i10 == 2) {
                f7 = view.getMeasuredHeight() / 2.0f;
            } else if (i10 == 3) {
                f7 = (view.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - (getScaleY() * (getStickyPaddingBottom() + (b() / 2.0f)));
            } else {
                f7 = f10;
            }
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                return AndroidUtilities.lerp(f10, f7, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
            if (f7 != 0.0f) {
                return f7;
            }
        }
        return f10;
    }

    public float getScale() {
        return getScaleX();
    }

    public rk0 getSelectionBounds() {
        return new rk0(0.0f, 0.0f, 0.0f, 0.0f);
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
        duration.setInterpolator(wr.f);
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
        duration.setInterpolator(wr.f);
        this.b0.addUpdateListener(new f(this, 4));
        this.b0.addListener(new g(this, 1));
        this.b0.start();
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return this.l0;
    }

    public final void j(float f7) {
        float f10 = this.h0;
        float f11 = f7 * f10;
        this.h0 = f11;
        float clamp = Utilities.clamp(Math.max(f11, 0.1f), getMaxScale(), getMinScale());
        if (!(this instanceof a2)) {
            if ((clamp >= getMaxScale() || clamp <= getMinScale()) != (f10 >= getMaxScale() || f10 <= getMinScale())) {
                try {
                    performHapticFeedback(3, 1);
                } catch (Exception unused) {
                }
            }
        }
        setScaleX(clamp);
        setScaleY(clamp);
    }

    public void k() {
        setX(getPositionX() - (getMeasuredWidth() / 2.0f));
        setY(getPositionY() - (getMeasuredHeight() / 2.0f));
        m();
    }

    public final void l(ViewGroup viewGroup, boolean z10) {
        if (this.l0 != z10) {
            this.l0 = z10;
            ValueAnimator valueAnimator = this.k0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.k0 = null;
            }
            if (this.H == null) {
                if (!z10 && viewGroup == null) {
                    return;
                }
                i a2 = a();
                this.H = a2;
                a2.f = !this.c0;
                a2.invalidate();
                viewGroup.addView(this.H);
                this.j0 = 0.0f;
            }
            this.H.b();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.j0, z10 ? 1.0f : 0.0f);
            this.k0 = ofFloat;
            ofFloat.addUpdateListener(new f(this, 2));
            this.k0.addListener(new g(this, 4));
            this.k0.setDuration(280L);
            this.k0.setInterpolator(wr.h);
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
        AndroidUtilities.cancelRunOnUIThread(this.T);
        int i10 = this.R;
        int i11 = this.V;
        if (i10 == i11) {
            return;
        }
        this.R = i11;
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
        AndroidUtilities.cancelRunOnUIThread(this.U);
        int i10 = this.S;
        int i11 = this.W;
        if (i10 == i11) {
            return;
        }
        this.S = i11;
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
    /* JADX WARN: Removed duplicated region for block: B:33:0x010a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
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
        if (this.F.q()) {
            h hVar = this.F;
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float[] fArr = this.e0;
            hVar.t(rawX, rawY, fArr);
            boolean z12 = motionEvent.getPointerCount() > 1;
            float[] fArr2 = this.f0;
            if (z12) {
                if (Build.VERSION.SDK_INT < 29) {
                    z10 = false;
                    float[] fArr3 = this.g0;
                    if (z10) {
                        fArr3[0] = fArr[0];
                        fArr3[1] = fArr[1];
                    } else {
                        fArr3[0] = (fArr[0] + fArr2[0]) / 2.0f;
                        fArr3[1] = (fArr[1] + fArr2[1]) / 2.0f;
                    }
                    if (this.c0 != z10) {
                        this.b = fArr[0];
                        this.c = fArr[1];
                        this.d = fArr2[0];
                        this.e = fArr2[1];
                        this.f = fArr3[0];
                        this.h = fArr3[1];
                        i iVar = this.H;
                        if (iVar != null) {
                            iVar.f = !z10;
                            iVar.invalidate();
                        }
                    }
                    this.c0 = z10;
                    float f7 = fArr3[0];
                    float f10 = fArr3[1];
                    actionMasked = motionEvent.getActionMasked();
                    xc xcVar = this.a;
                    if (actionMasked == 0) {
                        if (actionMasked != 1) {
                            if (actionMasked == 2) {
                                jVar = this;
                                z11 = jVar.c(fArr[0], fArr[1], z10, fArr2[0], fArr2[1]);
                            } else if (actionMasked != 3) {
                                z11 = false;
                                jVar = this;
                            }
                            jVar.d0 = z10;
                            if (!super.onTouchEvent(motionEvent) || z11) {
                                return true;
                            }
                        }
                        jVar = this;
                        d(actionMasked == 3);
                        xcVar.c(false);
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
                        jVar.f = f7;
                        jVar.h = f10;
                        jVar.r = false;
                        if ((getParent() instanceof d) && (jVar.R != 0 || jVar.S != 0)) {
                            ((d) getParent()).invalidate();
                        }
                        xcVar.c(true);
                        e eVar = jVar.I;
                        AndroidUtilities.cancelRunOnUIThread(eVar);
                        if (!z10) {
                            AndroidUtilities.runOnUIThread(eVar, ViewConfiguration.getLongPressTimeout());
                        }
                    }
                    z11 = true;
                    jVar.d0 = z10;
                    if (!super.onTouchEvent(motionEvent)) {
                    }
                    return true;
                }
                this.F.t(motionEvent.getRawX(1), motionEvent.getRawY(1), fArr2);
            }
            z10 = z12;
            float[] fArr32 = this.g0;
            if (z10) {
            }
            if (this.c0 != z10) {
            }
            this.c0 = z10;
            float f72 = fArr32[0];
            float f102 = fArr32[1];
            actionMasked = motionEvent.getActionMasked();
            xc xcVar2 = this.a;
            if (actionMasked == 0) {
            }
            z11 = true;
            jVar.d0 = z10;
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

    public void setScale(float f7) {
        this.h0 = f7;
        setScaleX(f7);
        setScaleY(f7);
    }

    public void setSelectionVisibility(boolean z10) {
        i iVar = this.H;
        if (iVar == null) {
            return;
        }
        iVar.setVisibility(z10 ? 0 : 8);
    }

    public void setStickyX(int i10) {
        this.V = i10;
        this.R = i10;
    }

    public void setStickyY(int i10) {
        this.W = i10;
        this.S = i10;
    }

    public void setIsVideo(boolean z10) {
    }
}
