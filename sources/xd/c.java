package xd;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import org.telegram.ui.Components.nv;
import org.telegram.ui.Components.voip.p1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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

    public final void a(float f10) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AssertionError();
        }
        if (this.g) {
            b();
        }
        float f11 = this.e;
        int i10 = this.a;
        b bVar = this.b;
        if (f11 == f10) {
            bVar.z(f11, i10);
            return;
        }
        int i11 = 1;
        if (!this.g) {
            this.g = true;
        }
        float f12 = f10 - f11;
        long j10 = (Build.VERSION.SDK_INT < 26 || ValueAnimator.areAnimatorsEnabled()) ? this.d : 0L;
        if (j10 <= 0) {
            d(f10, 1.0f);
            if (this.g) {
                this.g = false;
            }
            bVar.z(f10, i10);
            return;
        }
        this.f = f10;
        DecelerateInterpolator decelerateInterpolator = wd.a.a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.setDuration(j10);
        this.h.setInterpolator(this.c);
        this.h.addUpdateListener(new nv(this, f11, f12, 4));
        this.h.addListener(new p1(this, f11, f12, i11));
        try {
            this.h.start();
        } catch (Throwable th2) {
            Log.e("tgx", "Cannot start animation", th2);
            c(f10);
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

    public final void c(float f10) {
        boolean b10 = b();
        if (d(f10, 1.0f) || b10) {
            this.b.z(f10, this.a);
        }
    }

    public final boolean d(float f10, float f11) {
        if (this.e == f10) {
            return false;
        }
        this.e = f10;
        this.b.L(this.a, f10, f11, this);
        return true;
    }

    public c(int i10, b bVar, Interpolator interpolator, long j10, float f10) {
        this.a = i10;
        this.b = bVar;
        this.c = interpolator;
        this.d = j10;
        this.e = f10;
    }
}
