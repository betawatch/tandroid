// default package

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class s76 implements View.OnTouchListener {
    public static final int H = ViewConfiguration.getTapTimeout();
    public boolean E;
    public boolean F;
    public final os3 G;
    public final n80 a;
    public final AccelerateInterpolator b;
    public final os3 c;
    public o1 d;
    public final float[] e;
    public final float[] f;
    public final int h;
    public final float[] n;
    public final float[] r;
    public final float[] s;
    public boolean w;
    public boolean x;
    public boolean y;

    public s76(os3 os3Var) {
        n80 n80Var = new n80();
        n80Var.d = Long.MIN_VALUE;
        n80Var.f = -1L;
        n80Var.e = 0L;
        this.a = n80Var;
        this.b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.n = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.r = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.s = fArr5;
        this.c = os3Var;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.h = H;
        n80Var.a = (short) 500;
        n80Var.b = (short) 500;
        this.G = os3Var;
    }

    public static float b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f, float f2, float f3, int i) {
        float f4;
        float interpolation;
        float b = b(this.e[i] * f2, 0.0f, this.f[i]);
        float c = c(f2 - f, b) - c(f, b);
        AccelerateInterpolator accelerateInterpolator = this.b;
        if (c < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c);
        } else {
            if (c <= 0.0f) {
                f4 = 0.0f;
                if (f4 != 0.0f) {
                    return 0.0f;
                }
                float f5 = this.n[i];
                float f6 = this.r[i];
                float f7 = this.s[i];
                float f8 = f5 * f3;
                return f4 > 0.0f ? b(f4 * f8, f6, f7) : -b((-f4) * f8, f6, f7);
            }
            interpolation = accelerateInterpolator.getInterpolation(c);
        }
        f4 = b(interpolation, -1.0f, 1.0f);
        if (f4 != 0.0f) {
        }
    }

    public final float c(float f, float f2) {
        if (f2 != 0.0f && f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.E) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.x) {
            this.E = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        n80 n80Var = this.a;
        int i2 = (int) (currentAnimationTimeMillis - n80Var.d);
        short s = n80Var.b;
        if (i2 > s) {
            i = s;
        } else if (i2 >= 0) {
            i = i2;
        }
        n80Var.h = i;
        n80Var.g = n80Var.a(currentAnimationTimeMillis);
        n80Var.f = currentAnimationTimeMillis;
    }

    public final boolean e() {
        os3 os3Var;
        int count;
        float f = this.a.c;
        int abs = (int) (f / Math.abs(f));
        if (abs != 0 && (count = (os3Var = this.G).getCount()) != 0) {
            int childCount = os3Var.getChildCount();
            int firstVisiblePosition = os3Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && os3Var.getChildAt(0).getTop() >= 0)) : !(i >= count && os3Var.getChildAt(childCount - 1).getBottom() <= os3Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
    
        if (r0 == 3) goto L11;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (this.F) {
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
            float x = motionEvent.getX();
            float width = view.getWidth();
            os3 os3Var = this.c;
            a(x, width, os3Var.getWidth(), 0);
            this.a.c = a(motionEvent.getY(), view.getHeight(), os3Var.getHeight(), 1);
            if (!this.E && e()) {
                o1 o1Var = this.d;
                if (o1Var == null) {
                    o1Var = new o1(this, (byte) 6);
                    this.d = o1Var;
                }
                this.E = true;
                this.x = true;
                if (this.w || (i = this.h) <= 0) {
                    o1Var.run();
                } else {
                    long j = i;
                    WeakHashMap weakHashMap = kfc.a;
                    os3Var.postOnAnimationDelayed(o1Var, j);
                }
                this.w = true;
            }
        }
        return false;
    }
}
