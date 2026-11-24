// default package

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
