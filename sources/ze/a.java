package ze;

import com.google.android.gms.internal.cast.c0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.f8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a extends ThreadPoolExecutor implements AutoCloseable {
    public final /* synthetic */ c0 a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(c0 c0Var, PriorityBlockingQueue priorityBlockingQueue) {
        super(1, 1, 60L, r5, priorityBlockingQueue);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.a = c0Var;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void beforeExecute(Thread thread, Runnable runnable) {
        CountDownLatch countDownLatch = (CountDownLatch) this.a.c;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                f8.g(e, true);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        cf.b.j(this);
    }
}
