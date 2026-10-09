package v7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class q5 {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, com.google.android.gms.internal.cast.f4 f4Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(f4Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(f4Var) != obj && atomicReferenceFieldUpdater.get(f4Var) != obj) {
                return false;
            }
        }
        return true;
    }
}
