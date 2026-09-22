package v7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public abstract class l6 {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, com.google.android.gms.internal.play_billing.g4 g4Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(g4Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(g4Var) != obj && atomicReferenceFieldUpdater.get(g4Var) != obj) {
                return false;
            }
        }
        return true;
    }
}
