package v7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class p5 {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, com.google.android.gms.internal.cast.h4 h4Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(h4Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(h4Var) != obj && atomicReferenceFieldUpdater.get(h4Var) != obj) {
                return false;
            }
        }
        return true;
    }
}
