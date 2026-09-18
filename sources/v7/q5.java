package v7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
