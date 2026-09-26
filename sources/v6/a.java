package v6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l5.o;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class a implements ThreadFactory {
    public final AtomicInteger b = new AtomicInteger();
    public final ThreadFactory c = Executors.defaultThreadFactory();
    public final String a = "GAC_Executor";

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.c.newThread(new o(2, runnable));
        newThread.setName(this.a + "[" + this.b.getAndIncrement() + "]");
        return newThread;
    }
}
