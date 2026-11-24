package org.webrtc;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
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
            dq9.m("release() called on an object with refcount < 1");
        } else {
            if (decrementAndGet != 0 || (runnable = this.releaseCallback) == null) {
                return;
            }
            runnable.run();
        }
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        if (this.refCount.incrementAndGet() >= 2) {
            return;
        }
        dq9.m("retain() called on an object with refcount < 1");
    }

    public boolean safeRetain() {
        int i = this.refCount.get();
        while (i != 0) {
            if (this.refCount.weakCompareAndSet(i, i + 1)) {
                return true;
            }
            i = this.refCount.get();
        }
        return false;
    }
}
