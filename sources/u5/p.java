package u5;

import android.os.Looper;
import java.util.Locale;
import org.telegram.ui.Components.tl0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class p {
    public static final Object i = new Object();
    public final b a;
    public final long b;
    public final String c;
    public o g;
    public tl0 h;
    public long e = -1;
    public long f = 0;
    public final a7.e d = new a7.e(Looper.getMainLooper(), 2);

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
            oVar2.m(this.c, j11, j12, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                tl0 tl0Var = this.h;
                if (tl0Var != null) {
                    this.d.removeCallbacks(tl0Var);
                }
                tl0 tl0Var2 = new tl0(this, 10);
                this.h = tl0Var2;
                this.d.postDelayed(tl0Var2, this.b);
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
        boolean z4;
        synchronized (i) {
            long j11 = this.e;
            z4 = false;
            if (j11 != -1 && j11 == j10) {
                z4 = true;
            }
        }
        return z4;
    }

    public final boolean d() {
        boolean z4;
        synchronized (i) {
            z4 = this.e != -1;
        }
        return z4;
    }

    public final void e(String str, int i10, Object obj) {
        this.a.b(str, new Object[0]);
        Object obj2 = i;
        synchronized (obj2) {
            try {
                if (this.g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    o oVar = this.g;
                    b6.m.h(oVar);
                    oVar.n(this.c, this.e, i10, obj, this.f, currentTimeMillis);
                }
                this.e = -1L;
                this.g = null;
                synchronized (obj2) {
                    tl0 tl0Var = this.h;
                    if (tl0Var != null) {
                        this.d.removeCallbacks(tl0Var);
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
