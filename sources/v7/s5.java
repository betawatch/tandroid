package v7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class s5 {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, com.google.android.gms.internal.cast.e4 e4Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(e4Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(e4Var) != obj && atomicReferenceFieldUpdater.get(e4Var) != obj) {
                return false;
            }
        }
        return true;
    }
}
