package vi;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.a8;
import org.telegram.messenger.r2;
import w7.s;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class b {
    public static final AtomicLong d = new AtomicLong(1);
    public final long a = d.getAndIncrement();
    public final long b = SystemClock.elapsedRealtime();
    public final s c;

    public b(s sVar) {
        this.c = sVar;
    }

    public final void a(String str, Throwable th2) {
        String str2 = "AudioRecorder[" + this.a + "] t+" + (SystemClock.elapsedRealtime() - this.b) + "ms [" + Thread.currentThread().getName() + "] " + str;
        switch (this.c.a) {
            case 16:
                a8.e("AudioRecorderV2 " + str2, th2);
                break;
        }
    }

    public final void b(String str) {
        String str2 = "AudioRecorder[" + this.a + "] t+" + (SystemClock.elapsedRealtime() - this.b) + "ms [" + Thread.currentThread().getName() + "] " + str;
        switch (this.c.a) {
            case 16:
                if (r2.a) {
                    a8.b("AudioRecorderV2 " + str2);
                    break;
                }
                break;
        }
    }
}
