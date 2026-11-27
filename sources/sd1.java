// default package

import android.animation.ValueAnimator;
import java.net.URL;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class sd1 {
    public int a;
    public long b;
    public Object c;

    public sd1(int i, URL url, long j) {
        this.a = i;
        this.c = url;
        this.b = j;
    }

    public final void a(mk0 mk0Var, ye9 ye9Var) {
        int i;
        int b = nxe.b(mk0Var);
        long j = mk0Var != null ? mk0Var.a : Long.MIN_VALUE;
        boolean z = j == this.b && this.a >= 0;
        this.b = j;
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.c = null;
        }
        if (!z || (i = this.a) == b) {
            this.a = b;
            ye9Var.j(b);
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i, b);
        ofInt.addUpdateListener(new lk(this, ye9Var, (byte) 25));
        ofInt.setInterpolator(k43.f);
        ofInt.setDuration(200L);
        this.c = ofInt;
        ofInt.start();
    }

    public final synchronized long b(int i) {
        if (i != 429 && (i < 500 || i >= 600)) {
            return 86400000L;
        }
        return (long) Math.min(Math.pow(2.0d, this.a) + ((long) (Math.random() * 1000.0d)), 1800000.0d);
    }

    public final synchronized boolean c() {
        boolean z;
        if (this.a != 0) {
            ((tcc) this.c).a.getClass();
            z = System.currentTimeMillis() > this.b;
        }
        return z;
    }

    public final synchronized void d() {
        this.a = 0;
    }

    public final synchronized void e(int i) {
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            d();
            return;
        }
        this.a++;
        long b = b(i);
        ((tcc) this.c).a.getClass();
        this.b = System.currentTimeMillis() + b;
    }
}
