package v7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public abstract class q5 {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, com.google.android.gms.internal.cast.h4 h4Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(h4Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(h4Var) != obj && atomicReferenceFieldUpdater.get(h4Var) != obj) {
                return false;
            }
        }
        return true;
    }
}
