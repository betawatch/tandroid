// default package

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class w76 implements View.OnTouchListener {
    public static final int H = ViewConfiguration.getTapTimeout();
    public boolean E;
    public boolean F;
    public final vr3 G;
    public final p70 a;
    public final AccelerateInterpolator b;
    public final vr3 c;
    public p1 d;
    public final float[] e;
    public final float[] f;
    public final int h;
    public final float[] n;
    public final float[] r;
    public final float[] s;
    public boolean w;
    public boolean x;
    public boolean y;

    public w76(vr3 vr3Var) {
        p70 p70Var = new p70();
        p70Var.d = Long.MIN_VALUE;
        p70Var.f = -1L;
        p70Var.e = 0L;
        this.a = p70Var;
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
        this.c = vr3Var;
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
        p70Var.a = (short) 500;
        p70Var.b = (short) 500;
        this.G = vr3Var;
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
        p70 p70Var = this.a;
        int i2 = (int) (currentAnimationTimeMillis - p70Var.d);
        short s = p70Var.b;
        if (i2 > s) {
            i = s;
        } else if (i2 >= 0) {
            i = i2;
        }
        p70Var.h = i;
        p70Var.g = p70Var.a(currentAnimationTimeMillis);
        p70Var.f = currentAnimationTimeMillis;
    }

    public final boolean e() {
        vr3 vr3Var;
        int count;
        float f = this.a.c;
        int abs = (int) (f / Math.abs(f));
        if (abs != 0 && (count = (vr3Var = this.G).getCount()) != 0) {
            int childCount = vr3Var.getChildCount();
            int firstVisiblePosition = vr3Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && vr3Var.getChildAt(0).getTop() >= 0)) : !(i >= count && vr3Var.getChildAt(childCount - 1).getBottom() <= vr3Var.getHeight())) {
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
            vr3 vr3Var = this.c;
            a(x, width, vr3Var.getWidth(), 0);
            this.a.c = a(motionEvent.getY(), view.getHeight(), vr3Var.getHeight(), 1);
            if (!this.E && e()) {
                p1 p1Var = this.d;
                if (p1Var == null) {
                    p1Var = new p1(this, (byte) 6);
                    this.d = p1Var;
                }
                this.E = true;
                this.x = true;
                if (this.w || (i = this.h) <= 0) {
                    p1Var.run();
                } else {
                    long j = i;
                    WeakHashMap weakHashMap = ihc.a;
                    vr3Var.postOnAnimationDelayed(p1Var, j);
                }
                this.w = true;
            }
        }
        return false;
    }
}
