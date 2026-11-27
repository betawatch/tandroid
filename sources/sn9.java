// default package

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class sn9 {
    public static final AtomicLong c = new AtomicLong(1);
    public final long a = c.getAndIncrement();
    public final long b = SystemClock.elapsedRealtime();

    public final void a(String str, Throwable th) {
        cc4.d(c() + str + ": " + th);
        cc4.g(th, true);
    }

    public final void b(String str) {
        cc4.b(c().concat(str));
    }

    public final String c() {
        return "RoundVideo[" + this.a + "] t+" + (SystemClock.elapsedRealtime() - this.b) + "ms [" + Thread.currentThread().getName() + "] ";
    }
}
