package te;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import hi.da;
import org.telegram.ui.Components.voip.o1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class c {
    public final int a;
    public final b b;
    public Interpolator c;
    public long d;
    public long e;
    public float f;
    public float g;
    public boolean h;
    public ValueAnimator i;

    public c(int i7, b bVar, Interpolator interpolator, long j3) {
        this.a = i7;
        this.b = bVar;
        this.c = interpolator;
        this.d = j3;
    }

    public final void a(float f10) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AssertionError();
        }
        if (this.h) {
            b();
        }
        float f11 = this.f;
        int i7 = this.a;
        b bVar = this.b;
        if (f11 == f10) {
            bVar.G(f11, i7);
            return;
        }
        int i10 = 1;
        if (!this.h) {
            this.h = true;
        }
        float f12 = f10 - f11;
        long j3 = this.d;
        if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
            j3 = 0;
        }
        if (j3 <= 0) {
            d(f10, 1.0f);
            if (this.h) {
                this.h = false;
            }
            bVar.G(f10, i7);
            return;
        }
        this.g = f10;
        DecelerateInterpolator decelerateInterpolator = se.a.a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.i = ofFloat;
        ofFloat.setDuration(j3);
        this.i.setInterpolator(this.c);
        this.i.addUpdateListener(new da(this, f11, f12, 7));
        this.i.addListener(new o1(this, f11, f12, i10));
        long j10 = this.e;
        if (j10 != 0) {
            this.i.setStartDelay(j10);
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
            this.b.G(f10, this.a);
        }
    }

    public final boolean d(float f10, float f11) {
        if (this.f == f10) {
            return false;
        }
        this.f = f10;
        this.b.K(this.a, f10, f11, this);
        return true;
    }

    public c(int i7, b bVar, Interpolator interpolator, long j3, float f10) {
        this.a = i7;
        this.b = bVar;
        this.c = interpolator;
        this.d = j3;
        this.f = f10;
    }
}
