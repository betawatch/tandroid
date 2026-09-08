package v7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class p5 {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, com.google.android.gms.internal.cast.h4 h4Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(h4Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(h4Var) != obj && atomicReferenceFieldUpdater.get(h4Var) != obj) {
                return false;
            }
        }
        return true;
    }
}
