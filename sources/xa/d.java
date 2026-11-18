package xa;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import va.j;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class d {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long e = TimeUnit.MINUTES.toMillis(30);
    public final j a;
    public long b;
    public int c;

    public d() {
        if (z9.a.a == null) {
            Pattern pattern = j.c;
            z9.a.a = new z9.a();
        }
        z9.a aVar = z9.a.a;
        if (j.d == null) {
            j.d = new j(aVar);
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
