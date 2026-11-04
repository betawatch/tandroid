package wa;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import ra.e;
import ua.k;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long e = TimeUnit.MINUTES.toMillis(30);
    public final k a;
    public long b;
    public int c;

    public d() {
        if (e.c == null) {
            Pattern pattern = k.c;
            e.c = new e(27);
        }
        e eVar = e.c;
        if (k.d == null) {
            k.d = new k(eVar);
        }
        this.a = k.d;
    }

    public final synchronized long a(int i3) {
        if (!(i3 == 429 || (i3 >= 500 && i3 < 600))) {
            return d;
        }
        double pow = Math.pow(2.0d, this.c);
        this.a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), e);
    }

    public final synchronized boolean b() {
        boolean z10;
        if (this.c != 0) {
            this.a.a.getClass();
            z10 = System.currentTimeMillis() > this.b;
        }
        return z10;
    }

    public final synchronized void c() {
        this.c = 0;
    }

    public final synchronized void d(int i3) {
        if ((i3 >= 200 && i3 < 300) || i3 == 401 || i3 == 404) {
            c();
            return;
        }
        this.c++;
        long a10 = a(i3);
        this.a.a.getClass();
        this.b = System.currentTimeMillis() + a10;
    }
}
