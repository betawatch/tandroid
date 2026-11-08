package xa;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import va.j;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class d {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long e = TimeUnit.MINUTES.toMillis(30);
    public final j a;
    public long b;
    public int c;

    public d() {
        if (sa.d.b == null) {
            Pattern pattern = j.c;
            sa.d.b = new sa.d(28);
        }
        sa.d dVar = sa.d.b;
        if (j.d == null) {
            j.d = new j(dVar);
        }
        this.a = j.d;
    }

    public final synchronized long a(int i7) {
        if (!(i7 == 429 || (i7 >= 500 && i7 < 600))) {
            return d;
        }
        double pow = Math.pow(2.0d, this.c);
        this.a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), e);
    }

    public final synchronized boolean b() {
        boolean z9;
        if (this.c != 0) {
            this.a.a.getClass();
            z9 = System.currentTimeMillis() > this.b;
        }
        return z9;
    }

    public final synchronized void c() {
        this.c = 0;
    }

    public final synchronized void d(int i7) {
        if ((i7 >= 200 && i7 < 300) || i7 == 401 || i7 == 404) {
            c();
            return;
        }
        this.c++;
        long a10 = a(i7);
        this.a.a.getClass();
        this.b = System.currentTimeMillis() + a10;
    }
}
