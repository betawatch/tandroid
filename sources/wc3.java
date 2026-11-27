// default package

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class wc3 implements ThreadFactory {
    public final /* synthetic */ byte a;
    public final Object b;

    public wc3() {
        this.a = (byte) 0;
        this.b = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) obj).getAndIncrement());
                return thread;
            case 1:
                Thread newThread = Executors.defaultThreadFactory().newThread(new r54(runnable, (byte) 0));
                newThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) obj).getAndIncrement());
                return newThread;
            default:
                return ((ThreadFactory) obj).newThread(new ps9(runnable, (byte) 4));
        }
    }

    public /* synthetic */ wc3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
