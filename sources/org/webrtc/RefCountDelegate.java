package org.webrtc;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
            sc8.j("release() called on an object with refcount < 1");
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
        sc8.j("retain() called on an object with refcount < 1");
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
