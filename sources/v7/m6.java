package v7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public abstract class m6 {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, com.google.android.gms.internal.play_billing.g4 g4Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(g4Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(g4Var) != obj && atomicReferenceFieldUpdater.get(g4Var) != obj) {
                return false;
            }
        }
        return true;
    }
}
