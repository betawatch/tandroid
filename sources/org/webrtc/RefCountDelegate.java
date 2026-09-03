package org.webrtc;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
class RefCountDelegate implements RefCounted {
    private final AtomicInteger refCount = new AtomicInteger(1);
    private final Runnable releaseCallback;

    public RefCountDelegate(Runnable runnable) {
        this.releaseCallback = runnable;
    }

    @Override // org.webrtc.RefCounted
    public void release() {
        Runnable runnable;
        int decrementAndGet = this.refCount.decrementAndGet();
        if (decrementAndGet < 0) {
            throw new IllegalStateException("release() called on an object with refcount < 1");
        }
        if (decrementAndGet != 0 || (runnable = this.releaseCallback) == null) {
            return;
        }
        runnable.run();
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        if (this.refCount.incrementAndGet() < 2) {
            throw new IllegalStateException("retain() called on an object with refcount < 1");
        }
    }

    public boolean safeRetain() {
        int i10 = this.refCount.get();
        while (i10 != 0) {
            if (this.refCount.weakCompareAndSet(i10, i10 + 1)) {
                return true;
            }
            i10 = this.refCount.get();
        }
        return false;
    }
}
