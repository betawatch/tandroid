package v7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public abstract class a6 {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, com.google.android.gms.internal.play_billing.l0 l0Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(l0Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(l0Var) != obj && atomicReferenceFieldUpdater.get(l0Var) != obj) {
                return false;
            }
        }
        return true;
    }
}
