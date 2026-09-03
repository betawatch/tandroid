package org.webrtc;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public class ThreadUtils {

    /* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
    public class 1CaughtException {
        Exception e;
    }

    /* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
    public class 1Result {
        public V value;
    }

    /* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
    public interface BlockingOperation {
        void run();
    }

    /* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
    public static class ThreadChecker {
        private Thread thread = Thread.currentThread();

        public void checkIsOnValidThread() {
            if (this.thread == null) {
                this.thread = Thread.currentThread();
            }
            if (Thread.currentThread() != this.thread) {
                throw new IllegalStateException("Wrong thread");
            }
        }

        public void detachThread() {
            this.thread = null;
        }
    }

    public static void awaitUninterruptibly(final CountDownLatch countDownLatch) {
        executeUninterruptibly(new BlockingOperation() { // from class: org.webrtc.ThreadUtils.2
            @Override // org.webrtc.ThreadUtils.BlockingOperation
            public void run() {
                countDownLatch.await();
            }
        });
    }

    public static void checkIsOnMainThread() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new IllegalStateException("Not on main thread!");
        }
    }

    public static StackTraceElement[] concatStackTraces(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[stackTraceElementArr.length + stackTraceElementArr2.length];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr3, 0, stackTraceElementArr.length);
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, stackTraceElementArr.length, stackTraceElementArr2.length);
        return stackTraceElementArr3;
    }

    public static void executeUninterruptibly(BlockingOperation blockingOperation) {
        boolean z4 = false;
        while (true) {
            try {
                blockingOperation.run();
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }

    public static <V> V invokeAtFrontUninterruptibly(Handler handler, final Callable<V> callable) {
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            try {
                return callable.call();
            } catch (Exception e6) {
                throw new RuntimeException(e6);
            }
        }
        final 1Result r02 = new 1Result();
        final 1CaughtException r12 = new 1CaughtException();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        handler.post(new Runnable() { // from class: org.webrtc.ThreadUtils.3
            /* JADX WARN: Type inference failed for: r1v2, types: [V, java.lang.Object] */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    1Result.this.value = callable.call();
                } catch (Exception e10) {
                    r12.e = e10;
                }
                countDownLatch.countDown();
            }
        });
        awaitUninterruptibly(countDownLatch);
        if (r12.e == null) {
            return r02.value;
        }
        RuntimeException runtimeException = new RuntimeException(r12.e);
        runtimeException.setStackTrace(concatStackTraces(r12.e.getStackTrace(), runtimeException.getStackTrace()));
        throw runtimeException;
    }

    public static boolean joinUninterruptibly(Thread thread, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z4 = false;
        long j11 = j10;
        while (j11 > 0) {
            try {
                thread.join(j11);
                break;
            } catch (InterruptedException unused) {
                j11 = j10 - (SystemClock.elapsedRealtime() - elapsedRealtime);
                z4 = true;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return !thread.isAlive();
    }

    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z4 = false;
        long j11 = j10;
        boolean z10 = false;
        do {
            try {
                z4 = countDownLatch.await(j11, TimeUnit.MILLISECONDS);
                break;
            } catch (InterruptedException unused) {
                j11 = j10 - (SystemClock.elapsedRealtime() - elapsedRealtime);
                z10 = true;
            }
        } while (j11 > 0);
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return z4;
    }

    public static void joinUninterruptibly(final Thread thread) {
        executeUninterruptibly(new BlockingOperation() { // from class: org.webrtc.ThreadUtils.1
            @Override // org.webrtc.ThreadUtils.BlockingOperation
            public void run() {
                thread.join();
            }
        });
    }

    public static void invokeAtFrontUninterruptibly(Handler handler, final Runnable runnable) {
        invokeAtFrontUninterruptibly(handler, new Callable<Void>() { // from class: org.webrtc.ThreadUtils.4
            @Override // java.util.concurrent.Callable
            public Void call() {
                runnable.run();
                return null;
            }
        });
    }
}
