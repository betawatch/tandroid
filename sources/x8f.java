// default package

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
