package org.webrtc;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public class NativeLifecycleLock {
    private final String className;
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private long nativePointer;

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
    public interface NativeCallable<T> {
        T call();
    }

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
    public interface NativeDisposer {
        void dispose(long j);
    }

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
    public interface NativePointerCallable<T> {
        T call(long j);
    }

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
    public interface NativePointerRunnable {
        void run(long j);
    }

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
    public interface NativeRunnable {
        void run();
    }

    public NativeLifecycleLock(String str, long j) {
        this.className = str;
        this.nativePointer = j;
    }

    private void checkNotDisposed() {
        if (this.nativePointer != 0) {
            return;
        }
        grb.i(c00.k(new StringBuilder(), this.className, " has been disposed."));
    }

    public <T> T call(NativePointerCallable<T> nativePointerCallable) {
        this.lock.readLock().lock();
        try {
            checkNotDisposed();
            return nativePointerCallable.call(this.nativePointer);
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public <T> T callOrDefault(NativeCallable<T> nativeCallable, T t) {
        this.lock.readLock().lock();
        try {
            if (this.nativePointer != 0) {
                return nativeCallable.call();
            }
            Logging.w(this.className, this.className + " has been disposed.");
            return t;
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public void dispose(NativeDisposer nativeDisposer) {
        if (isDisposed()) {
            return;
        }
        this.lock.writeLock().lock();
        try {
            long j = this.nativePointer;
            if (j != 0) {
                nativeDisposer.dispose(j);
                this.nativePointer = 0L;
            }
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public long getNativePointer() {
        this.lock.readLock().lock();
        try {
            checkNotDisposed();
            return this.nativePointer;
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public boolean isDisposed() {
        this.lock.readLock().lock();
        try {
            return this.nativePointer == 0;
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public void run(NativePointerRunnable nativePointerRunnable) {
        this.lock.readLock().lock();
        try {
            checkNotDisposed();
            nativePointerRunnable.run(this.nativePointer);
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public boolean runIfAlive(NativeRunnable nativeRunnable) {
        this.lock.readLock().lock();
        try {
            if (this.nativePointer != 0) {
                nativeRunnable.run();
                this.lock.readLock().unlock();
                return true;
            }
            Logging.w(this.className, this.className + " has been disposed.");
            this.lock.readLock().unlock();
            return false;
        } catch (Throwable th) {
            this.lock.readLock().unlock();
            throw th;
        }
    }

    public void run(NativeRunnable nativeRunnable) {
        this.lock.readLock().lock();
        try {
            checkNotDisposed();
            nativeRunnable.run();
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public <T> T call(NativeCallable<T> nativeCallable) {
        this.lock.readLock().lock();
        try {
            checkNotDisposed();
            return nativeCallable.call();
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public <T> T callOrDefault(NativePointerCallable<T> nativePointerCallable, T t) {
        this.lock.readLock().lock();
        try {
            long j = this.nativePointer;
            if (j == 0) {
                Logging.w(this.className, this.className + " has been disposed.");
                return t;
            }
            return nativePointerCallable.call(j);
        } finally {
            this.lock.readLock().unlock();
        }
    }

    public boolean runIfAlive(NativePointerRunnable nativePointerRunnable) {
        this.lock.readLock().lock();
        try {
            long j = this.nativePointer;
            if (j == 0) {
                Logging.w(this.className, this.className + " has been disposed.");
                this.lock.readLock().unlock();
                return false;
            }
            nativePointerRunnable.run(j);
            this.lock.readLock().unlock();
            return true;
        } catch (Throwable th) {
            this.lock.readLock().unlock();
            throw th;
        }
    }
}
