// default package

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class z2f {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, cmd cmdVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(cmdVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(cmdVar) != obj && atomicReferenceFieldUpdater.get(cmdVar) != obj) {
                return false;
            }
        }
        return true;
    }
}
