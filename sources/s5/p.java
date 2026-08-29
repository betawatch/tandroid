package s5;

import android.os.Looper;
import c2.v0;
import java.util.Locale;
import org.telegram.ui.Components.rk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class p {
    public static final Object i = new Object();
    public final b a;
    public final long b;
    public final String c;
    public o g;
    public rk0 h;
    public long e = -1;
    public long f = 0;
    public final v0 d = new v0(Looper.getMainLooper(), 1);

    public p(long j10, String str) {
        this.b = j10;
        this.c = str;
        this.a = new b("RequestTracker", str);
    }

    public final void a(long j10, o oVar) {
        o oVar2;
        long j11;
        long j12;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = i;
        synchronized (obj) {
            oVar2 = this.g;
            j11 = this.e;
            j12 = this.f;
            this.e = j10;
            this.g = oVar;
            this.f = currentTimeMillis;
        }
        if (oVar2 != null) {
            oVar2.c(this.c, j11, j12, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                rk0 rk0Var = this.h;
                if (rk0Var != null) {
                    this.d.removeCallbacks(rk0Var);
                }
                rk0 rk0Var2 = new rk0(this, 9);
                this.h = rk0Var2;
                this.d.postDelayed(rk0Var2, this.b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(long j10, int i10, m mVar) {
        synchronized (i) {
            try {
                if (c(j10)) {
                    Locale locale = Locale.ROOT;
                    e("request " + j10 + " completed", i10, mVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c(long j10) {
        boolean z10;
        synchronized (i) {
            long j11 = this.e;
            z10 = false;
            if (j11 != -1 && j11 == j10) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean d() {
        boolean z10;
        synchronized (i) {
            z10 = this.e != -1;
        }
        return z10;
    }

    public final void e(String str, int i10, Object obj) {
        this.a.b(str, new Object[0]);
        Object obj2 = i;
        synchronized (obj2) {
            try {
                if (this.g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    o oVar = this.g;
                    z5.l.h(oVar);
                    oVar.o(this.c, this.e, i10, obj, this.f, currentTimeMillis);
                }
                this.e = -1L;
                this.g = null;
                synchronized (obj2) {
                    rk0 rk0Var = this.h;
                    if (rk0Var != null) {
                        this.d.removeCallbacks(rk0Var);
                        this.h = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            } finally {
            }
        }
    }

    public final boolean f(int i10) {
        synchronized (i) {
            try {
                if (!d()) {
                    return false;
                }
                Locale locale = Locale.ROOT;
                e("clearing request " + this.e, i10, null);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
