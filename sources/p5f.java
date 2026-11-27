// default package

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class p5f {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, rod rodVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(rodVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(rodVar) != obj && atomicReferenceFieldUpdater.get(rodVar) != obj) {
                return false;
            }
        }
        return true;
    }
}
