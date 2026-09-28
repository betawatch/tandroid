package v7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
