package v7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
