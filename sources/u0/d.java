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
import rg.b0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class d implements View.OnTouchListener {
    public static final int H = ViewConfiguration.getTapTimeout();
    public boolean E;
    public boolean F;
    public final r1 G;
    public final a a;
    public final AccelerateInterpolator b;
    public final r1 c;
    public b0 d;
    public final float[] e;
    public final float[] f;
    public final int h;
    public final int n;
    public final float[] r;
    public final float[] s;
    public final float[] v;
    public boolean w;
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
        this.v = fArr5;
        this.c = r1Var;
        float f7 = Resources.getSystem().getDisplayMetrics().density;
        float f10 = ((int) ((1575.0f * f7) + 0.5f)) / 1000.0f;
        fArr5[0] = f10;
        fArr5[1] = f10;
        float f11 = ((int) ((f7 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f11;
        fArr4[1] = f11;
        this.h = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.n = H;
        aVar.a = 500;
        aVar.b = 500;
        this.G = r1Var;
    }

    public static float b(float f7, float f10, float f11) {
        return f7 > f11 ? f11 : f7 < f10 ? f10 : f7;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f7, float f10, float f11, int i10) {
        float f12;
        float interpolation;
        float b10 = b(this.e[i10] * f10, 0.0f, this.f[i10]);
        float c10 = c(f10 - f7, b10) - c(f7, b10);
        AccelerateInterpolator accelerateInterpolator = this.b;
        if (c10 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c10);
        } else {
            if (c10 <= 0.0f) {
                f12 = 0.0f;
                if (f12 != 0.0f) {
                    return 0.0f;
                }
                float f13 = this.r[i10];
                float f14 = this.s[i10];
                float f15 = this.v[i10];
                float f16 = f13 * f11;
                return f12 > 0.0f ? b(f12 * f16, f14, f15) : -b((-f12) * f16, f14, f15);
            }
            interpolation = accelerateInterpolator.getInterpolation(c10);
        }
        f12 = b(interpolation, -1.0f, 1.0f);
        if (f12 != 0.0f) {
        }
    }

    public final float c(float f7, float f10) {
        if (f10 != 0.0f) {
            int i10 = this.h;
            if (i10 == 0 || i10 == 1) {
                if (f7 < f10) {
                    if (f7 >= 0.0f) {
                        return 1.0f - (f7 / f10);
                    }
                    if (this.E && i10 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i10 == 2 && f7 < 0.0f) {
                return f7 / (-f10);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i10 = 0;
        if (this.x) {
            this.E = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.a;
        int i11 = (int) (currentAnimationTimeMillis - aVar.e);
        int i12 = aVar.b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        aVar.i = i10;
        aVar.h = aVar.a(currentAnimationTimeMillis);
        aVar.g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        r1 r1Var;
        int count;
        a aVar = this.a;
        float f7 = aVar.d;
        int abs = (int) (f7 / Math.abs(f7));
        Math.abs(aVar.c);
        if (abs != 0 && (count = (r1Var = this.G).getCount()) != 0) {
            int childCount = r1Var.getChildCount();
            int firstVisiblePosition = r1Var.getFirstVisiblePosition();
            int i10 = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && r1Var.getChildAt(0).getTop() >= 0)) : !(i10 >= count && r1Var.getChildAt(childCount - 1).getBottom() <= r1Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        if (r0 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        if (this.F) {
            int actionMasked = motionEvent.getActionMasked();
            int i11 = 3;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.y = true;
            this.w = false;
            float x10 = motionEvent.getX();
            float width = view.getWidth();
            r1 r1Var = this.c;
            float a2 = a(x10, width, r1Var.getWidth(), 0);
            float a10 = a(motionEvent.getY(), view.getHeight(), r1Var.getHeight(), 1);
            a aVar = this.a;
            aVar.c = a2;
            aVar.d = a10;
            if (!this.E && e()) {
                if (this.d == null) {
                    this.d = new b0(this, i11);
                }
                this.E = true;
                this.x = true;
                if (this.w || (i10 = this.n) <= 0) {
                    this.d.run();
                } else {
                    b0 b0Var = this.d;
                    long j3 = i10;
                    WeakHashMap weakHashMap = i0.a;
                    r1Var.postOnAnimationDelayed(b0Var, j3);
                }
                this.w = true;
            }
        }
        return false;
    }
}
