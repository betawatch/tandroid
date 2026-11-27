// default package

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class x8f {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, lgf lgfVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(lgfVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(lgfVar) != obj && atomicReferenceFieldUpdater.get(lgfVar) != obj) {
                return false;
            }
        }
        return true;
    }
}
