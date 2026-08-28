package yf;

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
import org.telegram.messenger.ll;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.wj0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class j extends FrameLayout {
    public static final List l0 = Arrays.asList(-90, 0, 90, 180);
    public boolean A;
    public h B;
    public PointF C;
    public i D;
    public final e E;
    public final UUID F;
    public boolean G;
    public int H;
    public int I;
    public ve.a J;
    public float K;
    public ValueAnimator L;
    public ValueAnimator M;
    public int N;
    public int O;
    public final e P;
    public final e Q;
    public int R;
    public int S;
    public ValueAnimator T;
    public ValueAnimator U;
    public boolean V;
    public boolean W;
    public final pc a;
    public final float[] a0;
    public float b;
    public final float[] b0;
    public float c;
    public final float[] c0;
    public float d;
    public float d0;
    public float e;
    public float e0;
    public float f;
    public float f0;
    public ValueAnimator g0;
    public float h;
    public boolean h0;
    public ViewGroup i0;
    public float j0;
    public ValueAnimator k0;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: Type inference failed for: r0v0, types: [yf.e] */
    /* JADX WARN: Type inference failed for: r0v3, types: [yf.e] */
    /* JADX WARN: Type inference failed for: r0v4, types: [yf.e] */
    public j(Context context, PointF pointF) {
        super(context);
        this.a = new pc(this);
        this.n = false;
        this.r = false;
        this.s = false;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.A = false;
        final int i9 = 0;
        this.E = new Runnable(this) { // from class: yf.e
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i9) {
                    case 0:
                        j jVar = this.b;
                        jVar.A = true;
                        if (jVar.B != null) {
                            try {
                                jVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            jVar.B.w(jVar);
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
        this.G = true;
        this.H = 0;
        this.I = -1;
        this.N = 0;
        this.O = 0;
        final int i10 = 1;
        this.P = new Runnable(this) { // from class: yf.e
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        j jVar = this.b;
                        jVar.A = true;
                        if (jVar.B != null) {
                            try {
                                jVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            jVar.B.w(jVar);
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
        this.Q = new Runnable(this) { // from class: yf.e
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        j jVar = this.b;
                        jVar.A = true;
                        if (jVar.B != null) {
                            try {
                                jVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            jVar.B.w(jVar);
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
        this.a0 = new float[2];
        this.b0 = new float[2];
        this.c0 = new float[2];
        this.d0 = 1.0f;
        this.h0 = false;
        this.j0 = 1.0f;
        this.F = UUID.randomUUID();
        this.C = pointF;
    }

    public abstract i a();

    public final float b() {
        return (float) ((Math.abs(Math.sin((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredWidth()) + (Math.abs(Math.cos((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredHeight()));
    }

    public final boolean c(float f10, float f11, boolean z10, float f12, float f13) {
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
                AndroidUtilities.cancelRunOnUIThread(this.E);
                e(f16, f17);
                if (z10) {
                    float a2 = g7.w.a(f10, f11, f12, f13);
                    float a3 = g7.w.a(this.b, this.c, this.d, this.e);
                    if (a3 > 0.0f) {
                        j(a2 / a3);
                    }
                    f(this.e0 + ((float) Math.toDegrees(Math.atan2(f11 - f13, f10 - f12) - Math.atan2(this.c - this.e, this.b - this.d))));
                }
                this.b = f10;
                this.c = f11;
                this.f = f14;
                this.h = f15;
                if (z10) {
                    this.d = f12;
                    this.e = f13;
                }
                int i9 = 1;
                this.n = true;
                if ((getParent() instanceof d) && (this.N != 0 || this.O != 0)) {
                    ((d) getParent()).invalidate();
                }
                if (!this.v && (hVar4 = this.B) != null) {
                    this.v = true;
                    hVar4.C();
                }
                if (!this.w && z10 && (hVar3 = this.B) != null) {
                    this.w = true;
                    hVar3.l();
                }
                if (this.w && !z10 && (hVar2 = this.B) != null) {
                    this.w = false;
                    hVar2.j();
                }
                if (!this.h0 && !this.x && (hVar = this.B) != null) {
                    hVar.k(this);
                    this.x = true;
                }
                h hVar5 = this.B;
                if (hVar5 != null) {
                    hVar5.B(ll.c((float) getHeight(), 2.0f, scaleX, this.C.y) < ((float) AndroidUtilities.dp(66.0f)));
                    this.B.g(org.telegram.ui.Cells.j2.b((float) getHeight(), 2.0f, scaleX, this.C.y) > ((float) (((View) getParent()).getHeight() - AndroidUtilities.dp(114.0f))));
                }
                h hVar6 = this.B;
                boolean z11 = (hVar6 == null || hVar6.r()) && !z10 && g7.w.a(f14, f15, ((float) ((View) getParent()).getWidth()) / 2.0f, (float) (((View) getParent()).getHeight() - AndroidUtilities.dp(76.0f))) < ((float) AndroidUtilities.dp(32.0f));
                if (this.y != z11) {
                    ValueAnimator valueAnimator = this.k0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.k0 = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.j0, z11 ? 0.5f : 1.0f);
                    this.k0 = ofFloat;
                    ofFloat.addUpdateListener(new f(this, i9));
                    this.k0.setInterpolator(gr.h);
                    this.k0.setDuration(280L);
                    this.k0.start();
                    this.y = z11;
                    h hVar7 = this.B;
                    if (hVar7 != null) {
                        hVar7.o(z11);
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
            this.B.h(this.y);
            this.v = false;
        }
        this.w = false;
        if (!z10 && !this.A && !this.n && !this.s && !this.x && (hVar2 = this.B) != null) {
            hVar2.k(this);
        }
        if (this.n && (hVar = this.B) != null) {
            hVar.B(false);
            this.B.g(false);
        }
        AndroidUtilities.cancelRunOnUIThread(this.E);
        this.A = false;
        this.n = false;
        this.s = false;
        this.r = true;
        this.x = false;
        this.I = this.H;
        ve.a aVar = this.J;
        if (aVar != null) {
            AndroidUtilities.cancelRunOnUIThread(aVar);
            this.J = null;
        }
        this.R = this.N;
        AndroidUtilities.cancelRunOnUIThread(this.P);
        this.S = this.O;
        AndroidUtilities.cancelRunOnUIThread(this.Q);
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
                float f10 = this.j0;
                canvas.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
            } else {
                float width = (view.getWidth() / 2.0f) - getX();
                float height = (view.getHeight() - AndroidUtilities.dp(76.0f)) - getY();
                float f11 = this.j0;
                canvas.scale(f11, f11, width, height);
            }
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0132, code lost:
    
        if (java.lang.Math.abs(((getScaleY() * ((b() / 2.0f) - getStickyPaddingBottom())) + r9.C.y) - (r10.getMeasuredHeight() - org.telegram.messenger.AndroidUtilities.dp(64.0f))) <= org.telegram.messenger.AndroidUtilities.dp(12.0f)) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f10, float f11) {
        int i9;
        PointF pointF = this.C;
        pointF.x += f10;
        pointF.y += f11;
        if (((View) getParent()) != null) {
            int i10 = 3;
            if (!this.V) {
                if (Math.abs(this.C.x - (r10.getMeasuredWidth() / 2.0f)) > AndroidUtilities.dp(12.0f) || this.C.y >= r10.getMeasuredHeight() - AndroidUtilities.dp(112.0f)) {
                    if (Math.abs((this.C.x - (getScaleX() * (getStickyPaddingLeft() + (p() / 2.0f)))) - AndroidUtilities.dp(8.0f)) <= AndroidUtilities.dp(12.0f)) {
                        i9 = 1;
                    } else {
                        if (Math.abs(((getScaleX() * ((p() / 2.0f) - getStickyPaddingRight())) + this.C.x) - (r10.getMeasuredWidth() - AndroidUtilities.dp(8.0f))) <= AndroidUtilities.dp(12.0f)) {
                            i9 = 3;
                        }
                    }
                } else {
                    i9 = 2;
                }
                if (this.R != i9) {
                    this.R = i9;
                    if (i9 == 0) {
                        n();
                    } else {
                        AndroidUtilities.runOnUIThread(this.P, 250L);
                    }
                }
                if (!this.V) {
                    if (Math.abs(this.C.y - (r10.getMeasuredHeight() / 2.0f)) <= AndroidUtilities.dp(12.0f)) {
                        i10 = 2;
                    } else {
                        if (Math.abs((this.C.y - (getScaleY() * (getStickyPaddingTop() + (b() / 2.0f)))) - AndroidUtilities.dp(64.0f)) <= AndroidUtilities.dp(12.0f)) {
                            i10 = 1;
                        }
                    }
                    if (this.S != i10) {
                        this.S = i10;
                        if (i10 == 0) {
                            o();
                        } else {
                            AndroidUtilities.runOnUIThread(this.Q, 250L);
                        }
                    }
                }
                i10 = 0;
                if (this.S != i10) {
                }
            }
            i9 = 0;
            if (this.R != i9) {
            }
            if (!this.V) {
            }
            i10 = 0;
            if (this.S != i10) {
            }
        }
        k();
    }

    public final void f(float f10) {
        int i9 = 0;
        if (this.N != 0) {
            this.R = 0;
            n();
        }
        if (this.O != 0) {
            this.S = 0;
            o();
        }
        this.e0 = f10;
        boolean z10 = this.G;
        int i10 = 2;
        if (!z10 && !this.V) {
            Iterator it = l0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int intValue = ((Integer) it.next()).intValue();
                if (Math.abs(intValue - f10) < 4.0f) {
                    if (this.I != intValue) {
                        this.I = intValue;
                        ve.a aVar = this.J;
                        if (aVar != null) {
                            AndroidUtilities.cancelRunOnUIThread(aVar);
                        }
                        ve.a aVar2 = new ve.a(this, intValue, i10);
                        this.J = aVar2;
                        AndroidUtilities.runOnUIThread(aVar2, 250L);
                    }
                }
            }
        } else if (z10) {
            if (Math.abs(this.H - f10) >= 12.0f || this.V) {
                this.I = -1;
                ve.a aVar3 = this.J;
                if (aVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(aVar3);
                    this.J = null;
                }
                ValueAnimator valueAnimator = this.L;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = this.M;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                this.M = duration;
                duration.setInterpolator(gr.f);
                this.M.addUpdateListener(new f(this, i9));
                this.M.addListener(new g(this, 3));
                this.M.start();
                this.G = false;
            } else {
                f10 = this.L != null ? this.K : this.H;
            }
        }
        ValueAnimator valueAnimator3 = this.M;
        if (valueAnimator3 != null) {
            f10 = AndroidUtilities.lerpAngle(0.0f, f10, valueAnimator3.getAnimatedFraction());
        }
        g(f10);
    }

    public final void g(float f10) {
        setRotation(f10);
        if (this.N != 0 || this.O != 0) {
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
        return this.C;
    }

    public float getPositionX() {
        float f10;
        float f11 = this.C.x;
        if (getParent() != null) {
            View view = (View) getParent();
            int i9 = this.N;
            if (i9 == 1) {
                f10 = (getScaleX() * ((p() / 2.0f) - getStickyPaddingLeft())) + AndroidUtilities.dp(8.0f);
            } else if (i9 == 2) {
                f10 = view.getMeasuredWidth() / 2.0f;
            } else if (i9 == 3) {
                f10 = (view.getMeasuredWidth() - AndroidUtilities.dp(8.0f)) - (getScaleX() * (getStickyPaddingRight() + (p() / 2.0f)));
            } else {
                f10 = f11;
            }
            ValueAnimator valueAnimator = this.T;
            if (valueAnimator != null) {
                return AndroidUtilities.lerp(f11, f10, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
            if (f10 != 0.0f) {
                return f10;
            }
        }
        return f11;
    }

    public float getPositionY() {
        float f10;
        float f11 = this.C.y;
        if (getParent() != null) {
            View view = (View) getParent();
            int i9 = this.O;
            if (i9 == 1) {
                f10 = (getScaleY() * ((b() / 2.0f) - getStickyPaddingTop())) + AndroidUtilities.dp(64.0f);
            } else if (i9 == 2) {
                f10 = view.getMeasuredHeight() / 2.0f;
            } else if (i9 == 3) {
                f10 = (view.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - (getScaleY() * (getStickyPaddingBottom() + (b() / 2.0f)));
            } else {
                f10 = f11;
            }
            ValueAnimator valueAnimator = this.U;
            if (valueAnimator != null) {
                return AndroidUtilities.lerp(f11, f10, ((Float) valueAnimator.getAnimatedValue()).floatValue());
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

    public wj0 getSelectionBounds() {
        return new wj0(0.0f, 0.0f, 0.0f, 0.0f);
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
        return this.N;
    }

    public final int getStickyY() {
        return this.O;
    }

    public UUID getUUID() {
        return this.F;
    }

    public final void h(float... fArr) {
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.T = duration;
        duration.setInterpolator(gr.f);
        this.T.addUpdateListener(new f(this, 3));
        this.T.addListener(new g(this, 0));
        this.T.start();
    }

    public final void i(float... fArr) {
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.U = duration;
        duration.setInterpolator(gr.f);
        this.U.addUpdateListener(new f(this, 4));
        this.U.addListener(new g(this, 1));
        this.U.start();
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return this.h0;
    }

    public final void j(float f10) {
        float f11 = this.d0;
        float f12 = f10 * f11;
        this.d0 = f12;
        float clamp = Utilities.clamp(Math.max(f12, 0.1f), getMaxScale(), getMinScale());
        if (!(this instanceof a2)) {
            if ((clamp >= getMaxScale() || clamp <= getMinScale()) != (f11 >= getMaxScale() || f11 <= getMinScale())) {
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
        if (this.h0 != z10) {
            this.h0 = z10;
            ValueAnimator valueAnimator = this.g0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.g0 = null;
            }
            if (this.D == null) {
                if (!z10 && viewGroup == null) {
                    return;
                }
                i a2 = a();
                this.D = a2;
                a2.f = !this.V;
                a2.invalidate();
                viewGroup.addView(this.D);
                this.f0 = 0.0f;
            }
            this.D.b();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f0, z10 ? 1.0f : 0.0f);
            this.g0 = ofFloat;
            ofFloat.addUpdateListener(new f(this, 2));
            this.g0.addListener(new g(this, 4));
            this.g0.setDuration(280L);
            this.g0.setInterpolator(gr.h);
            this.g0.start();
        }
    }

    public final void m() {
        i iVar = this.D;
        if (iVar != null) {
            iVar.b();
        }
    }

    public final void n() {
        AndroidUtilities.cancelRunOnUIThread(this.P);
        int i9 = this.N;
        int i10 = this.R;
        if (i9 == i10) {
            return;
        }
        this.N = i10;
        if (getParent() instanceof d) {
            ((d) getParent()).invalidate();
        }
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.R == 0) {
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
        AndroidUtilities.cancelRunOnUIThread(this.Q);
        int i9 = this.O;
        int i10 = this.S;
        if (i9 == i10) {
            return;
        }
        this.O = i10;
        if (getParent() instanceof d) {
            ((d) getParent()).invalidate();
        }
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.S == 0) {
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
        return this.B.s();
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
        if (this.B.s()) {
            h hVar = this.B;
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float[] fArr = this.a0;
            hVar.v(rawX, rawY, fArr);
            boolean z12 = motionEvent.getPointerCount() > 1;
            float[] fArr2 = this.b0;
            if (z12) {
                if (Build.VERSION.SDK_INT < 29) {
                    z10 = false;
                    float[] fArr3 = this.c0;
                    if (z10) {
                        fArr3[0] = fArr[0];
                        fArr3[1] = fArr[1];
                    } else {
                        fArr3[0] = (fArr[0] + fArr2[0]) / 2.0f;
                        fArr3[1] = (fArr[1] + fArr2[1]) / 2.0f;
                    }
                    if (this.V != z10) {
                        this.b = fArr[0];
                        this.c = fArr[1];
                        this.d = fArr2[0];
                        this.e = fArr2[1];
                        this.f = fArr3[0];
                        this.h = fArr3[1];
                        i iVar = this.D;
                        if (iVar != null) {
                            iVar.f = !z10;
                            iVar.invalidate();
                        }
                    }
                    this.V = z10;
                    float f10 = fArr3[0];
                    float f11 = fArr3[1];
                    actionMasked = motionEvent.getActionMasked();
                    pc pcVar = this.a;
                    if (actionMasked == 0) {
                        if (actionMasked != 1) {
                            if (actionMasked == 2) {
                                jVar = this;
                                z11 = jVar.c(fArr[0], fArr[1], z10, fArr2[0], fArr2[1]);
                            } else if (actionMasked != 3) {
                                z11 = false;
                                jVar = this;
                            }
                            jVar.W = z10;
                            if (!super.onTouchEvent(motionEvent) || z11) {
                                return true;
                            }
                        }
                        jVar = this;
                        d(actionMasked == 3);
                        pcVar.c(false);
                        i iVar2 = jVar.D;
                        if (iVar2 != null) {
                            iVar2.f = true;
                            iVar2.invalidate();
                        }
                    } else {
                        jVar = this;
                        jVar.W = false;
                        jVar.b = fArr[0];
                        jVar.c = fArr[1];
                        jVar.f = f10;
                        jVar.h = f11;
                        jVar.r = false;
                        if ((getParent() instanceof d) && (jVar.N != 0 || jVar.O != 0)) {
                            ((d) getParent()).invalidate();
                        }
                        pcVar.c(true);
                        e eVar = jVar.E;
                        AndroidUtilities.cancelRunOnUIThread(eVar);
                        if (!z10) {
                            AndroidUtilities.runOnUIThread(eVar, ViewConfiguration.getLongPressTimeout());
                        }
                    }
                    z11 = true;
                    jVar.W = z10;
                    if (!super.onTouchEvent(motionEvent)) {
                    }
                    return true;
                }
                this.B.v(motionEvent.getRawX(1), motionEvent.getRawY(1), fArr2);
            }
            z10 = z12;
            float[] fArr32 = this.c0;
            if (z10) {
            }
            if (this.V != z10) {
            }
            this.V = z10;
            float f102 = fArr32[0];
            float f112 = fArr32[1];
            actionMasked = motionEvent.getActionMasked();
            pc pcVar2 = this.a;
            if (actionMasked == 0) {
            }
            z11 = true;
            jVar.W = z10;
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
        this.B = hVar;
    }

    public void setPosition(PointF pointF) {
        this.C = pointF;
        k();
    }

    public void setScale(float f10) {
        this.d0 = f10;
        setScaleX(f10);
        setScaleY(f10);
    }

    public void setSelectionVisibility(boolean z10) {
        i iVar = this.D;
        if (iVar == null) {
            return;
        }
        iVar.setVisibility(z10 ? 0 : 8);
    }

    public void setStickyX(int i9) {
        this.R = i9;
        this.N = i9;
    }

    public void setStickyY(int i9) {
        this.S = i9;
        this.O = i9;
    }

    public void setIsVideo(boolean z10) {
    }
}
