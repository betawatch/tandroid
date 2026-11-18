package u0;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.util.WeakHashMap;
import m.r1;
import r0.i0;
import s4.s0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class d implements View.OnTouchListener {
    public static final int I = ViewConfiguration.getTapTimeout();
    public boolean E;
    public boolean F;
    public boolean G;
    public final r1 H;
    public final a a;
    public final AccelerateInterpolator b;
    public final r1 c;
    public s0 d;
    public final float[] e;
    public final float[] f;
    public final int h;
    public final int n;
    public final float[] r;
    public final float[] s;
    public final float[] w;
    public boolean x;
    public boolean y;

    public d(r1 r1Var) {
        a aVar = new a();
        aVar.e = Long.MIN_VALUE;
        aVar.g = -1L;
        aVar.f = 0L;
        this.a = aVar;
        this.b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.r = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.s = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.w = fArr5;
        this.c = r1Var;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr5[0] = f11;
        fArr5[1] = f11;
        float f12 = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f12;
        fArr4[1] = f12;
        this.h = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.n = I;
        aVar.a = 500;
        aVar.b = 500;
        this.H = r1Var;
    }

    public static float b(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f10, float f11, float f12, int i7) {
        float f13;
        float interpolation;
        float b10 = b(this.e[i7] * f11, 0.0f, this.f[i7]);
        float c10 = c(f11 - f10, b10) - c(f10, b10);
        AccelerateInterpolator accelerateInterpolator = this.b;
        if (c10 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c10);
        } else {
            if (c10 <= 0.0f) {
                f13 = 0.0f;
                if (f13 != 0.0f) {
                    return 0.0f;
                }
                float f14 = this.r[i7];
                float f15 = this.s[i7];
                float f16 = this.w[i7];
                float f17 = f14 * f12;
                return f13 > 0.0f ? b(f13 * f17, f15, f16) : -b((-f13) * f17, f15, f16);
            }
            interpolation = accelerateInterpolator.getInterpolation(c10);
        }
        f13 = b(interpolation, -1.0f, 1.0f);
        if (f13 != 0.0f) {
        }
    }

    public final float c(float f10, float f11) {
        if (f11 != 0.0f) {
            int i7 = this.h;
            if (i7 == 0 || i7 == 1) {
                if (f10 < f11) {
                    if (f10 >= 0.0f) {
                        return 1.0f - (f10 / f11);
                    }
                    if (this.F && i7 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i7 == 2 && f10 < 0.0f) {
                return f10 / (-f11);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i7 = 0;
        if (this.y) {
            this.F = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.a;
        int i10 = (int) (currentAnimationTimeMillis - aVar.e);
        int i11 = aVar.b;
        if (i10 > i11) {
            i7 = i11;
        } else if (i10 >= 0) {
            i7 = i10;
        }
        aVar.i = i7;
        aVar.h = aVar.a(currentAnimationTimeMillis);
        aVar.g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        r1 r1Var;
        int count;
        a aVar = this.a;
        float f10 = aVar.d;
        int abs = (int) (f10 / Math.abs(f10));
        Math.abs(aVar.c);
        if (abs != 0 && (count = (r1Var = this.H).getCount()) != 0) {
            int childCount = r1Var.getChildCount();
            int firstVisiblePosition = r1Var.getFirstVisiblePosition();
            int i7 = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && r1Var.getChildAt(0).getTop() >= 0)) : !(i7 >= count && r1Var.getChildAt(childCount - 1).getBottom() <= r1Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i7;
        if (this.G) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.E = true;
            this.x = false;
            float x10 = motionEvent.getX();
            float width = view.getWidth();
            r1 r1Var = this.c;
            float a10 = a(x10, width, r1Var.getWidth(), 0);
            float a11 = a(motionEvent.getY(), view.getHeight(), r1Var.getHeight(), 1);
            a aVar = this.a;
            aVar.c = a10;
            aVar.d = a11;
            if (!this.F && e()) {
                if (this.d == null) {
                    this.d = new s0(this, 4);
                }
                this.F = true;
                this.y = true;
                if (this.x || (i7 = this.n) <= 0) {
                    this.d.run();
                } else {
                    s0 s0Var = this.d;
                    long j3 = i7;
                    WeakHashMap weakHashMap = i0.a;
                    r1Var.postOnAnimationDelayed(s0Var, j3);
                }
                this.x = true;
            }
        }
        return false;
    }
}
