package v7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public abstract class r5 {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, com.google.android.gms.internal.cast.f4 f4Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(f4Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(f4Var) != obj && atomicReferenceFieldUpdater.get(f4Var) != obj) {
                return false;
            }
        }
        return true;
    }
}
