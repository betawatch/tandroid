package w7;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class ha implements Closeable {
    public static final HashMap f = new HashMap();
    public int a;
    public long b;
    public long c;
    public long d = 2147483647L;
    public long e = -2147483648L;

    public ha(String str) {
    }

    public void a() {
        this.b = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public void b(long j3) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j10 = this.c;
        if (j10 != 0 && elapsedRealtimeNanos - j10 >= 1000000) {
            this.a = 0;
            this.b = 0L;
            this.d = 2147483647L;
            this.e = -2147483648L;
        }
        this.c = elapsedRealtimeNanos;
        this.a++;
        this.d = Math.min(this.d, j3);
        this.e = Math.max(this.e, j3);
        if (this.a % 50 == 0) {
            Locale locale = Locale.US;
            pa.b();
        }
        if (this.a % 500 == 0) {
            this.a = 0;
            this.b = 0L;
            this.d = 2147483647L;
            this.e = -2147483648L;
        }
    }

    public void c(long j3) {
        b((SystemClock.elapsedRealtimeNanos() / 1000) - j3);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j3 = this.b;
        if (j3 == 0) {
            throw new IllegalStateException("Did you forget to call start()?");
        }
        c(j3);
    }
}
