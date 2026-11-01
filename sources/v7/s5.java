package v7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
