package ua;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import sa.j;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class d {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long e = TimeUnit.MINUTES.toMillis(30);
    public final j a;
    public long b;
    public int c;

    public d() {
        if (qb.a.c == null) {
            Pattern pattern = j.c;
            qb.a.c = new qb.a(25);
        }
        qb.a aVar = qb.a.c;
        if (j.d == null) {
            j.d = new j(aVar);
        }
        this.a = j.d;
    }

    public final synchronized long a(int i10) {
        if (!(i10 == 429 || (i10 >= 500 && i10 < 600))) {
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

    public final synchronized void d(int i10) {
        if ((i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404) {
            c();
            return;
        }
        this.c++;
        long a2 = a(i10);
        this.a.a.getClass();
        this.b = System.currentTimeMillis() + a2;
    }
}
