package v7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
