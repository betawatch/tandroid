// default package

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
