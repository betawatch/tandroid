package z8;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import xf.o0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a implements ThreadFactory {
    public static final ThreadFactory e = Executors.defaultThreadFactory();
    public final AtomicLong a = new AtomicLong();
    public final String b;
    public final int c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i9, StrictMode.ThreadPolicy threadPolicy) {
        this.b = str;
        this.c = i9;
        this.d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = e.newThread(new o0(7, this, runnable));
        Locale locale = Locale.ROOT;
        newThread.setName(this.b + " Thread #" + this.a.getAndIncrement());
        return newThread;
    }
}
