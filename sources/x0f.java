// default package

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class x0f {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, akd akdVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(akdVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(akdVar) != obj && atomicReferenceFieldUpdater.get(akdVar) != obj) {
                return false;
            }
        }
        return true;
    }
}
