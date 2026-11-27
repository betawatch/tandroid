// default package

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class t84 {
    public final byte a;
    public final s84 b;
    public Interpolator c;
    public long d;
    public byte e;
    public float f;
    public float g;
    public boolean h;
    public ValueAnimator i;

    /* JADX WARN: Multi-variable type inference failed */
    public t84(int i, s84 s84Var, Interpolator interpolator, long j, float f) {
        this.a = i;
        this.b = s84Var;
        this.c = interpolator;
        this.d = j;
        this.f = f;
    }

    public final void a(float f) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            lq5.f();
            return;
        }
        if (this.h) {
            b();
        }
        float f2 = this.f;
        byte b = this.a;
        s84 s84Var = this.b;
        if (f2 == f) {
            s84Var.v0(f2, b);
            return;
        }
        if (!this.h) {
            this.h = true;
        }
        float f3 = f - f2;
        long j = this.d;
        if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
            j = 0;
        }
        byte b2 = 0;
        if (j <= 0) {
            d(f, 1.0f);
            if (this.h) {
                this.h = false;
            }
            s84Var.v0(f, b);
            return;
        }
        this.g = f;
        DecelerateInterpolator decelerateInterpolator = un.a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.i = ofFloat;
        ofFloat.setDuration(j);
        this.i.setInterpolator(this.c);
        this.i.addUpdateListener(new gy1(this, f2, f3, (byte) 3));
        this.i.addListener(new r84(this, f2, f3, b2));
        long j2 = this.e;
        if (j2 != 0) {
            this.i.setStartDelay(j2);
        }
        try {
            this.i.start();
        } catch (Throwable th) {
            Log.e("tgx", "Cannot start animation", th);
            c(f);
        }
    }

    public final boolean b() {
        if (this.h) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.h) {
                    this.h = false;
                }
                ValueAnimator valueAnimator = this.i;
                if (valueAnimator == null) {
                    return true;
                }
                valueAnimator.cancel();
                this.i = null;
                return true;
            }
            lq5.f();
        }
        return false;
    }

    public final void c(float f) {
        boolean b = b();
        if (d(f, 1.0f) || b) {
            this.b.v0(f, this.a);
        }
    }

    public final boolean d(float f, float f2) {
        if (this.f == f) {
            return false;
        }
        this.f = f;
        this.b.t(this.a, f, f2, this);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t84(int i, s84 s84Var, Interpolator interpolator, long j) {
        this.a = i;
        this.b = s84Var;
        this.c = interpolator;
        this.d = j;
    }
}
