package vd;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import nh.v9;
import org.telegram.ui.Components.voip.q1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c {
    public final int a;
    public final b b;
    public final Interpolator c;
    public final long d;
    public float e;
    public float f;
    public boolean g;
    public ValueAnimator h;

    public c(int i10, b bVar, Interpolator interpolator, long j10) {
        this.a = i10;
        this.b = bVar;
        this.c = interpolator;
        this.d = j10;
    }

    public final void a(float f9) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AssertionError();
        }
        if (this.g) {
            b();
        }
        float f10 = this.e;
        int i10 = this.a;
        b bVar = this.b;
        if (f10 == f9) {
            bVar.z(f10, i10);
            return;
        }
        int i11 = 1;
        if (!this.g) {
            this.g = true;
        }
        float f11 = f9 - f10;
        long j10 = (Build.VERSION.SDK_INT < 26 || ValueAnimator.areAnimatorsEnabled()) ? this.d : 0L;
        if (j10 <= 0) {
            d(f9, 1.0f);
            if (this.g) {
                this.g = false;
            }
            bVar.z(f9, i10);
            return;
        }
        this.f = f9;
        DecelerateInterpolator decelerateInterpolator = ud.a.a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.setDuration(j10);
        this.h.setInterpolator(this.c);
        this.h.addUpdateListener(new v9(this, f10, f11, 4));
        this.h.addListener(new q1(this, f10, f11, i11));
        try {
            this.h.start();
        } catch (Throwable th2) {
            Log.e("tgx", "Cannot start animation", th2);
            c(f9);
        }
    }

    public final boolean b() {
        if (!this.g) {
            return false;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AssertionError();
        }
        if (this.g) {
            this.g = false;
        }
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator == null) {
            return true;
        }
        valueAnimator.cancel();
        this.h = null;
        return true;
    }

    public final void c(float f9) {
        boolean b10 = b();
        if (d(f9, 1.0f) || b10) {
            this.b.z(f9, this.a);
        }
    }

    public final boolean d(float f9, float f10) {
        if (this.e == f9) {
            return false;
        }
        this.e = f9;
        this.b.N(this.a, f9, f10, this);
        return true;
    }

    public c(int i10, b bVar, Interpolator interpolator, long j10, float f9) {
        this.a = i10;
        this.b = bVar;
        this.c = interpolator;
        this.d = j10;
        this.e = f9;
    }
}
