// default package

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pp3 extends ThreadPoolExecutor implements AutoCloseable {
    public final /* synthetic */ ix2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp3(ix2 ix2Var, PriorityBlockingQueue priorityBlockingQueue) {
        super(1, 1, 60L, TimeUnit.SECONDS, priorityBlockingQueue);
        this.a = ix2Var;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void beforeExecute(Thread thread, Runnable runnable) {
        CountDownLatch countDownLatch = (CountDownLatch) this.a.c;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                fc4.g(e, true);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        z2.d(this);
    }
}
