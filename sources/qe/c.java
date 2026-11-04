package qe;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import gi.l9;
import org.telegram.ui.Components.voip.z0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c {
    public final int a;
    public final b b;
    public final Interpolator c;
    public final long d;
    public long e;
    public float f;
    public float g;
    public boolean h;
    public ValueAnimator i;

    public c(int i3, b bVar, Interpolator interpolator, long j10) {
        this.a = i3;
        this.b = bVar;
        this.c = interpolator;
        this.d = j10;
    }

    public final void a(float f10) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AssertionError();
        }
        if (this.h) {
            b();
        }
        float f11 = this.f;
        int i3 = this.a;
        b bVar = this.b;
        if (f11 == f10) {
            bVar.F(f11, i3);
            return;
        }
        int i10 = 1;
        if (!this.h) {
            this.h = true;
        }
        float f12 = f10 - f11;
        long j10 = (Build.VERSION.SDK_INT < 26 || ValueAnimator.areAnimatorsEnabled()) ? this.d : 0L;
        if (j10 <= 0) {
            d(f10, 1.0f);
            if (this.h) {
                this.h = false;
            }
            bVar.F(f10, i3);
            return;
        }
        this.g = f10;
        DecelerateInterpolator decelerateInterpolator = pe.a.a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.i = ofFloat;
        ofFloat.setDuration(j10);
        this.i.setInterpolator(this.c);
        this.i.addUpdateListener(new l9(this, f11, f12, 6));
        this.i.addListener(new z0(this, f11, f12, i10));
        long j11 = this.e;
        if (j11 != 0) {
            this.i.setStartDelay(j11);
        }
        try {
            this.i.start();
        } catch (Throwable th2) {
            Log.e("tgx", "Cannot start animation", th2);
            c(f10);
        }
    }

    public final boolean b() {
        if (!this.h) {
            return false;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AssertionError();
        }
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

    public final void c(float f10) {
        boolean b10 = b();
        if (d(f10, 1.0f) || b10) {
            this.b.F(f10, this.a);
        }
    }

    public final boolean d(float f10, float f11) {
        if (this.f == f10) {
            return false;
        }
        this.f = f10;
        this.b.Y(this.a, f10, f11, this);
        return true;
    }

    public c(int i3, b bVar, Interpolator interpolator, long j10, float f10) {
        this.a = i3;
        this.b = bVar;
        this.c = interpolator;
        this.d = j10;
        this.f = f10;
    }
}
