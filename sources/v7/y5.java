package v7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public abstract class y5 {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, com.google.android.gms.internal.play_billing.l0 l0Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(l0Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(l0Var) != obj && atomicReferenceFieldUpdater.get(l0Var) != obj) {
                return false;
            }
        }
        return true;
    }
}
