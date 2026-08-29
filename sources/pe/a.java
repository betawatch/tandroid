package pe;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a extends ThreadPoolExecutor implements AutoCloseable {
    public final /* synthetic */ c a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(c cVar, PriorityBlockingQueue priorityBlockingQueue) {
        super(1, 1, 60L, r5, priorityBlockingQueue);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.a = cVar;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void beforeExecute(Thread thread, Runnable runnable) {
        CountDownLatch countDownLatch = this.a.b;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException e10) {
                FileLog.e(e10);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        b9.b.h(this);
    }
}
