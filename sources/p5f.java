// default package

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
