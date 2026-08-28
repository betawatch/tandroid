package u0;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.util.WeakHashMap;
import m.s1;
import org.telegram.ui.Components.ju0;
import r0.j0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d implements View.OnTouchListener {
    public static final int D = ViewConfiguration.getTapTimeout();
    public boolean A;
    public boolean B;
    public final s1 C;
    public final a a;
    public final AccelerateInterpolator b;
    public final s1 c;
    public ju0 d;
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

    public d(s1 s1Var) {
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
        this.c = s1Var;
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
        this.n = D;
        aVar.a = 500;
        aVar.b = 500;
        this.C = s1Var;
    }

    public static float b(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f10, float f11, float f12, int i9) {
        float f13;
        float interpolation;
        float b10 = b(this.e[i9] * f11, 0.0f, this.f[i9]);
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
                float f14 = this.r[i9];
                float f15 = this.s[i9];
                float f16 = this.v[i9];
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
            int i9 = this.h;
            if (i9 == 0 || i9 == 1) {
                if (f10 < f11) {
                    if (f10 >= 0.0f) {
                        return 1.0f - (f10 / f11);
                    }
                    if (this.A && i9 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i9 == 2 && f10 < 0.0f) {
                return f10 / (-f11);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i9 = 0;
        if (this.x) {
            this.A = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.a;
        int i10 = (int) (currentAnimationTimeMillis - aVar.e);
        int i11 = aVar.b;
        if (i10 > i11) {
            i9 = i11;
        } else if (i10 >= 0) {
            i9 = i10;
        }
        aVar.i = i9;
        aVar.h = aVar.a(currentAnimationTimeMillis);
        aVar.g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        s1 s1Var;
        int count;
        a aVar = this.a;
        float f10 = aVar.d;
        int abs = (int) (f10 / Math.abs(f10));
        Math.abs(aVar.c);
        if (abs != 0 && (count = (s1Var = this.C).getCount()) != 0) {
            int childCount = s1Var.getChildCount();
            int firstVisiblePosition = s1Var.getFirstVisiblePosition();
            int i9 = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && s1Var.getChildAt(0).getTop() >= 0)) : !(i9 >= count && s1Var.getChildAt(childCount - 1).getBottom() <= s1Var.getHeight())) {
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
        int i9;
        if (this.B) {
            int actionMasked = motionEvent.getActionMasked();
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
            s1 s1Var = this.c;
            float a2 = a(x10, width, s1Var.getWidth(), 0);
            float a3 = a(motionEvent.getY(), view.getHeight(), s1Var.getHeight(), 1);
            a aVar = this.a;
            aVar.c = a2;
            aVar.d = a3;
            if (!this.A && e()) {
                if (this.d == null) {
                    this.d = new ju0(this, 8);
                }
                this.A = true;
                this.x = true;
                if (this.w || (i9 = this.n) <= 0) {
                    this.d.run();
                } else {
                    ju0 ju0Var = this.d;
                    long j10 = i9;
                    WeakHashMap weakHashMap = j0.a;
                    s1Var.postOnAnimationDelayed(ju0Var, j10);
                }
                this.w = true;
            }
        }
        return false;
    }
}
