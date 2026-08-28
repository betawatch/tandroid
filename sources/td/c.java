package td;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import kh.ka;
import org.telegram.ui.Components.voip.p1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public c(int i9, b bVar, Interpolator interpolator, long j10) {
        this.a = i9;
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
        int i9 = this.a;
        b bVar = this.b;
        if (f11 == f10) {
            bVar.B(f11, i9);
            return;
        }
        int i10 = 1;
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
            bVar.B(f10, i9);
            return;
        }
        this.f = f10;
        DecelerateInterpolator decelerateInterpolator = sd.a.a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.setDuration(j10);
        this.h.setInterpolator(this.c);
        this.h.addUpdateListener(new ka(this, f11, f12, 4));
        this.h.addListener(new p1(this, f11, f12, i10));
        try {
            this.h.start();
        } catch (Throwable th) {
            Log.e("tgx", "Cannot start animation", th);
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
            this.b.B(f10, this.a);
        }
    }

    public final boolean d(float f10, float f11) {
        if (this.e == f10) {
            return false;
        }
        this.e = f10;
        this.b.J0(this.a, f10, f11, this);
        return true;
    }

    public c(int i9, b bVar, Interpolator interpolator, long j10, float f10) {
        this.a = i9;
        this.b = bVar;
        this.c = interpolator;
        this.d = j10;
        this.e = f10;
    }
}
