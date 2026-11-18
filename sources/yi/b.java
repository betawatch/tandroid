package yi;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class b {
    public static final AtomicLong d = new AtomicLong(1);
    public final long a = d.getAndIncrement();
    public final long b = SystemClock.elapsedRealtime();
    public final f c;

    public b(f fVar) {
        this.c = fVar;
    }

    public final void a(String str, Throwable th2) {
        this.c.F("AudioRecorder[" + this.a + "] t+" + (SystemClock.elapsedRealtime() - this.b) + "ms [" + Thread.currentThread().getName() + "] " + str, th2);
    }

    public final void b(String str) {
        this.c.D0("AudioRecorder[" + this.a + "] t+" + (SystemClock.elapsedRealtime() - this.b) + "ms [" + Thread.currentThread().getName() + "] " + str);
    }
}
