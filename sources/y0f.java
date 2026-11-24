// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class y0f {
    public static /* synthetic */ boolean a(Unsafe unsafe, akd akdVar, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(akdVar, j, obj, obj2)) {
            if (unsafe.getObject(akdVar, j) != obj && unsafe.getObject(akdVar, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
